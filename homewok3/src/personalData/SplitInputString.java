package personalData;

import java.util.List;

public class SplitInputString {
    private List<String> ls;
    private PersonData pd;

    public List<String> getLs() {
        return ls;
    }

    public PersonData getPd() {
        return pd;
    }

    public SplitInputString(String str) {
        ls = List.of(str.strip().split(" "));
    }


}
