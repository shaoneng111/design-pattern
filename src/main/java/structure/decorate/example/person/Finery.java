package structure.decorate.example.person;

/**
 * @author shaoneng
 * @date 2020/09/29 14:53
 */
public class Finery extends Person {

    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
