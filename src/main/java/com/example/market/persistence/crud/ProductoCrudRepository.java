package com.example.market.persistence.crud;

import com.example.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByAsc(int idCategoria); // ordenados acendente

    Optional<List<Producto>> findByCatidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    /*
    @Query(value = "SELECT * FROM producto WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> getByCategoria(int idCategoria); //toca poner toda la sentencia SQL

    List<Producto> findByIdCategoria(int idCategoria); //query methods es mejor

    List<Producto> findByIdCategoriaOrderByDes(int idCategoria); // orden desendente
    */
}
