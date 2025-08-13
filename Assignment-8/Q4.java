//4. Get some strings through the command-line prompt and use an array to store and display them.
import java.util.*;

public class Q4{
	public static void main(String... args){
		List<String> words = new ArrayList<>();
		for(int i=0;i<args.length;i++){
			words.add(args[i]);
		}

		for(int i=0;i<words.size();i++){
			System.out.print(words.get(i)+" ");
		}
	}
}