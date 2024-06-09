package oop02;

public class Hotel {

    //酒店里所有的房间
    private Room[][] rooms = new Room[6][10];

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Hotel() {
        for (int i = 0; i < rooms.length; i++) {
            //设置房间类型
            String type = "单人间";
            switch (i){
                case 2, 3 -> type = "标准间";
                case 4, 5 -> type = "豪华间";
            }
            //设置房间状态
            String state = "空闲";
            for (int j = 0; j < rooms[i].length; j++) {
                int no = 100 * (i+1) + j + 1;
                rooms[i][j] = new Room(no,type,state);
            }
        }
    }

    //查看所有房间状态
    public void displayRoom() {
        for(int i = 0; i < rooms.length; i++){
            for(int x = 0; x < rooms[i].length; x++){
                System.out.print(rooms[i][x].toString());
            }
            System.out.println();
        }
    }
    //预定房间
    public void bookRoom(int roomNo) {
        rooms[roomNo / 100 - 1][roomNo % 100 - 1].setRoomState("占用");
    }

    //退房
    public void checkOutRoom(int roomNo) {
        rooms[roomNo / 100 -1][roomNo % 100 -1].setRoomState("空闲");
    }
}
