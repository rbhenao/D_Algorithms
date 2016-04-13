package AlgorithmsClass;

public class QuickSort  {
  private static int[] numbers;
  private static int number;

  public static int[] sort(int[] values) {
    
    if (values ==null || values.length==0){
      return new int[0];
    }
    numbers = values;
    number = values.length;
    quicksort(0, number - 1);
    return numbers;
  }

  private static void quicksort(int low, int high) {
    int i = low, j = high;
    
    int pivot = numbers[low + (high-low)/2];

    while (i <= j) {

      while (numbers[i] < pivot) {
        i++;
      }
      
      while (numbers[j] > pivot) {
        j--;
      }
      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
      }
    }
    
    if (low < j)
      quicksort(low, j);
    if (i < high)
      quicksort(i, high);
  }

  private static void exchange(int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
}  