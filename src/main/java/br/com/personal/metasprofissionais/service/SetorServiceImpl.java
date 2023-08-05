package br.com.personal.metasprofissionais.service;

import br.com.personal.metasprofissionais.dao.SetorDao;
import br.com.personal.metasprofissionais.entity.Setor;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorServiceImpl implements SetorService{

    @Resource
    SetorDao setorDao;
    @Override
    public List<Setor> findAll() {
        return setorDao.findAll();
    }

    @Override
    public void insertSetor(Setor setor) {
        setorDao.insertSetor(setor);
    }

    @Override
    public void updateSetor(Setor setor) {
        setorDao.updateSetor(setor);
    }

    @Override
    public void deleteSetor(Setor setor) {
        setorDao.deleteSetor(setor);
    }
}
