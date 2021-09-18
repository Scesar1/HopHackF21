package com.example.hophacks;

public class Location {

    protected String name;
    protected boolean jCardReq;
    protected boolean foodAllowed;
    protected boolean foodSold;
    protected int hygiene;
    protected int seating;
    protected boolean openNow;
    protected int privacyScale;
    protected boolean vendingFood;
    protected boolean rsvp;

    public Location() {

    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isjCardReq() {
        return jCardReq;
    }

    public void setjCardReq(boolean jCardReq) {
        this.jCardReq = jCardReq;
    }

    public boolean isFoodAllowed() {
        return foodAllowed;
    }

    public void setFoodAllowed(boolean foodAllowed) {
        this.foodAllowed = foodAllowed;
    }

    public boolean isFoodSold() {
        return foodSold;
    }

    public void setFoodSold(boolean foodSold) {
        this.foodSold = foodSold;
    }

    public int getHygiene() {
        return hygiene;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public boolean isOpenNow() {
        return openNow;
    }

    public void setOpenNow(boolean openNow) {
        this.openNow = openNow;
    }

    public int getPrivacyScale() {
        return privacyScale;
    }

    public void setPrivacyScale(int privacyScale) {
        this.privacyScale = privacyScale;
    }

    public boolean isVendingFood() {
        return vendingFood;
    }

    public void setVendingFood(boolean vendingFood) {
        this.vendingFood = vendingFood;
    }

    public boolean isRsvp() {
        return rsvp;
    }

    public void setRsvp(boolean rsvp) {
        this.rsvp = rsvp;
    }
}
