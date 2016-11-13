package com.example.matiasmsi.myapplication3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by NoBuNaGa on 10/11/2016.
 */

public class DBPreguntas extends SQLiteOpenHelper {

    public String sqlcreate = "CREATE TABLE Fresp (Id INTEGER PRIMARY KEY AUTOINCREMENT, Respuesta TEXT)";



    public DBPreguntas(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlcreate);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exist Fresp");

    }


}
