package br.com.senaigo.mobile.simpleadapter.atividades;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ListAdapter;

import java.math.BigDecimal;
import java.util.List;

import br.com.senaigo.mobile.simpleadapter.R;
import br.com.senaigo.mobile.simpleadapter.adapters.PedidoAdapter;
import br.com.senaigo.mobile.simpleadapter.entidades.Pedido;
import br.com.senaigo.mobile.simpleadapter.entidades.Produto;

public class BaseAdapter extends DefaultAtctivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);
    }

    public void adcionar(View view){
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

        PedidoAdapter pedidoAdapter = new PedidoAdapter(this, lista);
        minhaLista.setAdapter(pedidoAdapter);
    }
}
