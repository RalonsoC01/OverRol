package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Resgistro extends AppCompatActivity {

    //Declaración y asignación de spinner
    private Spinner spinner;
    private String[] genero={
            "Hombre","Mujer","Otro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistro);

        //Spinner
        spinner = findViewById(R.id.spinnerGenero);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, genero);
        spinner.setAdapter(adapter);
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