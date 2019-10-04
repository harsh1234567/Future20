// to find the missing no in the given array .
//that solution is using the concept of xor eg. 1^1=0,2^2=0
//that soulution given by Harsh jain 
class Solution {
    public int missingNumber(int[] nums) {
        int missingno = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missingno ^= i ^ nums[i];
        }
        return missingno;
    }
	
	public static void main(String args[]){
	    int arr[]={1,2,3,5,6};
		System.out.println(missingNumber(arr));
	}
}
