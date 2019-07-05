package com.example.buttonandlog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myBtn,myBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //myBlue = (Button) findViewById(R.id.myBlue) ;
        myBtn = (Button) findViewById(R.id.myRed);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("this","clicked");
            }
        });
    }
    public void bluePressed(View view)
    {
        CharSequence c = "hello from blue";
        int duration = Toast.LENGTH_SHORT;
        Toast toast =  Toast.makeText(getApplicationContext(),c,duration);
        toast.show();
    }
}
