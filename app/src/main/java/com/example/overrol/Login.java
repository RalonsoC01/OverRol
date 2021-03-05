package com.example.overrol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    private EditText Usuario;
    private EditText contrasena;
    private String usuarioStr;
    private String contrsenaStr;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_login);


        Usuario=(EditText) findViewById(R.id.txtEmailLogin);
        contrasena=(EditText) findViewById(R.id.txtContrasenaLogin);
    }


    public void registrarme(View view)
    {
        Intent i= new Intent(this,Resgistro.class);
        startActivity(i);
    }
    public void prueba(View view)
    {
        Intent i= new Intent(this,inicio.class);
        startActivity(i);
    }

    public void pasarIndex(View view){

        usuarioStr= Usuario.getText().toString();
        contrsenaStr = contrasena.getText().toString();
        if (!usuarioStr.isEmpty() && !contrsenaStr.isEmpty()){

            loginUser();
        }else{
            Toast.makeText(Login.this, "El correo o la contraseña no existe.", Toast.LENGTH_SHORT).show();
        }
    }



    private void loginUser() {
        mAuth.signInWithEmailAndPassword(usuarioStr, contrsenaStr).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(Login.this, inicio.class);
                    startActivity(intent);
                    //Finalizar Activity
                    finish();
                }else{
                    Toast.makeText(Login.this, "El correo o la contraseña no existe.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }



    @Override
    public void onClick(View v) {


    }
}