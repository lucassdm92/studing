package com.example.study.abstra;

public abstract class ClassA {

    public String variavelPublica;
    protected String variavelProtegida;

    private String variavelPrivada;

    String variavelDefault;

    public void firstMethod() {

        if (true) {
            System.out.print("Methd Publico");
        }
    }

    private void secondMethod() {

        if (true) {
            System.out.print("Methd privado");
        }
    }

    public static void threeMethod() {
    }
}
