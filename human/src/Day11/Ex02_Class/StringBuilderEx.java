package Day11.Ex02_Class;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sd = new StringBuilder();
		
		sd.append("휴먼 ");
		sd.append("교육센터 ");
		System.out.println(sd.toString());
		
		sd.insert(7, "학원");
		System.out.println(sd.toString());
		
		sd.setCharAt(0, 'H');
		System.out.println(sd.toString());
		
		sd.replace(1, 3, "uman ");
		System.out.println(sd.toString());
		
		sd.delete(0, 6);
		System.out.println(sd.toString());
		
		int length = sd.length();
		System.out.println("글자수 : " + length);
	}
}
