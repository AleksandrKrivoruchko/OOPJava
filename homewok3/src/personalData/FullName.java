package personalData;

public class FullName {
    String lastName;
    String firstName;
    String patronymic;

    public FullName(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", lastName, firstName, patronymic);
    }
}
