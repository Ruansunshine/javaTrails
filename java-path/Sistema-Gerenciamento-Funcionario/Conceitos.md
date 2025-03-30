# Estudo de Encapsulamento, Abstração e Herança em Java

## Introdução
Neste estudo, exploramos os conceitos de **Encapsulamento**, **Abstração** e **Herança** em Java, com base no desenvolvimento de um **Sistema de Gerenciamento de Funcionários**.

## Conceitos Abordados

### 1. Encapsulamento
O **Encapsulamento** é o processo de proteger os dados de uma classe e garantir que esses dados só possam ser acessados de forma controlada, utilizando **modificadores de acesso** como `private`, `public` e `protected`. O encapsulamento garante que os detalhes internos da classe estejam ocultos, e apenas os métodos públicos (getters e setters) permitem a interação com esses dados.

- **Atributos privados**: São acessíveis apenas dentro da própria classe.
- **Métodos públicos**: São usados para acessar e modificar os atributos privados de forma controlada.

### 2. Abstração
**Abstração** é o conceito de esconder a complexidade interna de um sistema e expor apenas os detalhes essenciais para o usuário. Em Java, usamos **classes abstratas** e **métodos abstratos** para isso.

- **Classe abstrata**: Não pode ser instanciada diretamente. Ela serve como uma base para outras classes que precisam implementar seus métodos abstratos.
- **Métodos abstratos**: Métodos declarados em uma classe abstrata, mas que não possuem implementação. As classes filhas devem implementar esses métodos.

### 3. Herança
A **Herança** permite que uma classe (subclasse) herde atributos e comportamentos de outra classe (superclasse). Isso promove a reutilização de código e a criação de hierarquias.

- **Subclasse**: Herda os atributos e métodos da superclasse.
- **Superclasse**: Oferece atributos e métodos que podem ser reutilizados pelas subclasses.
- Em Java, usamos a palavra-chave `extends` para indicar que uma classe herda de outra.

## Resumo do Desafio
No desafio proposto, criamos um sistema de gerenciamento de funcionários, aplicando os conceitos de **Encapsulamento**, **Abstração** e **Herança**:

- **Encapsulamento**: Proteger os atributos da classe `Funcionario` (como `salario`) usando o modificador `private` e fornecer métodos públicos para manipulá-los de forma controlada.
- **Abstração**: A classe `Funcionario` foi transformada em uma classe abstrata, obrigando as subclasses (como `Gerente` e `Desenvolvedor`) a implementarem o método `calcularBonus()`.
- **Herança**: As classes `Gerente` e `Desenvolvedor` herdam de `Funcionario`, reutilizando seus atributos e implementando o método `calcularBonus()` de forma específica para cada tipo de funcionário.

## Como esses conceitos foram aplicados

- **Encapsulamento**: A classe `Funcionario` possui atributos privados (como `salario`), acessados por meio de métodos `get` e `set`.
- **Abstração**: A classe `Funcionario` é abstrata, com o método `calcularBonus()` sendo declarado, mas não implementado. As subclasses devem implementar este método com a lógica específica de cada tipo de funcionário.
- **Herança**: A classe `Gerente` e a classe `Desenvolvedor` herdam os atributos e comportamentos da classe `Funcionario`, mas cada uma implementa o cálculo de bônus de forma diferente.

## Conclusão
Esses conceitos garantem que o código esteja bem estruturado, seguro e flexível para futuras extensões. O uso de encapsulamento ajuda a proteger os dados sensíveis, a abstração permite a definição de uma estrutura geral, e a herança facilita a reutilização de código e a especialização de classes.
