package closestBall;
import java.util.*;

public class closestBall
{
  public int computeClosest(ArrayList<Integer> players,
      ArrayList<Integer> balls)
  {
    int min = 100;
    int num = 0;
    for(int i = 0; i < players.size() ; i++){
      for(int j = 0; j < balls.size() ; j++){
        num = Math.abs(players.get(i)- balls.get(j));
        if(num < min){
          min = num;
        }
      }
    }
    return min;
  }
}
