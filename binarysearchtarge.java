// perform binary serach opertion to deterimen the keyvalues --39
//  and also determine the no.of comparison require to serach the key value -- 
//  the array is -- <12,15,20,29,34,39,46,50,85>
public class binarysearchtarge{
    public static void main(String[] args) {
        int arr[]={12,15,20,29,34,39,46,50,85};
        int key =39;
        int low=0;
        int high =arr.length-1;
        int comparisons=0;
        int position=-1;
        while(low <= high){
            comparisons++;
            int mid = (low + high) / 2;
            if(arr[mid] == key){
                position = mid;
                break;
            }
            else if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(position != -1){
            System.out.println("element found at " + position);
            System.out.println("no of all comparison: " + comparisons);
        }
        else{
            System.out.println("element not found");
        }
    }
}

// for arr[10], key value =5
