public class Tank {

    int x, y = 0;
    int dir;
    int fuel;


    public Tank(int x, int y, int f) {
        this.x = x;
        this.y = y;
        this.fuel = f;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tank() {
    }

    public void goForward(int i) {

        int w = getFuel(this.fuel, i);
        this.fuel = this.fuel - i;
        if (dir == 0) {
            x += w;

        } else if (dir == 1) {
            y += w;

        } else if (dir == 2) {

            x -= w;

        } else {

            y -= w;


        }
    }


    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now. Fuel left: " + this.fuel);
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public int getFuel(int fuel, int i) {

        if (fuel == 0) {
            this.fuel = 100;
        }
        int r = fuel;
        if (i > r) {
            r = i - r;
            this.fuel = r - i;
        } else if (fuel < 0) {
            r = 0;
            this.fuel = 0;
        } else {
            r = i;
            this.fuel = -i;
        }

        return r;
    }
}
