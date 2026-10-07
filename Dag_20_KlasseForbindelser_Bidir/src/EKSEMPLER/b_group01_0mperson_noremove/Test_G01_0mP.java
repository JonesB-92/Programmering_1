package EKSEMPLER.b_group01_0mperson_noremove;

public class Test_G01_0mP {

    public static void main(String[] args) {
        Group g1 = new Group("G1");
        Group g2 = new Group("G2");

        Person p1 = new Person("P1");
        Person p2 = new Person("P2");

        // Before: No connections
        // After: g1 <--> p1   
         g1.addPerson(p1);
        // or
        //p1.setGroup(g1);

        System.out.println("Test 1:");
        System.out.println(g1.getPersons().contains(p1));
        System.out.println(p1.getGroup() == g1);

        
        

      
    }
}
