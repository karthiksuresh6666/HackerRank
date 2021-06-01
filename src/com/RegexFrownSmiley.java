package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Karthik Suresh
 *
 */
public class RegexFrownSmiley {

	public static void main(String[] args) {
		int count = 0;
		String str = "Hello :-) >;-{ :-( :{ :@ :-{ 8-< hey ya";
		Pattern p = Pattern.compile("\\>?[\\:\\;8]-?[\\{\\(\\c\\@\\<]");
		Matcher m = p.matcher(str);
		while (m.find()) {
			count++;
		}
		System.out.println(count);
	}

}
