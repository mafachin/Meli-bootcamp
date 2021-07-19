package com.meli.api.Aula8Exercicio1.dao;

import com.meli.api.Aula8Exercicio1.entity.Prato;

import java.util.ArrayList;
import java.util.List;

public class PratoDAO {
    private static List<Prato> pratos = new ArrayList<>();

    public List<Prato> getList() {
        return pratos;
    }

    public void create(Prato prato) {
        pratos.add(prato);
    }

    public Prato get(long id) {
        return pratos.stream().filter(ent -> ent.getId() == id).findFirst().orElse(null);
    }
}