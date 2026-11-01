public class Cliente {

    private String nome;
    private double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean pagar(double valor) {
        if (this.saldo > 0 && valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
