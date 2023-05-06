package Exercicio2;

public class Principal {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();

        c1.saldo = 2000;
        System.out.println("saldo atual: " + c1.saldo);

        c1.saldo = c1.depositar(500);

        c1.saldo = c1.sacar(300);
    }
}
