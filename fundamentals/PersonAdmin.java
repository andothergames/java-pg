package fundamentals;
public class PersonAdmin {
    public static void main(String[] args) {
        Person personSheila = new Person("sheila", 30, true);
        Person personJonk = new Person("jonk", 10, false);

        personSheila.setOlderAge();
        System.out.println(personSheila.getAge());

        Person[] friends = {personSheila, personJonk};
        for (Person person : friends) {
            System.out.println(person.toString());
        }

    }

}
