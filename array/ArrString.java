package array;

public class ArrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array created");
		String[] arr = new String[3];
		System.out.println("address of array is : "+arr);
		System.out.println("default value of array is : "+arr[0]);
		System.out.println();
		System.out.println("array value is assigned");
		
		arr[0] = "Hallo ";
		arr[1] = "To ";
		arr[2] = "Durgasankar ";
		
		System.out.println("value of arr2 is : "+arr[2]);
		System.out.println();
		
		System.out.println("instead of creating array and then allocating memory we can do all in one stop");
		
		String[] colors = {"red ","green ","blue ","cyan ","magenta ","yello "};
		System.out.println("if we do syso colors only we will get adrres of color array : "+colors);
		
		for (String color:colors)//all the values of colors are transfered to color
		{
			System.out.println(color);
		}
		System.out.println();
		
		System.out.println("values and refernces");
		int value = 0;
		String text = null;//default value
		System.out.println(text);
		
		
		System.out.println("anather string created texts");
		String[] texts = new String[2];
		texts[0]="one";
		System.out.println(texts[0]);
		
		
		
	}

}
