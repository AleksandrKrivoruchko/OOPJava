package dataVerification;

import model.FullName;
import model.Person;
import repository.PersonsRepository;

import java.util.List;

public class CheckInputData {
    private PersonsRepository pr;
    private final int countWords = 6;
    private int[] indexData = new int[countWords];

    public CheckInputData() {
        for (int i = 0; i < countWords; i++) {
            indexData[i] = -1;
        }
    }

    public PersonsRepository getPr() {
        return pr;
    }

    public boolean isPerson(String str) {
        CheckLength checkLength = new CheckLength(str);
        if (checkLength.check() != 0) {
            return false;
        }
        List<String> tmpList = checkLength.getList();

        for (int i = 0; i < tmpList.size(); i++) {
            if (tmpList.get(i).length() == 1) {
                if (tmpList.get(i).charAt(0) == 'f' || tmpList.get(i).charAt(0) == 'm') {
                    indexData[5] = i;
                    continue;
                } else {
                    return false;
                }
            }
            if (CheckDigits.isDigits(tmpList.get(i))) {
                indexData[4] = i;
                continue;
            }
            if (CheckDate.isDate(tmpList.get(i))) {
                indexData[3] = i;
                continue;
            }
            if (indexData[0] < 0) {
                indexData[0] = i;
                continue;
            }
            if (indexData[1] < 0) {
                indexData[1] = i;
                continue;
            }
            indexData[2] = i;
        }

        for (int x: indexData) {
            if (x < 0) {
                return false;
            }
        }

        Person p = new Person(
                new FullName(tmpList.get(indexData[1]),
                        tmpList.get(indexData[2]), tmpList.get(indexData[0])),
                tmpList.get(indexData[3]), Long.parseLong(tmpList.get(indexData[4])),
                tmpList.get(indexData[5]).charAt(0));
        if(pr == null) {
            pr = new PersonsRepository();
        }
        pr.addPerson(p);
        return true;
    }
}
