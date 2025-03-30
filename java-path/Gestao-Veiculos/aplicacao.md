# 🚗 Sistema de Gestão de Veículos

## 📌 Visão Geral
Este projeto implementa um **Sistema de Gestão de Veículos** para uma locadora, permitindo o cadastro de veículos e o cálculo do valor do aluguel com base no tempo de locação e no tipo de seguro. Utilizamos **Programação Orientada a Objetos (POO)** com os conceitos de **Herança, Polimorfismo, Sobrecarga e Sobrescrita de Métodos**.

---

## 🏛️ Implementação dos Conceitos de POO

### 🔹 Herança
No projeto, utilizamos **herança** para evitar a repetição de código e garantir que todas as classes que representam veículos compartilhem características comuns. Criamos uma classe base chamada **`Veiculo`**, que contém atributos e métodos comuns a todos os veículos.  
Depois, criamos as classes **`Carro`** e **`Moto`**, que **herdam** de `Veiculo` e adicionam características específicas.  

🔹 **Benefícios da herança no projeto:**  
✔️ Permite reutilização de código.  
✔️ Garante que todas as classes filhas tenham atributos e métodos básicos de um veículo.  
✔️ Facilita a manutenção e a extensão do sistema.

---

### 🔹 Polimorfismo
Utilizamos **polimorfismo** ao criar um objeto do tipo **Veiculo**, mas instanciá-lo como um **Carro** ou **Moto**. Isso permite que tratemos diferentes tipos de veículos de forma genérica, tornando o código mais flexível.  

Por exemplo, em nosso código, chamamos um método como `exibirDetalhes()`, e o Java escolhe dinamicamente qual versão do método executar com base no tipo do objeto. Isso acontece porque `Carro` e `Moto` sobrescrevem o método `exibirDetalhes()` da classe `Veiculo`.

🔹 **Benefícios do polimorfismo no projeto:**  
✔️ Facilita a extensão do código sem necessidade de grandes modificações.  
✔️ Permite escrever código mais genérico, tornando a manutenção mais simples.  
✔️ Reduz a dependência de verificações explícitas de tipos de objetos.

---

### 🔹 Sobrecarga de Métodos
No projeto, aplicamos **sobrecarga de métodos** ao implementar diferentes versões do método **`calcularAluguel()`**.  
Isso permite calcular o aluguel de um veículo de duas formas:
1. Com base apenas no número de dias alugados.
2. Com base no número de dias alugados **e** no tipo de seguro escolhido.  

Isso proporciona maior flexibilidade ao sistema, pois permite lidar com diferentes cenários de aluguel sem criar múltiplos métodos com nomes diferentes.

🔹 **Benefícios da sobrecarga no projeto:**  
✔️ Maior flexibilidade ao lidar com diferentes formas de cálculo do aluguel.  
✔️ Código mais organizado e intuitivo.  
✔️ Evita a criação de múltiplos métodos com nomes diferentes, mantendo a coesão.

---

### 🔹 Sobrescrita de Métodos
A sobrescrita ocorre quando uma classe filha redefine um método herdado da classe pai para fornecer um comportamento específico.  
No nosso projeto, sobrescrevemos o método **`exibirDetalhes()`** nas classes **Carro** e **Moto** para exibir informações personalizadas sobre cada tipo de veículo.  

Isso permite que, mesmo que o método seja chamado a partir de um objeto do tipo `Veiculo`, ele execute a versão correspondente à classe real do objeto (`Carro` ou `Moto`).

🔹 **Benefícios da sobrescrita no projeto:**  
✔️ Permite personalizar o comportamento dos métodos para cada classe específica.  
✔️ Mantém um código mais organizado e evita duplicação.  
✔️ Garante que cada tipo de veículo apresente informações relevantes ao usuário.

---

## 🏁 Conclusão
O projeto **Sistema de Gestão de Veículos** demonstra claramente os conceitos de **herança, polimorfismo, sobrecarga e sobrescrita de métodos**, fundamentais para um código **modular, reutilizável e flexível**.  
Esses conceitos tornam o sistema mais **organizado**, **escalável** e **fácil de manter**, permitindo futuras expansões, como a adição de novos tipos de veículos sem grandes alterações no código existente.
