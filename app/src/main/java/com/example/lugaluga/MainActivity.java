package com.example.lugaluga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.adapter.adapterProduto;

import java.util.List;

public class MainActivity extends AppCompatActivity {

private RecyclerView recyclerView;

private adapterProduto adapterProduto;

private List<Produto> produtoList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.findViewById(R.id.listaProdutos);


    }

    public void  CriarListaProdutos(){
        Produto produto = new Produto("Iphone 13", "Iphone 13 64gb", 200.00, 1, "Disponível");
    }

}