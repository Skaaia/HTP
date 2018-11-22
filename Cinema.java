package com.skaari;

import java.util.Objects;

public class Cinema {
    private String filmName;
    public FilmMetadata filmMeta;

    public Cinema(String filmName,double filmGrade,double filmLength,String filmGenre, String filmDirector) {
        this.filmName = filmName;
        filmMeta = new FilmMetadata(filmGrade,filmLength,filmGenre,filmDirector);
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public FilmMetadata getFilmMeta() {
        return filmMeta;
    }

    public void setFilmMeta(FilmMetadata filmMeta) {
        this.filmMeta = filmMeta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(filmName, cinema.filmName) &&
                Objects.equals(filmMeta, cinema.filmMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmName, filmMeta);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "filmName='" + filmName + '\'' +
                ", " + filmMeta +
                '}';

    }

    class FilmMetadata {
        private double filmGrade;
        private double filmLength;
        private String filmGenre;
        private String filmDirector;


        public FilmMetadata(double filmGrade, double filmLength, String filmGenre, String filmDirector) {
            this.filmGrade = filmGrade;
            this.filmLength = filmLength;
            this.filmGenre = filmGenre;
            this.filmDirector = filmDirector;
        }

        public double getFilmGrade() {
            return filmGrade;
        }

        public void setFilmGrade(double filmGrade) {
            this.filmGrade = filmGrade;
        }

        public double getFilmLength() {
            return filmLength;
        }

        public void setFilmLength(double filmLength) {
            this.filmLength = filmLength;
        }

        public String getFilmGenre() {
            return filmGenre;
        }

        public void setFilmGenre(String filmGenre) {
            this.filmGenre = filmGenre;
        }

        public String getFilmDirector() {
            return filmDirector;
        }

        public void setFilmDirector(String filmDirector) {
            this.filmDirector = filmDirector;
        }

        @Override
        public String toString() {
            return
                    " filmGrade=" + filmGrade +
                    ", filmLength=" + filmLength +
                    ", filmGenre='" + filmGenre + '\'' +
                    ", filmDirector='" + filmDirector + '\'' +
                    '}';
        }
    }

}
