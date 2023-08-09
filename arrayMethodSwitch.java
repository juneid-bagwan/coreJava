import java.util.Scanner;

public class arrayMethodSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 numbers in the array:");
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		boolean flag = true;
		arrayMethodSwitch ams = new arrayMethodSwitch();
		while (flag) {
			System.out.println(
					"enter the operation you want to performe:\n1.to search element in array.\n2.to find maximum number.\n3.to find minimum number.\n4.to find sum of all elements.\n5.to print all even numbers in array.\n6.to stop");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				ams.search(a);
				break;
			case 2:
				ams.max(a);
				break;
			case 3:
				ams.min(a);
				break;
			case 4:
				ams.sum(a);
				break;
			case 5:
				ams.even(a);
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("invalid input");
				break;
			}
		}

	}

	void even(int[] a) {
		System.out.println("even number in array are:");
		for (int b = 0; b < a.length; b++) {
			if (a[b] % 2 == 0) {
				System.out.println(a[b]);
			}
		}
	}

	void sum(int[] a) {
		int sum = 0;
		for (int b = 0; b < a.length; b++) {

			sum = sum + a[b];

		}
		System.out.println("sum of number in array is :" + sum);

	}

	void min(int[] a) {
		int min = a[0];
		for (int b = 0; b < a.length; b++) {
			if (a[b] < min) {
				min = a[b];
			}
		}
		System.out.println("minimum number is :" + min);

	}

	void max(int[] a) {
		int max = a[0];
		for (int b = 0; b < a.length; b++) {
			if (a[b] > max) {
				max = a[b];
			}
		}
		System.out.println("maximum number is :" + max);
	}

	void search(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element you want to search:");
		int n = sc.nextInt();
		for (int b = 0; b < a.length; b++) {
			if (a[b] == n) {
				System.out.println(n + " exisit in array at index " + b);
				break;
			} else {
				System.out.println(n + " does not exisit in array at index " + b);
			}

		}

	}

}