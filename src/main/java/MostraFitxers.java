import java.io.File;
import java.util.Scanner;

public class MostraFitxers {

    public static void mostra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un directori");
        File f =new File(scanner.nextLine());
        String[] arxius = f.list();
        for (int i = 0; i < arxius.length; i++) {
            System.out.println(arxius[i]);
        }
    }
}
