package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void Daditos(View view)
    {
        Intent i= new Intent(this,dados.class);
        startActivity(i);
    }
    public void Inicio(View view)
    {
        Intent i= new Intent(this,inicio.class);
        startActivity(i);
    }
    public void CrearFicha(View view)
    {
        Intent i= new Intent(this,fichaPersonaje.class);
        startActivity(i);
    }

    //Menu actionBar
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_atras, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id =item.getItemId();

        if(id == R.id.menu_atras){
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
            finish();
        }

        return true;
    }
}