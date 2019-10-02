import java.util.Random;

public class Dau2 {

    int dau;

    void tirat() { dau = new Random().nextInt(6)+1; }
    void imprimir(int n,int dau){
        System.out.println(n+" dau = "+dau);
    }
    int getValor(){
        return dau;
    }
}
