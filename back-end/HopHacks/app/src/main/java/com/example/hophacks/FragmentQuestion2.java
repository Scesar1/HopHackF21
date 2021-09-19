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
import com.example.hophacks.databinding.FragmentQuestion2Binding;

@RequiresApi(api = Build.VERSION_CODES.O)
public class FragmentQuestion2 extends Fragment {
    int desiredVolume;


    private @NonNull FragmentQuestion2Binding binding;
    Findr idealSpot = new Findr();
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        binding = FragmentQuestion2Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If user presses 'No'
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'Yes'
            }
        });

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}