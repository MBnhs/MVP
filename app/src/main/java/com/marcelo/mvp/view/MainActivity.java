package com.marcelo.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.marcelo.mvp.R;
import com.marcelo.mvp.model.Produto;
import com.marcelo.mvp.model.ProdutoRepository;
import com.marcelo.mvp.presenter.ProdutosEsportivosPresenter;
import com.marcelo.mvp.presenter.ProdutosPresenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ProdutosView {

    private ProdutosPresenter presenter;
    private ListView listaDeProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new ProdutosEsportivosPresenter(this, new ProdutoRepository());
        listaDeProdutos = findViewById(R.id.lvProdutos);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.getProdutos(this);
    }

    @Override
    public void mostraProdutos(List<Produto> produtos) {
        listaDeProdutos.setAdapter(new AdapterProduto(produtos, this));
    }
}
