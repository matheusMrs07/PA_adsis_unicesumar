package com.adsis.exemploSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adsis.exemploSpring.DTOs.NinjaDTO;
import com.adsis.exemploSpring.Exceptions.NaoEncontradoException;
import com.adsis.exemploSpring.models.Ninja;
import com.adsis.exemploSpring.repositories.MissaoRepository;
import com.adsis.exemploSpring.repositories.NinjaRepository;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final MissaoRepository missaoRepository;

    public NinjaService(NinjaRepository ninjaRepository, MissaoRepository missaoRepository) {
        this.ninjaRepository = ninjaRepository;
        this.missaoRepository = missaoRepository;
    }

    public NinjaDTO salvar(NinjaDTO ninja) {
        Ninja ninjaEntity = new Ninja(ninja);

        ninjaEntity.setMissao(missaoRepository.findById(ninja.missaoId()).orElse(null));

        return new NinjaDTO(ninjaRepository.save(ninjaEntity));
    }

    public NinjaDTO salvar(Long id, NinjaDTO ninja) {
        ninjaRepository.findById(id).orElseThrow(
                () -> new NaoEncontradoException("Ninja nao foi encontrado!"));
        Ninja ninjaEntity = new Ninja(ninja);
        ninjaEntity.setId(id);
        ninjaEntity.setMissao(missaoRepository.findById(ninja.missaoId()).orElse(null));

        return new NinjaDTO(ninjaRepository.save(ninjaEntity));
    }

    public List<NinjaDTO> listar() {
        return ninjaRepository.findAll().stream().map(ninja -> new NinjaDTO(ninja)).toList();
    }

    public List<NinjaDTO> listarPorNome(String nome) {
        return ninjaRepository.findByNomeContainingIgnoreCase(nome).stream().map(ninja -> new NinjaDTO(ninja)).toList();
    }

    public NinjaDTO buscarPorId(Long id) {
        return ninjaRepository.findById(id).map(ninja -> new NinjaDTO(ninja)).orElseThrow(
                () -> new NaoEncontradoException("Ninja nao foi encontrado!"));
    }

    public void deletar(Long id) {
        ninjaRepository.findById(id)
                .orElseThrow(
                        () -> new NaoEncontradoException("Ninja nao foi encontrado!"));
        ninjaRepository.deleteById(id);
    }

}
