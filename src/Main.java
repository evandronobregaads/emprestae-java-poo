import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("================ EMPRESTAÊ | Java POO ================");
        System.out.println("========= Sistema de Locação de Equipamentos =========");

        Cliente cliente = new Cliente("Evandro", 200.00);
        Equipamento furadeira = new Furadeira ("Furadeira Profissional", 40.00);
        Equipamento furadeiraExtra = new Furadeira ("Furadeira Compacta", 40.00);

        exibirTitulo("DADOS INICIAIS");
        exibirCliente(cliente);
        exibirEquipamento(furadeira);

        // TESTE 01 - LOCAÇÃO BEM-SUCEDIDA
        exibirTitulo("TESTE 01 | PRIMEIRO ALUGUEL");
        Locacao aluguel1 = new Locacao(cliente, furadeira, 2);
        exibirValor(furadeira.calcularValor(2));
        exibirResultado("Solicitação de aluguel", aluguel1.alugar());
        exibirCliente(cliente);
        exibirEquipamento(furadeira);

        // TESTE 02 - TENTATIVA DE ALUGAR NOVAMENTE
        exibirTitulo("TESTE 02 | LOCAÇÃO DUPLICADA");
        exibirResultado("Repetir a mesma locação", aluguel1.alugar());
        exibirCliente(cliente);

        // TESTE 03 - EQUIPAMENTO INDISPONÍVEL
        exibirTitulo("TESTE 03 | EQUIPAMENTO INDISPONÍVEL");
        Locacao tentativaIndisponivel = new Locacao(cliente, furadeira, 1);
        exibirResultado("Alugar equipamento já reservado", tentativaIndisponivel.alugar());
        exibirEquipamento(furadeira);

        // TESTE 04 - DEVOLUÇÃO
        exibirTitulo("TESTE 04 | DEVOLUÇÃO DO EQUIPAMENTO");
        exibirResultado("Devolver primeira locação", aluguel1.devolver());
        exibirEquipamento(furadeira);

        // TESTE 05 - DEVOLUÇÃO DUPLICADA
        exibirTitulo("TESTE 05 | DEVOLUÇÃO DUPLICADA");
        exibirResultado("Tentar devolver novamente", aluguel1.devolver());

        // TESTE 06 - NOVO ALUGUEL
        exibirTitulo("TESTE 06 | SEGUNDO ALUGUEL");
        Locacao aluguel2 = new Locacao(cliente, furadeira, 2);
        exibirValor(furadeira.calcularValor(2));
        exibirResultado("Nova solicitação de aluguel", aluguel2.alugar());
        exibirCliente(cliente);
        exibirEquipamento(furadeira);

        // TESTE 07 - SALDO INSUFICIENTE
        exibirTitulo("TESTE 07 | SALDO INSUFICIENTE");
        Locacao aluguelSemSaldo = new Locacao(cliente, furadeiraExtra, 2);
        exibirValor(furadeiraExtra.calcularValor(2));
        exibirResultado("Tentar alugar sem saldo suficiente", aluguelSemSaldo.alugar());
        exibirCliente(cliente);
        exibirEquipamento(furadeiraExtra);

        // TESTE 08 - QUANTIDADE DE DIAS INVÁLIDA
        exibirTitulo("TESTE 08 | PERÍODO INVÁLIDO");
        Locacao aluguelInvalido = new Locacao(cliente, furadeiraExtra, 0);
        exibirResultado("Solicitar aluguel por zero dias", aluguelInvalido.alugar());

        // TESTE 09 - DEVOLUÇÃO FINAL
        exibirTitulo("TESTE 09 | FINALIZAR LOCAÇÃO");
        exibirResultado("Devolver segundo aluguel", aluguel2.devolver());
        exibirCliente(cliente);
        exibirEquipamento(furadeira);

        // RESUMO FINAL
        exibirTitulo("RESUMO FINAL DO SISTEMA");
        System.out.println("CLIENTE");
        System.out.println("------------------------------------------------------");
        System.out.println("Nome: Evandro");
        System.out.printf("Saldo final: R$ %.2f%n", cliente.getSaldo());
        System.out.println("------------------------------------------------------");
        System.out.println("PRIMEIRA LOCAÇÃO");
        System.out.println("Status: DEVOLVIDO");
        System.out.println("Período: " + aluguel1.getDias() + " dias");
        System.out.printf("Valor: R$ %.2f%n", furadeira.calcularValor(aluguel1.getDias()));
        System.out.println("------------------------------------------------------");
        System.out.println("SEGUNDA LOCAÇÃO");
        System.out.println("Status: DEVOLVIDO");
        System.out.println("Período: " + aluguel2.getDias() + " dias");
        System.out.printf("Valor: R$ %.2f%n", furadeira.calcularValor(aluguel2.getDias()));
        System.out.println();
        System.out.println("============= FIM DOS TESTES | EMPRESTAÊ =============");
    }

        //Organização de Saída
        private static void exibirTitulo(String titulo) {
            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println(" " + titulo);
            System.out.println("------------------------------------------------------");
        }

        private static void exibirResultado(String descricao, boolean sucesso) {
            String resultado = sucesso ? "SUCESSO" : "REJEITADO";

            System.out.printf("%-40s [%s]%n", descricao, resultado);
        }

        private static void exibirCliente(Cliente cliente1) {
            System.out.printf(Locale.forLanguageTag("pt-BR"),
                    "Saldo atual do cliente: R$ %.2f%n", cliente1.getSaldo());
        }

        private static void exibirEquipamento(Equipamento equipamento) {
            String situacao = equipamento.isDisponivel()
                    ? "DISPONÍVEL"
                    : "INDISPONÍVEL";

            System.out.println("Equipamento: " + equipamento.getNome());
            System.out.println("Situação: " + situacao);
        }

        private static void exibirValor(double valor) {
            System.out.printf(Locale.forLanguageTag("pt-BR"),
                    "Valor da locação: R$ %.2f%n", valor);
        }
    }