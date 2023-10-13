
public class App {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person("khaled");
        arr[1] = new Student("khaled", 2022000012);
        arr[2] = new Undergraduate("khaled", 2022123, 2);

        for (Person i : arr) {
            i.writeOutput();

        }

    }
}
