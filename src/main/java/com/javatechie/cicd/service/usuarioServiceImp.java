package com.javatechie.cicd.service;

import com.javatechie.cicd.models.Usuario;
import com.javatechie.cicd.repository.usuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class usuarioServiceImp implements usuarioService {

    final usuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id){
        return usuarioRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Long id, Usuario usuario){
        Usuario temp = usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario no encontrado")
        );
        temp.setUsuario_name(usuario.getUsuario_name());
        temp.setEmail(usuario.getEmail());
        return  usuarioRepository.save(temp);
    }

    @Override
    public void delete(Long id){
        if(!usuarioRepository.existsById(id)){
            throw  new RuntimeException("Usuario no encontrado");
        }
    }




}
