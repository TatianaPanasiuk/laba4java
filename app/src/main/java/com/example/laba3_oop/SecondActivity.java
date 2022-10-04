package com.example.laba3_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.seekBarValue);



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView.setText(String.valueOf(progress));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        TextView nameView = findViewById(R.id.nameLabel);
        TextView companyView = findViewById(R.id.favoriteWord);
        TextView ageView = findViewById(R.id.ageLabel);
        TextView weapon = findViewById(R.id.weapon);
        TextView number = findViewById(R.id.number);
        TextView email = findViewById(R.id.email);


        Bundle arguments = getIntent().getExtras();
        Character character;
        if(arguments!=null)
        {
            character = (Character) arguments.getSerializable(Character.class.getSimpleName());
            nameView.setText("Name:"+ character.getName());
            companyView.setText("Favorite word:"+ character.getCompany());
            ageView.setText("Age:"+ character.getAge());
            weapon.setText("Weapon: "+ character.getWeapon());
            number.setText("Number: "+ character.getNumber());
            email.setText("E-mail: "+ character.getEmail());


        }




    }

    public void onClick(View v) {

        TextView nameView = findViewById(R.id.nameLabel);
        TextView companyView = findViewById(R.id.favoriteWord);
        TextView ageView = findViewById(R.id.ageLabel);
        TextView numberView = findViewById(R.id.number);
        TextView emailView = findViewById(R.id.email);
        TextView weaponView = findViewById(R.id.weapon);
        String name = nameView.getText().toString();
        String company = companyView.getText().toString();
        int age = Integer.parseInt(ageView.getText().toString());
        String number = numberView.getText().toString();
        String email = emailView.getText().toString();
        String weapon = weaponView.getText().toString();
        Character character = new Character(name,company,age,weapon,email,number);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(Character.class.getSimpleName(), character);
        startActivity(intent);
    }



    public void onRadioButtonClicked(View view) {
// если переключатель отмечен
        boolean checked = ((RadioButton) view).isChecked();

        TextView selection = findViewById(R.id.selection);


// Получаем нажатый переключатель
        switch(view.getId()) {
            case R.id.human:
                if (checked){
                    selection.setText("You are Human");


                }

                break;
            case R.id.elf:
                if (checked){
                    selection.setText("You are Elf");


                }

                break;
            case R.id.animal:
                if (checked){
                    selection.setText("You are Animal");


                }

                break;
        }
    }

}