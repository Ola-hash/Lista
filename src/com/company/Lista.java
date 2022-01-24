package com.company;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lista implements Serializable {
    private final int[] liczby;
    private int pojemnosc;
    private int rozmiar;

    public Lista(int pojemnosc) {
        this.pojemnosc = pojemnosc;
        this.rozmiar = 0;
        this.liczby = new int[this.pojemnosc];
    }

    public void dodajElement(int liczba) {
        if (rozmiar < pojemnosc) {
            liczby[rozmiar] = liczba;
            rozmiar++;
        } else {
            System.out.println("Nie można dodać kolejnego elementu. Lista jest pełna.");
        }
    }

    public int znajdz(int liczba) {
        for (int i = 0; i < rozmiar; i++) {
            if (liczby[i] == liczba) {
                return i;
            }
        }
        return -1;
    }

    public int iloscWystapien(int liczba) {
        int ilosc = 0;
        for (int i = 0; i < rozmiar; i++) {
            if (liczba == liczby[i]) {
                ilosc++;
            }
        }
        return ilosc;
    }

    public void usunPierwsze(int liczba) {
        int ilsoc = iloscWystapien(liczba);
        int index = znajdz(liczba);
        if (ilsoc > 1) {
            for (int i = index; i < rozmiar; i++) {
                liczby[i] = liczby[i + 1];
            }
            rozmiar--;
        } else {
            System.out.println("Podany element się nie powtarza, wiec go nie usuwamy.");
        }
    }

    public void usunPowtorzenia() {
        Set<Integer> liczbybezDuplikatow = new LinkedHashSet<>();
        for (int i = 0; i < rozmiar; i++) {
            liczbybezDuplikatow.add(this.liczby[i]);
        }
        int i = 0;
        for (Integer liczba : liczbybezDuplikatow) {
            liczby[i++] = liczba;
        }
        rozmiar=liczbybezDuplikatow.size();
    }


    public void pisz() {
        System.out.println("Lista:");
        System.out.println("Pojemność: " + pojemnosc);
        System.out.println("Rozmiar: " + rozmiar);
        System.out.print("Elementy: ");
        for (int i = 0; i < rozmiar; i++) {
            System.out.print(liczby[i] + " ");
        }
        System.out.println();
    }
}
