package com.apple.phone;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo ligação para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
