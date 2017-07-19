package desafio;

import java.util.*;
import java.util.regex.*;
import javax.swing.*;

public class Tstring {		
	
	public static List<String> splitString(String msg, int tamanho){
		List<String> str = new ArrayList<>();
		Pattern p = Pattern.compile("\\b.{1," + (tamanho) + "}\\b\\W?");
		Matcher m = p.matcher(msg);
			
		while(m.find()) {
			System.out.println(m.group().trim());
			str.add(m.group());
		}
			return str;
	}	


	public static void main(String[] args) {
		String msg;
		int tamanho = 40;
			
		msg = JOptionPane.showInputDialog("Digite o texto: ");
			
		splitString(msg, tamanho);
		
	}
}