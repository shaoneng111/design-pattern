package structure.decorate.example.person;

/**
 * @author shaoneng
 * @date 2020/09/29 14:59
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("张三");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }
}
