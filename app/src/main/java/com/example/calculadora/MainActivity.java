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
    private TextView type;
    private double firstnumber ;
    private double secondnumber ;
    private String operador ;
    private String tag;
    private Boolean fl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = 0;
        secondnumber = 0;
        operador = "";
        fl = false;


        res = findViewById(R.id.textView_Resultado);
        res2 = findViewById(R.id.textView_segundonumero);
        type = findViewById(R.id.textView_rad);
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
        Button bsqrt = findViewById(R.id.button_sqrt);
        Button babs = findViewById(R.id.button_absoluto);
        Button bpi = findViewById(R.id.button_pi);
        Button e = findViewById(R.id.button_e);
        Button ex = findViewById(R.id.button_ex);
        Button x2 = findViewById(R.id.button_x2);
        Button xn = findViewById(R.id.button_xn);
        Button ln = findViewById(R.id.button_ln);
        Button log = findViewById(R.id.button_log);
        Button dx = findViewById(R.id.button_divisionx);
        Button sin = findViewById(R.id.button_sin);
        Button cos = findViewById(R.id.button_cos);
        Button tan = findViewById(R.id.button_tan);
        Button rad = findViewById(R.id.button_rad);
        Button inv = findViewById(R.id.button_flecha);


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
        if (babs != null) {
            babs.setOnClickListener(blistener);
        }
        if (bpi != null) {
            bpi.setOnClickListener(blistener);
        }
        if (e != null) {
            e.setOnClickListener(blistener);
        }
        if (ex != null){
            ex.setOnClickListener(blistener);
        }
        if (x2 != null){
            x2.setOnClickListener(blistener);
        }
        if (xn != null){
            xn.setOnClickListener(blistener);
        }
        if (ln != null){
            ln.setOnClickListener(blistener);
        }
        if (log != null){
            log.setOnClickListener(blistener);
        }
        if (dx != null){
            dx.setOnClickListener(blistener);
        }
        if (dx != null){
            dx.setOnClickListener(blistener);
        }
        if (sin != null)
        {
            sin.setOnClickListener(blistener);
        }
        if( cos != null){
            cos.setOnClickListener(blistener);
        }
        if (tan != null)
        {
            tan.setOnClickListener(blistener);
        }
        if (rad != null)
        {
            rad.setOnClickListener(blistener);
        }
        if (inv != null)
        {
            inv.setOnClickListener(blistener);
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
                case R.id.button_sqrt:
                    raiz("√");
                    break;
                case R.id.button_absoluto:
                    abs();
                    break;
                case R.id.button_pi:
                    pi();
                    break;
                case R.id.button_e:
                    e();
                    break;
                case R.id.button_ex:
                    ex();
                    break;
                case R.id.button_x2:
                    xpow();
                    break;
                case R.id.button_xn:
                    xn();
                    break;
                case R.id.button_ln:
                    ln();
                    break;
                case R.id.button_log:
                    log();
                    break;
                case R.id.button_divisionx:
                    dx();
                    break;
                case R.id.button_sin:
                    sin();
                    break;
                case R.id.button_cos:
                    cos();
                    break;
                case R.id.button_tan:
                    tan();
                    break;
                case R.id.button_rad:
                    rad();
                    break;
                case R.id.button_flecha:
                    inv();
                    break;
                default:
                    numeroPresionado("ERROR");
            }
        }
    }
    void inv(){
        Button sin = findViewById(R.id.button_sin);
        Button cos = findViewById(R.id.button_cos);
        Button tan = findViewById(R.id.button_tan);
        if (fl == false)
        {
            sin.setText("sin⁻¹");
            sin.setTextSize(9);
            cos.setText("cos⁻¹");
            cos.setTextSize(9);
            tan.setText("tan⁻¹");
            tan.setTextSize(9);
            fl=true;
        }
        else
        {
            sin.setText("sin");
            sin.setTextSize(12);
            cos.setText("cos");
            cos.setTextSize(12);
            tan.setText("tan");
            tan.setTextSize(12);
            fl=false;
        }

    }
    void rad(){
        try{
            String rad = type.getText().toString();
            if(rad == "RAD"){
                type.setText("");
            }
            else
            {
                type.setText("RAD");
            }
        }
        catch (Exception e)
        {
            res.setText("0");
            res2.setText("");
        }
    }


    void tan(){
        try{

            if(fl == true)
            {
                if (res.getText() == "0")
                {
                    operador = "tan⁻¹";
                    res.setText("0");
                    res2.setText( "tan⁻¹( ");
                }
                else
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    operador = "tan⁻¹";
                    res2.setText( "tan⁻¹(" + res.getText().toString() +")");
                }
            }
            else
            {
                if (res.getText() == "0")
                {
                    operador = "tan";
                    res.setText("0");
                    res2.setText( "tan(");
                }
                else
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    operador = "tan";
                    res2.setText( "tan(" + res.getText().toString() +")");
                }
            }

        }
        catch (Exception e ){
            res.setText("0");
            res2.setText("");
        }
    }
    void cos(){
        try{

            if(fl == true)
            {
                if (res.getText() == "0")
                {
                    operador = "cos⁻¹";
                    res.setText("0");
                    res2.setText( "cos⁻¹( ");
                }
                else
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    operador = "cos⁻¹";
                    res2.setText( "cos⁻¹(" + res.getText().toString() +")");
                }
            }
            else
            {
                if (res.getText() == "0")
                {
                    operador = "cos";
                    res.setText("0");
                    res2.setText( "cos( ");
                }
                else
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    operador = "cos";
                    res2.setText( "cos(" + res.getText().toString() +")");
                }
            }



        }
        catch (Exception e ){
            res.setText("0");
            res2.setText("");
        }
    }

    void sin(){
        try{

            if(fl == true)
            {
                if (res.getText() == "0")
                {
                    operador = "sin⁻¹";
                    res.setText("0");
                    res2.setText( "sin⁻¹( ");
                }
                else
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    operador = "sin⁻¹";
                    res2.setText( "sin⁻¹(" + res.getText().toString() +")");
                }
            }
            else
            {
                if (res.getText() == "0")
                {
                    operador = "sin";
                    res.setText("0");
                    res2.setText( "sin( ");
                }
                else
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    operador = "sin";
                    res2.setText( "sin(" + res.getText().toString() +")");
                }
            }

        }
        catch (Exception e ){
            res.setText("0");
            res2.setText("");
        }
    }



    void dx(){
        try{

            if (res.getText() == "0")
            {
                res.setText("ERROR");
                res2.setText("");

                Context context = getApplicationContext();
                CharSequence text = "No se puede dividir entre 0";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            else
            {
                firstnumber = Double.parseDouble(res.getText().toString());
                operador = "dx";
                res2.setText( "1 /" + res.getText().toString());


            }

        }
        catch (Exception e ){
            res.setText("0");
            res2.setText("");
        }
    }

    void log(){
        try{

            if (res.getText() == "0")
            {
                operador = "log";
                res.setText("0");
                res2.setText( "log(");
            }
            else
            {
                firstnumber = Double.parseDouble(res.getText().toString());
                operador = "log";
                res2.setText( "log(" + res.getText().toString());


            }

        }
        catch (Exception e ){
            res.setText("0");
            res2.setText("");
        }
    }

    void ln(){
        try{

            if (res.getText() == "0")
            {
                operador = "ln";
                res.setText("0");
                res2.setText( "ln(");
            }
            else
            {
                firstnumber = Double.parseDouble(res.getText().toString());
                operador = "ln";
                res2.setText( "ln(" + res.getText().toString());


            }

        }
        catch (Exception e ){
            res.setText("0");
            res2.setText("");
        }
    }

    void xn(){
        try {
            if (res.getText() == "0")
            {
                Context context = getApplicationContext();
                CharSequence text = "El formato no es valido";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            else
            {
                firstnumber = Double.parseDouble(res.getText().toString());
                operador = "xn";
                res.setText("0");
                res2.setText(String.valueOf(firstnumber) + " ^  ");
            }
        }
        catch (Exception e)
        {
            res.setText("0");
            res2.setText("");
        }
    }



    void xpow(){
        try {
            if (res.getText() == "0")
            {
                Context context = getApplicationContext();
                CharSequence text = "El formato no es valido";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            else
            {
                firstnumber = Double.parseDouble(res.getText().toString());
                secondnumber = 2;
                operador = "x2";
                res.setText("0");
                res2.setText(String.valueOf(firstnumber) + " ^ 2 ");
            }
        }
        catch (Exception e)
        {
            res.setText("0");
            res2.setText("");
        }
    }

    void ex(){
        try {
            if (res.getText() == "0") {
                firstnumber = 2.718281;
                res2.setText("2.718281");
                operador = "xn";

            }
            else{
                Context context = getApplicationContext();
                CharSequence text = "El formato no es valido";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        }

        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }
    }
    void e(){
        try {
            if (res.getText() == "0") {
                firstnumber = 2.718281;
                res.setText("2.718281");

            }
            else {
                firstnumber = Double.parseDouble(res.getText().toString());
                secondnumber = 2.718281;
                double r = firstnumber * secondnumber;
                res.setText( String.valueOf(r) );

            }
        }
        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }
    }
    void pi(){

        try {
            if (res.getText() == "0") {
                firstnumber = 3.141592;
                res.setText("3.141592");

            }
            else {
                firstnumber = Double.parseDouble(res.getText().toString());
                secondnumber = 3.141592;
                double r = firstnumber * secondnumber;
                res.setText( String.valueOf(r) );

            }
        }
        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }
    }
    void abs(){
        String s = res.getText().toString();
        try {
            firstnumber = Float.parseFloat(s);
            firstnumber = Math.abs(firstnumber);
            res.setText( String.valueOf(firstnumber));
        }
        catch (Exception e){
            res.setText("0");
            res2.setText("");
        }
    }

    void raiz(String op){

        String s = res.getText().toString();
        try {
                Double x = Double.parseDouble(s);
                if(x < 0){

                    res.setText("ERROR");
                    Context context = getApplicationContext();
                    CharSequence text = "Numero indefinido";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if(s.equals("0")){


                    operador = op;
                    res2.setText("√");
                }
                else{
                    firstnumber = Float.parseFloat(res.getText().toString());
                    res.setText( String.valueOf(firstnumber));
                    res2.setText("√" + firstnumber);
                    operador = "√";
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
        secondnumber =  Double.parseDouble(res.getText().toString());


        switch (operador){

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
            case "√":
                String n = (String) res.getText().toString();
                int i = n.length();
                n = n.substring(0,i);

                res2.setText("");

                firstnumber =  Double.parseDouble(n);
                resultado = Math.sqrt(firstnumber);
                s=String.valueOf(resultado);
                res.setText(s);
                break;
            case "pi" :
                resultado = firstnumber * secondnumber;
                s=String.valueOf(resultado);
                res.setText(s);
                res2.setText("");
                break;
            case "x2":
                resultado = Math.pow(firstnumber, 2);
                s=String.valueOf(resultado);
                res.setText(s);

                res2.setText("");
                break;
            case "xn":
            resultado = Math.pow(firstnumber, secondnumber);
            s=String.valueOf(resultado);
            res.setText(s);

            res2.setText("");
            break;

            case "ln":
                firstnumber = Double.parseDouble(res.getText().toString());
                resultado = Math.log(firstnumber);
                s= String.valueOf(resultado);
                res.setText(s);

                res2.setText("");
                break;
            case "log":
                firstnumber = Double.parseDouble(res.getText().toString());
                resultado = Math.log10(firstnumber);
                s= String.valueOf(resultado);
                res.setText(s);

                res2.setText("");
                break;
            case "dx":
                firstnumber = Double.parseDouble(res.getText().toString());
                resultado = 1 / firstnumber;
                s= String.valueOf(resultado);
                res.setText(s);

                res2.setText("");
                break;
            case "sin":

                if(type.getText().toString() == "RAD")
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    resultado = Math.sin(firstnumber);
                    s= String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                }
                else{
                    firstnumber = Double.parseDouble(res.getText().toString());
                    firstnumber = Math.toRadians(firstnumber);
                    resultado = Math.sin(firstnumber);
                    s= String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                }
                break;

            case "sin⁻¹":
                firstnumber = Double.parseDouble(res.getText().toString());
                if( firstnumber >= -1 && firstnumber <= 1  ) {
                    if (type.getText().toString() == "RAD") {

                        resultado = Math.asin(firstnumber);
                        s = String.valueOf(resultado);
                        res.setText(s);
                        res2.setText("");
                    } else {

                        firstnumber = Math.toRadians(firstnumber);
                        resultado = Math.asin(firstnumber);
                        s = String.valueOf(resultado);
                        res.setText(s);
                        res2.setText("");
                    }
                }
                else{

                    res.setText("ERROR");
                    res2.setText("");

                    Context context = getApplicationContext();
                    CharSequence text = "Resultado indeterminado";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    break;
                }



                break;
            case "cos":
                if(type.getText().toString() == "RAD")
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    resultado = Math.cos(firstnumber);
                    s= String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                }
                else{
                    firstnumber = Double.parseDouble(res.getText().toString());
                    firstnumber = Math.toRadians(firstnumber);
                    resultado = Math.cos(firstnumber);
                    s= String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                }
                break;
            case "cos⁻¹":

                if( firstnumber >= -1 && firstnumber <= 1  ) {
                    if (type.getText().toString() == "RAD") {
                        firstnumber = Double.parseDouble(res.getText().toString());
                        resultado = Math.acos(firstnumber);
                        s = String.valueOf(resultado);
                        res.setText(s);
                        res2.setText("");
                    } else {
                        firstnumber = Double.parseDouble(res.getText().toString());
                        firstnumber = Math.toRadians(firstnumber);
                        resultado = Math.acos(firstnumber);
                        s = String.valueOf(resultado);
                        res.setText(s);
                        res2.setText("");
                    }
                }
                else{

                    res.setText("ERROR");
                    res2.setText("");

                    Context context = getApplicationContext();
                    CharSequence text = "Resultado indeterminado";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    break;
                }


                break;
            case "tan":
                if(type.getText().toString() == "RAD")
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    resultado = Math.tan(firstnumber);
                    s= String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                }
                else{
                    firstnumber = Double.parseDouble(res.getText().toString());
                    firstnumber = Math.toRadians(firstnumber);
                    resultado = Math.tan(firstnumber);
                    s= String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                }
                break;
            case "tan⁻¹":
                if(type.getText().toString() == "RAD")
                {
                    firstnumber = Double.parseDouble(res.getText().toString());
                    resultado = Math.atan(firstnumber);
                    s= String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                }
                else{
                    firstnumber = Double.parseDouble(res.getText().toString());
                    firstnumber = Math.toRadians(firstnumber);
                    resultado = Math.atan(firstnumber);
                    s= String.valueOf(resultado);
                    res.setText(s);
                    res2.setText("");
                }
                break;

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