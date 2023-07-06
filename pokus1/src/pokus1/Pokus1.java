/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokus1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author eva
 */



public class Pokus1 {
    public static void main(String[] args) {
        Seznam evidencer = new Seznam();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Vytvořit pojištěného");
            System.out.println("2. Zobrazit seznam pojištěných");
            System.out.println("3. Vyhledat pojištěného");
            System.out.println("4. Ukončit program");
            System.out.print("Zvolte možnost: ");
            int volba = scanner.nextInt();
            scanner.nextLine(); // Přečte zbývajíc

        switch (volba) {
                case 1:
                    System.out.print("Zadejte jméno: ");
                    String jmeno = scanner.nextLine();
                    System.out.print("Zadejte příjmení: ");
                    String prijmeni = scanner.nextLine();
                    System.out.print("Zadejte věk: ");
                    int vek = scanner.nextInt();
                    scanner.nextLine(); // Přečte zbývající řádek po přečtení čísla
                    System.out.print("Zadejte telefonní číslo: ");
                    String telefonniCislo = scanner.nextLine();
                    evidencer.vytvorPojisteneho(jmeno, prijmeni, vek, telefonniCislo);
                    System.out.print("Doplnit činnost");
                    break;
                case 2:
                    evidencer.zobrazSeznamPojistenych();
                    break;
                case 3:
                    System.out.print("Zadejte jméno hledaného pojištěného: ");
                    String hledaneJmeno = scanner.nextLine();
                    System.out.print("Zadejte příjmení hledaného pojištěného: ");
                    String hledanePrijmeni = scanner.nextLine();
                    evidencer.najdiPojisteneho(hledaneJmeno, hledanePrijmeni);
                    
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Neplatná volba. Zvolte prosím znovu.");
                    break;
    }
}
        System.out.println("Program ukončen.");
    }
  } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
