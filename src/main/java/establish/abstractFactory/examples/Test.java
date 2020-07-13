package establish.abstractFactory.examples;

public class Test {
    public static void main(String[] args) {
        Client pmClient = new Client("PM");
        pmClient.getScrollBar().create();
        pmClient.getWindow().create();

        Client motifClient = new Client("Motif");
        motifClient.getWindow().create();
        motifClient.getScrollBar().create();
    }
}
