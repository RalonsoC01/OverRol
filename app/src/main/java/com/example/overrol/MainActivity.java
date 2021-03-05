package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation animacion1= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        TextView txtBienvenida = findViewById(txtBienvenida);
        ImageView logo = findViewById(logo);

        txtBienvenida.setAnimation(animacion1);
        logo.setAnimation(animacion2);

        new Handler() .postDelayed (new Runnable() {
            @Override
            public void run(){
                Intent intent=new Intent (MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}