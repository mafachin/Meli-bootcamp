package com.meli.api.Aula8Exercicio1.dao;

import com.meli.api.Aula8Exercicio1.entity.Mesa;

import java.util.ArrayList;
import java.util.List;

public class MesaDAO {
    private static List<Mesa> mesas = new ArrayList<>();

    public List<Mesa> getList() {
        return mesas;
    }

    public void create(Mesa mesa) {
        mesas.add(mesa);
    }

    public Mesa get(long id) {
        return mesas.stream().filter(ent -> ent.getId() == id).findFirst().orElse(null);
    }
}
