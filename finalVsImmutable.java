//Get difference between final vs immutable  in java 
class Solution {
	
	public static void main(String args[]){
        //example-1 using string class
		final StringBuffer sb = new StringBuffer("Future"); 
  
        // Even though reference varibale sb is final 
        // We can perform any changes 
        sb.append("20"); 
  
        System.out.println(sb); 
  
        // Here we will get Compile time error 
        // Because reassignment is not possible for final variable 
        sb = new StringBuffer("future change 20"); 
  
        System.out.println(sb); 
  	    //example-2 using array 
		  final int arr[]={1,2,3,4};
		  
		  int arr1[]={1,3,4,5};
		               
		  arr=arr1; //give error at compile time. 
		
		}
		
		
}