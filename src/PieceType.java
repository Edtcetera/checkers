/**
 * Created by Edward on 8/25/2016.
 */
public enum PieceType {
    RED(1), WHITE(-1);

    final int moveDir;

    PieceType(int moveDir){
        this.moveDir = moveDir;
    }
}
