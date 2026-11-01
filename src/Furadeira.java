public class Furadeira extends Equipamento {

    private double taxaFixa = 15.00;

    public Furadeira(String nome, double valorDiaria) {
        super(nome, valorDiaria);
    }

    @Override
    public double calcularValor(int dias) {
        return getValorDiaria() * dias + taxaFixa;
    }
}
