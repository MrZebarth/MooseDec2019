package P3;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int mineWords=0, craftWords=0, nonWords=0, minePos=-1, craftPos=-1;
		boolean lineCheck=true;
		int N=Integer.parseInt(in.readLine());
		for (int x=0;x<N;x++) {
			//read line
			String input=in.readLine();
			String[] words=input.split(" ");
			minePos=-1;
			craftPos=-1;
			for (int y=0;y<words.length;y++) {
				if (words[y].equals("mine")) {
					mineWords++;
					if (minePos==-1) {
						minePos=y;
					}
				}else if (words[y].contentEquals("craft")) {
					craftWords++;
					if (craftPos==-1) {
						craftPos=y;
					}
				}else {
					nonWords++;
				}
			}
			if (minePos>craftPos || minePos==-1 || craftPos==-1) {
				lineCheck=false;
			}
		}
		if (mineWords<nonWords) {
			lineCheck=false;
		}
		if (lineCheck) {
			System.out.println("PROFIT");
		}else {
			System.out.println("cri");
		}
	}

}
