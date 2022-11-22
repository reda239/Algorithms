package Searching;

/**
 * LinearSearch
 * time complexity O(N)
 * space Complexity O(1)
 */
public class LinearSearch {
 private static int seqSearch(int[] list,int target){
    int len = list.length;
    int i=0;
    for( ;i<len;i++){
        if(list[i] == target) break;
    }
    return i == len ? -1 : i;

 }
    public static void main(String[] args) {
        int arr[] = {2,3,1,5};
        int target = 1;
        System.out.print(seqSearch(arr, target));
    }
}