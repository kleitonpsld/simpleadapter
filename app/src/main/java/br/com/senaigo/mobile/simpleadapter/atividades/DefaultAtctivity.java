package br.com.senaigo.mobile.simpleadapter.atividades;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.simpleadapter.entidades.Pedido;
import br.com.senaigo.mobile.simpleadapter.entidades.Produto;

public class DefaultAtctivity extends AppCompatActivity {

    public EditText txtId;
    public EditText txtCliente;
    public EditText txtData;
    public EditText txtValor;
    public List<Pedido> lista = new ArrayList<>();
    public ListView minhaLista;
}
