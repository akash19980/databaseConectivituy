package com.example.lenovo.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

public class Databasehandler extends SQLiteOpenHelper
{
    private static final int Database_version=1;
    private static final String Database_name="Contacts Database";
    private static final String Table_name="Contacta";
    private static final String key_id="id";
    private static final String key_name="name";
    private static final String key_phoneNo="phone_no";

    public Databasehandler(Context context)
    {
        super(context, Database_name, null, Database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String create_contacts_table ="Create Table "+Table_name+"("+key_id+"Integer primary key,"+key_name+"Text,"+key_phoneNo+"Text"+")";
        sqLiteDatabase.execSQL(create_contacts_table);
    }
    void addContact(contacts contact)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues value = new ContentValues();
        value.put(key_name,contact.getname());
        value.put(key_phoneNo,contact.getPhone_number());
        database.insert(Table_name,null,value);
        database.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
