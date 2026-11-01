public abstract class Equipamento {
    private String nome;
    private double valorDiaria;
    private boolean disponivel;

    public Equipamento(String nome, double valorDiaria) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean reservar() {
        if (this.disponivel) {
            this.disponivel = false;
            return true;
        } return false;
    }

    public boolean devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            return true;
        } return false;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public abstract double calcularValor(int dias);

    @Override
    public String toString() {
        return "Equipamento{" +
                "nome='" + nome + '\'' +
                ", valorDiaria=" + valorDiaria +
                ", disponivel=" + disponivel +
                '}';
    }
}
