package com.example.matiasmsi.myapplication3;

/**
 * Created by NoBuNaGa on 09/11/2016.
 */

public class DB_Manager {

    public static final String TABLE_NAME = "RespuestasGuardadas";

    public static final String C_ID = "_id";
    public static final String C_RESPUESTAS = "respuestas";

    public static final String CREATE_TABLE = "create table " +TABLE_NAME+ " ("
            + C_ID + " integer primary key autoincrement,"
            + C_RESPUESTAS + "text not null);";








}
