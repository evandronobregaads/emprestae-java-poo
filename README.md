# 🛠️ Emprestaê | Sistema de Locação em Java

**Projeto acadêmico desenvolvido em Java para praticar os fundamentos da Programação Orientada a Objetos (POO).**

O Emprestaê é um sistema de simulação de aluguel de ferramentas e equipamentos, executado pelo console. O projeto permite cadastrar objetos em memória, calcular valores de locação, verificar saldo, controlar a disponibilidade dos equipamentos e realizar devoluções.

## 🎯 Objetivo

Aplicar na prática os conceitos estudados em Programação Orientada a Objetos, desenvolvendo um pequeno sistema no qual diferentes classes trabalham juntas para executar operações de locação.

## 🚀 Funcionalidades

- Simulação de clientes com saldo disponível.
- Representação de diferentes tipos de equipamentos.
- Cálculo de valores de aluguel conforme o equipamento e o período.
- Verificação de saldo suficiente para pagamento.
- Controle de disponibilidade dos equipamentos.
- Realização de reservas e devoluções.
- Prevenção de locações e devoluções duplicadas.
- Exibição de resultados e informações no console.
- Execução de cenários de teste com operações válidas e inválidas.

## 🧠 Conceitos de POO aplicados

| Conceito | Aplicação no projeto |
|---|---|
| **Classes e objetos** | Representação dos clientes, equipamentos e locações. |
| **Encapsulamento** | Proteção de atributos e controle das operações por métodos. |
| **Construtores** | Inicialização dos objetos com seus dados. |
| **Herança** | `Furadeira` e `Escada` herdam de `Equipamento`. |
| **Polimorfismo** | Objetos de diferentes equipamentos podem ser utilizados por referências do tipo `Equipamento`. |
| **Classes abstratas** | `Equipamento` define características e comportamentos comuns. |
| **Sobrescrita** | Implementação específica de `calcularValor()` nas subclasses. |

## 🗂️ Estrutura do projeto

O projeto é composto por seis classes principais:

- **`Cliente.java`** — representa o cliente e gerencia seu saldo e pagamentos.
- **`Equipamento.java`** — classe abstrata que define os atributos e métodos comuns dos equipamentos.
- **`Furadeira.java`** — representa uma furadeira e implementa seu cálculo de locação.
- **`Escada.java`** — representa uma escada e implementa seu cálculo de locação.
- **`Locacao.java`** — coordena as operações de aluguel, pagamento, reserva e devolução.
- **`Main.java`** — executa os cenários de teste e exibe os resultados no console.

## 🧪 Testes realizados

A classe `Main` contém nove cenários para demonstrar o funcionamento do sistema:

| Teste | Resultado esperado |
|---|---|
| Primeiro aluguel | Sucesso |
| Tentativa de locação duplicada | Rejeitado |
| Equipamento indisponível | Rejeitado |
| Devolução do equipamento | Sucesso |
| Tentativa de devolução duplicada | Rejeitado |
| Segundo aluguel | Sucesso |
| Saldo insuficiente | Rejeitado |
| Período de locação inválido | Rejeitado |
| Devolução final | Sucesso |

### Exemplo de simulação

Um cliente inicia com **R$ 200,00** de saldo e realiza duas locações de uma furadeira.

- Valor da diária: **R$ 40,00**
- Período de cada locação: **2 dias**
- Taxa adicional da furadeira: **R$ 15,00**
- Valor de cada locação: **R$ 95,00**
- Total pago: **R$ 190,00**
- Saldo final: **R$ 10,00**

O programa também demonstra a rejeição de operações que não atendem às regras de negócio.

## 💻 Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- IntelliJ IDEA
- Git e GitHub

## ▶️ Como executar

1. Clone o repositório ou baixe seu conteúdo em ZIP.
2. Abra a pasta do projeto no **IntelliJ IDEA**.
3. Configure um JDK compatível com o projeto.
4. Localize a classe `Main.java` na pasta `src`.
5. Execute o método `main()`.
6. Acompanhe os testes e resultados no console.

Não é necessário instalar um banco de dados ou configurar serviços externos. Os dados utilizados na simulação são criados diretamente no código.

## 📚 Aprendizados

O desenvolvimento do Emprestaê permitiu consolidar conhecimentos sobre a criação de classes, reutilização de código, herança e polimorfismo.

Um dos principais desafios foi organizar a comunicação entre os objetos `Cliente`, `Equipamento` e `Locacao`, garantindo que as regras de negócio fossem respeitadas durante pagamentos, reservas e devoluções.

O projeto também proporcionou a prática de depuração, validação de condições e testes de diferentes situações.

## 🔮 Possíveis evoluções

- Interface gráfica ou aplicação web.
- Persistência de dados em banco de dados.
- Cadastro interativo de clientes e equipamentos.
- Histórico de locações.
- Testes automatizados.
- Tratamento mais completo de exceções e validação de dados.

## 📌 Sobre o projeto

Projeto desenvolvido para fins educacionais durante os estudos de **Análise e Desenvolvimento de Sistemas**, com foco na disciplina de **Programação Orientada a Objetos em Java**.

O Emprestaê apresentado neste repositório é uma simulação em console e não representa uma plataforma comercial completa.

---

**Emprestaê — Aprendendo POO na prática, uma classe de cada vez.** 🚀