package com.rjornelas.dspesquisa.entities;

import com.rjornelas.dspesquisa.enums.Plataform;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Game implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Plataform platform;
    private Genre genre;
    private List<Record> records = new ArrayList<>();

    public Game() {
    }

    public Game(Long id, String title, Plataform  platform, Genre genre) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.genre = genre;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Plataform getPlatform() {
        return platform;
    }

    public void setPlatform(Plataform platform) {
        this.platform = platform;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Record> getRecords() {
        return records;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) &&
                Objects.equals(title, game.title) &&
                platform == game.platform &&
                Objects.equals(genre, game.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, platform, genre);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", platform=" + platform +
                ", genre=" + genre +
                '}';
    }
}
