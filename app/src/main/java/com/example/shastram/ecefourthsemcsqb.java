package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ecefourthsemcsqb extends AppCompatActivity {
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecefourthsemcsqb);
        link = findViewById(R.id.textView);

        link.setMovementMethod(LinkMovementMethod.getInstance());
    }
}