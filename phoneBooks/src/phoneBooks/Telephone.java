package phoneBooks;

import java.util.ArrayList;
import java.util.List;

public class Telephone {
    private List<String> telephones = new ArrayList<>();

    public Telephone(String t) {
        telephones.add(t);
    }

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

    public boolean equals(Object o) {
        List<String> other = (List<String>) o;
        for (String s : other) {
            if (!isTelephone(s)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : telephones) {
            sb.append(String.format("%30s",s)).append("\n");
        }
        return sb.toString();
    }
}
