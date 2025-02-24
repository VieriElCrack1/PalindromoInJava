import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        //m.esPalindromoSinFuncion("victor");
        //m.esPalindromoSinFuncion("ana");
        m.esPalindromoSinFuncion2("bob");
    }

    private void esPalindromoConFuncion(String nombre) {
        String palabra = new StringBuilder(nombre).reverse().toString();
        System.out.println((palabra.equals(nombre)));
    }

    private void esPalindromoSinFuncion(String nombre) {
        //Declarar una variable de tipo char para dividir las letras
        char[] palabra = nombre.toCharArray();
        //declara una lista para recorrer cada letra y agregarlas como indices del arreglo
        List<String> letrasRevertidas = new ArrayList<>();

        //recorrer
        for (int i = 0; i <= palabra.length - 1; i++) {
            //alamcenar y poner en un arreglo como: [v,i,c,t,o,r]
            letrasRevertidas.add(String.valueOf(palabra[i]));
        }

        //invertir las letras
        String palabraInvertida = "";
        for (int i = letrasRevertidas.size() - 1; i>= 0; i--) {
            palabraInvertida += letrasRevertidas.get(i);
        }

        System.out.println("La palabra es un palindromo? : " + String.valueOf(palabra).equals(palabraInvertida));
    }


    private void esPalindromoSinFuncion2(String nombre) {
        char[] palabra = nombre.toCharArray();
        String palabraInvertida = "";

        // Recorrer de atrás hacia adelante sin usar StringBuilder
        for (int i = palabra.length - 1; i >= 0; i--) {
            palabraInvertida = palabraInvertida + palabra[i];  // Concatenación manual
        }

        System.out.println("La palabra es un palíndromo? : " + nombre.equals(palabraInvertida));
    }
}