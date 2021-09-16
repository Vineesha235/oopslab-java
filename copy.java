import java.io.*;

public class CopyFile
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		int i;
		File f1=new File("D:\\JAVA\\labcycle 2\\qtn12\\file1.txt");
		File f2=new File("D:\\JAVA\\labcycle 2\\qtn12\\file2.txt");
		FileInputStream in=new FileInputStream(f1);
		FileOutputStream op=new FileOutputStream(f2);
		do 
		{
			i=in.read();
			if(i!=-1)
			op.write(i);
		  }
        while(i!=-1);
        in.close();
		op.close();
	}
}