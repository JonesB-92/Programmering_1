package ENUMERATION.enumeration;

public class EnumDemo {

    enum Day {
        MANDAG, TIRSDAG, ONSDAG, TORSDAG, FREDAG, LOERDAG, SOENDAG
    }

    public static void main(String[] args) {
        Day workday = Day.MANDAG;
        Day weekend = Day.LOERDAG;
        System.out.println(workday);

        System.out.println("Ordinal værdien for " + workday + "  " + workday.ordinal());
        System.out.println("Ordinal værdien for weekend " + weekend + " " + weekend.ordinal());

        
//        if (weekend > workday) {
//            System.out.println("Loerdag kommer senere end mandag");
//        }

        if (weekend.compareTo(workday) > 0) {
            System.out.println("Loerdag kommer senere end mandag");
        }

    }

}
