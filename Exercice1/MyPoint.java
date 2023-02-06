package Exercice1;

public class MyPoint {
    private int x;
    private int y;

    // le constructeur sans parametre
    public MyPoint() {
        super();
        x = 0;
        y = 0;
    }

    //le constructeur avec parametre
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //les getters et setters

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //getter et setters xy
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] result = new int[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) ;
    }

    public double distance(MyPoint given){
        return Math.sqrt(Math.pow(this.x - given.x, 2) + Math.pow(this.y - given.y, 2)) ;
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2)) ;
    }
}
