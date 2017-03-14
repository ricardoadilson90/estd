package estd;

public class Array {

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6) {
			return true;
		} else if (nums[nums.length - 1] == 6) {
			return true;
		} else {
			return false;
		}

	}
	public int countEvens(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				counter++;
			}
		}
		return counter;

	}
	public int sum13(int[] nums) {
		int sum = 0; 
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 13){
				sum = sum + nums[i];
			}else{
				i++;
			}
		}
		return sum; 
	}
	public int bigDiff(int nums[]){
	 	int maior = 0;
			int menor = 0;
			
			for (int i = 0; i < nums.length; i++) {
					if (menor> nums[i]&&i!=0){
						menor = nums[i];
					}else if (i == 0){
						menor = nums[i];
					}
					
				}
			
			for (int i = 0; i < nums.length; i++) {
					if (maior< nums[i]&&i!=0){
						maior = nums[i];
					}else if (i == 0){
						maior = nums[i];
					}
				
				
			}
			
			return maior - menor;
	}

}
