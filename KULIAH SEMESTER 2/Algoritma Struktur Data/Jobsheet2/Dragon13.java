package Jobsheet2;
public class Dragon13 {
    int x, y, width, height;
    public Dragon13(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x > 0 && x < width) {
                x--; 
            }    
        detectCollision();
        }
    

    void moveRight() {
        if (x > 0 && x < width) {
            x++;
        } else
        detectCollision();
    }

    void moveUp() {
        if (y > 0 && y < height) {
            y++; 
        } else
        detectCollision();
    }

    void moveDown() {
        if (y > 0 && y < height) {
            y--;
        } else
        detectCollision();
    }

    void printPosition() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        if (x >= width || y >= height || x == 0 || y == 0) {
            System.out.println("Game Over");
            System.exit(0); 
        }
    }
}
