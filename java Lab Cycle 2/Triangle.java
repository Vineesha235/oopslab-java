package graphics;

public class Triangle implements Graphics{

    @Override
    public float area(float x, float y){
        return ((x *y)/2);
    }
}
