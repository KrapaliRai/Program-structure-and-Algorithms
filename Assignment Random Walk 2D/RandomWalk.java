/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalkexperiment;

/**
 *
 * @author krapa
 */
import java.util.Random;

public class RandomWalk {
    // the man is initially is at zero that is origin.
    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    public void move(int dx, int dy) {
      // Here we added the distance
       x += dx;
       y += dy;
        // TODO you need to implement this
    }

    private void randomWalk(int n) {
        for (int i = 0; i < n; i++)
            randomMove();
    }

    private void randomMove() {
      
    int direction; 
    //for (int i = 0; i < 100; i++) {}
        direction = Math.abs(random.nextInt(3)); 
        switch (direction) {
            case 0:
                // For North
                y += 1; break;      
        // TODO you need to implement this
            case 1:
                // For East
                x +=1;  break;
            case 2:
                // For South
                y -=1;  break;
            case 3:
                // For West
                x -=1;  break;
            default:
                System.out.println("Move not possible");
                break;
        }
    
    }
    public double distance(){
        double d;
        //Distance formula.
        d = Math.sqrt((x*x)+(y*y));
        return d;
        // TODO you need to implement this
    }

    public static void main(String[] args) {
        //int n = Integer.parseInt(args[0]);
        for (int i = 0; i < 10; i++) {
            // taking ten readings for certain number of steps.
           int n = 3;
        RandomWalk walk = new RandomWalk();
        walk.randomWalk(n);
        System.out.println(n + " steps: " + walk.distance());
            
        }
        
    }
}

