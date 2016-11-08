package com.example.matiasmsi.myapplication3;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by MatiasMSI on 07/11/2016.
 */

public class Formulario extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,radioGroup7;
    String [] respuestas = new String[6];
    String pregunta1, pregunta2,pregunta3,pregunta4,pregunta5,pregunta6,pregunta7;
    Button btn ;


    //chupala
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        radioGroup1 = (RadioGroup) findViewById(R.id.group1);
        radioGroup2 = (RadioGroup) findViewById(R.id.group2);
        radioGroup3 = (RadioGroup) findViewById(R.id.group3);
        radioGroup4 = (RadioGroup) findViewById(R.id.group4);
        radioGroup5 = (RadioGroup) findViewById(R.id.group5);
        radioGroup6 = (RadioGroup) findViewById(R.id.group6);
        radioGroup7 = (RadioGroup) findViewById(R.id.group7);


        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio1 ){
                    Toast.makeText(getApplicationContext(), "si",Toast.LENGTH_SHORT).show();
                    pregunta1 = "SI";
                    respuestas[0] = pregunta1;
                    return;
                }else if (i ==R.id.radio2){
                    Toast.makeText(getApplicationContext(), "no",Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio3 ){
                    Toast.makeText(getApplicationContext(), "si",Toast.LENGTH_SHORT).show();
                    pregunta2 = "SI";
                }else if (i ==R.id.radio4){
                    Toast.makeText(getApplicationContext(),pregunta1,Toast.LENGTH_SHORT).show();
                }

            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio5 ){
                    Toast.makeText(getApplicationContext(), "si",Toast.LENGTH_SHORT).show();
                    pregunta3 = "SI";
                }else if (i ==R.id.radio6){
                    Toast.makeText(getApplicationContext(),pregunta1,Toast.LENGTH_SHORT).show();
                }

            }
        });

        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio7 ){
                    Toast.makeText(getApplicationContext(), "si",Toast.LENGTH_SHORT).show();
                    pregunta4 = "SI";
                }else if (i ==R.id.radio8){
                }

            }
        });

        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio9 ){
                    Toast.makeText(getApplicationContext(), "si",Toast.LENGTH_SHORT).show();
                    pregunta5 = "SI";
                }else if (i ==R.id.radio10){
                    Toast.makeText(getApplicationContext(),pregunta1,Toast.LENGTH_SHORT).show();
                }

            }
        });

        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio11 ){
                    Toast.makeText(getApplicationContext(), "si",Toast.LENGTH_SHORT).show();
                    pregunta6 = "SI";
                }else if (i ==R.id.radio12){
                    Toast.makeText(getApplicationContext(),pregunta1,Toast.LENGTH_SHORT).show();
                }

            }
        });

        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio13 ){
                    Toast.makeText(getApplicationContext(), "si",Toast.LENGTH_SHORT).show();
                    pregunta7 = "SI";
                }else if (i ==R.id.radio14){
                    Toast.makeText(getApplicationContext(),pregunta1,Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn = (Button) findViewById(R.id.btnArreglo);
        btn.setOnClickListener(this);
    }



    public void dialogoPregunta1 (View view){
        AlertDialog.Builder ventana = new AlertDialog.Builder(this);
        ventana.setMessage("INGRESE SU RESPUESTA");
        ventana.setTitle("Justificacion NO");
        final EditText Et_Respuesta = new EditText(this);
        ventana.setView(Et_Respuesta);
        ventana.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                pregunta1= Et_Respuesta.getText().toString().trim();
                if(pregunta1.length()!=0){
                    Toast.makeText(Formulario.this,"GRACIAS",Toast.LENGTH_SHORT).show();
                    respuestas[0]=pregunta1;
                }else{
                    Toast.makeText(Formulario.this,"DEBE COMPLETAR EL TEXTO",Toast.LENGTH_SHORT).show();
                }
            }
        });
        ventana.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        ventana.show();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnArreglo:
                Toast.makeText(getApplicationContext(), respuestas[0], Toast.LENGTH_SHORT).show();
                break;
        }

    }
}

