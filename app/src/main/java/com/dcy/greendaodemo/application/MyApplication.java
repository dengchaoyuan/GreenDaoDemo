package com.dcy.greendaodemo.application;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.dcy.greendaodemo.greenDao.DaoMaster;
import com.dcy.greendaodemo.greenDao.DaoSession;

public class MyApplication extends Application {

    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        initGreenDao();
    }

    private void initGreenDao() {
        DaoMaster .DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"dcy.db");
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }


    public static DaoSession getDaoSession(){
        return daoSession;
    }
}
