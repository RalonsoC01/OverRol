package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class inicio extends AppCompatActivity {

    private MediaPlayer musica;
    private boolean sonido=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        musica=MediaPlayer.create(this,R.raw.musicafondo);
        musica.setLooping(true);
        musica.start();
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
    public void Poneryquitarmusica(View view){
        if(sonido==true){
            musica.stop();
            sonido=false;
        }else{
            musica.start();
            sonido=true;
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
    protected void onDestroy() {
        super.onDestroy();
        if(musica.isPlaying())
        {
            musica.stop();
            musica.release();
        }
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        musica.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        musica.pause();
    }
}