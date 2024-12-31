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
	int i:arr)// 外层循环，控制冒泡排序的轮数，每轮确定一个元素的最终位置
	for(
	int i = 0;i<arr.length-1;i++)
	{
		// 内层循环，进行相邻元素的比较和交换
		for (int j = 0; j < arr.length - 1 - i; j++) {
			// 如果前一个元素大于后一个元素，则交换它们的位置
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j]; // 使用临时变量temp保存arr[j]的值
				arr[j] = arr[j + 1]; // 将arr[j+1]的值赋给arr[j]
				arr[j + 1] = temp; // 将临时变量temp的值（原arr[j]的值）赋给arr[j+1]
			}
		}
	}
	{
		System.out.println(i);
	}
	
	// 这是一个快速排序
	int[] arr2 = { 1, 34, 23, 56, 78, 90 };

	quickSort(arr2, 0, arr2.length - 1);
    for (int i : arr2) {
        System.out.println(i);
        System.out.println("Hello World!");
        
    }
    
}

	// 这是一个九九乘法表
	for(

	int i = 1;i<=9;i++)
	{
		for (int j = 1; j <= i; j++) {
			System.out.print(j + "*" + i + "=" + (i * j) + "\t");
		}
		System.out.println();
	}
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

}
