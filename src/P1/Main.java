package P1;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] values=in.readLine().split(" ");
		long[] v= {Long.parseLong(values[0]),Long.parseLong(values[1])};
		int degrees=Integer.parseInt(in.readLine());
		switch(degrees) {
		case 0:
			System.out.println(v[0]+" "+v[1]);
			break;
		case 90:
			System.out.println(-v[1]+" "+(v[0]));
			break;
		
		case 180:
			System.out.println((-1*v[0])+" "+(-1*v[1]));
			break;
			
		case 270:
			System.out.println((v[1])+" "+(-1*v[0]));
			break;
		}

	}

}
