package com.example.hophacks;

import android.os.Build;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import com.example.hophacks.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    StudySpot[] best5match = SpotsViewModel.idealSpot.rankSpots();
    StudySpot bestMatch = best5match[0];
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewPager = findViewById(R.id.viewpager);

        //Setting up the adapter
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Adding the fragments

        viewPagerAdapter.add(new FirstFragment(), "Page 0");
        viewPagerAdapter.add(new FragmentQuestion1(), "Page 1");
        viewPagerAdapter.add(new FragmentQuestion2(), "Page 2");
        viewPagerAdapter.add(new FragmentQuestion3(), "Page 3");

        if (bestMatch.getName().equals("Brody Atrium")) {
            viewPagerAdapter.add(new fragment4(), "Page 4");
        }
        if (bestMatch.getName().equals("Brody Reading Room")) {
            viewPagerAdapter.add(new fragment5(), "Page 4");
        }
        if (bestMatch.getName().equals("Brody Terrace")) {
            viewPagerAdapter.add(new fragment6(), "Page 4");
        }
        if (bestMatch.getName().equals("Hutzler Reading Room")) {
            viewPagerAdapter.add(new fragment7(), "Page 4");
        }
        if (bestMatch.getName().equals("Levering Lounge")) {
            viewPagerAdapter.add(new fragment8(), "Page 4");
        }
        if (bestMatch.getName().equals("MSE A-Level")) {
            viewPagerAdapter.add(new fragment9(), "Page 4");
        }
        if (bestMatch.getName().equals("MSE B-Level")) {
            viewPagerAdapter.add(new fragment10(), "Page 4");
        }
        if (bestMatch.getName().equals("MSE C-Level")) {
            viewPagerAdapter.add(new fragment11(), "Page 4");
        }
        if (bestMatch.getName().equals("MSE D-Level")) {
            viewPagerAdapter.add(new fragment12(), "Page 4");
        }
        if (bestMatch.getName().equals("MSE Study Rooms")) {
            viewPagerAdapter.add(new fragment13(), "Page 4");
        }
        if (bestMatch.getName().equals("MSE M-Level")) {
            viewPagerAdapter.add(new fragment14(), "Page 4");
        }
        if (bestMatch.getName().equals("Mudd Atrium")) {
            viewPagerAdapter.add(new fragment15(), "Page 4");
        }
        if (bestMatch.getName().equals("Visualization Studio")) {
            viewPagerAdapter.add(new fragment16(), "Page 4");
        }
        if (bestMatch.getName().equals("The Beach")) {
            viewPagerAdapter.add(new fragment17(), "Page 4");
        }
        if (bestMatch.getName().equals("Brody Cafe")) {
            viewPagerAdapter.add(new fragment18(), "Page 4");
        }

        //Set the Adapter
        viewPager.setAdapter(viewPagerAdapter);

        //For the tabs
        /*
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);*/

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().hide();


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        /*
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void Check(View v) {
        String msg ="";
        if(checkBox1.isChecked()) {
            System.out.println("Computer");
        }
        if(checkBox2.isChecked()) {
            System.out.println("Projector");
        }
        if(checkBox3.isChecked()) {
            System.out.println("Whiteboard");
        }
        if(checkBox4.isChecked()) {
            System.out.println("Printer");
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}