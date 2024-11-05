// Classe Main para executar o programa
public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Carro
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.setAno(2020);
        carro.numeroPortas = 4;

        // Instanciando um objeto da classe Moto
        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CB500";
        moto.setAno(2019);
        moto.setCilindrada(500);

        // Imprimindo informações dos veículos
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}