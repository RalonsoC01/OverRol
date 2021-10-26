package com.example.overrol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Resgistro <Firebase> extends AppCompatActivity implements View.OnClickListener {
    private EditText nombre;
    private EditText email;
    private EditText contrsena;
    private EditText contrsena2;
    private String Genero;
    private TextView TVSeleccion;
    private boolean acepto;
    private Spinner cur;
    private FirebaseAuth mAuth;
    private ProgressDialog progressDialog;



    //Declaración y asignación de spinner
    private Spinner spinner;
    private String[] genero={
            "Hombre","Mujer","Otro"
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistro);

        mAuth = FirebaseAuth.getInstance();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");


        //Spinner
        TVSeleccion=(TextView) findViewById(R.id.tvSeleccion);
        spinner = findViewById(R.id.spinnerGenero);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, genero);



        spinner.setAdapter(adapter);

        nombre=(EditText) findViewById(R.id.txtNombre);
        email=(EditText) findViewById(R.id.txtEmail);
        contrsena=(EditText)findViewById(R.id.txtContrasena);
        contrsena2=(EditText) findViewById(R.id.txtContrasena2);
        this.cur = (Spinner) findViewById(R.id.spinnerGenero);
        this.Genero =  cur.getSelectedItem().toString();

        progressDialog=new ProgressDialog(this);

    }

    public void registrousuario(View view) {

        String txtEmail = email.getText().toString().trim();
        String txtNombre = nombre.getText().toString().trim();
        String txtContrasena = contrsena.getText().toString().trim();
        String txtGenero = Genero;


        if (TextUtils.isEmpty(txtEmail)) {
            Toast.makeText(this, "Se debe ingresar un correo", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(txtContrasena)) {
            Toast.makeText(this, "Falta ingresar la contraseña", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(txtNombre)) {
            Toast.makeText(this, "Falta ingresar el nombre", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(txtGenero)) {
            Toast.makeText(this, "Falta ingresar tu genero", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Registrando...");
        progressDialog.show();
        mAuth.createUserWithEmailAndPassword(txtEmail, txtContrasena)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            usuario usuario = new usuario(txtNombre, txtGenero, txtEmail); //Creacion de un onnjeto de tipo usuario


                            FirebaseDatabase.getInstance().getReference("Usuario")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(usuario).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(Resgistro.this, "Se ha registrado el usuario con el email: " + txtEmail, Toast.LENGTH_SHORT).show();

                                    } else {
                                        if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                            Toast.makeText(getApplicationContext(), "El usuario ya existe", Toast.LENGTH_SHORT).show();
                                            Intent inicio = new Intent(getApplication(), Login.class);
                                        } else {
                                            Toast.makeText(getApplicationContext(), "No se pudo registrar el usuario", Toast.LENGTH_SHORT).show();
                                        }
                                        progressDialog.dismiss();
                                    }
                                }
                            });
                        }
                    }
                });
    }





    //Menu actionBar
   /** public boolean onCreateOptionsMenu(Menu menu){
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
    }*///

    @Override
    public void onClick(View v) {

    }
}