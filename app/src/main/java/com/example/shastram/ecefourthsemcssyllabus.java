package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ecefourthsemcssyllabus extends AppCompatActivity {
    TextView link1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecefourthsemcssyllabus);
        link1 = findViewById(R.id.textView7);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}