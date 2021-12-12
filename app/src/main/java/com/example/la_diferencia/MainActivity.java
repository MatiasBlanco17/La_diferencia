package com.example.la_diferencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import Objetos.Administrador;

public class MainActivity extends AppCompatActivity {

    private EditText user,password;
    private Administrador adm=new Administrador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=findViewById(R.id.name);
        password=findViewById(R.id.password);
    }
    public void Iniciosesion (View view){
        String usuario=user.getText().toString().trim();
        String contrasena=password.getText().toString().trim();
        String userObj= adm.getUser().trim();
        String passwordObj= adm.getPassword().trim();

        switch (usuario){
            case "matias":
                if (usuario.equals(userObj)&& contrasena.equals(passwordObj)){
                    Intent i=new Intent(getBaseContext(),Resulta_jarrones_act.class);
                    startActivity(i);
                }
                break;
            case "":
                if (usuario.equals("")&& contrasena.equals("")){
                    Toast.makeText(getBaseContext(),"Campos vacios",Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                if (!usuario.equals(userObj)&& !contrasena.equals(passwordObj)){
                    Toast.makeText(getBaseContext(),"Datos mal ingresados",Toast.LENGTH_SHORT).show();
                }
        }
    }
    public void Calculos(View view){
        Intent i=new Intent(this,Jarrones_act.class);
        startActivity(i);
    }
}