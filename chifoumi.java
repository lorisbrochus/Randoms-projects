import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class chifoumi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("est tu prêts à combattre le champion du monde de chif ou mie ? (oui/non)");
        String reponse1 = scanner.next();

        if (reponse1.equals("oui")) {

            int pointjoueur = 0;
            int pointordi = 0;


            while (pointjoueur != 3 && pointordi != 3) {

                int propordi = random.nextInt(3) +1;

                System.out.println("l'ordi a fait son choix, mtn choisis entre la 'Pierre', les 'Ciseaux', ou la 'Feuille'???");
                String reponse2 = scanner.next();
                int propjoueur = 0;

                while (propjoueur == 0) {
                    if (reponse2.equalsIgnoreCase("pierre")) {
                        propjoueur = 1;
                    } else if (reponse2.equalsIgnoreCase("ciseaux")) {
                        propjoueur = 2;
                    } else if (reponse2.equalsIgnoreCase("feuille")) {
                        propjoueur = 3;
                    } else {
                        System.out.println("t'es con ou quoi ecris pierre, feuille ou ciseaux trdc");
                    } }

                    switch (propordi) {
                        case 1:
                            System.out.println("l'ordi a choisi la pierre mon reuf");
                            break;
                        case 2:
                            System.out.println("l'ordi à choisi le ciseaux mgl");
                            break;
                        case 3:
                            System.out.println("l'ordi a choisi la feuille frérot");
                            break;
                    }
                if (propordi == propjoueur) {
                   System.out.println("Egalite !");
                    System.out.println("toujours "+pointjoueur+" : "+pointordi+" pour toi");}
                else

                if ((propjoueur == 2 && propordi == 1) || (propjoueur == 2 && propordi == 3) || (propjoueur == 3 && propordi == 1)) {
                    System.out.println("bv tu gagnes un point !");
                    pointjoueur = pointjoueur +1;
                    System.out.println("ça fait "+pointjoueur+" : "+pointordi+" pour toi");}
                else {
                    System.out.println("bon, perdu...");
                    pointordi = pointordi +1;
                    System.out.println("ça fait "+pointjoueur+" : "+pointordi+" pour toi");}

                } if (pointjoueur == 3){
                System.out.println("T'AS GAGNE C'EST IMPOSSIBLE");} else {
                System.out.println("c'etais sur c'est le champion du monde aussi trop nul");
            }
            } else {
            System.out.println("bahaha, c'est bien ce que je pensais casse toi");

        }
        scanner.close();
        } 

    }

