import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int value1 = 33;
        changeValue(value1);
        System.out.println(value1);

        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2);

        Integer[] value3 = new Integer[] {3, 4};
        changeValue1(value3);
        System.out.println(Arrays.toString(value3));

        Integer[] value4 = new Integer[] {3, 4};
        changeValue2(value4);
        System.out.println(Arrays.toString(value4));

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson1(person);
        System.out.println(person);

        changePerson2(person);
        System.out.println(person);
    }
    public static void changeValue(int value) {
        value = 22;
    }
    public static void changeValue(Integer value) {
        value = 22;
    }
    public static void changeValue1(Integer[] value) {
        value = new Integer[] {1, 2};
    }
    public static void changeValue2(Integer[] value) {
        value[0] = 99;
    }

    public static void changePerson1(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }
    public static void changePerson2(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
}