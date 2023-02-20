package com.example.incrementadecrementaduplica;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Numero;
    TextView Incrementa;
    TextView Decrementa;
    TextView Duplica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero = findViewById(R.id.txtNumero);

        Incrementa = findViewById(R.id.txvIncrementa);
        Decrementa = findViewById(R.id.txvDecrementa);
        Duplica = findViewById(R.id.txvDuplica);


    }

    public void Calcular(View view)
    {
        String Nume = Numero.getText().toString();

        String Incre = Incrementa.getText().toString();
        String Decre = Decrementa.getText().toString();
        String Dupli = Duplica.getText().toString();


        int Nume1 = Integer.parseInt(Nume);

        int NIncre = Nume1 + 77;
        int NDecre = Nume1 - 3;
        int NDupli = Nume1 + Nume1;

        String NInc = Double.toString(NIncre);
        String NDec = Double.toString(NDecre);
        String NDup = Double.toString(NDupli);

        String Mensaje1 =(Nume1 + " + 77 = " + NInc );
        Incrementa.setText(Mensaje1);

        String Mensaje2 =(Nume1 + " - 3 = " + NDec );
        Decrementa.setText(Mensaje2);

        String Mensaje3 =(Nume1 + " + " + Nume1 + " = " + NDupli );
        Duplica.setText(Mensaje3);
    }
}