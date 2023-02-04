package Lms;

public class Exercise4 {
	public static void main(String[]args) {
		String name=args[0];
		String[] result=name.split(",");;
		String result1=result[0];
		int result2=Integer.parseInt(result[1]);
		boolean result3=Boolean.parseBoolean(result[2]);
		String result4=result[3];
		long result5=Long.parseLong(result[4]);
		System.out.println("Name: "+result1);
		System.out.println("RollNo: "+result2);
		System.out.println("IsMale: "+result3);
		System.out.println("MailId: "+result4);
		System.out.println("MobileNo: "+result5);
		}

}
