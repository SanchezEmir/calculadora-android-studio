package com.idat.ec_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_suma, btn_resta, btn_division, btn_multiplicacion, btn_igual, btn_punto, btn_limpiar;

    private TextView txv_Operacion, txv_Resultado;

    private double primero;
    private double segundo;
    private double resultado;
    private String operacion;
    private String respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv_Operacion = findViewById(R.id.txvOperacion);
        txv_Resultado = findViewById(R.id.txvResultado);

        btn_0 = findViewById(R.id.btnCero);
        btn_1 = findViewById(R.id.btnUno);
        btn_2 = findViewById(R.id.btnDos);
        btn_3 = findViewById(R.id.btnTres);
        btn_4 = findViewById(R.id.btnCuatro);
        btn_5 = findViewById(R.id.btnCinco);
        btn_6 = findViewById(R.id.btnSeis);
        btn_7 = findViewById(R.id.btnSiete);
        btn_8 = findViewById(R.id.btnOcho);
        btn_9 = findViewById(R.id.btnNueve);

        btn_suma = findViewById(R.id.btnSumar);
        btn_resta = findViewById(R.id.btnRestar);
        btn_division = findViewById(R.id.btnDividir);
        btn_multiplicacion = findViewById(R.id.btnMultiplicar);

        btn_igual = findViewById(R.id.btnIgual);
        btn_punto = findViewById(R.id.btnPunto);
        btn_limpiar = findViewById(R.id.btnLimpiar);

        btn_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv_Operacion.setText(null);
                txv_Resultado.setText(null);
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_0.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_1.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_2.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_3.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_4.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_5.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_6.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_7.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_8.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_9.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txv_Resultado.getText().toString() + btn_punto.getText().toString();
                txv_Resultado.setText(text);
            }
        });

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String primary;
                primero = Double.parseDouble((String) txv_Resultado.getText());
                primary = String.format("%.2f", primero);
                txv_Operacion.setText(primary);
                txv_Resultado.setText("");
                operacion="+";

            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String primary;
                primero = Double.parseDouble((String) txv_Resultado.getText());
                primary = String.format("%.2f", primero);
                txv_Operacion.setText(primary);
                txv_Resultado.setText("");
                operacion="-";

            }
        });

        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String primary;
                primero = Double.parseDouble((String) txv_Resultado.getText());
                primary = String.format("%.2f", primero);
                txv_Operacion.setText(primary);
                txv_Resultado.setText("");
                operacion="*";

            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String primary;
                primero = Double.parseDouble((String) txv_Resultado.getText());
                primary = String.format("%.2f", primero);
                txv_Operacion.setText(primary);
                txv_Resultado.setText("");
                operacion="/";

            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                segundo = Double.parseDouble((String) txv_Resultado.getText());

                if(operacion == "+"){
                    resultado = primero + segundo;
                    respuesta = String.format("%.2f",resultado);
                    txv_Resultado.setText(respuesta);
                    txv_Operacion.setText(null);
                }

                if(operacion == "-"){
                    resultado = primero - segundo;
                    respuesta = String.format("%.2f",resultado);
                    txv_Resultado.setText(respuesta);
                    txv_Operacion.setText(null);
                }

                if(operacion == "/"){
                    resultado = primero / segundo;
                    respuesta = String.format("%.2f",resultado);
                    txv_Resultado.setText(respuesta);
                    txv_Operacion.setText(null);
                }

                if(operacion == "*"){
                    resultado = primero * segundo;
                    respuesta = String.format("%.2f",resultado);
                    txv_Resultado.setText(respuesta);
                    txv_Operacion.setText(null);
                }

            }
        });

    }
}