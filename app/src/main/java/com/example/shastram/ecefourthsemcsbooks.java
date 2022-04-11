package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ecefourthsemcsbooks extends AppCompatActivity {
    TextView link;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecefourthsemcsbooks);
        link = findViewById(R.id.textView15);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        link = findViewById(R.id.textView16);
        link.setMovementMethod(LinkMovementMethod.getInstance());

    }
}