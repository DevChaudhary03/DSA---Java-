// Q-1 : just print the matrix using the loop
// public class prtice {
//     public static void main(String[] args) {
//         int [][] arr = {
//             {1,2,3},
//             {2,3,4},
//             {3,34,2}
//         };
//         for(int row =0;row<arr.length;row++){
//             for(int col =0;col<arr[row].length;col++){
//                 System.out.print(arr[row][col]+" ");
//             }
//             System.out.println(" ");
//         }

//         }
//     }

// linear search in 2d array
// public class prtice{
//     public static void main(String[] args) {
//         int []num={23,4,22,44,19,5,2};
//         int target=19;
//         int ans =linearsearch(num,target);
//         System.out.println(ans);
//     }
//     static int linearsearch(int []arr,int target){
//     if(arr.length==0){
//         return-1;
//     }
//     for (int index = 0; index < arr.length; index++) {
//         int element = arr[index];
//         if(element==target){
//             return index;
//         }
//         }
//         return -1;
    
//     }
// }


// Q-2:serach in string :
// public class prtice {

//     public static void main(String[] args) {
//         String name ="chaudhary";
//         char find ='u';
//         System.out.println(search(name,find));
//     }
//     static boolean search(String str,char find){
//         if(str.length()==0){
//             return false;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             if( find ==str.charAt(i)){
//                 return true;
//             }
//         }
//         // for(char ch : str.toCharArray()){
//         // if(ch==target){
// //         return true;
// //     }
// // }
//         return false;
//     }
// }

// q-3 is rotated sorted array
public class Main {   // file name should be Main.java

    static class Solution {

        public int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                // Left half is sorted
                if (nums[low] <= nums[mid]) {
                    if (nums[low] <= target && target < nums[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                // Right half is sorted
                else {
                    if (nums[mid] < target && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int result = obj.search(nums, target);

        System.out.println("Target found at index: " + result);
    }
}
