public class SortedArr {
   public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] < arr[i+1]){
            return isSorted(arr,i+1);
        }else{
            return false;
        }
   }
   
   public static void main(String[] args) {
       int arr[] = {2,5,1,3};
       System.out.println(isSorted(arr,0));
   }
}
