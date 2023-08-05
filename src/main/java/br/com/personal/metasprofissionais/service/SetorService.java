package br.com.personal.metasprofissionais.service;

import br.com.personal.metasprofissionais.entity.Setor;

import java.util.List;

public interface SetorService {
    List<Setor> findAll();
    void insertSetor (Setor setor);
    void updateSetor (Setor setor);
    void deleteSetor (Setor setor);

}
