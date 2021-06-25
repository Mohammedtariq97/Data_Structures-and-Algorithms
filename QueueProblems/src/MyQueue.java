import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	
	private List<Integer> data;
	int p_start;
	
	MyQueue(){
		data = new ArrayList<>();
		p_start = 0;
	}
	
	public boolean enQueue(int x) {
		data.add(x);
		return true;
	}
	
	public boolean deQueue(){
		if(isEmpty() == true) {
			return false;
		}
		p_start++;
		return true;
	}
	
	public int Front() {
		return data.get(p_start);
	}
	
	public boolean isEmpty() {
		if(p_start >= data.size()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

