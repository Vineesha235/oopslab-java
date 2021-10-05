//server code

import java.net.*;
import java.io.*;
class DatagramServer
{
   public static void main(String args[])throws Exception
    {
       byte buffer[]=new byte[1024];
       DatagramSocket ds=new DatagramSocket(790);
       DataInputStream obj=new DataInputStream(System.in);
       System.out.println(" Enter a message for client");
       InetAddress ia=InetAddress.getByName("localhost");
       while(true)
        {
         String str=obj.readLine();
         if ((str==null || str.equals("end")))
           break;
         buffer =str.getBytes();
         DatagramPacket dp=new DatagramPacket(buffer,str.length(),ia,789);
         ds.send(dp);
          }
      }
}

// client code
import java.net.*;
import java.io.*;
class DatagramClient
{
  public static void main(String args[])throws Exception
  {
    byte buffer[]=new byte[1024];
    DatagramSocket ds=new DatagramSocket(789);
    System.out.println(" Client: waiting for server data");
     while(true) 
      {
        DatagramPacket p=new DatagramPacket(buffer,buffer.length);
        ds.receive(p);
        String psx=new String(p.getData(),0,p.getLength());
        System.out.println(psx);
       }
   }
}