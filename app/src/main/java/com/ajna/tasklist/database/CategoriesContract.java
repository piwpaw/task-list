package com.ajna.tasklist.database;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

import static com.ajna.tasklist.database.MyContentProvider.CONTENT_AUTHORITY;
import static com.ajna.tasklist.database.MyContentProvider.CONTENT_AUTHORITY_URI;

public class CategoriesContract {
    public static final String TABLE_NAME = "Lists";

    public static class Columns {
        public static final String _ID = BaseColumns._ID;
        public static final String NAME = "Name";


        private Columns(){}
    }

    public static final Uri CONTENT_URI = Uri.withAppendedPath(CONTENT_AUTHORITY_URI, TABLE_NAME);

    static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd." + CONTENT_AUTHORITY + "." + TABLE_NAME;
    static final String CONTENT_TYPE_ITEM = "vnd.android.cursor.item/vnd." + CONTENT_AUTHORITY + "." + TABLE_NAME;


    public static Uri buildUri(long id){
        return ContentUris.withAppendedId(CONTENT_URI, id);
    }

    public static long getId(Uri uri) {
        return ContentUris.parseId(uri);
    }
}
