public class Child extends Parent {
    int age;

    @Override
    public void greeting() {
        System.out.println("HI! My name is " + name+ " and I am " + age+ " years old.");
    }
}
