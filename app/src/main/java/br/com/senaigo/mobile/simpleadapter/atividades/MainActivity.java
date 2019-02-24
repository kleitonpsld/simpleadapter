package br.com.senaigo.mobile.simpleadapter.atividades;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.SimpleAdapter;

import br.com.senaigo.mobile.simpleadapter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__tela);
    }

    public void simpleAdapter(View view){

        startActivity(new Intent(this,SimpleAdapter.class));
    }

    public void arrayAdapter(View view){
        startActivity(new Intent(this,ArrayAdapter.class));
    }

    public void baseAdapter(View view){
        startActivity(new Intent(this,BaseAdapter.class));
    }

}
