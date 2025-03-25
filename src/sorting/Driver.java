package sorting;

import java.util.Arrays;

public class Driver {
    
    public static void main(String[] args) {
        Person prof = new Person("William", "Goble", 1234);
        Person pres = new Person("John", "Jones", 1235);
        Person musician = new Person("John", "Lennon", 1940);
        Person evilProf = new Person("William", "Goble", 2345);    
        Person[] group = {prof, pres, musician, evilProf};

        Arrays.sort(group);
        for(Person name : group) {
            System.out.println(name);
        }
    }
}
