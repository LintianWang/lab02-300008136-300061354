| Type | Collection | Time | Collection | Time | Collection | Time |
| --- | --- | --- |--- | --- | --- |--- | 
| oridinary arrays | n = 100000000| 15983ms | n = 10000000 | 1084ms | n = 10000000| 129ms |
| ArrayList | n = 100000000 | 116275ms | n = 10000000 | 6740ms | n = 10000000| 273ms |
| LinkedList | n = 100000000 | 356812ms | n = 10000000 | 24061ms | n = 10000000| 531ms |

Conclusions:

ArrayList is implemented as a resizable array. Its elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array. 

LinkedList is implemented as a double linked list. Its performance on add and remove is better than Arraylist, but worse on get and set methods.

(Code of arrays)


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
}}

(Code of Arraylist)


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


