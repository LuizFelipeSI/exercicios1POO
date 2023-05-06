package Exercicio2;

public class ContaBancaria {

    public double saldo;
    public String titular;

    public double depositar(double deposito) {

        System.out.println("saldo atual: " + (this.saldo + deposito));

        return this.saldo + deposito;

    }

    public double sacar(double saque) {

        System.out.println("saldo atual: " + (this.saldo - saque));

        return this.saldo - saque;
    }
}
