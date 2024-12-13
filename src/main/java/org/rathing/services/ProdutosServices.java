package org.rathing.services;

import org.rathing.dto.ProdutoDTO;
import org.rathing.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutosServices {

    @Autowired
    private ProdutosRepository produtosRepository;

    public List<ProdutoDTO> getAllProdutos(){


        return produtosRepository.findAllProdutos().stream()
                .map(p -> new ProdutoDTO(p.getProduto(), p.getMarca().getNome(),p.getQuantidade(),p.getMedida().getNome()   ))
                .collect(Collectors.toList());
    }
}
