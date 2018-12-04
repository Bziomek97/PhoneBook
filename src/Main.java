import Name.Name;
import Phone.PhoneNumber;
import Phone.PhoneRepository;

public class Main {

    static public void main(String[] args){

        PhoneRepository nowak = new PhoneRepository("Nowak");
        Name julka= new Name("Julia");
        Name krzys= new Name("Krzyś");
        nowak.addName(julka);
        nowak.addName(krzys);
        PhoneNumber n1= new PhoneNumber("1234");
        PhoneNumber n2= new PhoneNumber("12345");
        PhoneNumber n3= new PhoneNumber("123456");
        PhoneNumber n4= new PhoneNumber("1234567");

        nowak.addNumber(julka,n1);
        nowak.addNumber(krzys,n2);
        nowak.addNumber(julka,n3);
        nowak.addNumber(krzys,n4);
        nowak.addNumber(julka,n1);

        output(nowak,julka);
        output(nowak,krzys);
    }

    static void output(PhoneRepository surname, Name name){
        System.out.println(surname.getName() + " " + surname.findName(name.getName()).getName() + ":");
        for(PhoneNumber i: surname.findNumbers(name.getName())){
            System.out.println(i.getPhoneNumber());
        }
        System.out.println();
    }
}
