package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ecefourthsemsubjectselection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecefourthsemsubjectselection);
    }
    public void ececsfourthsemcsOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ecefourthsemsubjectselection.this, ecefourthsemcsmenu.class);
        startActivity(intent);
    }
}