
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> duplicateRemover;
    private int numberOfDuplicate;

    public PersonalDuplicateRemover() {
        duplicateRemover = new HashSet<>();
        numberOfDuplicate = 0;
    }

    @Override
    public void add(String characterString) {
        if(duplicateRemover.contains(characterString)){
            numberOfDuplicate ++;
            return;
        }
        duplicateRemover.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return numberOfDuplicate;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return duplicateRemover;
    }

    @Override
    public void empty() {
        duplicateRemover.removeAll(duplicateRemover);
        numberOfDuplicate = 0;
    }
}
