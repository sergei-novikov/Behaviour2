package behavioral.сhainofсommand;

public class Master implements Support {

    Support next;

    @Override
    public void action() {
        System.out.println("we are going to you, wait!");
        if (next != null) {
            next.action();
        }
    }
}
