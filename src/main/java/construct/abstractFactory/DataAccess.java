package construct.abstractFactory;

/**
 *
 * @author shaoneng
 * @date 2020/09/18 15:58
 */
public class DataAccess {

    private static final String DATA_TYPE = "Access";

    public static IUser getUser() {
        String className = DATA_TYPE + "User";
        try {
            String classAbsolutePath = DataAccess.class.getPackage().getName() + "." + className;
            Class userTypeClass = DataAccess.class.getClassLoader().loadClass(classAbsolutePath);
            return  (IUser)userTypeClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static IDepartment getDepartment() {
        String className = DATA_TYPE + "Department";
        try {
            Class userTypeClass = Class.forName(className);
            return (IDepartment) userTypeClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
