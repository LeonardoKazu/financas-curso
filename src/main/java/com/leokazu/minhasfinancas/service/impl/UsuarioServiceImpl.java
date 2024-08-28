package com.leokazu.minhasfinancas.service.impl;

import com.leokazu.minhasfinancas.model.entity.Usuario;
import com.leokazu.minhasfinancas.model.repository.UsuarioRepository;
import com.leokazu.minhasfinancas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.usuarioRepository = repository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {
        return;
    }
}
