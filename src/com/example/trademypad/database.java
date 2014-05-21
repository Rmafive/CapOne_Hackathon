package com.example.trademypad;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class database extends SQLiteOpenHelper {

	final static int DB_VERSION = 1;
	final static String DB_NAME = "listings";
	Context context;
	
	public database(Context context){
		super(context, DB_NAME, null, DB_VERSION);
		this.context = context;
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
	    database.execSQL("CREATE TABLE listings ( _id INTEGER PRIMARY KEY "
	    + "AUTOINCREMENT, name TEXT NOT NULL, ext TEXT NOT NULL, "
	    + "mob TEXT NOT NULL, age INTEGER NOT NULL DEFAULT '0')");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
