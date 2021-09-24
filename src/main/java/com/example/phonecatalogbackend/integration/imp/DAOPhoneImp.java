package com.example.phonecatalogbackend.integration.imp;

import com.example.phonecatalogbackend.business.pojos.TPhone;
import com.example.phonecatalogbackend.integration.DAOPhone;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DAOPhoneImp implements DAOPhone {

    @Override
    public TPhone createPhone(TPhone tPhone) {

        try (FileWriter file = new FileWriter("com/example/phonecatalogbackend/integration/phones.txt")) {
            JSONObject obj = new JSONObject();
            obj.put("name", tPhone.getName());
            obj.put("manufacturer", tPhone.getManufacturer());
            obj.put("description", tPhone.getDescription());
            obj.put("color", tPhone.getColor());
            obj.put("price", tPhone.getPrice());
            obj.put("imageFileName", tPhone.getImageFileName());
            obj.put("screen", tPhone.getScreen());
            obj.put("processor", tPhone.getProcessor());
            obj.put("ram", tPhone.getRam());

            file.write(obj.toString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
            file.close();

            return tPhone;
        } catch (JSONException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deletePhone(int id) {
        return false;
    }

    @Override
    public List<TPhone> getPhones() {
        return null;
    }

    @Override
    public TPhone updatePhone(TPhone tPhone) {
        return null;
    }
}
