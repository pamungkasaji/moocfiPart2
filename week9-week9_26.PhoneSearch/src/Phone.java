import java.util.HashSet;
import java.util.Set;

public class Phone {

    private Set<String> phones = new HashSet<>();

    public void add(String phone){
        phones.add(phone);
    }
}
