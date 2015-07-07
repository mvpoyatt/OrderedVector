import data_structures.*;

public class Driver{
	private OrderedListADT<Integer> list;
	public Driver(){
		list = new OrderedVector<Integer>();
		runTests();
		}

	private void runTests(){
		for(int i = 0; i < 10; i++)
			list.insert(i);
		}

	public static void main (String[] args){
		new Driver();
		}
	}