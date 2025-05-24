package com.adsis.exemploSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adsis.exemploSpring.models.Ninja;
import com.adsis.exemploSpring.repositories.NinjaRepository;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public Ninja salvar(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    public List<Ninja> listar() {
        return ninjaRepository.findAll();
    }

    public List<Ninja> listarPorNome(String nome) {
        return ninjaRepository.findByNomeContainingIgnoreCase(nome);
    }

    public Optional<Ninja> buscarPorId(Long id) {
        return ninjaRepository.findById(id);
    }

    public void deletar(Ninja ninja) {
        ninjaRepository.delete(ninja);
    }

}
