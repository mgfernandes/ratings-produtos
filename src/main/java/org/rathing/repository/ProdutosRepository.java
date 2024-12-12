package org.rathing.repository;

import org.rathing.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    @Query("select r from Produtos r ")
    List<Produtos> findAllProdutos();

}
