package com.example.solis.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mSubmit;
    EditText mEmail;
    EditText mPassword;
    TextView mShowEmail;
    TextView mShowPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSubmit = findViewById(R.id.vbt_Button);
        mEmail = findViewById(R.id.enterEmail_editText);
        mPassword = findViewById(R.id.enterPassword_editText);



        final Intent i = new Intent(getApplicationContext(), DisplayActivity.class);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Submit Button has been pressed", Toast.LENGTH_SHORT).show();

                i.putExtra("EmailValue", mEmail.getText().toString());
                i.putExtra("PasswordValue", mPassword.getText().toString());

                startActivity(i);


            }
        });
    }
}
