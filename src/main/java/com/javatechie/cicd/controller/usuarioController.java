package com.javatechie.cicd.controller;

import com.javatechie.cicd.models.Usuario;
import com.javatechie.cicd.service.usuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class usuarioController {
    private final usuarioService usuarioService;

    @GetMapping
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }
    //obtener por id
    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        return  usuarioService.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.update(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
