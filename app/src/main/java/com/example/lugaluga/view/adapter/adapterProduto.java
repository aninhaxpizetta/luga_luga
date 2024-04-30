package com.example.lugaluga.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lugaluga.R;
import com.example.lugaluga.model.Produto;

import java.util.List;

public class adapterProduto extends RecyclerView.Adapter<adapterProduto.ViewHolder> {

    private List<Produto> produtoList;

    public adapterProduto(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @NonNull
    @Override
    public adapterProduto.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listaProdutos = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_produto, parent, false);

        return new ViewHolder(listaProdutos);

    }

    @Override
    public void onBindViewHolder(@NonNull adapterProduto.ViewHolder holder, int position) {

        holder.nomeProduto.setText(produtoList.get(position).getNome());
        holder.nomePreco.setText(String.valueOf(produtoList.get(position).getPreco()));
        holder.descricao.setText(produtoList.get(position).getDescricao());


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nomeProduto, nomePreco, descricao;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeProduto = itemView.findViewById(R.id.tv_nomeProduto);
            nomePreco = itemView.findViewById(R.id.tv_nomePreco);
            descricao = itemView.findViewById(R.id.tv_descricao);


        }
    }
}