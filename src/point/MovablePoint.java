package point;

public class MovablePoint extends Point {
    private float sx = 5;
    private float sy = 5;
    public MovablePoint(){};
    public MovablePoint(float sx , float sy){
        this.sx = sx;
        this.sy = sy;
    }
    public MovablePoint(float x, float y, float sx, float sy){
        super(x, y);
        this.sx =sx;
        this.sy = sy;
    }

    public float getSx() {
        return sx;
    }

    public void setSx(float sx) {
        this.sx = sx;
    }

    public float getSy() {
        return sy;
    }

    public void setSy(float sy) {
        this.sy = sy;
    }
    public void move(){
        float a = super.getX() + this.getSx();
        float b = super.getY() + this.getSy();
        super.setXY(a,b);
    }

}
