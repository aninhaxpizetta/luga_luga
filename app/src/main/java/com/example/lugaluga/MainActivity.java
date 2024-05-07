package com.example.lugaluga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.ProdutoActivty;
import com.example.lugaluga.view.adapter.adapterProduto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

private RecyclerView recyclerView;

private adapterProduto adapterProduto;

private List<Produto> produtoList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listaProdutos);

        CriarListaProdutos();

        adapterProduto = new adapterProduto(produtoList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProduto);




        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, ProdutoActivty.class);
                intent.putExtra("produto", produtoList.get(position));
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), produtoList.get(position).getStatus(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));




    }

    public void  CriarListaProdutos(){

        Produto produto;

        produto = new Produto(
                "Iphone 13",
                "Iphone 13 64gb",
                200.00,
                1,
                "Disponível");
        produtoList.add(produto) ;

        produto = new Produto(
               "Máquina de Lavar",
               "Máquina de Lavar 20kg",
               1000.00,
               1,
               "Disponível");
        produtoList.add(produto);

        produto = new Produto(
                "Notebook",
                "Notebook dell 256gb",
                3500.00,
                2,
                "Indisponível");
        produtoList.add(produto);

        produto = new Produto(
                "Ipad",
                "Ipad pro 64gb",
                3970.00,
                1,
                "Disponível");
        produtoList.add(produto);

        produto = new Produto(
                "Carregador Portátil",
                "Carregador Portátil 120W",
                89.90,
                1,
                "Disponível");
        produtoList.add(produto);

        produto = new Produto(
                "Apple Watch",
                "Apple Watch 40 mm",
                2308.00,
                1,
                "Indisponível");
        produtoList.add(produto);

        produto = new Produto(
                "Teclado sem fio",
                "Teclado sem fio bluetooth 2.4G ",
                201.50,
                1,
                "Disponível");
        produtoList.add(produto);

        produto = new Produto(
                "Mouse",
                "Mouse 2.4G Sem Fio Bluetooth",
                205.00,
                1,
                "Disponível");
        produtoList.add(produto);

        produto = new Produto(
                "Televisão",
                "Smart TV LED 43",
                1999.90,
                1,
                "Disponível");
        produtoList.add(produto);

        produto = new Produto(
                "Geladeira",
                "Geladeira Electrolux Frost Free Inverter 590L AutoSense 3 Portas",
                6590.00,
                1,
                "Disponível");
        produtoList.add(produto);

    }

}