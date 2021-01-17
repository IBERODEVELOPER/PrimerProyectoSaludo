package com.informatico.ibero.prueba01saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*Creamos un objeto del EdiText*/
    EditText nameUser;
    /*Creamos un objeto TextView*/
    TextView mensajeUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Instanciamos las variables con los controles*/
        nameUser=(EditText)findViewById(R.id.etnombre);
        mensajeUser=(TextView)findViewById(R.id.tvmensaje);
    }
    /*creamos un meotodo el boton*/
    public void OnclickSaludar(View view){
        String nombre=getString(R.string.resultado_saludo,nameUser.getText().toString());
        mensajeUser.setText(nombre);
    }
}
