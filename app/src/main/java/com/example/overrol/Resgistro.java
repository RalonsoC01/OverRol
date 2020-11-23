package com.example.overrol;

import androidx.appcompat.app.AppCompatActivity;

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

public class Resgistro <Firebase> extends AppCompatActivity implements View.OnClickListener {
    private EditText nombre;
    private EditText email;
    private EditText contrsena;
    private EditText contrsena2;
    private TextView TVSeleccion;
    private boolean acepto;



    //Declaración y asignación de spinner
    private Spinner spinner;
    private String[] genero={
            "Hombre","Mujer","Otro"
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistro);

        //Spinner
        TVSeleccion=(TextView) findViewById(R.id.tvSeleccion);
        spinner = findViewById(R.id.spinnerGenero);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, genero);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TVSeleccion.setText(adapterView.getItemAtPosition(i).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        nombre=(EditText) findViewById(R.id.txtNombre);
        email=(EditText) findViewById(R.id.txtEmail);
        contrsena=(EditText)findViewById(R.id.txtContrasena);
        contrsena2=(EditText) findViewById(R.id.txtContrasena2);
        generos=(Spinner) findViewById(R.id.spinnerGenero);

    }

    private void registrousuario(){

        String txtEmail=email.getText().toString().trim();
        String txtNombre=nombre.getText().toString().trim();
        String txtContrasena=contrsena.getText().toString().trim();



        if (TextUtils.isEmpty(txtEmail)) {
            Toast.makeText(this, "Se debe ingresar un correo", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(contrsena)) {
            Toast.makeText(this, "Falta ingresar la contraseña", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(nombre)) {
            Toast.makeText(this, "Falta ingresar el nombre", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(telefono)) {
            Toast.makeText(this, "Falta ingresar el telefono", Toast.LENGTH_LONG).show();
            return;
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
    public void onClick(View v) {

    }
}