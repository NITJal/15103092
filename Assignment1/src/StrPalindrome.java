import java.util.*;
public class StrPalindrome {

	public static void main(String []args)
	{
		 String str;
		    int i,length;
		    int flag = 0;
		    
		    System.out.println("Enter a string:");
		    Scanner s=new Scanner(System.in);		    
		    str=s.next();
		    char arr[]=str.toCharArray();
		    length=arr.length;
		    
		    for(i=0;i < length ;i++){
		        if(arr[i] != arr[length-i-1]){
		            flag = 1;
		            break;
			   }
			}
		    
		    if (flag==1) {
		       System.out.println(str+" is not a palindrome");
		    }    
		    else {
			       System.out.println(str+" is a palindrome");
		    }
	}
}
