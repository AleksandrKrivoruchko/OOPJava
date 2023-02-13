package model;

public class FullName {
    private String name;

    private String patronymic;
    private String lastName;

    public FullName(String name, String patronymic, String lastName) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s %s %s",
                lastName, name, patronymic);
    }
}
