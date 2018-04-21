package com.example.timur.mytestproject;


import android.content.Context;

public class MyArray extends Thread {
    int first;
    int second;
    int action;
    int summ;
    String ac;
    public MyArray(){

    }

    public void randomize(){
        first = (int) (Math.random()*100);
        second = (int) (Math.random()*100);
        action = (int) (Math.random()*3);
        if(action==0){ac = "+";
        summ = first+second;}
        if(action==1){ac = "-";
        summ = first-second;}
        if (action==2){ac = "x";
        summ = first*second;}
        if(action==3){ac = ":";
        summ = Math.round((float)first/second);}


    }



}
