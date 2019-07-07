package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // for the customized image we have to create a vector asset
    // so go to file new and create vector asset
    public void buttonPressed(View view)
    {
        //Toast.makeText(this,"pressed",Toast.LENGTH_SHORT).show();
        customLayout("customized toast");
    }

    public void customLayout(String string)
    {
        LayoutInflater inflater = getLayoutInflater();
        //  by the next line we have got the complete layout reference which is of view type
        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText(string);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,150,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    public void emailPressed(View view)
    {
        customeLayout1();
    }

    public void customeLayout1()
    {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custome_email,(ViewGroup) findViewById(R.id.toast_root_email));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
