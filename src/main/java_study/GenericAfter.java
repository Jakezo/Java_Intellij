package java_study;

class GenericExample<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericAfter {

        public static void main(String[] args) {
            GenericExample<String> stringExample = new GenericExample<>();
            stringExample.setValue("Hello");
            String stringValue = stringExample.getValue();
            System.out.println(stringValue); // Output: Hello

            GenericExample<Integer> integerExample = new GenericExample<>();
            integerExample.setValue(42);
            int intValue = integerExample.getValue();
            System.out.println(intValue);    // Output: 42
        }

}

