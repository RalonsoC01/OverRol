package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class dados2 extends AppCompatActivity {

    private int dadinos;
    private String resultado;
    private int cantidad;
    private EditText cantidades;
    private String Cantidades;
    private TextView tv_Resultado;
    private int apoyo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados2);

       this.cantidades=(EditText)findViewById(R.id.editTextNumeros);

    }

    public void D4(View view)
    {
        this.Cantidades = this.cantidades.getText().toString().trim();
        this.cantidad = Integer.parseInt(this.Cantidades);
        this.tv_Resultado = findViewById(R.id.txtResultado);

        this.apoyo=0;

        for(int i=0; i<cantidad;i++) {
            this.dadinos=(int) (Math.random()*4+1);
            this.apoyo=this.apoyo+this.dadinos;
        }

        this.resultado= "";
        this.resultado= String.valueOf(this.apoyo);
        this.tv_Resultado.setText(resultado);
    }

    public void D6(View view)
    {
        this.Cantidades = this.cantidades.getText().toString().trim();
        this.cantidad = Integer.parseInt(this.Cantidades);
        this.tv_Resultado = findViewById(R.id.txtResultado);

        this.apoyo=0;

        for(int i=0; i<cantidad;i++) {
            this.dadinos=(int) (Math.random()*6+1);
            this.apoyo=this.apoyo+this.dadinos;
        }

        this.resultado= "";
        this.resultado= String.valueOf(this.apoyo);
        this.tv_Resultado.setText(resultado);
    }

    public void D8(View view)
    {
        this.Cantidades = this.cantidades.getText().toString().trim();
        this.cantidad = Integer.parseInt(this.Cantidades);
        this.tv_Resultado = findViewById(R.id.txtResultado);

        this.apoyo=0;

        for(int i=0; i<cantidad;i++) {
            this.dadinos=(int) (Math.random()*8+1);
            this.apoyo=this.apoyo+this.dadinos;
        }

        this.resultado= "";
        this.resultado= String.valueOf(this.apoyo);
        this.tv_Resultado.setText(resultado);
    }

    public void D10(View view)
    {
        this.Cantidades = this.cantidades.getText().toString().trim();
        this.cantidad = Integer.parseInt(this.Cantidades);
        this.tv_Resultado = findViewById(R.id.txtResultado);

        this.apoyo=0;

        for(int i=0; i<cantidad;i++) {
            this.dadinos=(int) (Math.random()*10+1);
            this.apoyo=this.apoyo+this.dadinos;
        }

        this.resultado= "";
        this.resultado= String.valueOf(this.apoyo);
        this.tv_Resultado.setText(resultado);
    }

    public void D12(View view)
    {
        this.Cantidades = this.cantidades.getText().toString().trim();
        this.cantidad = Integer.parseInt(this.Cantidades);
        this.tv_Resultado = findViewById(R.id.txtResultado);

        this.apoyo=0;

        for(int i=0; i<cantidad;i++) {
            this.dadinos=(int) (Math.random()*12+1);
            this.apoyo=this.apoyo+this.dadinos;
        }

        this.resultado= "";
        this.resultado= String.valueOf(this.apoyo);
        this.tv_Resultado.setText(resultado);
    }

    public void D20(View view)
    {
        this.Cantidades = this.cantidades.getText().toString().trim();
        this.cantidad = Integer.parseInt(this.Cantidades);
        this.tv_Resultado = findViewById(R.id.txtResultado);

        this.apoyo=0;

        for(int i=0; i<cantidad;i++) {
            this.dadinos=(int) (Math.random()*20+1);
            this.apoyo=this.apoyo+this.dadinos;
        }

        this.resultado= "";
        this.resultado= String.valueOf(this.apoyo);
        this.tv_Resultado.setText(resultado);
    }

    public void D100(View view)
    {
        this.Cantidades = this.cantidades.getText().toString().trim();
        this.cantidad = Integer.parseInt(this.Cantidades);
        this.tv_Resultado = findViewById(R.id.txtResultado);

        this.apoyo=0;

        for(int i=0; i<cantidad;i++) {
            this.dadinos=(int) (Math.random()*100+1);
            this.apoyo=this.apoyo+this.dadinos;
        }

        this.resultado= "";
        this.resultado= String.valueOf(this.apoyo);
        this.tv_Resultado.setText(resultado);
    }
}