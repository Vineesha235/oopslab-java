package graphics;

public class Circle implements Graphics{

    @Override
    public float area(float x, float y){
        return (3.14f * x * x);
    }
}