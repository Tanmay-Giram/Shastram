package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;

import android.os.Bundle;
import android.widget.TextView;

public class ecefourthsemcsvl extends AppCompatActivity {
    TextView link;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecefourthsemcsvl);
        link = findViewById(R.id.textView6);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        link = findViewById(R.id.textView12);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        link = findViewById(R.id.textView13);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        link = findViewById(R.id.textView14);
        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

}