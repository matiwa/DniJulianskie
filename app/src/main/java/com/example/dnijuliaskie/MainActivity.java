package com.example.dnijuliaskie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    EditText er,em,ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        btn=findViewById(R.id.btn);
        er=findViewById(R.id.er);
        em=findViewById(R.id.em);
        ed=findViewById(R.id.ed);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r=0,m=0,d=0,jd=0;
                double x=0,a=0,y=0,vp=0,b=0,q=0,c=0,w=0,e=0;
                tv.setText("");
                try{
                    r=Double.parseDouble(er.getText().toString());
                    m=Double.parseDouble(em.getText().toString());
                    d=Double.parseDouble(ed.getText().toString());

                    x=(m+9)/12;
                    a=4716+r+(int)x;
                    y=275+m/9;
                    vp=7*a/4;
                    b=1729279.5+367*r+(int)y-(int)vp+d;
                    q=(a+83)/100;
                    c=(int)q;
                    w=3*(c+1)/4;
                    e=(int)w;
                    jd=b+38-e;
                    tv.setText("Data kalendarza gregoriańskiego "+(int)r+"-"+
                            (int)m+"-"+(int)d+".\r\nDzień juliański "+jd);
                }catch (Exception blad){
                    Toast.makeText(MainActivity.this,blad.getMessage(),
                            Toast.LENGTH_LONG).show();
                }finally {
                    er.setText("");
                    em.setText("");
                    ed.setText("");
                }
            }
        });
    }
}