package sorting;

/**
 * Here we have a sample Person class that contains 
 * information about the first and last name of an individual,
 * as well as the year they were born. In order to sort an array 
 * of Person objects we need to make the class Comparable. 
 * 
 * @author William Goble
 * @author Student1, Student2
 */
public class Person implements Comparable<Person>{
    private String first;
    private String last;
    private int year;

    public Person(String first, String last, int year) {
        this.first = first;
        this.last = last;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getFirstName() {
        return first;
    }

    public String getLastName() {
        return last;
    }

    public String toString() {
        return first + " " + last + " born in " + year;
    }

    /**
     * This method allows us to override the preexisting 
     * compareTo method. We should ultimately use the compareTo method
     * in order to return a result. The criteria for ordering is as 
     * follows:
     *      1. Order the Person objects by their last name alphabetically
     *      2. If there is a tie during the first ordering, then it should be determined by the order of the first name
     *      3. If there is still a tie after the first name, then we should compare the year
     * 
     * Note: In order to use the compareTo method with ints, we first need to type case 
     * our primitive data types from int to Integer. This is because the compareTo method 
     * works on classes, not primitive data types.
     */
    @Override
    public int compareTo(Person other) {
        return 0;
    }
}
