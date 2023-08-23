package java_study;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class MyClass<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class Generic {
    public static void main(String[] args) {
        MyClass<Person> personClass = new MyClass<>();
        personClass.setValue(new Person("John"));
        Person personValue = personClass.getValue();
        Person personValue22 = new Person("완완");
        System.out.println("Person's name: " + personValue.getName()); // Output: Person's name: John
        System.out.println("Person's name: " + personValue22.getName()); // Output: Person's name: John
    }
}
