package com.example.administrator.datetimepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bigkoo.pickerview.builder.TimePickerBuilder;
import com.bigkoo.pickerview.listener.OnTimeSelectListener;
import com.bigkoo.pickerview.view.TimePickerView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends Activity {


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
//时间选择器
            TimePickerView pvTime = new TimePickerBuilder(MainActivity.this, new OnTimeSelectListener() {
                @Override
                public void onTimeSelect(Date date, View v) {
                    String formatDate = null;
                    DateFormat dFormat12 = new SimpleDateFormat("yyyy-MM"); //hh表示12小时制；
                    formatDate = dFormat12.format(date);

                    Toast.makeText(MainActivity.this, formatDate, Toast.LENGTH_SHORT).show();
                }


            }).build();
            pvTime.setDate(Calendar.getInstance());
            pvTime.show();
        }




}




