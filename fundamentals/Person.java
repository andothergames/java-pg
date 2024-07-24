package fundamentals;
public class Person {
    // defining an object - does not need psvm
    //encapsulate to contain diff things to be a person
    //private stops them being accessed w/o getters/setters
    private String name;
    private int age;
    private boolean likesCats;

    //building constructer
    public Person(String name, int age, boolean likesCats) {
        //when someone instantiates a person, define pars
        this.name = name;
        this.age = age;
        this.likesCats = likesCats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLikesCats() {
        return likesCats;
    }

    public void setLikesCats(boolean likesCats) {
        this.likesCats = likesCats;
    }

    public void setOlderAge() {
        this.age++;
    }
    
    //custom implementation for subclasses
    //toString already defined in Object class but we override this
    @Override
    public String toString() {
        return this.name + " (" + this.age + "yo) ";
    }
}

