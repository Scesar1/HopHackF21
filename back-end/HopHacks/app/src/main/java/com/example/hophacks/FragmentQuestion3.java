package com.example.hophacks;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hophacks.databinding.FragmentQuestion2Binding;
import com.example.hophacks.databinding.FragmentQuestion3Binding;

@RequiresApi(api = Build.VERSION_CODES.O)
public class FragmentQuestion3 extends Fragment {

    private @NonNull
    FragmentQuestion3Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        binding = FragmentQuestion3Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    // FOOD????

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If user presses 'NoSeat'
                SpotsViewModel.idealSpot.setDesiredSeating(0);
            }
        });

        binding.imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'desk chair'
                SpotsViewModel.idealSpot.setDesiredSeating(1);
            }
        });

        binding.imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'lounge chair'
                SpotsViewModel.idealSpot.setDesiredSeating(2);
            }
        });

        binding.imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'sofa'
                SpotsViewModel.idealSpot.setDesiredSeating(3);
            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'with other people'
                SpotsViewModel.idealSpot.setDesiredPrivacy(0);
            }
        });

        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'alone but ok'
                SpotsViewModel.idealSpot.setDesiredPrivacy(1);
            }
        });

        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'i dont want to be bothered'
                SpotsViewModel.idealSpot.setDesiredPrivacy(2);
            }
        });

        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'super private'
                SpotsViewModel.idealSpot.setDesiredSeating(3);
            }
        });

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}