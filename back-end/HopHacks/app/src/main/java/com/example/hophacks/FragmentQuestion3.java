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

/**
 * A simple {@link Fragment} subclass.
 * Use the factory method to
 * create an instance of this fragment.
 */
@RequiresApi(api = Build.VERSION_CODES.O)
public class FragmentQuestion3 extends Fragment {
    public SpotsViewModel spotsView;

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

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If user presses 'No'
                spotsView.idealSpot.setFoodDesired(false);
            }
        });

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user presses 'Yes'
                spotsView.idealSpot.setFoodDesired(true);
            }
        });

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}