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
        System.out.println("");
        System.out.print("Insira o valor do saque: ");
        double quantidade = teclado.nextDouble();
// Tratando a exceção
        try {
            conta.saque(quantidade);
            System.out.printf("Novo Saldo: %.2f", conta.getSaldo());
        } catch (ExcecoesConta ex) {
            System.out.println(ex.getMessage());
        }

        teclado.close();

    }

}
