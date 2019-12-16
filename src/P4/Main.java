package P4;
import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Read in int
		int N=Integer.parseInt(in.readLine());
		//Create array of strings
		String[] lines=new String[N];
		//loop
		for (int x=0;x<N;x++) {
			//read string
			lines[x]=in.readLine();
			//call fold while greater than length 1
			while (lines[x].length()>1) {
				lines[x]=fold(lines[x]);
			}
		}
		//sort array
		Arrays.sort(lines);
		int pairCount=0;
		String current="";
		int count=0;
		//loop
		for (int x=0;x<N;x++) {
			//have current value
			//if new value == current value, add to pair count
			if (lines[x].equals(current)) {
				count++;
					pairCount++;
				
			}else {
			//if not, set current to new.
				current=lines[x];
				count=1;
			}
		}
		//print pair count
		System.out.println(pairCount);
	}
	public static String fold(String word) {
	//fold (String)
		String output="";
	//if length%2==1
		if (word.length()%2==1) {
			//add 'y'
			word+='y';
		}
	//loop from 0 to (length-1)/2
		for (int x=0;x<word.length()/2;x++) {
			//get value of x and length-x+1
			int total=(int)(word.charAt(x)-'a'+1)*(int)(word.charAt(word.length()-1-x)-'a'+1);
		//multiply, then %26, then +1
			while(total>26) {
				total-=26;
			}
		//turn back to letter, add to output
			char letter=(char)(total+'a'-1);
			output+=letter;
		}
	//return output
		return output;
	}
}
