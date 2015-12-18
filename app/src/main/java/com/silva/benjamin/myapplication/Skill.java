package com.silva.benjamin.myapplication;

import co.uk.rushorm.core.RushObject;

/**
 * Created by benjamin on 12/18/15.
 */
public class Skill extends RushObject {
    public String id;
    private String name;

    public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
