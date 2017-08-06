/**
 * Created by AESFUI on 05.08.2017.
 */
public class Field {

    private int sizeX;
    private int sizeY;
    private int mines;
    private int field[][];


    public Field(int sizeX, int sizeY, int mines) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.mines = mines;
        this.field = new int [sizeX][sizeY];
    }
}
