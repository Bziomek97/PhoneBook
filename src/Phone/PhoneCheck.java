package Phone;

import java.util.Set;

public class PhoneCheck {

    public boolean check(PhoneNumber number, Set<PhoneNumber> numberSet){
        for(PhoneNumber i: numberSet){
            if(i.getPhoneNumber().equals(number.getPhoneNumber())) return true;
        }
        return false;
    }

}
