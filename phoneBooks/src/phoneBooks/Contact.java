package phoneBooks;

public class Contact extends Telephone{
    private String fullName;

    public Contact(String fullName, String telephone) {
        super(telephone);
        this.fullName = fullName;
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
        return  super.equals(c.getTelephones())&&
                this.fullName.equals(c.getFullName());
    }

    @Override
    public String toString() {
        return String.format("%30s\n%s",
                fullName, super.toString());
    }
}
