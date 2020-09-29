package structure.decorate.example.person;

/**
 * @author shaoneng
 * @date 2020/09/29 14:46
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    public void show() {
        System.out.printf("装扮的%s", name);
    }
}
