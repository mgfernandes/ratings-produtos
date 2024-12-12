package org.rathing.services;

import org.rathing.dto.ProdutoDTO;
import org.rathing.entity.Produtos;
import org.rathing.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosServices {

    @Autowired
    private ProdutosRepository produtosRepository;

    public List<ProdutoDTO> getAllProdutos(){
        return  produtosRepository.findAllProdutos();
    }
}
