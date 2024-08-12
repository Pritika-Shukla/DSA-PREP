public class removeDuplicate {
    static int removeDup(int arr[]) {
        if (arr.length == 0) return 0;
        
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 4, 7, 5};
       java.util.Arrays.sort(arr);

        int res = removeDup(arr);
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
