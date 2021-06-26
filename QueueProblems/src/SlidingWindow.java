import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {

	public static void main(String[] args) {
	
		MovingAverage1 movingAverage = new MovingAverage1(3);
		movingAverage.next(1); // return 1.0 = 1 / 1
		movingAverage.next(10); // return 5.5 = (1 + 10) / 2
		movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
		movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3
		System.out.println(movingAverage.next(5)); //return 4.33 = (3 + 5 + 5) / 3
	}
}

class MovingAverage1 {
    int size, head = 0, windowSum = 0, count = 0;
    int[] queue;
  public MovingAverage1(int size) {
    this.size = size;
    queue = new int[size];
  }

  public double next(int val) {
    ++count;
    
    //calculating new sum by shifting((previous sum - old element) + new element)
    int tail = (head + 1) % size;
    windowSum = windowSum - queue[tail] + val;
    
    // moving to next head
    head = (head + 1) % size;
    queue[head] = val;
    //calculating average
    return windowSum * 1.0 / Math.min(size, count);
  }
}

class MovingAverage {
    int size;
    List<Integer> list = new ArrayList<Integer>();
    
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        list.add(val);
        int sum =0;
        
        for(int i= Math.max(0, list.size() - size); i< list.size();i++){
            sum = sum + (int)list.get(i);
        }
        
        return (sum * 1.0) / Math.min(list.size(),size);
        //Math.max(0, list.size() - size) is used for getting starting index of moving average 
        //Math.min(list.size(),size) is used for getting minimum size of moving average  
    }
}
