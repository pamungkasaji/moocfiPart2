import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> map;

    public Dictionary(){
        map = new HashMap<>();
    }

    public String translate(String word){
        if (map.containsKey(word)){
            return map.get(word);
        }
        return null;
    }

    public void add(String word, String translation){
        map.put(word, translation);
    }

    public int amountOfWords(){
        return map.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> translations = new ArrayList<>();
        for (String key : map.keySet()){
            translations.add(key + " = " + map.get(key));
        }
        return translations;
    }
}
