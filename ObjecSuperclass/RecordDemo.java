package ObjecSuperclass;

import java.lang.reflect.RecordComponent;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class RecordDemo {
    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("alex", 3234);
        System.out.println(personRecord.ssnId() + " " + personRecord.name());
        System.out.println(personRecord);
//        PersonRecord personRecord1 = new PersonRecord(null, 1213);
//        System.out.println(personRecord1);

        Class fckefc = personRecord.getClass();
        System.out.println(fckefc.isRecord());
        RecordComponent[] rc = fckefc.getRecordComponents();
        for (RecordComponent r : rc) {
            System.out.println(r.toString());
        }


    }
}
