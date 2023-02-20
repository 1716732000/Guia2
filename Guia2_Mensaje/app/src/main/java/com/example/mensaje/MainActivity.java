package com.example.mensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Nombre;
    TextView Mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.edtNombre);
        Mensaje = findViewById(R.id.txvMostrarMensaje);
    }

    public void MostrarMensaje(View view)
    {
        String N = Nombre.getText().toString();

        Mensaje.setText("Bienvenido : "  + N);
    }
}