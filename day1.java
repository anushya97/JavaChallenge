package Java_dailyhomework;

import java.util.Scanner;

public class day1 {

public static void main(String[] args) {
	

Scanner sc = new Scanner(System.in);
String s = sc.nextLine();

System.out.println("Enter a sentence: "+s);
int g=s.length();

System.out.println("length of the sentence is : "+g);

String o = s.trim();

System.out.println("Enter a sentence: "+o);

int i=s.length();


System.out.println("length of the sentence after trimming is : "+i);

String h = o.substring(o.lastIndexOf(" ")+1);

System.out.println(h);

int l =h.length();

char c[] = h.toCharArray(); 

System.out.println("The last word is "+h+" with length "+l);


}
}