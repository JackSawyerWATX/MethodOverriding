class Main {
    public static void main(String[] args) {
        
        Parent p = new Parent();
        p.name = "Eagle";
        p.greeting();

        Child c = new Child();
        c.name = "Skylark";
        c.age = 13;
        c.greeting();

    }
}