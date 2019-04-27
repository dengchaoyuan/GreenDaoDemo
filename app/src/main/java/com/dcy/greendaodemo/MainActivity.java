package com.dcy.greendaodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dcy.greendaodemo.greenDao.Student;
import com.dcy.greendaodemo.utils.GreenDaoUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.insert)
    Button insert;
    @BindView(R.id.delete)
    Button delete;
    @BindView(R.id.update)
    Button update;
    @BindView(R.id.query)
    Button query;
    @BindView(R.id.username_et)
    EditText name;
    @BindView(R.id.usernumber_et)
    EditText number;
    @BindView(R.id.show)
    TextView show;
    String s;
    StringBuilder sb = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.insert)
    public void insert(){
        GreenDaoUtil.insert();
    }

    @OnClick(R.id.query)
    public void query(){
        List<Student> list = GreenDaoUtil.query();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getName()+"   "+list.get(i).getId()+"\n");
            s = sb.toString();
            show.setText(s);
        }
    }
}
