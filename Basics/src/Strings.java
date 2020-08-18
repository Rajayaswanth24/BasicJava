import java.awt.List;
import java.util.ArrayList;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1=4;
		int input2=2;
		
		int[] ch;
		int value=input1;
		for(int i=2;i<=input2;i++){
			value=value*input1;
			System.out.println("value - "+value);
	

		}
		ch = Integer.toString(value).chars().map(c -> c-'0').toArray();  
		
		System.out.println("chararray length - "+ch.length);
		System.out.println(ch[ch.length-1]);
	

		
		
		
		
		
		
		
		
		
		
		
		/*  String str="raja123";
		   StringBuffer sb=new StringBuffer();
		   sb.append(str);
		   System.out.println(sb);
		   String[] sa=new String[10];
		   sa[0]="r2aja";
		   System.out.println(sa[0]);
		   char[] ch=new char[5];
		   ch[0]='r';
		   ch[4]='4';
		   System.out.println(ch);
		   String ch2="1";
		   System.out.println(ch2);
		   String str2="m3y nam4e i1s ra2ja";
		   System.out.println(str2.replace("//s", ""));
		   char str3=' ';
		   ArrayList list=new ArrayList<String>();
		   int j=0;
		
		   for(int i=0;i<str2.length();i++) {
			   
			   int comp=Character.compare(str3, str2.charAt(i));
			   if(comp==0) {
				   
				   list.add(str2.substring(j, i));
				   j=i;
			   }
			   if(i==str2.length()-1) {
				   list.add(str2.substring(j));
			   }
			   
					   }
		   
		   System.out.println(list);*/
		   
		   
	}

}
