package com.example.android.manixcolorstore.data;

import android.provider.BaseColumns;

/**
 * Contract class for ManixColor Store
 */

public final class ManixColorContract {

    private ManixColorContract() {}

        public static final class ColorsEntry implements BaseColumns{

            public static final String TABLE_COLOR_NAME = "ManixColors";

            public static final String ID = BaseColumns._ID;
            public static final String COLUMN_COLOR_NAME = "name ";
            public static final String COLUMN_COLOR_PRICE = "price ";
            public static final String COLUMN_COLOR_QUANTITY = "quantity ";
            public static final String COLUMN_COLOR_IMAGE = "image ";
            public static final String COLUMN_COLOR_SUPPLIER_NAME = "supplier_name ";
            public static final String COLUMN_COLOR_SUPPLIER_EMAIL = "supplier_email ";
            public static final String COLUMN_COLOR_SUPPLIER_PHONE = "supplier_phone_number);";
    }
}
