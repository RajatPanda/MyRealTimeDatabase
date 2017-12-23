package com.example.rajat.myrealtimedatabase;

/**
 * Created by Rajat on 12/17/2017.
 */

public class UserRecord {
    String name,phone;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  "name : " + name + '\n' +
                "phone : " + phone + '\n' ;
    }
}
