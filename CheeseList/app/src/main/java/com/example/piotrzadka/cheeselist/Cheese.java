package com.example.piotrzadka.cheeselist;

import java.io.Serializable;

/**
 * Created by Piotr Zadka on 13.02.2018.
 */

public class Cheese implements Serializable {
    String name,details;

    Cheese(String name, String details){
        this.name = name;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public String getName() {
        return name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setName(String name) {
        this.name = name;
    }
}
