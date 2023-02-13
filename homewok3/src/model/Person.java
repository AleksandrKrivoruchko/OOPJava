package model;

public class Person {
    private FullName fullName;

    private String birthday;
    private long phoneNumber;

    private char gender;

    public Person(FullName fullName, String birthday, long phoneNumber, char gender) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public FullName getFullName() {
        return fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return String.format("%s %s %d %s", fullName,
                birthday, phoneNumber, gender);
    }
}
