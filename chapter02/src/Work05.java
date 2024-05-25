public class Work05 {
    public static void main(String[] args) {
        int money = 100; //手里的钱 -> 买鸡
        //i 代表公鸡 5元    j 代表母鸡 3元   z 代表小鸡 3只1元
        for (int i = 0; i <= 20; i++){
            for (int j = 0; j <= 33; j++){
                for (int z = 0; z <= 300; z+=3){
                    //i 代表公鸡 5元    j 代表母鸡 3元   z 代表小鸡 3只1元
                    if(5*i + 3*j + z/3 == money && i + j + z == 100){
                        System.out.println("公鸡:" + i + "只," + "母鸡:" + j + "只," + "小鸡:" + z + "只。");

                    }
                }
            }
        }
    }
}
