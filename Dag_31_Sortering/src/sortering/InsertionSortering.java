package sortering;

public class InsertionSortering {

	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int next = list[i];
			int j = i;
			boolean found = false;
			while (!found && j > 0) {
				if (next >= list[j - 1]) {
					found = true;
				} else {
					list[j] = list[j - 1];
					j--;
				}
			}
			list[j] = next;
		}
	}

}
