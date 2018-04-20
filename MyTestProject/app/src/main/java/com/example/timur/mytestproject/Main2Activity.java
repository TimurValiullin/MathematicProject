package com.example.timur.mytestproject;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends ListActivity {
  protected String[] rounds = {"1","2","3","4","5","6","7","8","9","10",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main2);
        /*Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        View.OnClickListener MyOCL = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             switch(view.getId()) {
                 case R.id.btn1:
                     Intent i1 = new Intent(Main2Activity.this, Level1.class);
                     startActivity(i1);
                     break;
                 case R.id.btn2:
                     Intent i2 = new Intent(Main2Activity.this, Level2.class);
                     startActivity(i2);
                     break;
             }
            }
        };
        btn1.setOnClickListener(MyOCL);
        btn2.setOnClickListener(MyOCL);*/
        ListView list_one = (ListView)findViewById(R.id.lv1);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rounds);

        setListAdapter(adapter);

}
@Override
    protected void  onListItemClick(ListView l, View v, int position, long id){
switch ((String)getListAdapter().getItem(position)){
    case "1": Intent i1 = new Intent(Main2Activity.this, Level1.class);
        startActivity(i1);
        break;
}
}
}
