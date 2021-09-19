package com.example.hophacks;
import android.app.Activity;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.time.LocalTime;


public class Findr {
    //public double score;
    boolean foodDesired; // want food? if yes = true
    int desiredHygiene; // 0 = no bathroom, 1 = bathroom nearby,
    // 2 = bathroom + hygiene products available
    int desiredSeating; // 0 = no seating, 1 = desk chairs/basic seating,
    // 2 = comfy (lounge) chairs, 3 = couches, extremely comfortable
    int desiredPrivacy; // 0 = no privacy, 1 = desk cubicles, 2 = like 1,
    // but nobody is gonna bother you, 3 = locked doors
    //boolean vendingFoodDesired; // true if you want vending machine snacks
    // boolean wantToRsvp; // do you want to have to reserve it?
    int desiredVolume; // 0 = NO TALKING, 1 = very quiet, whisper only, 2 = convos allowed,
    // 3 = CONVOS WILL BE HAD HERE
    boolean claustrophobicDesired; // do you want to be in an enclosed space?
    //boolean vendingSuppliesDesired; // do you want stationery vending? pencils, pens, etc
    boolean[] equipmentDesired; // {computer, projector, whiteboard, printer}
    int time;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Findr(){
        time = (LocalTime.now().getHour() * 100) + LocalTime.now().getMinute(); //local time
        if (time < 200) {
            time += 2400;
        }
    }

    /*
    public void updateScore(int score) {
        this.score += score;
    }
    */

    public double calculateScore(StudySpot studySpot) {

        double Score = 100;

        // if studySpot is closed, returns a score of -1, which automatically removes it from reccs

        if (!((this.time >= studySpot.openTime) && (this.time <= studySpot.closingTime))) {
            return -1;
        } else if (studySpot.closingTime - this.time < 200) {
            Score -= (1000 / (studySpot.closingTime - this.time));
        }


        //volume score mod
        Score -= 20 * Math.abs(this.desiredVolume - studySpot.getVolume());
        //equipment score mod
        for (int i = 0; i < equipmentDesired.length; i++){
            if (this.equipmentDesired[i] && !studySpot.equipment[i]) {
                Score -= 35;
            }
        }
        //privacy score mod
        Score -= 17 * Math.abs(this.desiredPrivacy - studySpot.getPrivacy());
        //seating score mod
        Score -= 12 * Math.abs(this.desiredSeating - studySpot.getSeating());
        //food score mod
        if (this.foodDesired) {
            if (!studySpot.isFoodAllowed()){
                Score -= 30;
            } else {
                if (studySpot.isVendingFood()) {
                    Score += 13;
                }
                if (studySpot.isFoodSold()) {
                    Score += 18;
                }
                if (studySpot.isVendingFood() && studySpot.isFoodSold()) {
                    Score+= 7;
                }
            }
        }
        //rsvp score mod
        if (!studySpot.isRsvp()) {
            Score += 15;
        }
        //jcard score mod
        if (!studySpot.isjCardReq()) {
            Score += 10;
        }
        //hygiene score mod
        if (studySpot.getHygiene() == 0) {
            Score -= 5;
        } else {
            Score += 5 * studySpot.getHygiene();
        }


        return Score;
    }
}
