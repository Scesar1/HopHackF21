package com.example.hophacks;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalTime;

public class Findr {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args){

        // boolean jCardHad; // do you have a jCard? if yes = true

        boolean foodAllowed;
        boolean buyFood; // want to buy food? if yes = true
        int desiredHygiene; // 0 = no bathroom, 1 = bathroom nearby,
                            // 2 = bathroom + hygiene products available
        int desiredSeating; // 0 = no seating, 1 = desk chairs/basic seating,
                            // 2 = comfy (lounge) chairs, 3 = couches, extremely comfortable
        int currentTime = (LocalTime.now().getHour() * 100) + LocalTime.now().getMinute(); //local time
        int timeOn2600Scale = currentTime;
        //System.out.println(currentTime);

        if (currentTime < 200) {
            timeOn2600Scale += 2400;
        }

        int desiredPrivacy; // 0 = no privacy, 1 = desk cubicles, 2 = like 1,
                            // but nobody is gonna bother you, 3 = locked doors
        boolean vendingFoodDesired; // true if you want vending machine snacks
        // boolean wantToRsvp; // do you want to have to reserve it?
        int desiredVolume; // 0 = NO TALKING, 1 = very quiet, whisper only, 2 = convos allowed,
                            // 3 = CONVOS WILL BE HAD HERE
        boolean claustrophobicDesired; // do you want to be in an enclosed space?
        boolean vendingSuppliesDesired; // do you want stationery vending? pencils, pens, etc
        boolean[] equipmentDesired; // {computer, projector, whiteboard, printer}



    }
}
