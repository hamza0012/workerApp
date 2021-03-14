package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText name, password, confirmpassword;
    String value1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

            name= findViewById(R.id.enterworkername);
            password = findViewById(R.id.workerpassword);
            confirmpassword = findViewById(R.id.workerconfirmpassword);
             value1 = getIntent().getExtras().getString("number");




            }
    public void nexttoSignup(View v){

        Intent intent = new Intent(SignUp.this,Documents_Screen.class);
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("password", password.getText().toString());
        intent.putExtra("wnumber", value1);
        startActivity(intent);
    }
}