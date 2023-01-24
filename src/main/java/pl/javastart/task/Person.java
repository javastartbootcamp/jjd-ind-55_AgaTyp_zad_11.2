package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws IncorrectAgeException, IncorrectPeselException, NameUndefinedException {
//        this.firstName = firstName;
        setFirstName(firstName);
//        this.lastName = lastName;
        setLastName(lastName);
//        this.age = age;
        setAge(age);
//        this.pesel = pesel;
        setPesel(pesel);
    }

    @Override
    public String toString() {
        return "Imię: '" + firstName + '\'' +
                ", Nazwisko: '" + lastName + '\'' +
                ", wiek: " + age +
                ", PESEL: '" + pesel + '\'';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (!correctName(firstName)) {
            throw new NameUndefinedException("Imię jest niepoprawne " + firstName);
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (!correctName(lastName)) {
            throw new NameUndefinedException("Nazwisko jest nieprawidłowe " + lastName + "\nKoniec programu");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException("Wiek musi być większy od 1\nKoniec programu");
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) throws IncorrectPeselException {
        if (pesel.length() < 11) {
            throw new IncorrectPeselException("Pesel ma za mało cyfr. Poprawna ilość: 11\nKoniec programu");
        }
        this.pesel = pesel;
    }

    private boolean correctName(String name) {
        if (name == null) {
            return false;
        } else {
            return name.length() >= 2;
        }
    }
}
