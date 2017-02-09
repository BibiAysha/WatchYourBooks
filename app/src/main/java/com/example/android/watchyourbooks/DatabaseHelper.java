package com.example.android.watchyourbooks;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by lalith on 11/12/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    String DB_PATH= null;
    private static String DB_NAME= "books.db";
    private SQLiteDatabase myDataBase;
    private final Context mycontext;

    public DatabaseHelper (Context context)
    {
        super(context, DB_NAME, null, 10);
        this.mycontext=context;
        this.DB_PATH= "/data/data/" + context.getPackageName() + "/databases/";
        Log.e("Path1",DB_PATH);

    }

    public void createDataBase() throws IOException {
        boolean dbExist= checkDataBase();
        if(dbExist)
        {

        } else{
            this.getReadableDatabase();
            try{
                copyDataBase();

            }catch (IOException e){
                throw new Error("Error copyting database");

            }
        }

    }

    private boolean checkDataBase()
    {
        SQLiteDatabase checkDB = null;
        try{
            String myPath= DB_PATH + DB_NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);

        } catch (SQLiteException e){

        }

        if(checkDB!= null)
        {
            checkDB.close();
        }
        return checkDB!=null ? true : false;
    }

    private void copyDataBase() throws IOException{
        InputStream myInput= mycontext.getAssets().open(DB_NAME);
        String outFileName= DB_PATH+ DB_NAME;
        OutputStream myOutput= new FileOutputStream(outFileName);
        byte[] buffer= new byte[10];
        int length;
        while((length =myInput.read(buffer))>0)
        {
            myOutput.write(buffer,0,length);
        }

        myOutput.flush();
        myOutput.close();
        myInput.close();


    }

    public void openDataBase() throws SQLiteException{
        String myPath= DB_PATH+DB_NAME;
        myDataBase= SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);

    }

    public synchronized void close() {
        if(myDataBase != null)
        {
            myDataBase.close();
        }
        super.close();
    }

    public void onCreate(SQLiteDatabase db){}

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion > oldVersion) {
            try {
                copyDataBase();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy){
        return myDataBase.query("books.db", null, null, null, null, null,null);
    }
}



