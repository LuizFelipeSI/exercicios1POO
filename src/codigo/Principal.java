package codigo;

public class Principal {

    public static void main(String[] args) {

        Carro uno = new Carro();

        uno.ano = 2013;
        uno.modelo = "Uno";
        uno.fabricante = "FIAT";
        uno.velocidade = 0;

        uno.acelerar(5);

        System.out.println(uno.velocidade);

        Carro lamborghini = new Carro();

        lamborghini.ano = 2024;
        lamborghini.fabricante = "Lamborghini";
        lamborghini.modelo = "Gallardo";

        System.out.println(lamborghini.modelo);
        System.out.println(uno.modelo);
    }
}
