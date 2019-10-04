package com.example.bandas.Model;

import androidx.fragment.app.Fragment;

public class Album {

    private String nomeAlbum;
    private int imagemAlbum;
    private Fragment fragment;

    public Album( ) {

    }

    public Album(String nome, int imagem, Fragment fragment) {
        this.nomeAlbum = nome;
        this.imagemAlbum = imagem;
        this.fragment = fragment;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public int getImagemAlbum() {
        return imagemAlbum;
    }

    public void setImagemAlbum(int imagemAlbum) {
        this.imagemAlbum = imagemAlbum;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
