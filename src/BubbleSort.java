import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
	
		int[] bubbles = new int[100];
	
		int enter = 0;
		int size = 0;
	
		while(1==1){
			System.out.println("Enter next int (-1 to exit)");
			enter = in.nextInt();
			if(enter==-1)break;
			bubbles[size] = enter;
			size++;
		}
		
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size - 1; j++){
				if(bubbles[j]>bubbles[j+1]){
					int temp = bubbles[j];
					bubbles[j] = bubbles[j+1];
					bubbles[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < size; i++)System.out.print(bubbles[i]);
	}
}
