package com.example.userinputapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    public EditText firstname, lastname, email_address;
    public Button submit_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = findViewById(R.id.first_nameView);

        lastname = findViewById(R.id.last_nameView);

        email_address = findViewById(R.id.email_addressView);


        submit_button = findViewById(R.id.submit_button);




    }

    public void submit(View v){
        String name = firstname.getText().toString().trim();
        String last_name = lastname.getText().toString().trim();
       String email = email_address.getText().toString().trim();
        Toast show_toast = Toast.makeText(MainActivity.this, "Welcome " + name + " " + last_name + "with " + email + ". This shows you have completed your second task!", Toast.LENGTH_LONG);
        show_toast.show();
    }
}