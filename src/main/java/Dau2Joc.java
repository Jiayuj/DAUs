public class Dau2Joc {
    int dau;
    static int partidasganados;
    Dau2 dau2= new Dau2();
    Menu menu = new Menu();


    void jugar(){
        int ganar=0;
        int dau;
        dau2.tirat();
        this.dau = dau2.getValor();
        dau2.imprimir(1);

        for (int i = 2; i < 4; i++) {
            dau2.tirat();
            dau = dau2.getValor();
            dau2.imprimir(i);
            if (dau==this.dau){
                ganar++;
            }
        }

        if (ganar==2){
            System.out.println("!!!ha ganado!!!");
            partidasganados++;
        }
        menu.menudau2();
    }
}
