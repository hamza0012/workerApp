package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Verify_Code extends AppCompatActivity {

    TextView firstheading;
    TextView secondheading;
    EditText editphone;
    String phonestring;
    LinearLayout numbersec;
    RelativeLayout relativeLayout,relativeLayout2,relativeLayout3,relativeLayout4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify__code);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



         firstheading = findViewById(R.id.firsthead);
         secondheading = findViewById(R.id.secondhead);
         editphone = findViewById(R.id.workerphonenumber);
         numbersec = findViewById(R.id.numbersection);


         //2nd Activity
         relativeLayout = findViewById(R.id.codedigits);
            relativeLayout2 = findViewById(R.id.verify);
        relativeLayout3=findViewById(R.id.contnuetoverify);

        relativeLayout.setVisibility(View.INVISIBLE);
        relativeLayout2.setVisibility(View.INVISIBLE);

    }

    public void onClickContinue(View v){

        firstheading.setText("Verify Code");
        phonestring = editphone.getText().toString();
        secondheading.setText("Code has sent on your "+phonestring);
        numbersec.setVisibility(View.INVISIBLE);

        relativeLayout.setVisibility(View.VISIBLE);
        relativeLayout2.setVisibility(View.VISIBLE);
        relativeLayout3.setVisibility(View.INVISIBLE);

    }
    public void verfiyCode(View v){

        Intent intent = new Intent(Verify_Code.this,SignUp.class);
        intent.putExtra("number", editphone.getText().toString());
        startActivity(intent);
    }
}