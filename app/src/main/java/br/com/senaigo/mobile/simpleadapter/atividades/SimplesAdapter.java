package br.com.senaigo.mobile.simpleadapter.atividades;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.senaigo.mobile.simpleadapter.R;
import br.com.senaigo.mobile.simpleadapter.entidades.Pedido;
import br.com.senaigo.mobile.simpleadapter.entidades.Produto;

public class SimplesAdapter extends DefaultAtctivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
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

        List<String> colecaoArrayAdapter = new ArrayList<>();

        List<HashMap<String, String>> colecao = new ArrayList<>();

        for (Pedido p : lista){
            HashMap<String, String> map = new HashMap<>();
            map.put("id", p.getId().toString());
            map.put("cliente", p.getCliente().toString());
            map.put("data", p.getData().toString());
            map.put("valor", p.getValor().toString());

            colecao.add(map);
            colecaoArrayAdapter.add(p.getCliente());

            String[] de = {"id", "cliente", "data", "valor"};
            int[] para = {R.id.txtId, R.id.txtCliente, R.id.txtData, R.id.txtValor};

            SimplesAdapter adapter = new SimplesAdapter(this, colecao, R.layout.item,de,para);

            minhaLista.setAdapter(adapter);
        }
    }


}
