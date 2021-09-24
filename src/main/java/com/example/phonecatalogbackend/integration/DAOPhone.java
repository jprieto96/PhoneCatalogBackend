package com.example.phonecatalogbackend.integration;

import com.example.phonecatalogbackend.business.pojos.TPhone;
import org.json.JSONException;

import java.util.List;

public interface DAOPhone {

    TPhone createPhone(TPhone tPhone);
    boolean deletePhone(int id);
    List<TPhone> getPhones();
    TPhone updatePhone(TPhone tPhone);

}
