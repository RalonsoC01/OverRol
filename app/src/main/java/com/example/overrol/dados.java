package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class dados extends AppCompatActivity {
    int d4;
    int d6;
    int d8;
    int d10;
    int d12;
    int d20;
    int d100;
    String resultado;
    private TextView tv_dadosd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        tv_dadosd = findViewById(R.id.textDados);
    }

    public void Inicio(View view)
    {
        Intent i= new Intent(this,inicio.class);
        startActivity(i);
    }

    public void D4(View view)
    {
        this.d4=(int) (Math.random()*4+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.d4);
        tv_dadosd.setText(resultado);
    }
    public void D6(View view)
    {
        this.d6=(int) (Math.random()*6+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.d6);
        tv_dadosd.setText(resultado);
    }
    public void D8(View view)
    {
        this.d8=(int) (Math.random()*8+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.d8);
        tv_dadosd.setText(resultado);
    }
    public void D10(View view)
    {
        this.d10=(int) (Math.random()*10+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.d10);
        tv_dadosd.setText(resultado);
    }
    public void D12(View view)
    {
        this.d12=(int) (Math.random()*12+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.d12);
        tv_dadosd.setText(resultado);
    }
    public void D20(View view)
    {
        this.d20=(int) (Math.random()*20+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.d20);
        tv_dadosd.setText(resultado);
    }
    public void D100(View view)
    {
        this.d100=(int) (Math.random()*100+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.d100);
        tv_dadosd.setText(resultado);
    }

    //Menu actionBar
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_atras, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id =item.getItemId();

        if(id == R.id.menu_atras){
            Intent intent = new Intent(this, inicio.class);
            startActivity(intent);
            finish();
        }

        return true;
    }
}