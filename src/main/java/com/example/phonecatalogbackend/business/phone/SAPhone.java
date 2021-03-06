package com.example.phonecatalogbackend.business.phone;

import com.example.phonecatalogbackend.business.pojos.TPhone;

import java.util.List;

public interface SAPhone {

    TPhone createPhone(TPhone tPhone);
    boolean deletePhone(int id);
    List<TPhone> getPhones();
    TPhone updatePhone(TPhone tPhone);

}
