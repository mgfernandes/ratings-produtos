package org.rathing.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.rathing.dto.ProdutoDTO;
import org.rathing.services.ProdutosServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Path("/hello")
public class ProdutosResource {

    @Autowired
    private ProdutosServices produtosServices;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProdutoDTO> getProdutos() {
        return produtosServices.getAllProdutos();
    }
}
