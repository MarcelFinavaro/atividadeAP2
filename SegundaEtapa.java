// Classe Carro que herda de Veiculo
class Carro extends Veiculo {
    public int numeroPortas; // Atributo público

    @Override
    public String informacoesVeiculo() {
        return "Carro: " + marca + " " + modelo + ", Ano: " + getAno() + ", Portas: " + numeroPortas;
    }
}