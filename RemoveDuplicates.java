package week2.day2;


// Take the String  to check 
//String text = "String text = "We learn java basics as part of java sessions in java week1";		
//Initialize an integer as count
//Split the string into an string array iterate it
//another loop for checking the string array is there in that loop 
//if its avaible increase the count by 1
//if the count >1 replace that with " "
//Print string with out duplicates

public class RemoveDuplicates {

	public static void main(String[] args) {
		String Chkstr = "We learn java basics as part of java sessions in java week1";

		int duplicateCount = 0;

		String[] splitchkstr = Chkstr.split(" ");

		for (int i = 0; i <= splitchkstr.length - 1; i++)
		{
			duplicateCount = 1;
			
			for (int j = i + 1; j <= splitchkstr.length - 1; j++) 
			{
				if (splitchkstr[i].equals(splitchkstr[j])) {
					duplicateCount = duplicateCount + 1;
					if (duplicateCount > 1)
						splitchkstr[j] = " ";
				}
				
			}
			if (splitchkstr[i].isEmpty())
				continue;
			else
				System.out.print(splitchkstr[i] + " ");


		}
	}

}
