package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
    // Buscar productos por nombre (búsqueda parcial)
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
    
    // Buscar productos por laboratorio
    List<Producto> findByLaboratorioContainingIgnoreCase(String laboratorio);
    
    // Buscar productos con stock bajo (menor a un valor)
    List<Producto> findByStockLessThanEqual(Integer stock);
}