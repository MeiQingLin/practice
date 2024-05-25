public class Work02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = 0; j < 5-i; j++){
                System.out.print(" ");
            }
            int j = 1;
            for (; j <= i; j++){
                System.out.print(j);
            }
            for (; j > 2; j--){
                System.out.print(j-2);
            }
            System.out.println();
        }
    }
}
