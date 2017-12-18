package com.example.student2.myapplication123123;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.layout);


    }


    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences preferences = getSharedPreferences("button", MODE_PRIVATE);
        String side = preferences.getString("buttonSide", "");
        Toast toast = Toast.makeText(this, "Side:" + side, Toast.LENGTH_SHORT);
        toast.show();
        switch (side) {
            case "TOP":
                layout.setGravity(Gravity.TOP);
                break;
            case "BOTTOM":
                layout.setGravity(Gravity.BOTTOM);
                break;
            case "RIGHT":
                layout.setGravity(Gravity.RIGHT);
                break;
            case "LEFT":
                layout.setGravity(Gravity.LEFT);
                break;
        }
    }

public void startSettings(View v){
   startActivity (new Intent (this, SettingsActivity.class));
}
}
