package br.com.personal.metasprofissionais.service;

import br.com.personal.metasprofissionais.dao.PerfilDao;
import br.com.personal.metasprofissionais.entity.Perfil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService{
    @Resource
    PerfilDao perfilDao;
    @Override
    public List<Perfil> findAll() {
        return perfilDao.findAll();
    }

    @Override
    public void insertPerfil(Perfil p) {
        perfilDao.insertPerfil(p);
    }

    @Override
    public void updatePerfil(Perfil p) {
        perfilDao.updatePerfil(p);
    }

    @Override
    public void deletePerfil(Perfil p) {
        perfilDao.deletePerfil(p);
    }
}
