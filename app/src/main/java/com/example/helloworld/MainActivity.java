package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
    }

    private void initButton() {
        final Button mButton = (Button) findViewById(R.id.button);

        if (mButton != null) {
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showToast();
                }
            });
        }
    }

    private void showToast() {
        final Toast toast = Toast.makeText(this, getString(R.string.toast_message_text), Toast.LENGTH_LONG);
        final LinearLayout toastContainer = (LinearLayout) toast.getView();
        final ImageView epamImageView = new ImageView(this);

        toast.setGravity(Gravity.CENTER, 0, 0);
        epamImageView.setImageResource(R.drawable.epam_logo);
        toastContainer.addView(epamImageView, -1);
        toast.show();
    }
}