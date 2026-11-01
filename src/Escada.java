public class Escada extends Equipamento {

    public Escada(String nome, double valorDiaria) {
        super(nome, valorDiaria);
    }

    @Override
    public double calcularValor(int dias) {
        return this.getValorDiaria() * dias;
    }
}
