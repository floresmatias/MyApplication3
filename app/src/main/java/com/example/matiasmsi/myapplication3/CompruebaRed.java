package com.example.matiasmsi.myapplication3;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import static android.media.audiofx.NoiseSuppressor.isAvailable;
import android.app.Service;


/**
 * Created by MatiasMSI on 12/11/2016.
 */

public class CompruebaRed {

    Context context;
    boolean valor;


    public CompruebaRed(Context context) {
        this.context = context;
    }

    public boolean isConnected() {
        ConnectivityManager connectivity = (ConnectivityManager)
                context.getSystemService(Service.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if(info!=null){

             if (info.getState() == NetworkInfo.State.CONNECTED) {
                return true;

             }
        }
    }

    return false;

    }

    public class AsyncConnectTask extends AsyncTask<Void, Void, Boolean> {

        @Override
        protected Boolean doInBackground(Void... params) {

            isConnected();
            return isAvailable();

        }

        @Override
        protected void onPostExecute(Boolean isAvalable) {

            //Se recibe el valor boleano del método doInBackground().
            // Se puede abrir el Dialogo en el Thread principal.
            if(isAvalable){

                //alert.showAlertDialog(.this, "Verifique su conexión!", "No      hay conexión ", false);
            } else{
                //....hago otra cosa
            }
        }

        @Override
        protected void onPreExecute() {}

        @Override
        protected void onProgressUpdate(Void... values) {}

    }


}
