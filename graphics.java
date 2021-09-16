package graphics;
interface Graphics
{
	public float area(float x,float y);
}
class Square implements Graphics
{
	public float area(float x,float y)
	{
		return(x*x);
	}
}
class Rectangle implements Graphics
{
	public float area(float x,float y)
	{
		return(x*y);
	}
}
class Triangle implements Graphics
{
	public float area(float x,float y)
	{
		return((x*y)/2);
	}
}
class Circle implements Graphics
{
	public float area(float x,float y)
{
		return(3.14f*x*x);
	}
}
