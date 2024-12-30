package src;

public class test {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}

	public static void test() {
		System.out.println("Hello World!");
	}
	int a = 1;
	int b = 2;
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	System.out.println("Hello World!");
	
	// 这是一个冒泡排序
	int[] arr = {1, 34, 23, 56, 78, 90};for(
	int i = 0;i<arr.length-1;i++)
	{
		for (int j = 0; j < arr.length - 1 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	
	for(
	int i:arr)
	{
		System.out.println(i);
	}

}
