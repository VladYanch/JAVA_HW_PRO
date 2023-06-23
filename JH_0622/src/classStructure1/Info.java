package classStructure1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Info {
    private Map<Position, List<String>> mapAccess;

    public Info(Map<Position, List<String>> mapAccess) {
        this.mapAccess = mapAccess;
    }

    public List<String> checker(Employee employee) {
        List<String> list = new ArrayList<>();

        return list;
    }
}

//- Map<Position, List<String>>
//- checker() - на вход сотруника, на выходе String в зависимости от позишн
//- avgSalaryDep() - на вход Set<Employee>, Department, на выход средняя зп по департаменту
//- maxSalary() - на вход Set<Employee>, Department, на выход max зп по департаменту + у кого такая зп(имя)
//- minSalary() - на вход Set<Employee>, Department, на выход min зп по департаменту + у кого такая зп(имя)
//- getPromotion() - на вход сотрудника. в методе - засетить переход на одну позицию выше и зп на 25% больше.
