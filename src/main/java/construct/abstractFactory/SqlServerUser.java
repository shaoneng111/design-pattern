package construct.abstractFactory;

/**
 * @author shaoneng
 * @date 2020/09/18 15:58
 */
public class SqlServerUser implements IUser {
    public void create() {
        System.out.println("create sql server user");
    }
}
