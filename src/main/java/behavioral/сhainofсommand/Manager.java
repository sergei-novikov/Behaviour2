package behavioral.сhainofсommand;

public class Manager implements Support {

    Support next = new TechnicalSupport();

    @Override
    public void action() {
        System.out.println("try turning it off and on...");
        System.out.println("...if it don't work, pleas wait...");
        if (next != null) {
            next.action();
        }
    }
}
