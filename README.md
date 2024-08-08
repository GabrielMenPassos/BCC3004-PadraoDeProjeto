# Prototype:

## Introdução

Este projeto demonstra a implementação do **padrão de projeto Prototype**. O objetivo é mostrar como criar novos objetos clonando um objeto existente, economizando tempo e recursos na criação de objetos complexos.

## O que é o Padrão Prototype?

O padrão Prototype é um padrão de criação que permite criar novos objetos a partir de um protótipo existente. Em vez de instanciar um objeto do zero, você clona um objeto já configurado e personaliza-o conforme necessário.

## Diagrama UML

[Insira aqui o diagrama UML do padrão Prototype, como o que foi sugerido anteriormente]

## Como funciona?

1. **Criação do protótipo:** Um objeto é criado e configurado com os valores padrão.
2. **Clonagem:** Um novo objeto é criado como uma cópia do protótipo.
3. **Personalização:** O novo objeto pode ser personalizado com valores diferentes.

## Implementação

Neste projeto, temos:

* **Produto:** Interface que define o contrato para todos os objetos que podem ser clonados.
* **Camisa:** Classe concreta que implementa a interface Produto e representa uma camisa. O método `clonar()` cria uma nova instância de Camisa, copiando os atributos da camisa original.
* **Main:** Classe principal que demonstra o uso do padrão, criando uma camisa e clonando-a.

## Exemplo de Uso

```java
// Criando uma camisa vermelha
Camisa camisaVermelha = new Camisa("Camisa básica", 29.99, "M", "Vermelha");

// Clonando a camisa vermelha para criar uma camisa azul
Camisa camisaAzul = (Camisa) camisaVermelha.clone();

// Imprimindo as informações das camisetas
System.out.println("Camisa Vermelha:");
System.out.println(camisaVermelha);

System.out.println("\nCamisa Azul:");
System.out.println(camisaAzul);
