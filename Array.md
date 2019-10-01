| Type | Collection | Time | Collection | Time | Collection | Time |
| --- | --- | --- |--- | --- | --- |--- | 
| oridinary arrays | n = 100000000|  | n = 10000000 | | n = 10000000||
| ArrayList | n = 100000000 | 116275ms | n = 10000000 | | n = 10000000| |
| LinkedList | n = 100000000 | 356812ms | n = 10000000 | 24061ms | n = 10000000| 531ms |


(Code of arrays)


import java.util.Random;

public class list {

	public static void main(String[] args) {
	
		int n = 100000000;
		
		float num = 0;
		
		long start = System.currentTimeMillis();
		
		float[] arr = new float[n];
		
		for (int i = 0; i < n; i++) {
			num = (float)(0 + ((9.0 - 0) * new Random().nextDouble()));
			arr[i] = num;
			}
		long end = System.currentTimeMillis();
		
	    System.out.println("for list, time is " + (end - start) + "ms");
}
}
}

(Code of Arraylist)

import java.util.ArrayList;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
	
	int n = 100000000;

		float num = 0;
		long start = System.currentTimeMillis();
		
		ArrayList<Float> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
        	num = (float)(0 + ((9.0 - 0) * new Random().nextDouble()));
            list.add(new Float(num));
        }
        long end = System.currentTimeMillis();
    	
        System.out.println("for Arraylist, time is " + (end - start) + "ms");
	
	}
	}
 
  
(Code of LinkedList)

import java.util.LinkedList;
import java.util.Random;

public class Linkedlist {

	public static void main(String[] args) {
		int n = 100000000;
	float num = 0;
	long start = System.currentTimeMillis();
	
	LinkedList<Float> list = new LinkedList<>();
    for (int i = 1; i < n; i++) {
    	num = (float)(0 + ((9.0 - 0) * new Random().nextDouble()));
        list.add(new Float(num));
    }
    long end = System.currentTimeMillis();
	
    System.out.println("for Linkedlist, time is " + (end - start) + "ms");
}

}


