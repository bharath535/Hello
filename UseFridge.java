package Lms;

public class UseFridge {
	public static void main(String[]args) {
		
		String[] word1=args[0].split("@");
		
		Fridge fridge1=new Fridge();
		fridge1.brand=word1[0];
		fridge1.price=Integer.parseInt(word1[1]);
		fridge1.color=word1[2];
		fridge1.taxAmount=Integer.parseInt(word1[3]);
		fridge1.netPrice=fridge1.price+fridge1.taxAmount;
		
		String[] word2=args[1].split("@");
		Fridge fridge2=new Fridge();
		fridge2.brand=word2[0];
		fridge2.price=Integer.parseInt(word2[1]);
		fridge2.color=word2[2];
		fridge2.taxAmount=Integer.parseInt(word2[3]);
		fridge2.netPrice=fridge2.price+fridge2.taxAmount;
		
		System.out.println("Brand = "+fridge1.brand.toUpperCase()+" , "+fridge2.brand.toUpperCase()+" Color = "+fridge1.color.toLowerCase()+" , "+fridge2.color.toLowerCase()+" NetPrice = "+fridge1.netPrice+" , "+fridge2.netPrice);
		
	}

}
