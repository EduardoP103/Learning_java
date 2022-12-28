package org.example;

public class Concatenation {
    public static void main (String[] args){
        String nombre = "Eduardo";
        Integer followersInstagram = 200;
        Integer followersYoutube = 200;
        String frase = "Hola, mi nombre es " + nombre + ". Tengo " + (followersYoutube + followersInstagram) + " seguidores";
        System.out.println(frase);
    }
}

