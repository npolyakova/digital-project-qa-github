public class Cat {
    String name;
    private int age;

    public void meow() {
        System.out.println("Meow!");
    }

    public int getAge() {
        return age + 1;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int createCatAndGetAge() {
        Cat exampleCat = new Cat("Nance", 2);
        return exampleCat.getAge();
    }
}
