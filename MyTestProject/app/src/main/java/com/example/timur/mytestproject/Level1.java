package com.example.timur.mytestproject;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;


public class Level1 extends AppCompatActivity {

private TextView text1;
private EditText edit1;
private MyT t;
private MyCounter mc;
private String summ;
private MyArray th;
private Chronometer MyChronometr;
public boolean count_first = false;
public boolean count_second = false;
    private Chronometer chronometer;
    Context context;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        text1 = findViewById(R.id.primer);
        t = new MyT(getApplicationContext());
        t.start();
        th = new MyArray();
        th.randomize();
        text1.setText(th.first+" "+th.ac+" "+th.second);
mc = new MyCounter(getApplicationContext());
        //final TextView timer = findViewById(R.id.timer);
       // Button btn_check = findViewById(R.id.button3);
        edit1 = findViewById(R.id.edit1);








        String title = "Время кончилось";
        String message = "Вы слишком долго думали";
        String btn1Str = "Выйти в меню";
        String btn2Str = "Начать заново";
        String title_Win = "Вы успели";
        String message2 = "Вы успели всё решить, пока не кончилось время";
        String btn_menu = "Выйти в меню";
        context = Level1.this;

       /* final AlertDialog.Builder ad = new AlertDialog.Builder(context);
        ad.setTitle(title);
        ad.setMessage(message);
        ad.setPositiveButton(btn1Str, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent int_out = new Intent(Level1.this, Main2Activity.class);
                startActivity(int_out);
            }
        });
        ad.setNegativeButton(btn2Str, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent int_in = new Intent(Level1.this, Level1.class)  ;
                startActivity(int_in);
            }
        });
        ad.setCancelable(false);
        final AlertDialog.Builder victory = new AlertDialog.Builder(context);
        victory.setTitle(title_Win);
        victory.setMessage(message2);
        victory.setNeutralButton(btn_menu, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent out = new Intent(Level1.this, Main2Activity.class);
                startActivity(out);
                return;
            }
        });
        victory.setCancelable(false);
        final CountDownTimer MyCounter;
MyCounter = new CountDownTimer(10000,1000){

    @Override
    public void onTick(long l) {
        timer.setText("Осталось "+l/1000);
        return;
    }

    @Override
    public void onFinish() {
ad.show();
return;
    }
}.start();
btn_check.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(img_qw_1.getVisibility()==View.GONE&& img_qw_2.getVisibility()==View.GONE){
            victory.show();
      MyCounter.cancel();
        }
        else
            Toast.makeText(getApplicationContext(),"Вы решили не всё", Toast.LENGTH_LONG).show();
    }
});*/



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }




class MyT extends Thread{
        public MyT(Context context){

        }
        @Override
    public void run(){
         text1.setOnTouchListener(new View.OnTouchListener() {
             @Override
             public boolean onTouch(View view, MotionEvent motionEvent) {
                 edit1.setVisibility(View.VISIBLE);
                 edit1.addTextChangedListener(new TextWatcher() {
                     @Override
                     public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                     }

                     @Override
                     public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                     }

                     @Override
                     public void afterTextChanged(Editable editable) {
                         String s = edit1.getText().toString();
                         if(s.equals(Integer.toString(th.summ))){
                             Toast.makeText(getApplicationContext(),"Вы ответели правильно",Toast.LENGTH_LONG).show();

                             edit1.setText("");
                             th.randomize();
                             mc.running = false;
                             text1.setText(th.first+" "+th.ac+" "+th.second);


                         }
                         else {
                             /*
                             try {
                                 sleep(500);
                                 Toast.makeText(getApplicationContext(),"Ваш ответ неверный",Toast.LENGTH_LONG).show();
                             } catch (InterruptedException e) {
                                 e.printStackTrace();
                             }*/
                             mc.start();

                     }
                     }
                 });

                 return false;
             }
         });
        }
}
class MyCounter extends Thread{
        boolean running = true;
        public MyCounter(Context context){}
        @Override
    public void run(){
            while (running){
            try {
             wait(500);
             Toast.makeText(getApplicationContext(),"Ваш ответ неверный",Toast.LENGTH_LONG).show();
            }catch (Exception e){}
        }}
}







}


