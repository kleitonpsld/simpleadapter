package br.com.senaigo.mobile.simpleadapter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.senaigo.mobile.simpleadapter.R;
import br.com.senaigo.mobile.simpleadapter.atividades.BaseAdapter;
import br.com.senaigo.mobile.simpleadapter.entidades.Pedido;

public class PedidoAdapter extends BaseAdapter {

    Context context;
    List<Pedido> colecao;
    LayoutInflater inflater;

    public PedidoAdapter(final Context applicationContext, final List<Pedido> colecao){
        this.context = applicationContext;
        this.colecao = colecao;
    }

    public int getCount(){
        return this.colecao != null ? this.colecao.size() : 0;
    }

    public Object getItem(int i){
        return this.colecao.get(i);
    }

    public Pedido parsetItem(int i){
        return this.colecao.get(i);
    }

    public long getItemId(int i){
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup){
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_pedido, viewGroup, false);
        }

        Pedido pedido = parsetItem(i);

        Textview campoCliente, campoData, campoId, campoValor;
        campoCliente = view.findViewById(R.id.txtCliente);
        campoId = view.findViewById(R.id.txtId);
        campoData = view.findViewById(R.id.txtData);
        campoValor = view.findViewById(R.id.txtValor);

        return view;
    }


}
