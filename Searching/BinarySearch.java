package Searching;



class BinarySearch{
       public static int binarySerachIter(int target,int start,int end,int mylist[]){
      int mid=(start+end)/2;
      while(start<=end){
          if(target==mylist[mid]){
            return mid;
          }else if(target<mylist[mid]){
               start=mid+1;
               
          }else{
            end=mid+1;
          }
          mid=(start+end)/2;
      }
     
        return -1;
      

       }
       public static int binarySerachRec(int target,int start,int end,int mylist[]){
        int mid=(start+end)/2;
        if(start<=end){
            if(target==mylist[mid]){
              return mid;
            }else if(target<mylist[mid]){
              binarySerachRec(target, mid+1, end, mylist);
               
                 
            }else{
              binarySerachRec(target, start, mid+1, mylist);
            }
        }
       
          return -1;
        
  
         }
       public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int target=30;
        int last=arr.length-1;
        System.out.println( binarySerachRec(target, 0, last, arr));
       
       }
}