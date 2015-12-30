package com.silva.benjamin.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by benjamin on 12/18/15.
 */
public class RealmSkill extends RealmObject {
    @PrimaryKey
    private String id;
    @Required
    private String name;

    public RealmSkill() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
