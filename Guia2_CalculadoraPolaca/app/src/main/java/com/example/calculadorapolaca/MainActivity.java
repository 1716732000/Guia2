package com.example.calculadorapolaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText N1;
    EditText N2;
    EditText Operador;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        N1 = findViewById(R.id.txtN1);
        N2 = findViewById(R.id.txtN2);
        Operador = findViewById(R.id.txtOperacion);
        Resultado = findViewById(R.id.txvResultado);
    }

    public void Operando(View view)
    {
        String No1 = N1.getText().toString();
        String No2 = N2.getText().toString();
        String Ope = Operador.getText().toString();
        //String Res = Resultado.getText().toString();

        double N11 = Double.parseDouble(No1);
        double N22 = Double.parseDouble(No2);

        //gender.compareTo ("Male")==0
        if (Ope.compareTo("+")==0)
        {
            double suma = (N11 + N22);
            String Resul = Double.toString(suma);
            Resultado.setText(Resul);
        }else if(Ope.compareTo("-")==0)
        {
            double resta = (N11 - N22);
            String Resul = Double.toString(resta);
            Resultado.setText(Resul);
        }else if(Ope.compareTo("*")==0)
        {
            double multi = (N11 * N22);
            String Resul = Double.toString(multi);
            Resultado.setText(Resul);
        }else if(Ope.compareTo("/")==0)
        {
            double divi = (N11 / N22);
            String Resul = Double.toString(divi);
            Resultado.setText(Resul);
        }

    }
}
