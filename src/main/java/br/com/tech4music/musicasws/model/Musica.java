package br.com.tech4music.musicasws.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musicas")
public class Musica {
    @Id
    private String id;

    //@NotEmpty(message= "Título em branco, por favor, corrija!!!")
    //@Size(min= 2, message= "O título deve ter, pelo menos, 2 caracteres.")
    private String titulo;

    //@NotBlank(message= "Artista preenchido apenas com carácter em branco, preste atenção e por favor, corrija!")
    private String artista;
    private String album;
    private String genero;

    //@PositiveOrZero(message= "Preste atenção no preenchimento da data; negativa ou zero proibidos!!!")
    private int anoLancamento;
    private String compositor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    @Override
    public String toString() {
        return "Musica [album=" + album + ", anoLancamento=" + anoLancamento + ", artista=" + artista + ", compositor="
                + compositor + ", genero=" + genero + ", id=" + id + ", titulo=" + titulo + "]";
    }

    
}
