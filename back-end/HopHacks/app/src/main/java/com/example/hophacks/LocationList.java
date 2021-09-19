package com.example.hophacks;

public class LocationList {
    boolean[] equipment = new boolean[4];
    StudySpot[] studySpotList;

    StudySpot mseMLevel = new StudySpot("MSE M-Level", true, true, false, 2,
            100,true, 0, false,
            false, 2, 100, false, false, equipment);

    StudySpot Brody_Atrium = new StudySpot("Brody Atrium", true, true, true, 2,
            100,true, 0, false,
            false, 2, 100, false, false, equipment);

    StudySpot mseALevel = new StudySpot("MSE A-Level", true, true, false, 2,
            100, true, 0, true, false, 1, 100, false,
    false, equipment); //

}
