package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        testVisitor();
    }

    private static void testVisitor(){
        User user = new User(12L, "Sergey", "Pass123");
        Bank bank = new Bank();
        bank.setName("VTB");
        bank.setDescription("Самый выгодный вклад");

        Visitor visitor = new VisitorImpl();

        user.accept(visitor);
        bank.accept(visitor);
    }
}

