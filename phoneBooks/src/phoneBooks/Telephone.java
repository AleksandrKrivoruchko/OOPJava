package phoneBooks;

import java.util.ArrayList;
import java.util.List;

public class Telephone {
    private List<String> telephones = new ArrayList<>();

    public Telephone(String t) {
        telephones.add(t);
    }

    public Telephone() {}

    public List<String> getTelephones() {
        return telephones;
    }

    public boolean addTelephone(String t) {
        if (isTelephone(t)) {
            return false;
        }
        telephones.add(t);
        return true;
    }

    public boolean isTelephone(String t) {
        return telephones.contains(t);
    }

    public int phoneCount() {
        return telephones.size();
    }

    public boolean removePhone(String t) {
        if (telephones.contains(t)) {
            telephones.remove(t);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        Telephone other = (Telephone) o;
        for (String s : other.getTelephones()) {
            if (!isTelephone(s)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : telephones) {
            sb.append(String.format("%30s",s)).append("\n");
        }
        return sb.toString();
    }

    public String phonesToFile() {
        StringBuilder sb = new StringBuilder();
        for (String s : telephones) {
            sb.append(s).append(";");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
