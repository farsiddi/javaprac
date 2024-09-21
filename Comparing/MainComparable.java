package Comparing;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparable {
    public static void main(String[] args) throws CustomException {
        ArrayList<Result> rs = new ArrayList<>();
        rs.add(new Result("Faran",23,87));
        rs.add(new Result("Rohan",22,84));
        rs.add(new Result("Ali",20,95));
        Collections.sort(rs);
      System.out.println(rs);
        for (Result st :rs  ) {
            System.out.println(st.marks+" "+st.name+" "+st.rno);
        }
        int chec = 32;
        int flag =0;
        for ( Result rf : rs){
            if (chec == rf.rno){
                System.out.println("it exists");
                flag =1;
            }

        }
//        if (flag ==0){
//            throw new CustomException("The "+chec+" rno does not exists");
//        }
        try {
            if (flag==0) {
                throw new CustomException("The " + chec + " rno does not exists");
            }
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }

}
