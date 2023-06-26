import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    Random random;
    double xVelocity, yVelocity, initialSpeed = 2;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0)
            randomXDirection -= 1;
        setXDirection(randomXDirection * initialSpeed);
        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0)
            randomYDirection -= 1;
        setYDirection(randomYDirection * initialSpeed);
    }

    public void setXDirection(double randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(double randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);

    }
}
