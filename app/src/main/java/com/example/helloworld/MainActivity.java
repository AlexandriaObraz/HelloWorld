package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick (View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "Hello Epam!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer =(LinearLayout) toast.getView();
        ImageView epamView = new ImageView(getApplicationContext());
        epamView.setImageResource(R.drawable.epam_151x105);
        toastContainer.addView(epamView, -1);
        toast.show();
    }
}
