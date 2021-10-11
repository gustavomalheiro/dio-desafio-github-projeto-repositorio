package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        // com tipos primitivos
        int intA = 1;
        int intB = intA; // copia o valor de intA

        System.out.println("intA= " + intA + " intB= " + intB);
        intA = 2; // não modifica o valor em intB
        System.out.println("intA= " + intA + " intB= " + intB);

        // com objetos
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA; // copia a referência em memória de a para b

        System.out.println("objA= " + objA + " objB= " + objB);
        objA.setNum(2); // modifica o valor em intB
        System.out.println("objA= " + objA + " objB= " + objB);
    }
}
