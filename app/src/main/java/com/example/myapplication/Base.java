package com.example.myapplication;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Base extends AppCompatActivity {
    private int contador = 0;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void add(TextView view){
        contador++;
        TextView cont = findViewById(R.id.valor);
        cont.setText("Contador: " + this.getContador());
    }
    public void zerar(TextView view){
        contador = 0;
        TextView cont = findViewById(R.id.valor);
        cont.setText("Contador: " + this.getContador());
    }
    public void menos(TextView view){
        contador--;
        TextView cont = findViewById(R.id.valor);
        cont.setText("Contador: " + this.getContador());
    }

}
