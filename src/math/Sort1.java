package math;

public class Sort1 {
	public static void main(String[] args){
		int[] L1 = {1,5,2,4,3,8,7,9,9,12,34,23};
		int c = 0;
		int count = 0;
		int swap = 0;
		while(count < 2){
			swap = 0;
			for(int i = 0;i < L1.length-1;i++){
				if (L1[i] > L1[i+1]){
					c = L1[i];
					L1[i] = L1[i+1];
					L1[i+1] = c;
					swap ++;
				}
			}
			if(swap == 0){
				break;
			}
			count++;
		}
		for(int i = 0;i < L1.length;i++){
			System.out.print(L1[i]+" ");
		}
	}
}