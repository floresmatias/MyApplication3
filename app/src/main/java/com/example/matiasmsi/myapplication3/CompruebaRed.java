package com.example.matiasmsi.myapplication3;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;
import static android.media.audiofx.NoiseSuppressor.isAvailable;
import android.app.Service;

import java.util.Timer;


/**
 * Created by MatiasMSI on 12/11/2016.
 */

public class CompruebaRed extends AppCompatActivity{
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time time = new time();
        time.execute();

    }

    Context context;
    boolean valor;


    public CompruebaRed(Context context) {
        this.context = context;
    }

    public boolean isConnected() {
        Log.d("hola","estoy en coneccion");
        ConnectivityManager connectivity = (ConnectivityManager)
                context.getSystemService(Service.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if(info!=null) {
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    Log.d("estado","conectado");
                    return true;


                }
            }
    }
        Log.d("estado","no conectado");

        return false;

    }
    public void Hilo(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ejecutar(){
        time time = new time();
        time.execute();
    }

    public class time extends AsyncTask<Void,Integer,Boolean>
    {

        @Override
        protected Boolean doInBackground(Void... voids) {
            for(int i = 1;i<=7;i++){
                Hilo();
            }
            return true;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            isConnected();
        }
    }




    //ejecutar en intervalo de 3 segundos.



}
