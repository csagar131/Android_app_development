package com.example.customegradleapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonPressed(View view)
    {
        switch (view.getId())
        {
            case R.id.btnError:
                Toasty.error(this,"error occured",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.btnSucces:
                Toasty.success(this,"success login",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.btnInfo:
                Toasty.info(this,"info found",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.btnWarning:
                Toasty.warning(this,"there is a warning",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.btnImage:
                Toasty.normal(this,"error occured",Toasty.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_cloud)).show();
                break;

        }

    }
}
