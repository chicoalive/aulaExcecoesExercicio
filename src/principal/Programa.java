package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.entidades.Conta;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-- -- Olá, seja bem vindo ao Banco ChicoAlive -- --");
        System.out.print("Quantas operações deseja realizar: ");
        int operacoes = teclado.nextInt();
// Criando um lista de contas
// List<tipo da lista> nome da lista = new ClasseQueImplementaList<tipo da lista>();
        List<Conta> lista = new ArrayList<>();
// For para armazenar as contas
        for (int i = 0; i < operacoes; i++) {
            System.out.println("Digite os dados da: "+(i+1)+"ª conta: ");
            System.out.print("Numero da conta: ");
            int numero = teclado.nextInt();
            System.out.print("Titular da conta: ");
            teclado.nextLine();
            String titular = teclado.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = teclado.nextInt();
            System.out.print("Limite de saque: ");
            double limiteSaque = teclado.nextDouble();
            lista.add(new Conta(numero, titular, saldo, limiteSaque));
            System.out.println("Insira o valor do saque: ");
            double quantidade = teclado.nextDouble();
            lista.get(i).saque(quantidade);
            
        }
        
        for (Conta conta : lista) {
            System.out.println("Novo Saldo: "+ conta.getSaldo());
        }
        teclado.close();

    }

}
