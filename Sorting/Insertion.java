package Sorting;
/**
 * LInsertion Sort
 * time complexity O(N^2)
 * space Complexity O(1)
 */
public class Insertion {
    private static int[] insertionSort(int[] list){
        int len = list.length;
        for (int i = 0; i < len; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(list[i]<list[j]) break;
                if(list[i]>list[j]){
                    int tmp=list[i];
                    list[i]=list[j];
                    list[j]=tmp;
                }
            }
        }
        return list;
       
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,5};
        System.out.print(insertionSort(arr));
    }
}
