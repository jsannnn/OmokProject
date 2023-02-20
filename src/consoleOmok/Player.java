package consoleOmok;

public class Player {
    private String name;
    private int color;

    public Player(String name, int color){
        this.name = name;
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public int getColor(){
        return color;
    }
    public void setColor(int color){
        this.color = color;
    }
    public int[] makeMove(){
        return new int[0];
    }
}
