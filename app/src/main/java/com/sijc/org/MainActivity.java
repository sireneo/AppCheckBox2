package com.sijc.org;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ed1, ed2;
    private CheckBox che1, che2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.txt_a);
        ed2 = (EditText)findViewById(R.id.txt_b);
        che1 = (CheckBox)findViewById(R.id.chk_suma);
        che2 = (CheckBox)findViewById(R.id.chk_prod);
        tv = (TextView)findViewById(R.id.txt_resultado);

    }
    //metodo que permite calcular las opreaciones
    public void Realizar(View view){
        String a = ed1.getText().toString();
        String b = ed2.getText().toString();

        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);

        String resultado = "";

        if (che1.isChecked() == true){
            int suma = numA + numB;
            resultado = "La suma es = " + suma + "//";
        }
        if (che2.isChecked() == true){
            int multiplicar = numA * numB;
            resultado = resultado + "El producto es = " + multiplicar + " ";
        }
        tv.setText(resultado);
    }
}