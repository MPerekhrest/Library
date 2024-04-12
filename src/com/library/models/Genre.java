package com.library.models;
public class Genre {
    private String name;
    private String description;
    @Override
    public String toString() {
        return "Genre : " +
                " name = " + name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
