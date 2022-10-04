package com.example.laba3_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    public void onClick(View v) {
        EditText nameText = findViewById(R.id.name);
        EditText companyText = findViewById(R.id.company);
        EditText ageText = findViewById(R.id.age);
        EditText numberText = findViewById(R.id.number);
        EditText emailText = findViewById(R.id.email);
        CheckBox chbx1 = findViewById(R.id.checkBox);
        CheckBox chbx2 = findViewById(R.id.checkBox2);
       String weapon;

        String name = nameText.getText().toString();
        String company = companyText.getText().toString();
        String email = emailText.getText().toString();
        String number = numberText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        Character character;
        if (chbx1.isChecked() == true && chbx2.isChecked() == false) {
                weapon = chbx1.getText().toString();
            } else if (chbx2.isChecked() == true && chbx1.isChecked() == false) {
                weapon = chbx2.getText().toString();
            } else if (chbx1.isChecked() == true && chbx2.isChecked() == true) {
                weapon = chbx1.getText().toString() + "; " + chbx2.getText().toString();
            } else {
                weapon = "not select";
            }
            if(number == null || number == "" || email == null|| email ==""){
                character = new Character(name, company, age, weapon);
            }
            else{
                character = new Character(name, company, age, weapon,email,number);
            }

            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(Character.class.getSimpleName(), character);
            startActivity(intent);


    }
}