package com.example.first_shashin;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void OnStepAge(View view){
        setContentView(R.layout.step_2);
    }
    public void OnStepSex(View view){
        setContentView(R.layout.step_3);
    }
    public void OnStepEmail(View view){
        setContentView(R.layout.step_4);
    }
}