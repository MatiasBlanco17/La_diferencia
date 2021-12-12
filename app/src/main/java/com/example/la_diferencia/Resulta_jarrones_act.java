package com.example.la_diferencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Clientes;
import Objetos.Jarrones;

public class Resulta_jarrones_act extends AppCompatActivity {

    private Spinner cliente,jarrones;
    private TextView resultado,adicionalt;
    private RatingBar estrellita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resulta_jarrones);

        cliente = findViewById(R.id.cliente);
        jarrones = findViewById(R.id.jarrones);
        resultado = findViewById(R.id.resultado);
        adicionalt = findViewById(R.id.tb);
        estrellita = findViewById(R.id.rb);

        //objetos
        Clientes cli = new Clientes();
        Jarrones jar = new Jarrones();
        //listas
        String[] listaCliente=cli.getClientes();
        String[] listaJarron=jar.getJarrones();

        ArrayAdapter adapCliente=new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaCliente);
        ArrayAdapter adapJarron=new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaJarron);
        //pasar a spinner
        cliente.setAdapter(adapCliente);
        jarrones.setAdapter(adapJarron);
    }
    public void Calcular(View view){
        Clientes cli = new Clientes();
        Jarrones jar = new Jarrones();
        String opcionCliente=cliente.getSelectedItem().toString();
        String opcionjarron=jarrones.getSelectedItem().toString();
        int salario=0;
        int adicional=0;
        int total=0;
        for (int i=0;i<opcionCliente.length();i++){
            if(opcionCliente.equals(cli.getClientes()[i])){
                salario=cli.getSalarios()[i];
                break;
            }
        }

        for (int i=0;i<opcionjarron.length();i++){
            if(opcionjarron.equals(jar.getJarrones()[i])){
                adicional=jar.getAdicional()[i];
                total=jar.agregarAdicional(jar.getPrecios()[i],jar.getAdicional()[i]);
                salario=salario-total;
                break;

            }
        }
        if(jarrones.getSelectedItem().equals("Ceramica")){
            estrellita.setRating(2);
        }
        if(jarrones.getSelectedItem().equals("Porcelana")){
            estrellita.setRating(3);
        }
        if(jarrones.getSelectedItem().equals("Vidrio")){
            estrellita.setRating(5);
        }
        adicionalt.setText("El adicional es:"+adicional);
        resultado.setText("El costo final es:"+total+"\n La resta del jarron al salario es:"+salario);


    }
}