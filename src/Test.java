import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
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
        List<Integer> saisie = new ArrayList<>();
        int rep;
        int t = 0;
        int i = 0;
        do {

            System.out.println("Donnez un nombre");
            saisie.add(sc.nextInt());
            i= t-1;
            if(t!=0) {
                System.out.println(i+";"+t);
                while(i>0 && saisie.get(t) < saisie.get(i)){
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

    }

}