package com.mvrsoftware.rebrickable.model;

public class BrickSet {
    private String setNumber;
    private int year;
    private int themeId;
    private int numberParts;
    private String imageUrl;
    private String setUrl;

    public String getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(String setNumber) {
        this.setNumber = setNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public int getNumberParts() {
        return numberParts;
    }

    public void setNumberParts(int numberParts) {
        this.numberParts = numberParts;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSetUrl() {
        return setUrl;
    }

    public void setSetUrl(String setUrl) {
        this.setUrl = setUrl;
    }
}
