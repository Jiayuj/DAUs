import java.util.Random;
import java.util.Scanner;

public class Dau1 {

    void jugar() {

        Scanner sr = new Scanner(System.in);

        int lista [] = new int[11];
        System.out.println("Cuanta vez queire tira?");
        int vez=sr.nextInt();
        for (int i = 0; i < vez; i++) {
            int dau1 = new Random().nextInt(6)+1;
            int dau2 = new Random().nextInt(6)+1;
            int dauT = (dau1 + dau2)-2;
            lista[dauT]++;
        }
        for (int i = 0; i <lista.length ; i++) {
            System.out.println(i+2+" p"+ " = "+ lista[i]+" vegadas");
        }
        Menu menu = new Menu();
        menu.menu1();
    }
}
