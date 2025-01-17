package LambdaStream.section_24.stream.flatMap;

import java.util.List;

public class Person {
    private String name;
    private List<String> phoneNum;

    public Person(String name, List<String> phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(List<String> phoneNum) {
        this.phoneNum = phoneNum;
    }
}
