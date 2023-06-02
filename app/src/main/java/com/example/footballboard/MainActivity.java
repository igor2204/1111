package com.example.footballboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer firstteam = 0;
    private Integer secondteam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnAddFirsT(View View) {
        firstteam++;
        TextView counterView = findViewById(R.id.firstteam_counter);
        counterView.setText(firstteam.toString());
    }

    public void onClickBtnAddSecondT(View View) {
        secondteam++;
        TextView counterView = findViewById(R.id.secondteam_counter);
        counterView.setText(secondteam.toString());
    }

    public void Reset(View View) {
        firstteam = 0;
        TextView counterView = findViewById(R.id.firstteam_counter);
        counterView.setText(firstteam.toString());
        secondteam = 0;
        TextView counterView1 = findViewById(R.id.secondteam_counter);
        counterView1.setText(secondteam.toString());
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("first", firstteam );
        outState.putInt("second", secondteam);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("first")) {
            firstteam = savedInstanceState.getInt("first");
            TextView counterView = findViewById(R.id.firstteam_counter);
            counterView.setText(firstteam.toString());
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("second")) {
            secondteam = savedInstanceState.getInt("second");
            TextView counterView = findViewById(R.id.secondteam_counter);
            dcounterView.setText(secondteam.toString());
        }

    }
}