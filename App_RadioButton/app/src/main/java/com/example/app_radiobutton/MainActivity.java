package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //siempre agregar primero los componentes para que se agreguen las librerias
    // y declarar las variables que se van a utilizar.
    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rbSuma, rbResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtnum1);
        et2 = (EditText) findViewById(R.id.txtnum2);
        tv1 = (TextView) findViewById(R.id.txtView_Operacion);
        rbSuma = (RadioButton)findViewById(R.id.rb_suma);
        rbResta = (RadioButton)findViewById(R.id.rb_resta);
    }
    //Metodo para el botón calcular
    public void Calcular(View calcular){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        //aqui los valores que ingresa el usuario que serían enteros, pasan a strings
        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if (rbSuma.isChecked() == true){
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if(rbResta.isChecked() == true){
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else{
            tv1.setText("no ha seleccionado una operación");
        }

    }
}