package Phone;

import Name.Name;

import java.lang.reflect.Field;
import java.util.*;

public class PhoneRepository extends Name{

    private Map<String,Set<PhoneNumber>> numbers;

    public PhoneRepository(String name) {
        super(name);
        numbers = new HashMap<>();
    }

    public void addNumber(Name name,PhoneNumber number) {
        //Sprawdzenie numeru
        if(!this.numbers.containsKey(name.getName())) {
            PhoneCheck check = new PhoneCheck();
            Set<String> keys = this.numbers.keySet();
            for (String key : keys) {
                if (check.check(number, this.numbers.get(key))) {
                    System.err.println("Taki numer istnieje w bazie!");
                    return;
                }
            }
        }

        Set<PhoneNumber> tmp=new HashSet<>();
        if(this.numbers.containsKey(name.getName())) tmp = this.numbers.get(name.getName());
        tmp.add(number);
        this.numbers.put(name.getName(),tmp);
    }

    public Set<PhoneNumber> findNumbers(String name) {
        return this.numbers.get(name);
    }
}
