package com.meli.api.Aula8Exercicio1.dao;

import com.meli.api.Aula8Exercicio1.entity.Mesa;
import com.meli.api.Aula8Exercicio1.entity.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteDAO {
    private static Restaurante restaurante = new Restaurante();

    public Restaurante getRestaurante() {
        return restaurante;
    }
}
