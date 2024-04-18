package com.example.lugaluga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView listCidade;

    private String[] cidades = {
            "São Carlos", "Araraquara", "Ibaté",
            "Santa Rita", "Porto Ferreira", "Tambaú",
            "Descalvado", "Ribeirão Preto", "Pirassununga",
            "Brotas", "Araras", "São Paulo", "Jaboticabal",
            "Itirapina", "Itú", "Bauru", "Rio Claro",
            "Franca", "Santa Cruz das Palmeiras"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listCidade = findViewById(R.id.listaNomes);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                cidades
        );

        listCidade.setAdapter(adapter);

        listCidade.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemSelecionado = listCidade.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), itemSelecionado, Toast.LENGTH_LONG).show();
            }
        });




    }
}