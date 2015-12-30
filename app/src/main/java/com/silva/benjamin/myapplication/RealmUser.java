package com.silva.benjamin.myapplication;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class RealmUser extends RealmObject {

    @PrimaryKey
    private String id;
    @Required
    private String username;
    private RealmList<RealmSkill> skills;

    public RealmUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RealmList<RealmSkill> getSkills() {
        return skills;
    }

    public void setSkills(RealmList<RealmSkill> skills) {
        this.skills = skills;
    }
}
