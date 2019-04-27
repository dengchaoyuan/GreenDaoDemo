package com.dcy.greendaodemo.greenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Unique;

@Entity
public class Student {
    // 注意主键自增长必须设置为Long而不是long
    @Id(autoincrement = true)
    Long id;
    @Unique
    int studentNumber;
    String name;
    @Generated(hash = 1165814559)
    public Student(Long id, int studentNumber, String name) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.name = name;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getStudentNumber() {
        return this.studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
