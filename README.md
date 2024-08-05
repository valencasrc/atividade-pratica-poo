# atividade-pratica-poo
Atividade prática numero um para a matéria de Design de Software da Faculdade Descomplica mediante ao segundo período

# Sistema de Registro e Validação de Trabalhos

Este repositório contém uma implementação simples em Java para um sistema de registro e validação de trabalhos acadêmicos. O sistema permite o registro de processos, acompanhamento da análise e emissão de certificados.

## Funcionalidades

- **Registro de Processos:** Clientes podem registrar um trabalho, fornecendo informações como nome do autor, CPF, título do trabalho e data de produção.
- **Análise de Processos:** Profissionais analisam os processos e definem o status (deferido/indeferido), além de registrar a data de análise e sua matrícula.
- **Consulta de Processos:** Clientes podem consultar o status do processo usando o protocolo recebido no momento do registro.
- **Emissão de Certificados:** Clientes têm a opção de emitir certificados em casa ou em uma empresa de registro de certificados.

## Classes

### `Cliente`

Representa um cliente do sistema.

#### Atributos
- `cpf` (String): Identificador único do cliente.
- `nome` (String): Nome completo do cliente.
- `email` (String): Endereço de e-mail do cliente.
- `protocolos` (List<String>): Lista de protocolos dos processos de registro associados ao cliente.

### `Processo`

Representa um processo de validação de trabalho.

#### Atributos
- `nomeAutor` (String): Nome do autor do trabalho.
- `cpfAutor` (String): CPF do autor do trabalho.
- `tituloTrabalho` (String): Título do trabalho submetido.
- `dataProducao` (LocalDate): Data em que o trabalho foi produzido.
- `dataAnalise` (LocalDate): Data em que o trabalho foi analisado pelo profissional.
- `matriculaAnalista` (String): Matrícula do profissional que realizou a análise.
- `status` (String): Status da análise (deferido/indeferido).
- `protocolo` (String): Protocolo gerado no ato do registro.

## Exemplos de Uso

### Criar um Cliente

```java
Cliente cliente = new Cliente("12345678900", "João Silva", "joao.silva@email.com");
