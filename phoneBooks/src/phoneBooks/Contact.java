package phoneBooks;

public class Contact {
    private String fullName;
    private String telephone;

    public Contact(String fullName, String telephone) {
        this.fullName = fullName;
        this.telephone = telephone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        Contact c = (Contact) o;
        return this.telephone.equals(c.getTelephone()) &&
                this.fullName.equals(c.getFullName());
    }
}
