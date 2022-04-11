package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class homepageit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepageit);
        TextView link2 = findViewById(R.id.textView2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}