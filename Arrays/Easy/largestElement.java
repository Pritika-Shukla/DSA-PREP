//Recursive Approach
public class largestElement {
    public static void main(String[] args) {
     int arr[]={1,2,8,6,4};
System.out.println("The Largest elemnt in the array is "+ findlargest(arr));

    }
    static int findlargest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
