package inheritanceExample;

public class PersonTester {

    public static void main(String[] args) {
        Person sally = new Person("Sally", "Phillips");
        System.out.println(sally);

        Student mike = new Student("Mike", "Thompon", "12345");
        System.out.println(mike);

        StudentEmployee jeff = new StudentEmployee("Jeff", "Sam", "4567", 20.5, "#45678");
        System.out.println(jeff);
    }

}