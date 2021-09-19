package com.example.hophacks;

import androidx.annotation.NonNull;

public class LocationList {
    public static void main(String[] args) {

        boolean[] equipment = new boolean[4];
        boolean[] noEquipment = {/*computers*/ false, /*projectors*/ false, /*whiteboards*/ false, /*printers*/ false};
        boolean[] justWhiteboard = {false, false, true, false};
        boolean[] whiteboardAndProjector = {false, true, true, false};
        boolean[] whiteboardAndPrinters = {false, false, true, true};
        boolean[] justPrinters = {false, false, false, true};

        // TODO: set equipment for each location

        //TODO: check if openNow -- make an hours variable in location obj? and then crosscheck with current time
        //boolean isOpen = true;

        //TODO: find real max occupancy for capacity variable


        StudySpot brodyAtrium = new StudySpot("Brody Atrium", true, true, true, 2,
                2, 800,2600, 0, false,
                false, 3, false, false, whiteboardAndProjector);

        StudySpot mseMLevel = new StudySpot("MSE M-Level", true, true, false, 2,
                2, 800,2600, 0, false,
                false, 3, false, false, whiteboardAndPrinters);

        StudySpot mseALevel = new StudySpot("MSE A-Level", true, true, false, 2,
                1, 800,2600, 0, true,
                false, 3, false, false, noEquipment);

        StudySpot mseBLevel = new StudySpot("MSE B-Level", true, true, false, 1,
                1, 800,2600, 1, false,
                false, 1, false, false, equipment);

        StudySpot mseCLevel = new StudySpot("MSE C-Level", true, true, false, 1,
                1, 800,2600, 2, false, false, 0, true,
                false, noEquipment);

        StudySpot mseDLevel = new StudySpot("MSE D-Level", true, true, false, 1,
                1, 800,2600, 2, false, false, 0, true,
                false, noEquipment);

        StudySpot visualizationStudio = new StudySpot("A-Level Visualization Studio", true, true, false, 1,
                1, 800,2600, 2, false, false, 3, false,
                false, equipment);

        StudySpot mseStudyRooms = new StudySpot("MSE Study Rooms", true, true, false, 1,
                1, 800,2600, 3, false, true, 3, true,
                false, justWhiteboard);

        StudySpot brodyStudyRooms = new StudySpot("Brody Study Rooms", true, true, false, 1,
                1, 800,2600, 3, false, true, 3, true,
                false, whiteboardAndProjector);

        StudySpot brodyCafe = new StudySpot("Brody Cafe", true, true, true, 0,
                1, 830,1600, 0, false, false, 3, false,
                false, noEquipment);

        StudySpot brodyTerrace = new StudySpot("Brody Terrace", false, true, false, 0,
                1, 0,2600, 0, false, false, 3, false,
                false, noEquipment);

        StudySpot leveringLounge = new StudySpot("Levering Lounge", true, true, false, 1,
                3, 730,2400, 0, true, false, 3, false,
                false, noEquipment);

        StudySpot hutReadingRoom = new StudySpot("Hutzler Reading Room", false, false, false, 1,
                3, 0,2600, 0, false, false, 0, false,
                false, justPrinters);

        StudySpot beach = new StudySpot("The Beach", false, true, false, 0,
                1, 0,2600, 0, false, false, 3, false,
                false, noEquipment);

        StudySpot muddAtrium = new StudySpot("Mudd Atrium", false, true, true, 1,
                3, 0, 2600,0, false, false, 3, false,
                false, noEquipment);

        StudySpot brodyReadingRoom = new StudySpot("Brody Reading Room", true, false, false, 1,
                3, 1000,1700, 1, false, true, 0, false,
                false, noEquipment);


        StudySpot[] studySpotsList = {brodyAtrium, mseMLevel, mseALevel, mseBLevel, mseCLevel, mseDLevel,
                visualizationStudio, mseStudyRooms, brodyStudyRooms, brodyCafe, brodyTerrace,
                leveringLounge, hutReadingRoom, beach, muddAtrium, brodyReadingRoom};

        printStudySpots(studySpotsList);

    }

    private static void printStudySpots(@NonNull StudySpot[] spots) {
        for (StudySpot s : spots) {
            System.out.println(s);
        }
    }

}
