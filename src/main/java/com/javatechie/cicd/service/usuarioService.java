package com.javatechie.cicd.service;

import com.javatechie.cicd.models.Usuario;

import java.util.List;

public interface usuarioService {
    public List<Usuario> findAll();
    public Usuario findById(Long id);
    public Usuario save(Usuario usuario);
    public Usuario update(Long id, Usuario usuario);
    public void delete(Long id);
}
