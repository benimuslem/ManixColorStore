package com.example.android.manixcolorstore;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.manixcolorstore.data.DBHelper;
import com.example.android.manixcolorstore.data.ManixColorContract.ColorsEntry;

public class MainActivity extends AppCompatActivity {

    private DBHelper helper;
    private SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DBHelper(this);
        insertColor();
        seeColorsDetails();
    }

    private void insertColor() {
        // Get DB for writing
        database = helper.getWritableDatabase();

        //Create a new ContentValues object: column are the keys
        ContentValues values = new ContentValues();
        values.put(ColorsEntry.COLUMN_COLOR_NAME, "Hot Hot Pink");
        values.put(ColorsEntry.COLUMN_COLOR_PRICE, 12);
        values.put(ColorsEntry.COLUMN_COLOR_QUANTITY, 2);
        values.put(ColorsEntry.COLUMN_COLOR_IMAGE,
                "https://manicpanic.com.es/37-large_default/tinte-de-pelo-rosa-manic-panic-classic-hot-hot-pink.jpg");
        values.put(ColorsEntry.COLUMN_COLOR_SUPPLIER_NAME, "Manic Panic");
        values.put(ColorsEntry.COLUMN_COLOR_SUPPLIER_EMAIL, "products@manicpanic.com");
        values.put(ColorsEntry.COLUMN_COLOR_SUPPLIER_PHONE, "555-666-669");

        database.insert(ColorsEntry.TABLE_COLOR_NAME, null, values);
    }

    private Cursor seeColorsDetails() {

        database = helper.getReadableDatabase();

        return database.query(
                ColorsEntry.TABLE_COLOR_NAME,
                null,
                null,
                null,
                null,
                null,
                null
                );
    }
}
