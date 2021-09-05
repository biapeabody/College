public class Exercicio {

    // Contém os exercícios das questões 5 e 6

    public static void showCaractere(String word) {
        for(int i = 0 ; i < word.length() ; i++) {
            System.out.println(word.charAt(i));
        }
    }
    
    public static void showInverseCaractere(String word) {
        for(int i = word.length() - 1 ; i >= 0 ; i--) {
            System.out.print(word.charAt(i));
        }
    }

}