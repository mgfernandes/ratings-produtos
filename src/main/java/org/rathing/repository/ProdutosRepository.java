package org.rathing.repository;

import org.rathing.dto.ProdutoDTO;
import org.rathing.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    @Query("select p.produto,p.quantidade,m.nome,ma.nome from Produtos p inner join p.medida m inner join p.marca ma ")
    List<ProdutoDTO> findAllProdutos();

}
