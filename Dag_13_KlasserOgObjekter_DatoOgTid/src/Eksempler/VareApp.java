package Eksempler;

public class VareApp {

    public static void main(String[] args) {

        Vare[] varer = {
                new Vare("Fars", 100),
                new Vare("Fisk", 200),
                new Vare("Havregryn", 25),
                new Vare("Mel", 10)
        };

        System.out.println("Priser for varer (inkl. moms):");
        for (Vare v : varer) {
            System.out.println(v.getNavn() + ": " + v.getPrisInklMoms() + " kr.");
        }

        Vare.setMomsProcent(20);

        System.out.println("Priser for varer (inkl. moms):");
        for (Vare v : varer) {
            System.out.println(v.getNavn() + ": " + v.getPrisInklMoms() + " kr.");
        }
    }
}
