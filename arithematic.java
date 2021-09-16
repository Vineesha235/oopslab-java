package arithmetic;
interface Arithmetic
{
	public int Add(int a,int b);
	public int Sub(int a,int b);
	public int Multi(int a,int b);
	public int Div(int a,int b);
	
}
class TestPackage implements Arithmetic
{ 
	public int Add(int a,int b)
	{
		return(a+b);
	}
	public int Sub(int a,int b)
	{
	return(a-b);
	}
	public int Multi(int a,int b)
	{
        return(a*b);
	}
	public int Div(int a,int b)
	{
	return(a/b);
    }
}
