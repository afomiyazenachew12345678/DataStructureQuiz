import java.util.Arrays;

public class MergeSort {
 public static void main(String[] args) {
		        int[] array = {3, 2, 1, 5, 4};
		        mergeSort(array, 0, array.length - 1);
		        System.out.println(Arrays.toString(array));
		    }

		    public static void mergeSort(int[] array, int left, int right) {
		        if (right <= left) return;
		        int mid = (left+right)/2;
		        mergeSort(array, left, mid);
		        mergeSort(array, mid+1, right);
		        merge(array, left, mid, right);
		    }

		    static void merge(int[] array, int left, int mid, int right) {
		        int[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
		        int[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);
		        int leftIndex = 0, rightIndex = 0;
		        for (int i = left; i < right + 1; i++) {
		            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
		                if (leftArray[leftIndex] < rightArray[rightIndex]) {
		                   array[i] = leftArray[leftIndex];
		                   leftIndex++;
		                } else {
		                    array[i] = rightArray[rightIndex];
		                    rightIndex++;
		                }
		            } else if (leftIndex < leftArray.length) {
		                array[i] = leftArray[leftIndex];
		                leftIndex++;
		            } else if (rightIndex < rightArray.length) {
		                array[i] = rightArray[rightIndex];
		                rightIndex++;
		            }
		        }
		    }
		}

	


