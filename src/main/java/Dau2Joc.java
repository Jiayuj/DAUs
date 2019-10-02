public class Dau2Joc {
    static int partidasganados;
    boolean ganar = false;
    Menu menu;
    Dau2 dau2;
    int dauA;
    int dauB;
    int dauC;

    public  Dau2Joc() {
        dau2 = new Dau2();
        menu = new Menu();
    }

    void jugar() {

        dau2.tirat();
        dauA = dau2.getValor();

        dau2.tirat();
        dauB = dau2.getValor();

        dau2.tirat();
        dauC = dau2.getValor();

        dau2.imprimir(1,dauA);
        dau2.imprimir(2,dauB);
        dau2.imprimir( 3,dauC);

        if (dauA == dauB && dauA == dauC ){
            ganar=true;
            System.out.println("!!! has ganado !!!");
        }
        if (ganar){
            partidasganados++;
        }
        menu.menudau2();
    }
}
