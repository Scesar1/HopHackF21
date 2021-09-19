package com.example.hophacks;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.ViewModel;

@RequiresApi(api = Build.VERSION_CODES.O)
public class SpotsViewModel extends ViewModel {
    protected static Findr idealSpot = new Findr();
}
