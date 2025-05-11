package com.apple;

import com.apple.internetbrowser.NavegadorInternetImpl;
import com.apple.musicplayer.ReprodutorMusicalImpl;
import com.apple.phone.AparelhoTelefonicoImpl;

public class Main {
    public static void main(String[] args) {

        ReprodutorMusicalImpl reprodutorMusical = new ReprodutorMusicalImpl();

        AparelhoTelefonicoImpl aparelhoTelefonicoImpl = new AparelhoTelefonicoImpl();

        NavegadorInternetImpl navegadorInternetImpl = new NavegadorInternetImpl();

        separator();

        reprodutorMusical.selecionarMusica("My Way");

        separator();

        reprodutorMusical.tocar();

        separator();

        reprodutorMusical.pausar();

        separator();

        aparelhoTelefonicoImpl.ligar("11-4543-9999");

        separator();

        aparelhoTelefonicoImpl.atender();

        separator();

        aparelhoTelefonicoImpl.iniciarCorreioDeVoz();

        separator();

        navegadorInternetImpl.adicionarNovaAba();

        separator();

        navegadorInternetImpl.exibirPagina("www.dio.io");

        separator();

        navegadorInternetImpl.atualizarPagina();

        separator();

    }

    public static void separator(){
        System.out.println("---------------------------");
    }
}