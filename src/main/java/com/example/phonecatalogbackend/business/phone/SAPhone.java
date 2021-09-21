package com.example.phonecatalogbackend.business.phone;

import java.util.List;

public interface SAPhone {

    TPhone createPhone(TPhone tPhone);
    boolean deletePhone(int id);
    List<TPhone> getPhones();
    TPhone updatePhone(TPhone tPhone);

}
