package com.example.stephen.test2;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import com.firebase.client.Firebase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    public static final String TAG = SearchActivity.class.getSimpleName();
    private SeekBar RadiusBar;
    private TextView RadiusText;
    private CheckBox checkBoxCarpenter, checkBoxLocksmith, checkBoxGlazer, checkBoxPlumber, checkBoxElectrician, checkBoxGardener, checkBoxMechanic;
    public static List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        addListenerOnCheckboxes();

        //addListenerOnCarpenter();

        //Toolpbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);




        RadiusBar = (SeekBar)findViewById(R.id.SeekbarID); // make seekbar object
        RadiusBar.setOnSeekBarChangeListener(this);
        RadiusBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int Radius, boolean fromUser) {
                RadiusText = (TextView) findViewById(R.id.RadiusTextID);
                RadiusText.setText("Radius:: KM's " + Radius);
                Log.d(TAG, "" + Radius);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //Done button like create profile
        //once pressed sends to maps where queries start
        final Button done = (Button) findViewById(R.id.donebutton);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if radius and checkbox not null start intent

                //addListenerOnCheckboxes();
                startActivity(new Intent(SearchActivity.this, MapResultsActivity.class));
            }
        });


    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int Radius,
                                  boolean fromUser) {
        // TODO Auto-generated method stub

        RadiusText.setText("Radius:: KM's " + Radius);


    }

    public void addListenerOnCheckboxes() {


        checkBoxCarpenter = (CheckBox) findViewById(R.id.checkBoxCarpenter);
        checkBoxCarpenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //is checkbox checked?
                if (((checkBoxCarpenter.isChecked()))) {

                    //updates user profile with selected skills
                    String Carpenter = "Carpenter";
                    list.add("" + Carpenter);

                } else {
                    list.remove("Carpenter");
                    Log.d(TAG, "REMOVED");
                }
            }
        });

        checkBoxLocksmith = (CheckBox) findViewById(R.id.checkBoxLocksmith);
        checkBoxLocksmith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //is checkbox checked?
                if (((checkBoxLocksmith.isChecked()))) {

                    //updates user profile with selected skills
                    String Locksmith = "Locksmith";
                    list.add("" + Locksmith);
                }else {
                    list.remove("Locksmith");
                    Log.d(TAG, "REMOVED");
                }
            }
        });

        checkBoxGlazer = (CheckBox) findViewById(R.id.checkBoxGlazer);
        checkBoxGlazer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //is checkbox checked?
                if (((checkBoxGlazer.isChecked()))) {

                    //updates user profile with selected skills
                    String Glazer = "Glazer";
                    list.add("" + Glazer);
                }else {
                    list.remove("Glazer");
                    Log.d(TAG, "REMOVED");
                }
            }
        });

        checkBoxPlumber = (CheckBox) findViewById(R.id.checkBoxPlumber);
        checkBoxPlumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //is checkbox checked?
                if (((checkBoxPlumber.isChecked()))) {

                    //updates user profile with selected skills
                    String Plumber = "Plumber";
                    list.add("" + Plumber);

                }else {
                    list.remove("Plumber");
                    Log.d(TAG, "REMOVED");
                }
            }
        });

        checkBoxElectrician = (CheckBox) findViewById(R.id.checkBoxElectrician);
        checkBoxElectrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //is checkbox checked?
                if (((checkBoxElectrician.isChecked()))) {

                    //updates user profile with selected skills
                    String Electrician = "Electrician";
                    list.add("" + Electrician);

                } else {
                    list.remove("Electrician");
                    Log.d(TAG, "REMOVED");
                }
            }
        });

        checkBoxGardener = (CheckBox) findViewById(R.id.checkBoxGardener);
        checkBoxGardener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //is checkbox checked?
                if (((checkBoxGardener.isChecked()))) {

                    //updates user profile with selected skills
                    String Gardener = "Gardener";
                    list.add("" + Gardener);

                }else {
                    list.remove("Gardener");
                    Log.d(TAG, "REMOVED");
                }
            }
        });

        checkBoxMechanic = (CheckBox) findViewById(R.id.checkBoxMechanic);
        checkBoxMechanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //is checkbox checked?
                if (((checkBoxMechanic.isChecked()))) {

                    //updates user profile with selected skills
                    String Mechanic = "Mechanic";
                    list.add("" + Mechanic);

                }else {
                    list.remove("Mechanic");
                    Log.d(TAG, "REMOVED");
                }
            }
        });


    }





}
