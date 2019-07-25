import java.io.*;
public class Extension
{
 public static void main(String Args[])throws IOException
 {
  Extension ob=new Extension();
  ob.input();
 }
 public void input()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter full path");
  String Fpath=br.readLine();
  String path="",name="",ext="";
  int last_slash=Fpath.lastIndexOf('\\');
  int dot=Fpath.lastIndexOf('.');
  path=Fpath.substring(0,last_slash);
  name=Fpath.substring(last_slash+1,dot);
  ext=Fpath.substring(dot);

  System.out.println("Path="+path+"\nName="+name+"\nExtension="+ext );

 }
}