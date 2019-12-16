package P2;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		String[][] scores=new String[N][6];
		for (int x=0;x<scores.length;x++) {
			scores[x]=in.readLine().split(" ");
		}
		int[] totals=new int[N];
		for (int x=0;x<totals.length;x++) {
			totals[x]=getScore(scores[x]);
		}
		String p1="", p2="";
		int first=0,second=0;
		for (int x=0;x<totals.length;x++) {
			if (totals[x]>first) {
				second=first;
				p2=p1;
				first=totals[x];
				p1=scores[x][0];
			}else if (totals[x]==first) {
				if (scores[x][0].compareTo(p1)<0) {
					second=first;
					p2=p1;
					p1=scores[x][0];
					first=totals[x];
				}else {
					second=totals[x];
					p2=scores[x][0];
				}
			}else if (totals[x]>second) {
				second=totals[x];
				p2=scores[x][0];
			}else if (totals[x]==second) {
				if (scores[x][0].compareTo(p2)<0) {
					second=totals[x];
					p2=scores[x][0];
				}
			}
		}
		System.out.println(p1+" "+first+"\n"+p2+" "+second);
		
	}
	
	public static int getScore(String[] nums) {
		int total=0;
		for (int x=1;x<nums.length;x++) {
			total+=Integer.parseInt(nums[x]);
		}
		return total;
	}

}
