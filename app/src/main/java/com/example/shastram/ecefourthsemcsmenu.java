package com.example.shastram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ecefourthsemcsmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecefourthsemcsmenu);
    }
    public void ecefourthsemcsvlOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ecefourthsemcsmenu.this, ecefourthsemcsvl.class);
        startActivity(intent);
    }
    public void ecefourthsemcssyllabusOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ecefourthsemcsmenu.this, ecefourthsemcssyllabus.class);
        startActivity(intent);
    }
    public void ecefourthsemcsnoteOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ecefourthsemcsmenu.this, ecefourthsemcsnote.class);
        startActivity(intent);
    }
    public void ecefourthsemcsbooksOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ecefourthsemcsmenu.this, ecefourthsemcsbooks.class);
        startActivity(intent);
    }
    public void ecefourthsemcsqbOcl(View V){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ecefourthsemcsmenu.this, ecefourthsemcsqb.class);
        startActivity(intent);
    }
}
