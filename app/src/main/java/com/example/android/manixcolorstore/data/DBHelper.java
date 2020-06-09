package com.example.android.manixcolorstore.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.manixcolorstore.data.ManixColorContract;

/**
 * Data Base Helper
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ColorsDB.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase colorsDB) {

        String SQL_CREATE_COLORS_TABLE = "CREATE TABLE "
                + ManixColorContract.ColorsEntry.TABLE_COLOR_NAME + " ("
                + ManixColorContract.ColorsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ManixColorContract.ColorsEntry.COLUMN_COLOR_NAME + " TEXT NOT NULL, "
                + ManixColorContract.ColorsEntry.COLUMN_COLOR_PRICE + " INTEGER NOT NULL DEFAULT 0, "
                + ManixColorContract.ColorsEntry.COLUMN_COLOR_QUANTITY + " INTEGER NOT NULL DEFAULT 0, "
                + ManixColorContract.ColorsEntry.COLUMN_COLOR_IMAGE + " TEXT NOT NULL, "
                + ManixColorContract.ColorsEntry.COLUMN_COLOR_SUPPLIER_NAME + " TEXT NOT NULL, "
                + ManixColorContract.ColorsEntry.COLUMN_COLOR_SUPPLIER_EMAIL + " TEXT NOT NULL, "
                + ManixColorContract.ColorsEntry.COLUMN_COLOR_SUPPLIER_PHONE + " TEXT NOT NULL); ";
        colorsDB.execSQL(SQL_CREATE_COLORS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
