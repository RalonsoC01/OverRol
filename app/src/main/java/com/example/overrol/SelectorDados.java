package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectorDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selector_dados);
    }
    public void Daditos(View view)
    {
        Intent i= new Intent(this,dados.class);
        startActivity(i);
        overridePendingTransition(R.anim.deslizar_derecha, R.anim.deslizar_hacia_izquierda);
    }
    public void Dados2(View view){
        Intent i =new Intent(this,dados2.class);
        startActivity(i);
        overridePendingTransition(R.anim.deslizar_derecha, R.anim.deslizar_hacia_izquierda);
    }
}