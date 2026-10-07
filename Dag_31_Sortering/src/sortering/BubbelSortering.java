package sortering;

public class BubbelSortering {
	private static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	public static void bubbleSort(int[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (list[j] > list[j + 1])
					swap(list, j, j + 1);
			}
		}
	}

}
