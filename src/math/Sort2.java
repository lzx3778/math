package math;

public class Sort2 {
	public static void main(String[] args){
		int[] a = {3,5,6,8,1,2,4,7,234,7,5,3,3,6,7,835,6,4};
		int place = 0;
		int swap = 0;
		for(int i = 0;i < a.length;i ++){
			swap = 0;
			int small = 1000;
			for(int j = i;j < a.length;j ++){
				if(a[j] < small){
					small = a[j];
					place = j;
					swap ++;
				}
			}
			if(swap == 0){
				break;
			}
			a[place] = a[i];
			a[i] = small;
		}
		for(int k = 0;k < a.length;k++){
			System.out.print(a[k] + " ");
		}
	}
}
