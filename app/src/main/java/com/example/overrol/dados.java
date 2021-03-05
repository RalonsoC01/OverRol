package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class dados extends AppCompatActivity {
    int dado;
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
        overridePendingTransition(R.anim.delizar_izquierda, R.anim.deslizar_hacia_derecha);
    }

    public void D4(View view)
    {
        this.dado=(int) (Math.random()*4+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.dado);
        tv_dadosd.setText(resultado);
    }
    public void D6(View view)
    {
        this.dado=(int) (Math.random()*6+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.dado);
        tv_dadosd.setText(resultado);
    }
    public void D8(View view)
    {
        this.dado=(int) (Math.random()*8+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.dado);
        tv_dadosd.setText(resultado);
    }
    public void D10(View view)
    {
        this.dado=(int) (Math.random()*10+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.dado);
        tv_dadosd.setText(resultado);
    }
    public void D12(View view)
    {
        this.dado=(int) (Math.random()*12+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.dado);
        tv_dadosd.setText(resultado);
    }
    public void D20(View view)
    {
        this.dado=(int) (Math.random()*20+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.dado);
        tv_dadosd.setText(resultado);
    }
    public void D100(View view)
    {
        this.dado=(int) (Math.random()*100+1);
        this.resultado= "";
        this.resultado= String.valueOf(this.dado);
        tv_dadosd.setText(resultado);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.delizar_izquierda, R.anim.deslizar_hacia_derecha);
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    protected void onResume(){
        super.onResume();
    }
    @Override
    protected void onPause(){
        super.onPause();
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