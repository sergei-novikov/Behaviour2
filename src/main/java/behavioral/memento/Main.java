package behavioral.memento;

public class Main {

    public static void main(String[] args) {
        testMemento();
    }

    private static void testMemento(){
        Person person = new Person("Sergey", "Novikov", 21);
        System.out.println("save: " + person);
        person.save();

        person.setAge(45);
        person.save();
        System.out.println("update 1: " + person);

        person.setAge(49);
        person.save();
        System.out.println("update 2: " + person);

        person.setAge(32);
        person.save();
        System.out.println("update 3: " + person);

        person.setAge(15);
        person.save();
        System.out.println("update 4: " + person);

        person.setAge(16);
        System.out.println("update 5: " + person);

        person.undo();
        System.out.println("undo 1: " + person);

        person.undo();
        System.out.println("undo 2: " + person);

        person.undo();
        System.out.println("undo 3: " + person);

        person.undo();
        System.out.println("undo 4: " + person);

        person.undo();
        System.out.println("undo 5: " + person);

        person.undo();
        System.out.println("undo 6: " + person);
    }
}
