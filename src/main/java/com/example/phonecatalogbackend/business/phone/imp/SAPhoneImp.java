package com.example.phonecatalogbackend.business.phone.imp;

import com.example.phonecatalogbackend.business.phone.SAPhone;
import com.example.phonecatalogbackend.business.pojos.TPhone;
import com.example.phonecatalogbackend.integration.DAOPhone;
import com.example.phonecatalogbackend.integration.imp.DAOPhoneImp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SAPhoneImp implements SAPhone {

    @Override
    public TPhone createPhone(TPhone tPhone) {
        DAOPhone daoPhone = new DAOPhoneImp();
        return daoPhone.createPhone(tPhone);
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
