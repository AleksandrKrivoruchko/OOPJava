package phoneBooks;

public class Contact {
    private String fullName;

    private Telephone phone;

    public Contact(String fullName, String telephone) {
        this.fullName = fullName;
        phone = new Telephone(telephone);
    }

    public Telephone getPhone() {
        return phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        Contact c = (Contact) o;
        return  phone.equals(c.phone)&&
                this.fullName.equals(c.getFullName());
    }

    @Override
    public String toString() {
        return String.format("%30s\n%s",
                fullName, phone);
    }
}
