package com.example.phonecatalogbackend;

import com.example.phonecatalogbackend.business.phone.SAPhone;
import com.example.phonecatalogbackend.business.pojos.TPhone;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class WebController {

    private static final Logger log = LoggerFactory.getLogger(WebController.class);

    private static final String INTERNAL_SERVER_ERROR = "Something went wrong on the server";

    @Autowired
    SAPhone saPhone;

    @PostMapping(path = "/create-phone", consumes = "application/json")
    public String createPhone(@RequestBody TPhone tPhone, HttpServletResponse response) {

        log.debug("Starting POST operation: CreatePhone for the phone: {}", tPhone);

        TPhone newPhone;

        Optional<TPhone> optional = null;
        try {
            optional = Optional.ofNullable(saPhone.createPhone(tPhone));
        } catch (Exception e) {
            log.error("The service has responsed with the following error: {}", e.getMessage());
            response.setStatus(400);
            return e.getMessage();
        }
        if (optional.isPresent()) {
            response.setStatus(HttpServletResponse.SC_OK);
            newPhone = optional.get();
        } else {
            log.error("The service does not work correctly");
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            newPhone = new TPhone();
        }
        log.debug("Phone created successfully: {}", newPhone);

        return new Gson().toJson(newPhone);
    }

    @RequestMapping(path = "/")
    public String hello() {
        return "Hello";
    }


}
