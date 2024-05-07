package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lugaluga.R;
import com.example.lugaluga.model.Produto;

public class ProdutoActivty extends AppCompatActivity {

    private Produto produto;

    private TextView nomeProduto, qtProduto, precoProduto, descProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto_activty);

        nomeProduto = findViewById(R.id.nome);
        qtProduto = findViewById(R.id.quantidade);
        precoProduto = findViewById(R.id.preco);
        descProduto = findViewById(R.id.tv_descricao);

        produto = getIntent().getExtras().getParcelable("produto");

        nomeProduto.setText(produto.getNome());
        qtProduto.setText(produto.getQuantidade());
        precoProduto.setText(String.valueOf(produto.getPreco()));
        descProduto.setText(produto.getDescricao());



    }
}