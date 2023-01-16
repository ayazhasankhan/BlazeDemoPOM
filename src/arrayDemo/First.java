package arrayDemo;

public class First {

	/*
	 Array: is an object which contains elements of similar data type.
	 
	 LastName: Joy, lubo, Ricky, Devid, Mike, Cris
	 
	 int []Number = {1201, 503,440,550};
	 
	 String s1 ="Joy";
	 String s2 ="lubo";
	 .................
	 .................
	 
	 
	 Array = {Joy, lubo, Ricky, Devid, Mike, Cris}
	 */
	
	public static void main(String[] args) {
		// First way to create the array
		
		String s[] = {"Joy", "lubo", "Ricky", "Devid", "Mike", "Cris"}; //declaration, instantiation, initialization
		
		System.out.println(s[0].concat("How are you?"));


		
  		// send way to create the array
		
		int a[] =new int[5];  // declaration, instantiation
		a[0]=404; //initialization
		a[1]=303; //initialization
		a[2]=909;
		a[3]=a[1];	
		a[4]=101;
		a[5]=333;
		
			System.out.println(a[5]);
	
		  
	}

}
