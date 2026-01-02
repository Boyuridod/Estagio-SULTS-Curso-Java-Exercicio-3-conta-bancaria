# 🏦 Estagio-SULTS-Curso-Java-Exercicio-3-conta-bancaria

Este projeto foi desenvolvido como parte do meu **treinamento em Programação Orientada a Objetos (POO)** durante o **estágio na SULTS**, utilizando o curso [**Java COMPLETO – Programação Orientada a Objetos + Projetos**](https://www.udemy.com/course/java-curso-completo/).

---

## 🎯 Objetivo do Projeto

O objetivo deste aplicativo é **simular uma conta bancária simples**, aplicando conceitos fundamentais de **Programação Orientada a Objetos em Java**.

O programa permite:

* Criar uma conta bancária
* Informar os dados do titular
* Definir se haverá depósito inicial
* Realizar depósitos
* Realizar saques (com taxa)
* Visualizar os dados atualizados da conta

Tudo isso por meio de **classes, objetos, métodos e encapsulamento**.

---

## 🧠 Conceitos de POO Aplicados

✔️ Classes e Objetos

✔️ Encapsulamento

✔️ Construtores sobrecarregados

✔️ Métodos de negócio

✔️ Getters e Setters

✔️ Organização em pacotes

✔️ Sobrescrita do método `toString()`

✔️ Controle de fluxo (`do-while` e `switch-case`)

---

## 🛠️ Tecnologias Utilizadas

* ☕ **Java**
* 📚 **Programação Orientada a Objetos**
* 🖥️ **Entrada de dados via console (Scanner)**

---

## 📌 Estrutura do Projeto

### 🔹 Classe `Conta`

Representa uma **conta bancária**, contendo:

#### 🔸 Atributos

* `numeroConta` → número da conta
* `nomeTitular` → nome do cliente
* `saldo` → saldo disponível

#### 🔸 Construtores

* Conta sem saldo inicial
* Conta com saldo inicial

#### 🔸 Métodos

* `deposito(double valor)` → adiciona valor ao saldo
* `saque(double valor)` → remove valor do saldo com taxa fixa de R$5,00
* `toString()` → retorna os dados formatados da conta

Essa classe **encapsula toda a lógica da conta bancária**, garantindo organização e reutilização de código.

---

### 🔹 Classe `Program`

Responsável por:

* Interagir com o usuário via console
* Ler os dados da conta
* Criar o objeto `Conta`
* Controlar o fluxo da aplicação com menu interativo
* Executar depósitos e saques
* Exibir os dados atualizados da conta após cada operação

O menu funciona através de um **laço `do-while` combinado com `switch-case`**, permitindo várias operações até o usuário encerrar a aplicação.

---

## 🔄 Fluxo do Programa

1. Usuário informa:

   * Número da conta
   * Nome do titular
   * Se haverá depósito inicial
2. Conta é criada
3. Menu de opções é exibido:

   * Depositar
   * Sacar
   * Sair
4. Operações são realizadas até o usuário escolher sair

---

## 🚀 Aprendizados

Com este projeto foi possível reforçar:

* Como **modelar uma entidade real (conta bancária) em uma classe**
* Uso correto de **encapsulamento**
* Importância dos **construtores**
* Como **métodos alteram o estado de um objeto**
* Aplicação prática de **POO no dia a dia**
* Controle de fluxo com `switch` e `loops`

---

## 👨‍💻 Autor

**Yuri Duarte**

Estagiário na **SULTS**

Treinamento em **Java e Programação Orientada a Objetos**