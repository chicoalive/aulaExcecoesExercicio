package model.entidades;

import model.excecoes.ExcecoesConta;

public class Conta {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

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
// Chamando a função aqui, já estou informando que se tive erro ele faz operação saque, se não, não faz.
        validacaoSaque(quantidade);
        saldo -= quantidade;
    }
// Cria uma função com as exceções

    private void validacaoSaque(double quantidade) throws ExcecoesConta {
        if (quantidade > getLimiteSaque()) {
            throw new ExcecoesConta("Saque maior que o limite. ");
        }
        if (quantidade > getSaldo()) {
            throw new ExcecoesConta("Saldo insuficiente. ");

        }
    }

}
