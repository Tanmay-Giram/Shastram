package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eceOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, homepageece.class);
        startActivity(intent);
    }
    public void itOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, homepageit.class);
        startActivity(intent);
    }
    public void csOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, homepagecs.class);
        startActivity(intent);
    }

    public void mechOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, homepagemech.class);
        startActivity(intent);
    }
    public void civilOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, homepagecivil.class);
        startActivity(intent);
    }


}
