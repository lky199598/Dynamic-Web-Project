package cifa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CiFa2 {
	
	private List<String> list = new ArrayList<String>();  
	private char ch;
	private String str;
	private int index = 0;

	private Map<Integer, String> keyValue;
  
    
    
	public CiFa2() {
		keyValue = new HashMap<Integer, String>();
		keyValue.put(1, "Program");
		keyValue.put(2, "begin");
		keyValue.put(3, "end");
		keyValue.put(4, "var");
		keyValue.put(5, "int");

		keyValue.put(6, "and");
		keyValue.put(7, "or");
		keyValue.put(8, "not");
		keyValue.put(9, "if");
		keyValue.put(10, "then");
		keyValue.put(11, "else");
		keyValue.put(12, "while");
		keyValue.put(13, "do");

		keyValue.put(16, "+");
		keyValue.put(17, "*");
		keyValue.put(18, "(");
		keyValue.put(19, ")");
		keyValue.put(20, ",");

		keyValue.put(21, ";");
		keyValue.put(22, ":=");
		keyValue.put(23, ">");
		keyValue.put(24, ">=");
		keyValue.put(25, "<");

		keyValue.put(26, "<=");
		keyValue.put(27, ".");
		keyValue.put(28, "<>");
		keyValue.put(29, "=");

	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public char getCharacter(char[] array) {

		while (index < array.length && array[index] == ' ') {
			index++;
		}
		index++;// 提前指向下一个字符
		if (index > array.length)
			return ' ';
		return array[index - 1];
	}

	public char getNextCharacter(char[] strChar) {
		index++;
		if(index > strChar.length)
			return '\0';
		return strChar[index - 1];
	}

	public String contactCharacter(String str, char ch) {
		return str + String.valueOf(ch);
	}

	public int findKeyword(String str) {
		for (int i = 1; i <= 13; i++) {
			if (str.equalsIgnoreCase(keyValue.get(i)))
				return i;
		}

		for (int i = 16; i <= 29; i++) {
			if (str.equalsIgnoreCase(keyValue.get(i)))
				return i;
		}
		return 0;
	}

	public boolean analyse(char[] strArray)
	{
		index = 0;
		char temp1;

		while (index < strArray.length)
		{
			str = "";
			ch = getCharacter(strArray);

			int n = findKeyword(String.valueOf(ch));

			if (ch == '+')
			{
				System.out.println("(" + n + ", +)");
				list.add("(" + n + ", +)");				
			}

			else if (ch == '*')
			{
				System.out.println("(" + n + ", *)");
				list.add("(" + n + ", *)");
			}

			else if (ch == '(')
			{
				System.out.println("(" + n + ", ()");
				list.add("(" + n + ", ()");
			}
			
			else if (ch == ')')
			{
				System.out.println("(" + n + ", ))");
				list.add("(" + n + ", ))");
			}
			
			else if (ch == ',')
			{
				System.out.println("(" + n + ", ,)");
				list.add("(" + n + ", ,)");
			}
			
			else if (ch == '.')
			{
				System.out.println("(" + n + ", .)");
				list.add("(" + n + ", .)");
			}
			
			else if (ch == ';')
			{
				System.out.println("(" + n + ", ;)");
				list.add("(" + n + ", ;)");
			}
			
			else if (ch == '=')
			{
				System.out.println("(" + n + ", =)");
				list.add("(" + n + ", =)");
			}
			
			else if (ch == ':') {
				if ((temp1 = this.getNextCharacter(strArray)) == '=') {
					System.out.println("(" + findKeyword(":=") + ", :=)");
					list.add("(" + findKeyword(":=") + ", :=)");
				} 
			}
			
			
			else if (ch == '>') {
				if ((temp1 = this.getNextCharacter(strArray)) == '=') 
				{
					System.out.println("(" + findKeyword(">=") + ", >=)");
					list.add("(" + findKeyword(">=") + ", >=)");
				}
				
				else {
					index--;
					System.out.println("(" + findKeyword(">") + ", >)");
					list.add("(" + findKeyword(">") + ", >)");
				}
			}

			else if (ch == '<') {
				if ((temp1 = getNextCharacter(strArray)) == '=')
				{
					System.out.println("(" + findKeyword("<=") + ", <=)");
					list.add("(" + findKeyword("<=") + ", <=)");
				}

				else if (temp1 == '>')
				{
					System.out.println("(" + findKeyword("<>") + ", <>)");
					list.add("(" + findKeyword("<>") + ", <>)");
				}
				
				else {
					index--;
					System.out.println("(" + findKeyword("<") + ", < )");
					list.add("(" + findKeyword("<") + ", < )");
				}
			}

			else if (Character.isLetter(ch)) {
				str = contactCharacter(str, ch);

				if (index == strArray.length)
					break;
				ch = getNextCharacter(strArray);
				// 如果字符为字母，则返回 true；否则返回 false
				// 确定指定字符是否为数字
				while (((Character.isLetter(ch)) || (Character.isDigit(ch))))
				{
					str = contactCharacter(str, ch);
					ch = getNextCharacter(strArray);
				}

				index--;

				if (findKeyword(str) != 0) {

					System.out.println("(" + findKeyword(str) + ", "
							+ str + ")");
					list.add("(" + findKeyword(str) + ", "
							+ str + ")");
				}

				else
				{
					System.out.println("(14, " + str + ")");
					list.add("(14, " + str + ")");
				}

			}

			else if (Character.isDigit(ch)) {
				str = contactCharacter(str, ch);

				ch = getNextCharacter(strArray);
				while ( Character.isDigit(ch)) {
					str = contactCharacter(str, ch);
					ch = getNextCharacter(strArray);
				}

				index--;
				System.out.println("(15, " + str + ")");
				list.add("(15, " + str + ")");
				str = "";
			}
		}

		return true;
	}

	
	public static void main(String args[]) {
		File file1 = new File("F:\\input.txt");
		File file2 = new File("F:\\output.txt");
		CiFa2 c = new CiFa2();

		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			// System.out.println("以行为单位读取文件内容，一次读一整行：");
			reader = new BufferedReader(new FileReader(file1));
			
			writer = new BufferedWriter(new FileWriter(file2));
			String tempString = null;

			while ((tempString = reader.readLine()) != null) 
			{
				char[] strChar = new char[100];// 限制每行代码字符数不超过100
				strChar = tempString.toCharArray();

			   c.analyse(strChar);
			}
			
			for(String s:c.getList())
			{
				writer.write(s);
				writer.newLine();
			}				
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}