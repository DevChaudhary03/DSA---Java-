public class inseration_Search {
    public static void main(String[] args) {
        int[] arr={2,4,1,6,8,5,3};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key =arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int x :arr){
            System.out.print(x+" ");

        }
    }
}
