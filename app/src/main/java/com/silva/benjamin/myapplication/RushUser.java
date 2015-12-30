package com.silva.benjamin.myapplication;

import java.util.List;

import co.uk.rushorm.core.RushCore;
import co.uk.rushorm.core.RushObject;
import co.uk.rushorm.core.annotations.RushList;

public class RushUser extends RushObject {

    public String id;
    private String username;
    @RushList(classType = Skill.class)
    private List<Skill> skills;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public RushUser() {
    }

    @Override
    public void save() {
        RushCore.getInstance().registerObjectWithId(this, id);
        for(Skill skill : getSkills()) {
            RushCore.getInstance().registerObjectWithId(skill, skill.id);
        }
        super.save();
    }
}
