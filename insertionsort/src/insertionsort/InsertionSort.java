package insertionsort;
import java.util.*;

public class InsertionSort  {
	

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
			System.out.println("====Welcome to insertion sort=====");
			do {
			System.out.println("Choose your options below!");
			System.out.println("1. Input your own values to sort");
			System.out.println("2. Input random values to sort");
			System.out.println("3. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				InputOwnValues();
			break;
				
			case 2:
				RandomValues();
			break;
			
			case 3:
				System.out.println("Program terminating ...");
			
				
			}
			}while(choice<3);
		}
	public static void RandomValues() {
		Scanner sc2 = new Scanner(System.in); 
		int[] slot;
		System.out.println("Choose how many values you want to output");
		int n = sc2.nextInt();
		slot = new int[n];
		System.out.println("Enter the Upper Bound for your values");
		int ub = sc2.nextInt()+ 1;
		System.out.println("Enter the Lower Bound for your values");
		int lb = sc2.nextInt() + 1;
		
		for (int i =0; i<n;i++) {
			int randInt = (int) Math.round(Math.random()*(ub-lb) + lb);
			slot[i] = randInt;
		}
		PrintArray(slot,n);
		
		
	}
	
	public static void InputOwnValues() {
		
		Scanner sc1 = new Scanner(System.in); 
			System.out.println("How many values are you planning to input?");//can consider adding function to if they dont know how many values they are inputting
			int n = sc1.nextInt();
			int[] slot = new int[n];
			for (int j = 0; j<n;j++) {slot[j]=0;}
			for (int i = 0; i < n; i++) {
				int p = i+1;
				System.out.println("Input the "+ p + " value");
				int values = sc1.nextInt();
				slot[i]=values;
			}
			PrintArray(slot,n);
			
		
	}
	public static void PrintArray(int [] slot, int n) {
		Scanner sc3 = new Scanner(System.in); 
		System.out.println("Your current array is:");
		System.out.println(Arrays.toString(slot));
		InsertionSortImplementation(slot, n);
		System.out.println("Would you like to print out the sorted values?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int Ans = sc3.nextInt();
		if (Ans==1)System.out.println(Arrays.toString(slot));
	}
	public static void InsertionSortImplementation(int [] slot, int n) {
		for (int i =1; i<n;i++) {
			for (int j = i; j>0; j--) {
				if(slot[j]<slot[j-1]) {
					int temp = slot[j-1];
					slot[j-1] = slot[j];
					slot[j] = temp;
				}
				else break;
				}
			}
		}


}
