package br.com.tech4music.musicasws.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4music.musicasws.model.Musica;

public interface MusicaRepository extends MongoRepository <Musica, String> {
    
}
