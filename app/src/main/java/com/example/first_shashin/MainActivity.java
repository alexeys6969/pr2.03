package com.example.first_shashin;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void OnStepName(View view){
        EditText _name = findViewById(R.id.editTextText);
        String strName = _name.getText().toString();

        setContentView(R.layout.step_2);

        TextView tv = findViewById(R.id.textView2);
        tv.setText("Очень приятно познакомиться "+strName+".\nМеня зовут Бисквит.\n Сколько тебе лет?");
    }
    public void OnStepAge(View view){
        EditText _age = findViewById(R.id.editTextText3);
        String strAge = _age.getText().toString();

        setContentView(R.layout.step_3);

        TextView tv = findViewById(R.id.textView3);
        tv.setText("Ничего себе ты большой, целых "+ strAge +".\nКакого ты пола");
    }
    public void OnStepSex(View view){
        setContentView(R.layout.step_3);
    }
    public void OnStepEmail(View view){
        setContentView(R.layout.step_4);
    }
}