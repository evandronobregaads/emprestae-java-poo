public class Locacao {
    private Cliente cliente;
    private Equipamento equipamento;
    private int dias;
    private String estado;

    public Locacao(Cliente cliente, Equipamento equipamento, int dias) {
        this.cliente = cliente;
        this.equipamento = equipamento;
        this.dias = dias;
        this.estado = "PENDENTE";
    }

    public int getDias() {
        return dias;
    }

    public boolean alugar() {

        //Verifica o estado da locação
        if (!estado.equals("PENDENTE")) {
            System.out.println("Esta locação não está PENDENTE.");
            return false;
        }

        //Valida dias e disponibilidade
        if (dias <= 0 || !equipamento.isDisponivel()) {
            System.out.println("Dias inválidos ou equipamento indisponível.");
            return false;
        }

        //Calcula o valor do aluguel
        double valorAluguel = equipamento.calcularValor(dias);

        //Verifica o valor e o saldo do cliente
        if (valorAluguel <= 0 || cliente.getSaldo() < valorAluguel) {
            System.out.println("Valor inválido ou saldo insuficiente.");
            return false;
        }

        //Tenta reservar equipamento
        if (!equipamento.reservar()) {
            System.out.println("Não foi possível reservar o equipamento.");
            return false;
        }

        //Tenta realizar pagamento
        if (!cliente.pagar(valorAluguel)) {
            equipamento.devolver();
            System.out.println("Pagamento não realizado.");
            return false;
        }

        //Confirma locação
        this.estado = "ALUGADO";
        System.out.println("Equipamento ALUGADO com sucesso!");
        return true;
    }

    public boolean devolver() {
        //Só permite devolver uma Locação ativa
        if (!estado.equals("ALUGADO")) {
            System.out.println("Esta locação não possui uma devolução pendente.");
            return false;
        }

        //Tenta devolver o equipamento
        if(!equipamento.devolver()) {
            System.out.println("Não foi poss[ivel devolver o equipamento.");
            return false;
        }

        //Atualiza o estado da Locação
        this.estado = "DEVOLVIDO";
        System.out.println("Equipamento DEVOLVIDO com sucesso!");
        return true;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "estado='" + estado + '\'' +
                ", dias=" + dias +
                ", equipamento=" + equipamento +
                '}';
    }
}