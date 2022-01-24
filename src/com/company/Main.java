package com.company;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista(10);
        lista.dodajElement(3);
        lista.dodajElement(3);
        lista.dodajElement(5);
        lista.dodajElement(5);

        lista.pisz();
        System.out.println("------------");
        lista.usunPowtorzenia();
        lista.pisz();
    }
}
