package com.dio;

public class Main {

    public static void main(String[] args) {
        Cliente jonatha = new Cliente();
        jonatha.setNome("Jonatha");

        Conta cc = new ContaCorrente(jonatha);
        Conta poupanca = new ContaPoupanca(jonatha);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}