import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Magazina magazina1 = new Magazina();

        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Miresevini, ju lutem zgjidhni nje opsion : " + '\n' + "1-Menaxher" + '\n' + "2-Klient");
                int s = input.nextInt();
                switch (s) {
                    case (1):
                        System.out.println("Cfare veprimi deshironi te kryeni:" + '\n' + "1- Shto nje produkt te ri" +
                                '\n' + "2-Fshi nje produkt " + '\n' + "3-Shfaq produktet e makazines");
                        int st = input.nextInt();
                        switch (st) {
                            case (1):
                                magazina1.addProduct();

                                break;
                            case 2:
                                magazina1.deleteElement();
                                break;
                            case 3:
                                magazina1.printElements();
                                break;
                        }
                        break;
                    case 2:
                        magazina1.calculateProducts();
                        break;
                }

            } catch (Exception e) {
                System.out.println("Ju lutem zgjidhni nje nga opsionet e mesiperme");
            }
        }

    }
}



