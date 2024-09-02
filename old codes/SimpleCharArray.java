public class SimpleCharArray
{
	public char[] CreateArray()
	{
		char[]s;
		s=new char[26];
		for(int i=0;i<26;i++)
		{
			s[i]=(char)('A'+i); //1st step :65 +0
		}
			return s;
	}
			public void printArray(char[]array)
			{
				System.out.print('<');
				for(int i=0;i<array.length;i++)
				{
					System.out.print(array[i]);
					if((i+1)<array.length)
					{	
						System.out.print(",");
					}
				}
				System.out.print('>');
			}
			public static void main(String[]args)
			{
				SimpleCharArray ob=new SimpleCharArray();
				// char[] characters=ob.CreateArray();
				// ob.printArray(characters);
				ob.printArray(ob.CreateArray());
			}
}