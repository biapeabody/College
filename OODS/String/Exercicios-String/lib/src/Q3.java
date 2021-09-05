import java.util.*;

public class Q3 {
    public static void main(String[] args) throws Exception {
        String s = "fj11";
        
        // Forma que só mostra o resultado
        System.out.println("Sem criar uma nova variável: " + s.replaceAll("1", "2"));
        
        // Criando uma nova String que recebe o retorno da função replaceAll
        String S = s.replaceAll("1", "2");
        System.out.println("Criando uma nova variável: " + S);
    }
}
