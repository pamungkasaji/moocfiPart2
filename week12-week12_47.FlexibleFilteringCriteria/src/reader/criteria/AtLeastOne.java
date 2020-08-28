
package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class AtLeastOne implements Criterion {

    private Criterion[] criterions;

    public AtLeastOne(Criterion... criterions) {
        this.criterions = criterions;
    }

    @Override
    public boolean complies(String line) {
        for(Criterion criterion : criterions){
            if (criterion.complies(line)){
                return true;
            }
        }
        return false;
    }
}