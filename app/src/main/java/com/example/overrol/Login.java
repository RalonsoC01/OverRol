package com.example.overrol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void acceder(View view)
    {
        Intent i= new Intent(this,inicio.class);
        startActivity(i);
    }
    public void registrarme(View view)
    {
        Intent i= new Intent(this,Resgistro.class);
        startActivity(i);
    }
    public void registrarmeEmail(View view)
    {
        Intent i= new Intent(this,EmailLogin.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {


    }
}