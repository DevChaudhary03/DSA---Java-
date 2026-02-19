//  for an empty array key target found 
public class BinarySearchEmptyarr {

    public static void main(String[] args) {

        int arr[] = {};   
        int key = 10;
        if(arr.length == 0){
            System.out.println("array is empty.");
            return; 
        }
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key){
                System.out.println("element found :" + mid);
                return;
            }
            else if(key < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println("element not found");
    }
}

