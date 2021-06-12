package br.com.tech4music.musicasws.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4music.musicasws.model.Musica;
import br.com.tech4music.musicasws.shared.MusicaDTO;

public interface MusicaService {
    MusicaDTO criarMusica(Musica musica);
    List<MusicaDTO> obterTodas();
    Optional<MusicaDTO> obterPorId(String id);
    void removerMusica(String id);
    MusicaDTO atualizarMusica(String id, Musica musicaNova);
}
