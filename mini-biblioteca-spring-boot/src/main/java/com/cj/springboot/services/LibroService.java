package com.cj.springboot.services;

import com.cj.springboot.entities.Categoria;
import com.cj.springboot.entities.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService {

    Libro saveLibro(Libro libro);

    Optional<Libro> buscarPorId(Long id);

    Optional<Libro> buscarPorTitulo(String titulo);

    List<Libro> listarTodosLosLibros();

    Libro actualizarLibro(Libro libro);

    void eliminarLibro(Long id);

    List<Libro> buscarPorCategoria(Categoria categoria);
}
