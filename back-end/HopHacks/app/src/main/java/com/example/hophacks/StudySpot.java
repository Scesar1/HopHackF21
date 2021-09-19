package com.example.hophacks;

public class StudySpot extends Location {

    boolean claustrophobic;
    boolean vendingSupplies;
    boolean[] equipment = new boolean[4]; //computer, projector, whiteboard, printer

    public StudySpot(String name, boolean jCardReq, boolean foodAllowed, boolean foodSold,
                     int hygiene, int seating, boolean openNow, int privacy,
                     boolean vendingFood, boolean rsvp, int volume, int capacity, boolean claustrophobic,
                     boolean vendingSupplies, boolean[] equipment){

        super(name, jCardReq, foodAllowed, foodSold, hygiene, seating, openNow,
                privacy, vendingFood,rsvp,volume,capacity);
        this.setClaustrophobic(claustrophobic);
        this.setVendingSupplies(vendingSupplies);
        this.setEquipment(equipment);

    }


    public boolean isClaustrophobic() {
        return claustrophobic;
    }

    public void setClaustrophobic(boolean claustrophobic) {
        this.claustrophobic = claustrophobic;
    }

    public boolean isVendingSupplies() {
        return vendingSupplies;
    }

    public void setVendingSupplies(boolean vendingSupplies) {
        this.vendingSupplies = vendingSupplies;
    }

    public boolean[] getEquipment() {
        return equipment;
    }

    public void setEquipment(boolean[] equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Study Spot: " + super.toString();
    }

}
