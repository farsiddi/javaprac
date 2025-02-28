package ObjecSuperclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VarDemo {

    public static void main(String[] args) {
        var message = "How are you?"; // variables need to be initialization
//        System.out.println(message);
//        System.out.println(message.getClass());
        message = "not good"; // Allowed
//        message = 73283; // Not allowed - cannot change datatype
        var arr = new int[]{21, 34, 46, 576, 54};
        for (var num : arr) {
            System.out.println(num);
        }
        var list = new ArrayList<String>(Arrays.asList("nejcbfe", "frfugreu", "EFewfe"));
        System.out.println(list.getClass());

    }
}

