package Jobsheet2;
public class Dragonmain {
    public static void main(String[] args) {
        
        Dragon13 dragon = new Dragon13(5, 5, 10, 10);

        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveRight();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();

        for (int x = 0; x < 10; x++) {
            dragon.moveDown();
            dragon.printPosition();
        }
    }
}