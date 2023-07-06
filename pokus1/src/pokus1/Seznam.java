/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokus1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eva
 */
public class Seznam {

    private List<Pojisteny> seznamPojistenych;

    public Seznam() {
        this.seznamPojistenych = new ArrayList<>();
    }

    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
        seznamPojistenych.add(pojisteny);
        System.out.println("Pojistěný úspěšně vytvořen.");
    }

    public void zobrazSeznamPojistenych() {
        if (seznamPojistenych.isEmpty()) {
            System.out.println("Seznam pojištěných je prázdný.");
        } else {
            System.out.println("Seznam pojištěných:");
            for (Pojisteny pojisteny : seznamPojistenych) {
                System.out.println(pojisteny);
            }
        }
    }

    public void najdiPojisteneho(String jmeno, String prijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmeno().equals(jmeno) && pojisteny.getPrijmeni().equals(prijmeni)) {
                System.out.println("Nalezený pojištěný: " + pojisteny);
                return;
            }
        }
        System.out.println("Pojištěný s tímto jménem a příjmením nebyl nalezen.");
    }
}   
