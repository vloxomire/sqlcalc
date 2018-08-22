package com.example.itmaster.sqlcalculadora.Listeners;

import android.view.View;

import com.example.itmaster.sqlcalculadora.interfaz.SqliteActivity;

public class ListenerSuma implements View.OnClickListener {
    SqliteActivity context;

    public ListenerSuma(SqliteActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Integer resultadoSuma = Integer.valueOf(context.getEdtNro1().getText().toString()) + Integer.valueOf(context.getEdtNro2().getText().toString());

        context.getResultado().setText(resultadoSuma.toString());



    }
}
