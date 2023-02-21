package consoleOmok;

public class omokGame {
    private static Board board;
    private int player;
    public omokGame(){
        this.player = player;
        this.board = board;
    }
    public static void main(String[] args){
        board = new Board(15);
        board.design();
    }
}
