import java.util.Scanner;

public class Menu {
    Scanner sr = new Scanner(System.in);

    void menudau2() {
        System.out.println("----DAU--2----");
        System.out.println("1 - Tirar otra");
        System.out.println("2 -    exit   ");
        System.out.println("-------------");
        int opcion = sr.nextInt();
        switch (opcion){
            case 1:
                Dau2Joc dau2Joc = new Dau2Joc();
                dau2Joc.jugar();
                break;
            case 2:
                System.out.println("has ganado "+new Dau2Joc().partidasganados+" veces");
                menu();
                break;
        }
    }
    void menu1(){
        System.out.println("----DAU--1----");
        System.out.println("1 - otra vez ");
        System.out.println("2 -   salir  ");
        System.out.println("-------------");
        int opcion = sr.nextInt();
        switch (opcion){
            case 1:
                Dau1 dau1 = new Dau1();
                dau1.jugar();
                break;
            case 2:
                menu();
                break;
        }
    }
    void menu (){
        System.out.println("----Hello----");
        System.out.println("1 - joc dau 1");
        System.out.println("2 - joc dau 2");
        System.out.println("3 -    exit  ");
        System.out.println("-------------");
        int opcion = sr.nextInt();
        switch (opcion){
            case 1:
                Dau1 dau1 = new Dau1();
                dau1.jugar();
                break;
            case 2:
                Dau2Joc dau2 = new Dau2Joc();
                dau2.jugar();
                break;
            case 3:
                break;
        }
    }
}

