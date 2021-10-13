package com.company;

public class Main {

    public static void main(String[] args) {
        //const edad = 31;
        String nombre = "Fernanda Flores";

        //Datos primitivos numéricos
        byte num1 = 10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        //Datos primitivos decimales
        float decimal1 = 10; //es válido porque el 10 contiene decimales
        float decimal11 = 10.156155f; //para que un decimal sea válido se le agrega la f
        double decimal2 = 20.258759853d; //En double se usa d

        //datos primitivo char
        char caracter = 'f';

        //dato primitivo boolean
        boolean verdadero = true;

        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;

        //short numShort2= numInt; (es incorrecto porque un Int no puede estar dentro de un Short)

        byte numByte1 = 120;
        byte numByte2 = 120;
        short suma = (short) (numByte1 + numByte2);

//        System.out.println(suma);
//        System.out.println(numShort2);

        //Operadores aritméticos
        // + sumar o concatenar cadenas
        // - restas
        // * multiplicar
        // / dividir
        // % residuo

        int numero1 = 120;
        int numero2 = 89;

        int suma1 = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        float division = (float) (float)numero1 / (float)numero2;

        System.out.println(suma1);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);


    }
}
