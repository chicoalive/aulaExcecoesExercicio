package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.entidades.Conta;
import model.excecoes.ExcecoesConta;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-- -- Olá, seja bem vindo ao Banco ChicoAlive -- --");

// Criando um lista de contas
// List<tipo da lista> nome da lista = new ClasseQueImplementaList<tipo da lista>();
// criando uma lista vazia de objetos do tipo Conta
        Conta conta = new Conta();
// For para armazenar as contas
        try {

            System.out.println("Digite os dados daconta: ");
            System.out.print("Numero da conta: ");
            int numero = teclado.nextInt();
            System.out.print("Titular da conta: ");
            teclado.nextLine();
            String titular = teclado.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = teclado.nextInt();
            System.out.print("Limite de saque: ");
            double limiteSaque = teclado.nextDouble();
            conta = new Conta(numero, titular, saldo, limiteSaque);
            System.out.print("Insira o valor do saque: ");
            double quantidade = teclado.nextDouble();
            conta.saque(quantidade);
            System.out.println("Novo Saldo: " + conta.getSaldo());
        } catch (ExcecoesConta erro) {
            System.out.println("Erro no saque: " + erro.getMessage());
        }

        teclado.close();

    }

}
