package point;

public class Point {
    private float x = 5f;
    private float y = 5f;
    public Point(){};
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return " This point at (" + getX()+","+getY()+")";
    }
}
