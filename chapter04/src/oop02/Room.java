package oop02;

public class Room {
    private int roomNO;
    private String roomType;
    private String roomState;

    public Room(int roomNO, String roomType, String roomState) {
        this.roomNO = roomNO;
        this.roomType = roomType;
        this.roomState = roomState;
    }

    public Room() {
    }

    public int getRoomNO() {
        return roomNO;
    }

    public void setRoomNO(int roomNO) {
        this.roomNO = roomNO;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    @Override
    public String toString() {
        return "[" +this.roomNO + "," + this.roomType + "," + this.roomState + "]";
    }
}
