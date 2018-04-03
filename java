package com.example.samanthajaime.sjsufreshamanapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Freshman_App extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freshman__app);
    }

    public void buttonOnClick(View v)
    {
        Button button = (Button) v;
        ((Button) v).setText("Clicked");
    }


}
