public class pt15 {
    public static void alpha(int n){
        for(int i=0;i<=n;i++){
        for(char ch='A';ch<='A'+(n-i-1);ch++)
         {
            System.out.print(ch);
         }

         System.out.println();
        } 
    }
    public static void main(String[] args) {
        alpha(5);
    }
}
