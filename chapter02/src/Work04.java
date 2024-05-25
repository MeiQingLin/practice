public class Work04 {

    public static void main(String[] args) {
        int mantou = 100;
        for (int i = 0; i < 100/3; i++){
                for (int j = 0; j < 100; j+=3){
                    if (3 * i + j / 3 == mantou && i + j == 100){
                        System.out.println("大和尚是" + i);
                        System.out.println("小和尚是" + j);
                    }
                }
        }
    }
}
