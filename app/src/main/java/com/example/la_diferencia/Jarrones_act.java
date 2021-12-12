package com.example.la_diferencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import Objetos.Jarrones;

public class Jarrones_act extends AppCompatActivity {

    private CheckBox docejar,veinticuatrojar;
    private TextView compra;
    private Spinner material;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarrones);
        docejar=findViewById(R.id.docejarrones);
        veinticuatrojar=findViewById(R.id.veinticuatro);
        compra=findViewById(R.id.compra);
        material=findViewById(R.id.material);

        Jarrones jar = new Jarrones();
        String[] listaJarron=jar.getJarrones();
        ArrayAdapter adapJarron=new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaJarron);
        material.setAdapter(adapJarron);
    }
    public void Calculos(View view){
        Jarrones jar = new Jarrones();
        if (docejar.isChecked()&&veinticuatrojar.isChecked()){
            Toast.makeText(getBaseContext(),"Seleccione una opcion",Toast.LENGTH_SHORT).show();
        }
        else {
            if (docejar.isChecked()==false&&veinticuatrojar.isChecked()==false){
                Toast.makeText(getBaseContext(),"No seleciono ninguna opcion",Toast.LENGTH_SHORT).show();
            }
            if (docejar.isChecked()){
                if(material.getSelectedItem().equals("Ceramica")){
                    compra.setText("compraste 12 jarrones de ceramica su costo es:"+jar.precioCeramica(12));
                }
                if(material.getSelectedItem().equals("Porcelana")){
                    compra.setText("compraste 12 jarrones de porcelana su costo es:"+jar.precioporcelana(12));
                }
                if(material.getSelectedItem().equals("Vidrio")){
                    compra.setText("compraste 12 jarrones de vidrio su costo es:"+jar.preciovidrio(12));
                }
            }
            if (veinticuatrojar.isChecked()){
                if(material.getSelectedItem().equals("Ceramica")){
                    compra.setText("compraste 24 jarrones de ceramica su costo es:"+jar.precioCeramica(24));
                }
                if(material.getSelectedItem().equals("Porcelana")){
                    compra.setText("compraste 24 jarrones de porcelana su costo es:"+jar.precioporcelana(24));
                }
                if(material.getSelectedItem().equals("Vidrio")){
                    compra.setText("compraste 24 jarrones de vidrio su costo es:"+jar.preciovidrio(24));
                }
            }
        }
    }
}