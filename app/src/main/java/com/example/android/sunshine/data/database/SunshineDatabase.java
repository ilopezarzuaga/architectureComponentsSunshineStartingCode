package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {WeatherEntry.class}, version = 1)
public abstract class SunshineDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "weather";
    private static  volatile SunshineDatabase sInstance;


    abstract WeatherDao weatherDao();
}
