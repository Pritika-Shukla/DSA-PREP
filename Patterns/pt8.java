public class pt8 {
    public static void pattern(int n){
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }
}