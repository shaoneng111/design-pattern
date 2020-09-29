package structure.facade.example.subsystem;

/**
 * @author shaoneng
 * @date 2020/09/29 16:31
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
