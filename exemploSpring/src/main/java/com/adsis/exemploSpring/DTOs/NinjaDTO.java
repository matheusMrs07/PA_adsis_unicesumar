package com.adsis.exemploSpring.DTOs;

import com.adsis.exemploSpring.models.Ninja;

public record NinjaDTO(
                Long id,
                String nome,
                int idade,
                String vila,
                String cla,
                Long missaoId) {
        public NinjaDTO(Ninja ninja) {
                this(
                                ninja.getId(),
                                ninja.getNome(),
                                ninja.getIdade(),
                                ninja.getVila(),
                                ninja.getCla(),
                                ninja.getMissao() != null ? ninja.getMissao().getId() : null);
        }
}
