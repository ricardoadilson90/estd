package estd;

import org.junit.Assert;
import org.junit.Test;

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
	
	public void sort(String [] linhas){
		for (int i = 0; i < linhas.length; i++) {
			String aux = linhas[i];
			int j = i -1;
			while ((j>=0)&&(linhas[j].compareTo(aux)>0)){
				linhas[j+1] = linhas[j--];
			}
			linhas [j+1] = aux;
		}
	}
	@Test
	public void sortTest(){
		Array a = new Array();
		String [] linhas = {"joao","pedro","luan", "jose"};
		a.sort(linhas);
		String [] esperado = {"joao", "jose","luan", "pedro"};
		Assert.assertArrayEquals(esperado, linhas);
	}

}
