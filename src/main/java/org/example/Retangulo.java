package org.example;

public class Retangulo {

    public int area(int base, int altura) {
        return base * altura;
    }

    public int perimentro(int base, int altura){
        return base * 2 + altura * 2;
    }

    public int isTriangle(int a, int b, int c) {
        if((a + b > c) && (b + c > a) && (a + c > b)) {
            return 1;
        }
        return 0;
        }
    }

