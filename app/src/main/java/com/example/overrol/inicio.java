package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class inicio extends AppCompatActivity {

    public MediaPlayer musica;
    private boolean sonido=true;
    ImageView estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        musica=MediaPlayer.create(this,R.raw.musicafondo);
        musica.setLooping(true);
        musica.start();
        this.estado = findViewById(R.id.imgSonido);
    }
    public void Daditos(View view)
    {
        musica.stop();
        musica.release();
        Intent i= new Intent(this,SelectorDados.class);
        startActivity(i);
        overridePendingTransition(R.anim.deslizar_derecha, R.anim.deslizar_hacia_izquierda);
    }
    public void CrearFicha(View view)
    {
        musica.stop();
        musica.release();
        Intent i= new Intent(this,fichaPersonaje.class);
        startActivity(i);
        overridePendingTransition(R.anim.deslizar_derecha, R.anim.deslizar_hacia_izquierda);
    }
    public void PoneryQuitarmusica(View view){
        if(sonido){
            musica.pause();
            sonido=false;
            this.estado.setImageResource(R.drawable.mute);
        }else{
            musica.start();
            sonido=true;
            this.estado.setImageResource(R.drawable.volume);
        }
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
    @Override
    protected void onStart(){
        super.onStart();
        try {
            musica.start();
            musica.setLooping(true);
        }catch (IllegalStateException e){

        }
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
        try {
            musica.pause();
            musica.setLooping(false);
        }catch (IllegalStateException e){

        }
    }
}