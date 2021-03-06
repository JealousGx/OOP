//Code
public class SelectionSort {
    /** The method for sorting the numbers */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;
    
            for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
                currentMin = list[j];
                currentMinIndex = j;
            }
            }
    
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
            }
        }
        }
    public static void main (String[] args) {
        System.out.println("------------------");
        System.out.println("Author: JealousGx");
        System.out.println("------------------");
        
        double [] list={2.0 , 9.0 , 5.0 , 4.0 , 8.0 , 1.0 , 6.0};
        SelectionSort.selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }  
    }
  }
  
  