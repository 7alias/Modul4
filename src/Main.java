public class Main {


    public static void main(String[] args) {
/*
Make (add code to class Tank),
which can turn around
*/
        // At (0;0) fuel=100
        Tank justTank = new Tank();
// At (10;20) fuel=100
        Tank anywhereTank = new Tank(10, 10);
// At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        System.out.print("justTank "); justTank.printPosition();

        anywhereTank.goBackward(-200);
        System.out.print("anywhereTank ");anywhereTank.printPosition();
        customTank.goForward(201);
        System.out.print("customTank ");customTank.printPosition();
    }

}
