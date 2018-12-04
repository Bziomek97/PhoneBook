package Name;

import java.util.*;

public class NameRepository{

    private Set<Name> name;

    public NameRepository() {
        this.name = new HashSet<>();
    }

    public void addName(Name name){
        this.name.add(name);

    }

    public Name findName(String names){
        for(Name i: name){
            if((i.getName()).equals(names)) return i;
        }
        return null;
    }


}
