package consoleOmok;

public class Board {
    //Declare variables used to create our board
    private char[][] board;
    private int size;
    public Board(int size){
        this.size = size;
        this.board = new char[size][size];
        for(int i = 0;i < size; i++){
            for(int j = 0;j < size; j++){
                board[i][j] = '.';
            }
        }
    }
    public void design(){
        System.out.print(" x ");
        //Print out values of x column
        for(int i = 0;i < size; i++){
            if(i <= 9) {
                System.out.print(i + " ");
            }
            if(i > 9){
                System.out.print((char)(i + 'A' - 1) + " ");
                System.out.println("Hello");
            }
        }
        //print out values of y columns along with the dot markers
        System.out.println();
        System.out.println("y -------------------------------");
        for(int i = 0; i < size; i++){
            if(i <= 9) {
                System.out.print(i + "| ");
            }
            if(i > 9){
                System.out.print((char)(i + 'A' - 1) + "| ");
            }
            for(int j = 0; j < size; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void display(){
        Board board = new Board(15);
        board.design();
    }

}
