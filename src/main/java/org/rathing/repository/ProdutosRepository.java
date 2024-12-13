package org.rathing.repository;

import org.rathing.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long> {

    @Query("select p from Produtos p inner join p.medida m inner join p.marca ma ")
    List<Produto> findAllProdutos();

}
