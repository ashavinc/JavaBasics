
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="Welcome to Java programming";
char [] ch=str.toCharArray();
String str2=" ";
for(int i=0;i<ch.length;i++)
{
	if(ch[i]!=' ')
	{
		str2=str2+ch[i];
	}
}
System.out.println(str2);
	}

}
