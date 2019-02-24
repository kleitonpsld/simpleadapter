package br.com.senaigo.mobile.simpleadapter.atividades;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ListAdapter;

import java.math.BigDecimal;
import java.util.List;

import br.com.senaigo.mobile.simpleadapter.R;
import br.com.senaigo.mobile.simpleadapter.entidades.Pedido;
import br.com.senaigo.mobile.simpleadapter.entidades.Produto;

public class ArrayAdapter extends DefaultAtctivity{



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);
    }

    public void adicionar(View view){

        //ENTRADA DE DADOS
        txtId = findViewById(R.id.txtId);
        txtCliente = findViewById(R.id.txtCliente);
        txtData = findViewById(R.id.txtData);
        txtValor = findViewById(R.id.txtValor);
        //lista

        String cliente, data;
        Long id;
        BigDecimal valor;
        List<Produto> produtos;

        id = Long.valueOf(txtId.getId());
        cliente = txtCliente.getText().toString();
        data = txtData.getText().toString();
        valor = (BigDecimal) txtValor.getText();


        Pedido pedido = new Pedido(id,cliente,data,valor);

        lista.add(pedido);
        
        minhaLista = findViewById(R.id.minhaLista);

        ArrayAdapter<Pedido> arrayAdapter = new ArrayAdapter<Pedido>(this, android.R.layout.simple_list_item_1, lista);
        minhaLista.setAdapter((ListAdapter) arrayAdapter);
    }




}
