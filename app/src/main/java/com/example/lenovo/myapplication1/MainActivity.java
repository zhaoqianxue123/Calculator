package com.example.lenovo.myapplication1;



import android.content.DialogInterface;
import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lenovo.myapplication1.R.id.Btn1;
import static com.example.lenovo.myapplication1.R.id.BtnBack;
import static com.example.lenovo.myapplication1.R.id.BtnC;
import static com.example.lenovo.myapplication1.R.id.BtnCE;
import static com.example.lenovo.myapplication1.R.id.BtnDivide;
import static com.example.lenovo.myapplication1.R.id.BtnEqual;
import static com.example.lenovo.myapplication1.R.id.BtnMinus;
import static com.example.lenovo.myapplication1.R.id.BtnMultiply;
import static com.example.lenovo.myapplication1.R.id.BtnSquare;
import static com.example.lenovo.myapplication1.R.id.text;
import static com.example.lenovo.myapplication1.R.id.txt;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private StringBuffer str_display = new StringBuffer("");
    private boolean point = false,sign=false;
    private boolean flag1,flag2,flag3;//flag1数字,flag2运算符,//flag3除此之外的其他符号
    private String str_result;
    private double num1=0;
    private double num2=0;
    private String a= String.valueOf(0);
    int op=0;
    private String str = str_display.toString();
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    //从布局文件中获取控件
    Button Btn0 = (Button) findViewById(R.id.Btn0);
    Button Btn1 = (Button) findViewById(R.id.Btn1);
    Button Btn2 = (Button) findViewById(R.id.Btn2);
    Button Btn3 = (Button) findViewById(R.id.Btn3);
    Button Btn4 = (Button) findViewById(R.id.Btn4);
    Button Btn5 = (Button) findViewById(R.id.Btn5);
    Button Btn6 = (Button) findViewById(R.id.Btn6);
    Button Btn7 = (Button) findViewById(R.id.Btn7);
    Button Btn8 = (Button) findViewById(R.id.Btn8);
    Button Btn9 = (Button) findViewById(R.id.Btn9);
    Button Btn10 = (Button) findViewById(R.id.Btn10);
    Button BtnPoint = (Button) findViewById(R.id.BtnPoint);
    Button BtnPlus = (Button) findViewById(R.id.BtnPlus);
    final Button BtnMinus = (Button) findViewById(R.id.BtnMinus);
    final Button BtnMultiply = (Button) findViewById(R.id.BtnMultiply);
    final Button BtnDivide = (Button) findViewById(R.id.BtnDivide);
    final Button BtnEqual = (Button) findViewById(R.id.BtnEqual);
    Button BtnC = (Button) findViewById(R.id.BtnC);
    Button BtnCE = (Button) findViewById(R.id.BtnCE);
    Button BtnSign = (Button) findViewById(R.id.BtnSign);
    Button BtnReciprocal = (Button) findViewById(R.id.BtnReciprocal);
    Button BtnBack = (Button) findViewById(R.id.BtnBack);
    Button BtnSquare = (Button)findViewById(R.id.BtnSquare);
    Button BtnRooting=(Button)findViewById(R.id.BtnRooting);
    final TextView txt = (TextView) findViewById(R.id.txt);
    txt.setText("0");

    View.OnClickListener listener = null;
    Btn0.setOnClickListener(listener);
    Btn1.setOnClickListener(listener);
    Btn2.setOnClickListener(listener);
    Btn3.setOnClickListener(listener);
    Btn4.setOnClickListener(listener);
    Btn5.setOnClickListener(listener);
    Btn6.setOnClickListener(listener);
    Btn7.setOnClickListener(listener);
    Btn8.setOnClickListener(listener);
    Btn9.setOnClickListener(listener);
    BtnPoint.setOnClickListener(listener);
    BtnPlus.setOnClickListener(listener);
    BtnMinus.setOnClickListener(listener);
    BtnMultiply.setOnClickListener(listener);
    BtnDivide.setOnClickListener(listener);
    BtnEqual.setOnClickListener(listener);
    BtnC.setOnClickListener(listener);
    BtnCE.setOnClickListener(listener);
    BtnSign.setOnClickListener(listener);
    BtnReciprocal.setOnClickListener(listener);
    BtnBack.setOnClickListener(listener);
    BtnSquare.setOnClickListener(listener);
    BtnRooting.setOnClickListener(listener);
   Btn1.setOnClickListener(new View.OnClickListener(){
       @Override
       public void onClick(View v) {
           flag1=true;
           if (str_display.length()<15){
           str_display.append("1");}//向后面加1
           txt.setText(str_display.toString());
       }
   });
    Btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (str_display.length()<15){
                str_display.append("2");}//向后面加2
            txt.setText(str_display.toString());
        }
    });
    Btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (str_display.length()<15){
                str_display.append("3");}//向后面加3
            txt.setText(str_display.toString());
        }
    });
    Btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (str_display.length()<15){
                str_display.append("4");}//向后面加4
            txt.setText(str_display.toString());
        }
    });
    Btn5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (str_display.length()<15){
                str_display.append("5");}//向后面加5
            txt.setText(str_display.toString());
        }
    });
    Btn6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (str_display.length()<15){
                str_display.append("6");}//向后面加6
            txt.setText(str_display.toString());
        }
    });
    Btn7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (str_display.length()<15){
                str_display.append("7");}//向后面加7
            txt.setText(str_display.toString());
        }
    });
    Btn8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (str_display.length()<15){
                str_display.append("8");}//向后面加8
            txt.setText(str_display.toString());
        }
    });
    Btn9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (str_display.length()<15){
                str_display.append("9");}//向后面加9
            txt.setText(str_display.toString());
        }
    });
    Btn0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flag1=true;
            if (txt.getText().toString()!="0"){//如果屏幕上显示的不是0
                if (str_display.length()<15){//向后面加0
                    str_display.append("0");}
            txt.setText(str_display.toString());}
        }
    });
    BtnPoint.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (flag3==false){
            if (txt.getText().toString()=="0"){//如果屏幕上显示0，就是内部是空，就加0.
                str_display.append("0");
                str_display.append(".");
                txt.setText(str_display.toString());}
            else{//如果不是0,就加.
                str_display.append(".");
                txt.setText(str_display.toString());
            }}
            flag3=true;
        }
    });
    BtnSign.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sign=true;
            a=txt.getText().toString();
            double c = Double.parseDouble(a);
            if (c>0){//屏幕的值大于0
                a="-"+a;}
            else if(c<0){
                a=a.replace("-","");}
            else if (c==0&&a.contains(".")&&!a.contains("-")){//如果本身屏幕上的值是0没有符号
                a="-"+a;}
            else if (c==0&&a.contains(".")&&a.contains("-")){//如果本身屏幕上的值是0有负号
                a=a.replace("-","");}
            txt.setText(a);
            str_display = new StringBuffer(a);
    }});
    BtnPlus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            op=1;
            flag1=false;
             if (flag2){//按过运算符
                 num2 = Double.parseDouble(txt.getText().toString());//num2赋值
             str_result = String.valueOf(num1+num2);//得到结果
                 if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                     str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                     str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
                 }
                 txt.setText(str_result.toString());//让屏幕显示结果
             num1 = Double.parseDouble(txt.getText().toString());
             str_display = new StringBuffer("");}//内部变成空
             else if(!flag2) {//没有按过运算符
                num1 = Double.parseDouble(txt.getText().toString());
                str_display = new StringBuffer("");
            }flag2=true;    }
    });
    BtnMinus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            op = 2;
            flag1=false;
            if (flag2){
                num2 = Double.parseDouble(txt.getText().toString());
                str_result = String.valueOf(num1-num2);
                if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                    str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                    str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
                }
                txt.setText(str_result.toString());
                num1 = Double.parseDouble(txt.getText().toString());
                str_display = new StringBuffer(str_result);}
            else if (!flag2){
                num1 = Double.parseDouble(txt.getText().toString());
            str_display = new StringBuffer("");}
            flag2 = true;
        }});

    BtnMultiply.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            op=3;
            flag1=false;
            if (flag2){
                num2 = Double.parseDouble(txt.getText().toString());
                str_result = String.valueOf(num1*num2);
                if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                    str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                    str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
                }
                txt.setText(str_result.toString());
                num1 = Double.parseDouble(txt.getText().toString());
                str_display = new StringBuffer(str_result);}
            else if(!flag2){
        num1 = Double.parseDouble(txt.getText().toString());
                str_display = new StringBuffer("");
            }
        flag2 = true;}
    });
    BtnDivide.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            op=4;
            flag1=false;
            if (flag2){
                num2 = Double.parseDouble(txt.getText().toString());
                if(num2==0&&num1!=0){
                    txt.setText("除数不能为零");
                }else
                if (num2==0&&num1==0){
                    txt.setText("结果未定义");
                }else
                    if(num1!=0&&num2!=0){
                str_result = String.valueOf(num1/num2);
                        if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                            str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                            str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
                        }
                        txt.setText(str_result.toString());
                num1 = Double.parseDouble(txt.getText().toString());
                str_display = new StringBuffer(str_result);}}
            else if(!flag2){
                num1 = Double.parseDouble(txt.getText().toString());
                str_display = new StringBuffer("");}
            flag2 = true;
        }
    });
    BtnBack.setOnClickListener(new  View.OnClickListener(){
        @Override
        public void onClick(View v) {

            if (str_display.length()==1||str_display.length()==0){//如果内部有一位或零位数
                str_display = new StringBuffer("");//内部变成空
                txt.setText("0");//屏幕上显示0
            }else
            if(str_display.length()!=1){//如果内部有多位数
                str_display.deleteCharAt(str_display.length()-1);//内部减一位数
                txt.setText(str_display.toString());//屏幕显示内部
            }

        }
    });
    BtnC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {//所有参数复原
            str_display = new StringBuffer("");
            str_result = String.valueOf(0);
            txt.setText("0");
            flag1=false;
            flag2=false;
            flag3=false;
            num1=0;
            num2=0;
            op=0;
        }
    });
    BtnCE.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            str_display = new StringBuffer("");//把当前值清除，内部变成空
            txt.setText("0");//屏幕显示0
        }
    });
    BtnSquare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {//求平方
            op=5;
            flag3=true;
            num1=Double.parseDouble(txt.getText().toString());
            str_result = String.valueOf(num1*num1);
            if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
            }
            txt.setText(str_result.toString());
            str_display = new StringBuffer("");
        }
    });
    BtnReciprocal.setOnClickListener(new View.OnClickListener(){//求倒数
        @Override
        public void onClick(View v) {
            op=6;
            flag3=true;
            num1=Double.parseDouble(txt.getText().toString());
            str_result = String.valueOf(1/num1);
            if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
            }
            txt.setText(str_result.toString());
            str_display = new StringBuffer("");
        }
    });
    BtnRooting.setOnClickListener(new View.OnClickListener() {//求根号
        @Override
        public void onClick(View v) {
            op=7;
            flag3=true;
            num1=Double.parseDouble(txt.getText().toString());
            str_result = String.valueOf(Math.sqrt(num1));
            if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
            }
            txt.setText(str_result.toString());
            str_display = new StringBuffer("");
        }
    });

    BtnEqual.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //实现eg:1+1=2+1=3
            if ((flag1)&&(flag2)){
            num2 = Double.parseDouble(txt.getText().toString());}
            //实现eg:1+=2
            else if ((!flag1)&&(flag2))
            {num2 = Double.parseDouble(txt.getText().toString());}
            //实现1+1=2=3
            else if ((!flag1)&&(!flag2)){
                num1 = Double.parseDouble(str_result);
            }
        switch (op){
            case 1: {
                str_result = String.valueOf(num1 + num2);
                if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                    str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                    str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
                }
                str_display = new StringBuffer("");
                txt.setText(str_result.toString());
                break;
            }
            case 2:{
                str_result = String.valueOf(num1-num2);
                if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                    str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                    str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
                }
                txt.setText(str_result.toString());
                str_display = new StringBuffer("");
                break;
            }
            case 3:{
                str_result = String.valueOf(num1*num2);
                if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                    str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                    str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
                }
                txt.setText(str_result.toString());
                str_display = new StringBuffer("");
                break;
            }
            case 4:{
                if (num2==0&&num1!=0)
                {txt.setText("除数不能为零");}
                if(num2==0&&num1==0){
                    txt.setText("结果未定义");
                }
                else if (num2!=0){
                str_result = String.valueOf(num1/num2);
                    if (str_result.indexOf(".") > 0) {//如果c中包含小数点
                        str_result = str_result.replaceAll("0+?$", "");//去掉多余的0
                        str_result = str_result.replaceAll("[.]$", "");//如最后一位是.则去掉
                    }
                    str_display = new StringBuffer("");
                    txt.setText(str_result.toString());
                break;}
            }
            }
            flag1=false;
            flag2=false;
    }});
        }}









