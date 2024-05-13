import java.util.Arrays;

public class  Main {

	public static void main(String[] args) {
		
		        int[] array = {3, 7, 1, 9, 4};
		        int index = 2;
		        if (index < 0 || index >= array.length) {
		            System.out.println("Invalid index.");
		        } else {
		            int[] newArray = new int[array.length - 1];
		            for (int i = 0, k = 0; i < array.length; i++) {
		                if (i == index) {
		                    continue;
		                }
		                newArray[k++] = array[i];
		            }
		            System.out.println(Arrays.toString(newArray));
		        }
		    }
		}

	


