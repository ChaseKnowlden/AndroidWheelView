package com.example.androidwheelview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Arrays;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import me.sujanpoudel.wheelview.WheelView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WheelView wheelView = (WheelView) findViewById(R.id.wheel_view);
        wheelView.setTitles(Arrays.asList("First","Second","Third","Fourth","Five","Six"));
        wheelView.setSelectListener(new Function1<Integer, Unit>() {
            @Override
            public Unit invoke(Integer integer) {
                showToast(integer);
                return Unit.INSTANCE;
            }
            private final void showToast(Integer index) {
                Toast.makeText(MainActivity.this, ""+wheelView.getTitles().get(index), Toast.LENGTH_SHORT).show();
            }
        });
    }
}