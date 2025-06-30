public class ArrayIsSorted {
    public static void main(String[] args){
        int []arr = {1,2,3,4,5,6,7,8,9};
        boolean found = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i - 1] > arr[i] ){
                found = false;
                break;
            }
        }
        if(found){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
