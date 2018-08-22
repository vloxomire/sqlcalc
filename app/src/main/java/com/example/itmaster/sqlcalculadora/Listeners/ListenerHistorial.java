package com.example.itmaster.sqlcalculadora.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.itmaster.sqlcalculadora.interfaz.Fase2;
import com.example.itmaster.sqlcalculadora.interfaz.SqliteActivity;

public class ListenerHistorial implements View.OnClickListener {

    SqliteActivity context;

    public ListenerHistorial(SqliteActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this.context, Fase2.class);

      
    }
}
