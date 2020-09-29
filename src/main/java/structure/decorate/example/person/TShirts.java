package structure.decorate.example.person;

/**
 * @author shaoneng
 * @date 2020/09/29 14:56
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }


}
