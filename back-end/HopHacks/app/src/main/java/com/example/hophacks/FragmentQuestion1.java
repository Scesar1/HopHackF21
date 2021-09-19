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
    Findr finderScore = new Findr();
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
                finderScore.desiredVolume = desiredVolume;
                System.out.println("poke!");
            }
        });

        binding.imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desiredVolume = 1;
                finderScore.desiredVolume = desiredVolume;
                System.out.println("poke!");
            }
        });

        binding.imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desiredVolume = 2;
                finderScore.desiredVolume = desiredVolume;
                System.out.println("poke!");
            }
        });
        binding.imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desiredVolume = 3;
                finderScore.desiredVolume = desiredVolume;
                System.out.println("poke!");
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}