import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Test {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
/*
        System.out.println("donnez le nombre 1");
        int nb1 = sc.nextInt();

        System.out.println("donnez le nombre 2");
        int nb2 = sc.nextInt();

        System.out.println("donnez le nombre 3");
        int nb3 = sc.nextInt();

        if (nb1>nb2){
            if (nb1>nb3){
                System.out.println("le plus grand nombre est " +nb1);
            }else {
                System.out.println("le plus grand nombre est " +nb3);
            }
        } else {
            if (nb2>nb3){
                System.out.println("le plus grand nombre est " +nb2);
            } else {
                System.out.println("le plus grand nombre est " +nb3);
            }
        }
        System.out.println("donnez l'heur qu'il fait");
        int h = sc.nextInt();
        System.out.println("donnez les minute");
        int min = sc.nextInt();

        if (min==59){
            min = 0;
            if (h == 23){
                h = 0;
            } else  {
                h = h+1;
            }
        } else {
            min = min + 1;
        }
        System.out.println("après minute il fera " +h+ "h" +min);


        System.out.println("donnez un nombre");
        int nb = sc.nextInt();
        int reste;
        int div = nb;
        String exa = "";
        do {

            reste = nb%16;
            nb = nb / 16;
            String rs = Integer.toString(reste);
            switch(reste) {
                case 10:
                    rs = "A";
                    break;
                case 11:
                    rs = "B";
                    break;
                case 12:
                    rs = "C";
                    break;
                case 13:
                    rs = "D";
                    break;
                case 14:
                    rs = "E";
                    break;
                case 15:
                    rs = "F";
                    break;
            }
             exa = rs.concat(exa) ;
        } while (nb != 0);
        System.out.println(div+ " en HEXA est " +exa);

 /*
        double resultat = 0;
        int dec = 0;
        System.out.println("donnez un nombre binaire ");
        String bin = sc.nextLine();
        for (int i = bin.length(); i ==  1; i--){
             char bit = bin.charAt(i-1);
             dec = Character.getNumericValue(bit);
             resultat = resultat + dec * Math.pow(2, bin.length()-i);

        }
        System.out.println("résultat "+resultat);

 */
  /*      List<Integer> saisie = new ArrayList<>();
        int rep;
        int t = 0;
        int i = 0;
        do {
            System.out.println("Donnez un nombre");
            saisie.add(sc.nextInt());
            i= t-1;
            if(t!=0) {
                System.out.println(i+";"+t);
               i = t;
                while(i>=0 && saisie.get(t) < saisie.get(i)){
                    saisie.add(i, saisie.get(t));
                    saisie.remove(t+1);
                    i--;

                    System.out.println(i+";;"+t);
                };
              if (i>=0 && saisie.get(t) < saisie.get(i)){
                    System.out.println(i+";;;"+t);
                    saisie.add(i, saisie.get(t));
                    saisie.remove(t+1);
                } else if (saisie.get(t) < saisie.get(i+1)){
                    System.out.println(i+";;;;"+t);
                    saisie.add(i+1, saisie.get(t));
                    saisie.remove(t+1);
                }
                t= t+1;
            } else {
                t = t + 1;
            }
            System.out.println("vous voulez insérer un autre nombre 1/0");
            rep = sc.nextInt();
        } while (rep == 1);
        System.out.println(saisie);

  List<Integer> listeA = new ArrayList<>();
  List<Integer> listeB = new ArrayList<>();
  List<Integer> listeT = new ArrayList<>();

        int nbA=0;
  int nbB=0;
  int rep;
        System.out.println("REmplissage de la liste A");
        do {
            System.out.println("give a number");
            listeA.add(sc.nextInt());
            nbA ++;
            System.out.println("Nouveau numero? 1/0");
            rep = sc.nextInt();
        } while(rep == 1);
        rep =0;
        System.out.println("---------------------REmplissage de la liste B-----------------------------------------");
        do {
            System.out.println("give a number");
            listeB.add(sc.nextInt());
            nbB ++;
            System.out.println("Nouveau numero? 1/0");
            rep = sc.nextInt();
        } while(rep == 1);
        System.out.println("--------------------------------listeA--------------------------------");
        System.out.println(listeA);
        System.out.println("---------------------------------ListeB--------------------------");
        System.out.println(listeB);
int min;
int i=0;
int j=0;
if (nbA<nbB){
    min = nbA;
} else min = nbB;
while (i<min || j<min){
    if (listeA.get(i)<listeB.get(j)){
        listeT.add(listeA.get(i));
        i++;
    } else {
        listeT.add(listeB.get(j));
        j++;
    }
}



        System.out.println("-----------------------------ListeT--------------------------");
        System.out.println(listeT);
*/
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                         GESTION DES NOTES DES ELEVES");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("Donnez le nombre d'eleve");
        int nbE = sc.nextInt();
        sc.nextLine(); //throw away the \n not consumed by nextInt()
        System.out.println("Donnez le nombre de matière");

        int nbM = sc.nextInt();
        sc.nextLine(); //throw away the \n not consumed by nextInt()

        int gestion[][] = new int[nbE + 3][nbM+1];
        String eleve[] = new String[nbE+1];
        String matiere[] = new String[nbM];
        System.out.println("gestion"+gestion.length);
        for(int i=0; i< nbE + 3; i++){
            gestion[i][nbM] = 0;
        }
        for(int i=0; i< nbM+1; i++){
            gestion[nbE][i] = 25;
            gestion[nbE+1][i] = 0;
            gestion[nbE+2][i] = 0;
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                         SAISIE DES NOMS DES ELEVES");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");


        for(int i=0; i< nbM; i++){

           System.out.println("Saisissez les noms de l'eleve "+i);
           eleve[i] = sc.nextLine();

        }


        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                         SAISIE DES MATIERES");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");


        for(int i=0; i< nbM; i++){

            System.out.println("Saisissez les noms de la matiere "+i);
            matiere[i] = sc.nextLine();

        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                         SAISIE DES NOTES");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for(int i=0; i< nbE; i++){


            System.out.println("    "+eleve[i]);
            System.out.println("--------------------");
            for(int j=0; j< nbM; j++){
                System.out.print(matiere[j]+" : ");
                gestion[i][j] = sc.nextInt();
                gestion[i][nbM] = gestion[i][nbM] + gestion[i][j]/nbM;
                if (gestion[i][j] < gestion[nbE][j]) gestion[nbE][j] = gestion[i][j];
                if (gestion[i][j] > gestion[nbE+1][j]) gestion[nbE+1][j] = gestion[i][j];
                gestion[nbE+2][j] = gestion[nbE+2][j] + gestion[i][j]/nbE;
            }


        }
        System.out.println("Ce programme permet d'afficher :");
        System.out.println("1. Les notes des elevre par matières et leure moyenne");
        System.out.println("2. Note minimale, maximale et moyenne pour chaque matière");
        System.out.println("entrer le numéro de votre choix");
        int choix;
        choix = sc.nextInt();
        if (choix == 1){
                for (int i=0; i<nbM;i++) System.out.print("            " +matiere[i]);
            System.out.printf("             Moyenne");
            for (int i=0; i<nbE;i++){
                System.out.println();
                System.out.print(eleve[i]);
                for (int j=0; j<nbM+1;j++){
                    System.out.print("        " +gestion[i][j]+"         ");

                }

            }
        }


    }

}