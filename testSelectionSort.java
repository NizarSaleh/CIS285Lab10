import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
public class testSelectionSort {
	SelectionSort sort = new SelectionSort();
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}
public void testPositive(){
	

int[] arr = new int[]{8,9,7,10,2};
int[] Sortedarr = new int[]{2,7,8,9,10};


sort.basicSelectionSort(arr);
assert(Arrays.equals(Sortedarr,arr));
}
public void testNegative(){
	int[] arr = new int[]{-8,-9,-7,-10,-2};
	int[] Sortedarr = new int[]{-10,-9,-8,-7,-2};


	sort.basicSelectionSort(arr);
	assert(Arrays.equals(Sortedarr,arr));
}
public void testMixed(){
	int[] arr = new int[]{-8,-9,7,10,2,0};
	int[] Sortedarr = new int[]{-9,-8,0,2,7,10};


	sort.basicSelectionSort(arr);
	assert(Arrays.equals(Sortedarr,arr));
}
public void testDuplicates(){
	int[] arr = new int[]{8,9,7,10,9,2,7};
	int[] Sortedarr = new int[]{2,7,7,8,9,9,10};


	sort.basicSelectionSort(arr);
	assert(Arrays.equals(Sortedarr,arr));
}
}