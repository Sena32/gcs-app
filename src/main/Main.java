package main;

import valores.Valores;

public class Main {
    public static void main(String[] args) {
        Valores v = new Valores();
        System.out.println("Insere" + v.ins(1));
        System.out.println("Insere" + v.ins(3));
        System.out.println("Tamanho" + v.size());
        System.out.println("Delete" + v.del(0));
        System.out.println("Tamanho Pós Delete" + v.size());
    }
}