package com.example.lugaluga.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.example.lugaluga.R;
import com.example.lugaluga.model.Produto;

public class ProdutoActivty extends AppCompatActivity {

    private Produto produto;

    private TextView nomeProduto, qtProduto, precoProduto, descProduto;

    private Button btnAluga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto_activty);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        nomeProduto = findViewById(R.id.nome);
        qtProduto = findViewById(R.id.quantidade);
        precoProduto = findViewById(R.id.preco);
        descProduto = findViewById(R.id.tv_descricao);

        btnAluga = findViewById(R.id.alugaBtn);

        produto = getIntent().getExtras().getParcelable("produto");

        nomeProduto.setText(produto.getNome());
        qtProduto.setText(String.valueOf(produto.getQuantidade()));
        precoProduto.setText(String.valueOf(produto.getPreco()));
        descProduto.setText(produto.getDescricao());

        btnAluga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProdutoActivty.this);
                builder.setMessage("Deseja realmente alugar esse produto?");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Concluído", Toast.LENGTH_SHORT).show();
                        btnAluga.setText("Solicitado");
                        btnAluga.setBackgroundColor(getColor(R.color.yellow));
                        btnAluga.setEnabled(false);

                    }
                });

                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });


                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });



    }
}