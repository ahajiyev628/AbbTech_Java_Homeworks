package homework9;

import java.util.Arrays;

public class Main {

    public static <CollectionFamilyDAO> void main(String[] args) {
        FamilyController fc = new FamilyController();


        Human child1 = new Human("child1","child1");
        Human child2 = new Human("child2","child2");
        Human child3 = new Human("child3","child3");
        fc.createNewFamily(new Human("father","father"),new Human("mother","mother"), Arrays.asList(child1, child2));
        fc.createNewFamily(new Human("father","father"),new Human("mother","mother"), Arrays.asList(child3));

        System.out.println(fc.count());

        System.out.println(fc.getAllFamilies());
        System.out.println(fc.displayAllFamilies());
        System.out.println(fc.getPets(0,0));
        System.out.println(fc.getAllFamilies());


        System.out.println(fc.getFamiliesLessThan(4));
        System.out.println(fc.getFamiliesBiggerThan(1));

        System.out.println(fc.count());

        System.out.println(fc.getFamiliesLessThan(4).size());
        System.out.println(fc.getFamiliesBiggerThan(1).size());
    }
}
