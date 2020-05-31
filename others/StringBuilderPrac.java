package others;

public class StringBuilderPrac {
	
	public static void main(String[] args) {
		//Inefficient
		String info = " ";//empty string
		info += "My name is Bob.";
		info += " ";
		info += "I am a Builder.";
		
		System.out.println(info);
		
		//more efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("My Name is Raja.");
		sb.append(" ");
		sb.append("I am a Student.");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My Name is Rager.");
		s.append(" ");
		s.append("I am a SkyDiver");
		System.out.println(s.toString());
		System.out.println();
		
		//////////Formatting//////////
		System.out.print("Here is some text.\tThat is a tab.\nThat is a next line.\nOne more line.");
		System.out.println("more lines.");
		System.out.println();
		
		System.out.printf("Total cost : %d\nTotal quantity : %d",100,50);
		System.out.println();
		System.out.printf("Total cost : %d\nTotal quantity : %d",100,50);

		
		for(int i=0;i<+10;i++)
		{
			System.out.printf("%3d : some text here\n ",i);
		}
	}

}
