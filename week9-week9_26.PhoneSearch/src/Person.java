import java.util.HashMap;
import java.util.Set;

public class Person {

    private String name;
    private HashMap<String, Set<String>> phoneByPerson;

    public Person(String name) {
        this.name = name;
        initEmpty();
    }

    public void initEmpty(){
        phoneByPerson = new HashMap<>();
    }

    public void addNumber(String phone){

    }

    public Set<String> phoneSearchByPerson(){
        return phoneByPerson.get(String);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
