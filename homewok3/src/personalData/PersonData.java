package personalData;

public class PersonData {
    private FullName fullName;
    private Birthday birthday;
    private long phone;
    private char gender;

    public PersonData(FullName fullName, Birthday birthday, long phone, char gender){
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s",fullName, birthday, phone, gender);
    }
}
