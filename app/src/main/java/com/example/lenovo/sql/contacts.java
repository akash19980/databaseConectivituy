package com.example.lenovo.sql;

public class contacts {
    int id;
    String name;
    String phone_number;
    public contacts(){}
    public contacts(int id,String name,String phone_number)
    {
        this.id=id;
        this.name=name;
        this.phone_number=phone_number;
    }
    public contacts(String name,String phone_number)
    {
        this.name=name;
        this.phone_number=phone_number;
    }
    //---------------------------Gtetter setter methods of id name and phone number-------//
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getname()
    {
        return this.name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getPhone_number()
    {
        return this.phone_number;
    }
    public void setPhone_number(String phone_number)
    {
        this.phone_number=phone_number;
    }
    //---------------------------------getter setter eneded----//
}
