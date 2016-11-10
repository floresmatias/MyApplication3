package com.example.matiasmsi.myapplication3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by NoBuNaGa on 09/11/2016.
 */

public class DB extends SQLiteOpenHelper {

    private  static final String DB_NAME = "Respuesta";
    private static final int DB_SCHEME_VERSION  = 1;


    public DB(Context context) {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DB_Manager.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
