package pl.javastart.task;

public class Main {

    public static void main(String[] args) throws IncorrectAgeException, NameUndefinedException, IncorrectPeselException {
//        Person person = new Person("Jan", null, 25, "12345678901");
//        System.out.println(person);

//        Person person = new Person("Jan", "Kowalski", 25, "12345678901");
//        System.out.println(person);
//        person.setAge(-10);
//        person.setFirstName(null);
//        System.out.println(person);

        Person person = null;
        try {
//            person = new Person("Jan", null, 25, "12345678901");
            person = new Person("Jan", "Kowalski", 25, "12345678901");
            System.out.println(person);
        } catch (NameUndefinedException | IncorrectAgeException | IncorrectPeselException e) {
            System.out.println(e.getMessage());
        }

        if (person != null) {
            try {
                person.setAge(-10);
                System.out.println(person);
            } catch (IncorrectAgeException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
