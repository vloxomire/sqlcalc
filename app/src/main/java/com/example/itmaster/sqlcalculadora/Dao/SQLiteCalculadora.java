package com.example.itmaster.sqlcalculadora.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteCalculadora implements SQLiteOpenHelper{
    private Context context;
    private static final String DBname ="Calculadora";
    private static final int DB_VERSION=1;
    private SQLiteDatabase conexion = null;

    public SQLiteCalculadora(Context context) {
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    String createTable;
    createTable= "CREATE TABLE `calculadora` ( `Id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `calculo` TEXT NOT NULL )";
    db
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
