package com.marcelo.mvp.presenter;

import android.content.Context;

import com.marcelo.mvp.model.Produto;
import com.marcelo.mvp.model.ProdutoRepository;
import com.marcelo.mvp.view.ProdutosView;

import java.util.Arrays;

public class ProdutosEsportivosPresenter implements ProdutosPresenter {

    private ProdutosView view;
    private ProdutoRepository repository;

    public ProdutosEsportivosPresenter(ProdutosView view, ProdutoRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void getProdutos(Context context) {
        view.mostraProdutos(repository.listaTodos());
    }
}
