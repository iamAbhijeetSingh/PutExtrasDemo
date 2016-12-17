package com.abhijeet.putextrasdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        String namefrommain = getIntent().getExtras().getString("name");

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(namefrommain);

    }
}
