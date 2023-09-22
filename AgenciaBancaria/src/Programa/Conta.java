package Programa;

import Utilitarios.Util;

public class Conta {

    private static int contadorDeContas = 1;

    private int numeroConta;
    private Cliente cliente;
    private Double saldo = 0.0;

    public Conta(Cliente cliente) {
        this.numeroConta = contadorDeContas;
        this.cliente = cliente;
        contadorDeContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString () {
        return "\nNumero da conta: " + this.numeroConta.getNome() +
                "\nNome: " + this.cliente.getNome() +
                "\nCPF: " + this.cliente.getcpf() +
                "\nEmail: " + this.cliente.getEmail()+
                "\nSaldo: " + Util.doubleToString(this.getSaldo()) +
                        "\n";

    }
}
