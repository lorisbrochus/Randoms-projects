import java.util.Scanner; 
import java.util.Random;

public class devinenombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random(); 

        int secret = random.nextInt(100) + 1;    
        int essais = 0;
        int proposition = 0;

        System.out.println("j'ai choisi un nombre entre 1 et 100. Devine le mon petit tom!");

        while (proposition != secret) {
            System.out.println("ta proposition :");
        z    proposition = scanner.nextInt();
            essais = essais + 1;

            if (proposition < secret) {
                System.out.println("Plus grand dommage t'es toujours aussi nul fils de pute !");
            } else if (proposition > secret) {
                System.out.println("Plus petit bahaha t'es trop nul au jeu gros pd!");
            } else {
                System.out.println("Bon t'as trouvé en " +essais+ " essaies, t'as eu d'la chance quoi"); 
            }


        }

        scanner.close();
    }
}