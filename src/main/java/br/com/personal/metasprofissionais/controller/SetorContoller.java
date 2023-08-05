package br.com.personal.metasprofissionais.controller;

import br.com.personal.metasprofissionais.entity.Setor;
import br.com.personal.metasprofissionais.service.SetorService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Resource
@RequestMapping("/setores")
public class SetorContoller {
    @Resource
    SetorService setorService;

    @GetMapping(value = "/list")
    public List<Setor> getSetores(){
        return setorService.findAll();
    }
    @PostMapping(value = "/create")
    public void createSetor(@RequestBody Setor setor) {
        setorService.insertSetor(setor);
    }
    @PutMapping(value = "/update")
    public void updateSetor(@RequestBody Setor setor) {
        setorService.updateSetor(setor);
    }
    @DeleteMapping(value = "/deleteSetorById")
    public void deleteSetor(@RequestBody Setor setor) {
        setorService.deleteSetor(setor);
    }
}
