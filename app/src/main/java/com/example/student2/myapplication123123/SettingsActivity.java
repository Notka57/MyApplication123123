package com.example.student2.myapplication123123;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.IdRes;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import static com.example.student2.myapplication123123.R.id.radioBOTTOM;

public class SettingsActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        radioGroup = (RadioGroup) findViewById(R.id.settings);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int buttonId) {
                String side = " ";
                switch (buttonId) {
                    case radioBOTTOM:
                        side = "BOTTOM";
                        break;
                    case R.id.radioLEFT:
                        side = "LEFT";
                        break;
                    case R.id.radioRIGHT:
                        side = "RIGHT";
                        break;
                    case R.id.radioTOP:
                        side = "TOP";
                        break;

                }
                SharedPreferences preferences = getSharedPreferences("button", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("buttonSide", side);
                editor.apply();
            }
        });
    }

}
