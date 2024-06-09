package oop02;

/*小项目
请使用二维数组实现酒店管理系统。功能如下:
接收用户不同编号输入,对应相应的功能
1.查看酒店所有房间的状态
2.预订房间
3.退房
0.退出系统
*/

public class Test {
    public static void main(String[] args) {
        //创建酒店
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用酒店管理系统");
        System.out.println("请输入不同的编号使用不同的功能");
        System.out.println("[1]查看所有房间状态");
        System.out.println("[2]预订房间");
        System.out.println("[3]退订房间");
        System.out.println("[0]退出系统");
        System.out.print("请输入功能编号:");

        while(true){
            //接受用户输入
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("请输入功能编号:");
            int i = scanner.nextInt();
            if(i == 0){
                System.out.println("谢谢使用,下次再见");
                //退出系统,终止JVM
                System.exit(0);
            }else if(i == 1){
                hotel.displayRoom();
            }else if(i == 2){
                System.out.print("请输入要预订的房间编号:");
                int roomNo = scanner.nextInt();
                hotel.bookRoom(roomNo);
                System.out.println("房间" + roomNo + "预订成功!");
            }else if(i == 3){
                System.out.print("请输入要退房的房间编号:");
                int roomNo = scanner.nextInt();
                hotel.checkOutRoom(roomNo);
                System.out.println("房间" + roomNo + "退房成功");
            }else{
                System.out.print("您输入的编号不符合要求,");
            }

        }
    }
}
