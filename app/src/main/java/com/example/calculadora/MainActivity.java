package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView res;
    private TextView res2;
    private double firstnumber ;
    private double secondnumber ;
    private String operador ;
    private String tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = 0;
        secondnumber = 0;
        operador = "";

        res = findViewById(R.id.textView_Resultado);
        res2 = findViewById(R.id.textView_segundonumero);
        res.setText("0");


        Button bc = findViewById(R.id.button_c);
        Button be =  findViewById(R.id.button_eliminar);
        Button bm =  findViewById(R.id.button_mas);
        Button br =  findViewById(R.id.button_menos);
        Button bp =  findViewById(R.id.button_multiplica);
        Button bd =  findViewById(R.id.button_division);
        Button bi =  findViewById(R.id.button_igual);
        Button bpu =  findViewById(R.id.button_punto);
        Button bs =  findViewById(R.id.button_signoInverso);
        Button bpa =  findViewById(R.id.button_parentesis);
        Button bpor = findViewById(R.id.button_porcentaje);
        Button bsqrt = findViewById(R.id.button_raiz);

        Button b0 =  findViewById(R.id.button_0);
        Button b1 =  findViewById(R.id.button_1);
        Button b2 =  findViewById(R.id.button_2);
        Button b3 =  findViewById(R.id.button_3);
        Button b4 =  findViewById(R.id.button_4);
        Button b5 =  findViewById(R.id.button_5);
        Button b6 =  findViewById(R.id.button_6);
        Button b7 =  findViewById(R.id.button_7);
        Button b8 =  findViewById(R.id.button_8);
        Button b9 =  findViewById(R.id.button_9);


        ButtonHandler blistener = new ButtonHandler();
        br.setOnClickListener(blistener);
        bp.setOnClickListener(blistener);
        bd.setOnClickListener(blistener);
        bi.setOnClickListener(blistener);
        bm.setOnClickListener(blistener);
        be.setOnClickListener(blistener);
        bc.setOnClickListener(blistener);
        b0.setOnClickListener(blistener);
        b1.setOnClickListener(blistener);
        b2.setOnClickListener(blistener);
        b3.setOnClickListener(blistener);
        b4.setOnClickListener(blistener);
        b5.setOnClickListener(blistener);
        b6.setOnClickListener(blistener);
        b7.setOnClickListener(blistener);
        b8.setOnClickListener(blistener);
        b9.setOnClickListener(blistener);
        bpu.setOnClickListener(blistener);
        bs.setOnClickListener(blistener);
        bpa.setOnClickListener(blistener);
        bpor.setOnClickListener(blistener);



        //Landscape
        if (bsqrt != null) {
            bsqrt.setOnClickListener(blistener);
        }

    }

    private class ButtonHandler implements View.OnClickListener{

        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button_0:
                    numeroPresionado("0");
                    break;
                case R.id.button_1:
                    numeroPresionado("1");
                    break;
                case R.id.button_2:
                    numeroPresionado("2");
                    break;
                case R.id.button_3:
                    numeroPresionado("3");
                    break;
                case R.id.button_4:
                    numeroPresionado("4");
                    break;
                case R.id.button_5:
                    numeroPresionado("5");
                    break;
                case R.id.button_6:
                    numeroPresionado("6");
                    break;
                case R.id.button_7:
                    numeroPresionado("7");
                    break;
                case R.id.button_8:
                    numeroPresionado("8");
                    break;
                case R.id.button_9:
                    numeroPresionado("9");
                    break;
                case R.id.button_mas:
                    opera("+");
                    break;
                case R.id.button_menos:
                    menos("-");
                    break;
                case R.id.button_multiplica:
                    opera("*");
                    break;
                case R.id.button_division:
                    opera("/");
                    break;
                case R.id.button_igual:
                    igual();
                    break;
                case R.id.button_c:
                    eliminarOperacion();
                    break;
                case R.id.button_eliminar:
                    eliminarDigito();
                    break;
                case R.id.button_punto:
                    numeroPresionado(".");
                    break;

                case R.id.button_signoInverso:
                    signoInverso();
                    break;
                case R.id.button_parentesis:
                    parentesis();
                    break;
                case R.id.button_porcentaje:
                    opera("%");
                    break;
                case R.id.button_raiz:
                    raiz();
                    break;
                default:
                    numeroPresionado("ERROR");
            }
        }
    }

    void raiz(){

        String s = res.getText().toString();
        try {

                if(s.equals("0")){
                    operador = "√";
                    res.setText("√");
                }
                else{
                    firstnumber = Double.parseDouble(res.getText().toString());
                    operador = "√";
                    res.setText("√" + res.getText());
                }

        }
        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }
    }
    void parentesis(){
        String s = res.getText().toString();
        try {
            if (s.contains("(")){
                res.setText(res.getText() + ")");

            }
            else{
                res.setText("(" + res.getText());
            }

        }
        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }
    }
    void signoInverso(){
        try {
            float n = Float.parseFloat(res.getText().toString());
            n = n * -1;
            String s = String.valueOf(n);
            res.setText(s);
        }
        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }
    }

    void opera (String op){
        try {
            firstnumber = Float.parseFloat(res.getText().toString());
            res2.setText(res.getText().toString() + op);
            res.setText("0");
            operador = op;
        }
        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }


    }

    void menos(String op){

        if(res.getText() == "0" || res.getText() == ""){

            Context context = getApplicationContext();
            CharSequence text = "El formato no es valido";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            try {
                firstnumber = Float.parseFloat(res.getText().toString());
                res2.setText(res.getText().toString() + op);
                res.setText("0");
                operador = op;
            } catch (Exception e) {
                res.setText("0");
                res2.setText("");
            }
        }
    }

    void igual (){
        double resultado;
        String s;

        try{
        secondnumber =  Float.parseFloat(res.getText().toString());


        switch (operador){

            case "√":
                String n = (String) res.getText().toString();
                int i = n.length();
                n = n.substring(1,i);
                res.setText(n);

                firstnumber =  Float.parseFloat(res.getText().toString());
                resultado = Math.sqrt(firstnumber);
                s=String.valueOf(resultado);
                res.setText(s);

                Log.i( "Operador = %d", operador);

                break;
            case "+":
                resultado = firstnumber + secondnumber;
                s=String.valueOf(resultado);
                res.setText(s);
                res2.setText("");
                break;
            case "-":

                    resultado = firstnumber - secondnumber;
                    s = String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");

                break;
            case "*":
                resultado = firstnumber * secondnumber;
                s=String.valueOf(resultado);
                res.setText(s);
                res2.setText("");
                break;
            case "%":
                firstnumber = firstnumber / 100;
                resultado = firstnumber * secondnumber;
                s=String.valueOf(resultado);
                res.setText(s);
                res2.setText("");
                break;
            case "/":
                if(secondnumber != 0) {
                    resultado = firstnumber / secondnumber;
                    s = String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                    break;
                }
                else{
                    res.setText("ERROR");
                    res2.setText("");

                    Context context = getApplicationContext();
                    CharSequence text = "No se puede dividir entre 0";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    break;
                }

            default:
        }
        }
        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }



    }

    void eliminarDigito(){

        try {
            String n = (String) res.getText().toString();
            int i = n.length()-1;
            n = n.substring(0,i);
            res.setText(n);
        }
        catch (Exception e){
            tag = getClass().getSimpleName();
            Log.i(tag, e.toString());
            res.setText("0");
            res2.setText("");
        }


    }
    void eliminarOperacion(){

        res.setText("0");
        res2.setText("");
    }

    void numeroPresionado(String digito) {


        if(res.getText() == "0"  || res.getText() == "ERROR"){

            res.setText( digito);
        }
        else {
            res.setText(res.getText() + digito);
        }
    }
}