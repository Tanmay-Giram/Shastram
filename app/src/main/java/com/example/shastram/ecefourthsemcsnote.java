package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ecefourthsemcsnote extends AppCompatActivity {
    TextView link2;
    TextView link3;
    TextView link4;
    TextView link5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecefourthsemcsnote);
        link2 = findViewById(R.id.textView8);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link3 = findViewById(R.id.textView9);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        link4 = findViewById(R.id.textView10);
        link4.setMovementMethod(LinkMovementMethod.getInstance());
        link5 = findViewById(R.id.textView11);
        link5.setMovementMethod(LinkMovementMethod.getInstance());
    }
}