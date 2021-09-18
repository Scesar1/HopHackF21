package com.example.hophacks;

public class StudySpot extends Location {

    boolean claustrophobic;
    boolean vendingSupplies;
    boolean[] equipment = new boolean[4]; //computer, projector, whiteboard, printer

    public StudySpot() {

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
