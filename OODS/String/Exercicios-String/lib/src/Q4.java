import java.util.*;

public class Q4 {
    
    public static void main(String[] args) {

        String palavra = "Exercícios com Java";
        String palavra2 = "";
        String palavra3 = "Java";
        String palavra4 = " Exercícios de String com Java ";
        
        // Saber se uma string está dentro de outra
        System.out.println("1- " + palavra.contains(palavra3));
        System.out.println("2- " + palavra.contains("Python"));

        // Tirar espaços em branco das pontas de uma string
        System.out.println("3- " + palavra4.trim());
        
        // Saber se a string está vazia
        System.out.println("4- " + palavra.isEmpty());
        System.out.println("5- " + palavra.isBlank());      // O método isBlank() é mais aconcelhável pois se a string só tiver espaços
        System.out.println("6- " + palavra2.isEmpty());     // em branco ainda sim considera a string como vazia
        System.out.println("7- " + palavra2.isBlank());

        // Quantos caracteres tem uma string
        System.out.println("8- " + palavra.length());

    }

}
