
public class BubbleSort {

	public static void main(String[] args) {
		
		        char[] array = {'h', 'e', 'l', 'l', 'o'};
		        int n = array.length;
		        for (int i = 0; i < n-1; i++) {
		            for (int j = 0; j < n-i-1; j++) {
		                if (array[j] > array[j+1]) {
		                    char temp = array[j];
		                    array[j] = array[j+1];
		                    array[j+1] = temp;
		                }
		            }
		        }
		        System.out.println(array);
		    }
		}


	


