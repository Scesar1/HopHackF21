package com.example.hophacks;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.hophacks.databinding.FragmentQuestion1Binding;

@RequiresApi(api = Build.VERSION_CODES.O)
public class FragmentQuestion1 extends Fragment {
    int desiredVolume;


    private FragmentQuestion1Binding binding;
    //Findr idealSpot = new Findr();
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        binding = FragmentQuestion1Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desiredVolume = 0;
                SpotsViewModel.idealSpot.setDesiredVolume(desiredVolume);
                System.out.println("poke! desiredVolume is " + desiredVolume);
            }
        });

        binding.imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desiredVolume = 1;
                SpotsViewModel.idealSpot.setDesiredVolume(desiredVolume);
                System.out.println("poke! desiredVolume is " + desiredVolume);
            }
        });

        binding.imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desiredVolume = 2;
                SpotsViewModel.idealSpot.setDesiredVolume(desiredVolume);
                System.out.println("poke! desiredVolume is " + desiredVolume);
            }
        });
        binding.imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desiredVolume = 3;
                SpotsViewModel.idealSpot.setDesiredVolume(desiredVolume);
                System.out.println("poke! desiredVolume is " + desiredVolume);
            }
        });

        binding.button.setOnClickListener(new View.OnClickListener() { // computers
            @Override
            public void onClick(View view) {
                SpotsViewModel.idealSpot.equipmentDesired[0] = true;
                System.out.println("Computer desired!");
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() { // projector
            @Override
            public void onClick(View view) {
                SpotsViewModel.idealSpot.equipmentDesired[1] = true;
                System.out.println("Projector desired.");
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() { // whiteboard
            @Override
            public void onClick(View view) {
                SpotsViewModel.idealSpot.equipmentDesired[2] = true;
                System.out.println("Whiteboard desired.");
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() { // printers
            @Override
            public void onClick(View view) {
                SpotsViewModel.idealSpot.equipmentDesired[3] = true;
                System.out.println("Printer desired.");
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}