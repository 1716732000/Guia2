package com.example.precioproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Producto;
    EditText Cantidad;
    EditText Precio;
    TextView Pagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Producto = findViewById(R.id.txtProducto);
        Cantidad = findViewById(R.id.txtCantidad);
        Precio = findViewById(R.id.txtPrecio);
        Pagar = findViewById(R.id.txvPagar);

    }

    public void Calcular(View view)
    {
        String Cantidad1 = Cantidad.getText().toString();
        String Precio1 = Precio.getText().toString();

        double Can = Double.parseDouble(Cantidad1);
        double Pre = Double.parseDouble(Precio1);

        double Pag2 = (Pre + (Pre * (13.4 / 100))) ;
        double Pag1 = Pag2 * Can;

        String Pag = Double.toString(Pag1);
        Pagar.setText(Pag);
    }
}