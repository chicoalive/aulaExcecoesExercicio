package model.entidades;

public class Conta {

    public Integer numero;
    public String titular;
    public Double saldo;
    public Double limiteSaque;

// Construtores
    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

// Get e Set - Pegar e modificar
    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

// Não pode ter um setSaldo, pois só pode modificar o saldo com as operações de saque e deposito.
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

// Métodos para saque e deposito
    public void deposito(double quantidade) {
        saldo += quantidade;
    }

    public void saque(double quantidade) {
        saldo -= quantidade;
    }
}
