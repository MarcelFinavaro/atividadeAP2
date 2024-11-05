// Classe Moto que herda de Veiculo
class Moto extends Veiculo {
    private int cilindrada; // Atributo privado

    @Override
    public String informacoesVeiculo() {
        return "Moto: " + marca + " " + modelo + ", Ano: " + getAno() + ", Cilindrada: " + cilindrada + "cc";
    }

    // Métodos de acesso para o atributo cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}