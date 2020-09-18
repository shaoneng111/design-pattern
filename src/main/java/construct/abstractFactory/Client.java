package construct.abstractFactory;

/**
 * @author shaoneng
 * @date 2020/09/18 16:02
 */
public class Client {

    public static void main(String[] args) {
        IUser user = DataAccess.getUser();
        user.create();
        System.out.println("end");
    }
}
