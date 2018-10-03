package com.example.solis.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Solis on 4/25/2018.
 */

public class DisplayActivity extends MainActivity {

    Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_main);


        mHomeButton = findViewById(R.id.home_Button);
        mShowEmail = findViewById(R.id.showEmail_textView);
        mShowPassword = findViewById(R.id.showPassword_TextView);


        String k1 = getIntent().getStringExtra("EmailValue");
        mShowEmail.setText(k1);

        String k2 = getIntent().getStringExtra("PasswordValue");
        mShowPassword.setText(k2);

        final Intent i2 = new Intent(getApplicationContext(), MainActivity.class);


        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(i2);
            }
        });




    }
}
