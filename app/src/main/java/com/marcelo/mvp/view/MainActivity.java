package com.marcelo.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.marcelo.mvp.R;
import com.marcelo.mvp.presenter.ProdutosEsportivosPresenter;
import com.marcelo.mvp.presenter.ProdutosPresenter;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements ProdutosView {

    private ProdutosPresenter presenter;
    private ListView listaDeProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new ProdutosEsportivosPresenter();
    }

    @Override
    public void mostraProdutos() {
        listaDeProdutos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Arrays.asList("")));
        presenter.getProdutos();
    }
}
