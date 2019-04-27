package com.dcy.greendaodemo.utils;

import android.content.Context;

import com.dcy.greendaodemo.MainActivity;
import com.dcy.greendaodemo.application.MyApplication;
import com.dcy.greendaodemo.greenDao.DaoSession;
import com.dcy.greendaodemo.greenDao.Student;

import java.util.List;

public class GreenDaoUtil {
    public static void insert(){
        DaoSession daoSession = MyApplication.getDaoSession();
//        daoSession.deleteAll(Student.class);
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setName("小张"+i);
            student.setStudentNumber(i);
            daoSession.insert(student);
        }
    }

    public static List query(){
        List<Student> list = MyApplication.getDaoSession().loadAll(Student.class);
        return list;
    }
}
