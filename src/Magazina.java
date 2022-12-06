import java.util.*;

public class Magazina {
    Scanner input = new Scanner(System.in);
    Map<Integer, Produkt> magazina = new HashMap<>();
    Produkt produkt = new Produkt("", 0, 0);
    int index = 0;
    public void addProduct() {

        System.out.print("Vendosni emrin e produktit qe do te shtoni " + '\n');
        String emri = input.nextLine();
        System.out.println("Vendosni sasine e produktit qe do te shtoni" + '\n');
        int sasi = input.nextInt();
        System.out.println("vendosni cmimin e produktit" + '\n');
        int cmimi = input.nextInt();
        ++index;
        magazina.put(index, new Produkt(emri, sasi, cmimi));
        System.out.println("Produkti u shtua me sukses" + '\n' + magazina.put(index, new Produkt(emri, sasi, cmimi)));
    }


    public void printElements() {
        for (Map.Entry entry : magazina.entrySet()) {
            if (entry != null) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            } else {
                System.out.println("Ne makazine nuk ka asnje produkt.");
            }
        }
    }

    public void deleteElement() {
        System.out.println("Vendosni produktin qe deshironi te fshini : ");
        int indeks = input.nextInt();
        System.out.println(magazina);
        for (Integer key : magazina.keySet()) {
            if (magazina.containsKey(indeks)) {
                magazina.remove(indeks);
                System.out.println("Produkti u fshi me sukses.");
            } else {
                System.out.println("Produkti nuk ndodhet ne makazine.");
            }
        }
    }

    public void calculateProducts() {
        System.out.println("Ju lutem vendosni kodin e produktit qe deshironi te blini: " + magazina);
        int j = input.nextInt();
        System.out.println("Vendosni sasine qe deshironi te blini ");
        int z = input.nextInt();
        for (Integer key : magazina.keySet()) {
            double result = 0;
            if (j == key) {
                produkt.setQuantity(produkt.getQuantity() - z);
                result = z * produkt.getPrice();
                System.out.println("Blerja juaj u krye me sukses , shuma qe duhet te paguani eshte :" + " " + result);
            }
        }
    }
}

