package com.example.HibernateORM.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String housenumber;
    private String pinCode;
    private String streetNo;

    public Address(){}

    public Address(String housenumber,String pinCode,String streetNo){
        this.housenumber = housenumber;
        this.streetNo = streetNo;
        this.pinCode = pinCode;
    }

    public String getHousenumber(){
        return this.housenumber;
    }
    public String getPinCode(){
        return this.pinCode;
    }
    public String getStreetNo(){
        return this.streetNo;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }
}
