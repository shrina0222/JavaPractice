package com.amazon.randomgenerator;

import java.util.Arrays;
import java.util.Random;

public class RandomNamePicker {

	public static void main (String[]args) {
		
		String[] names = new String[] {
				"shrina Patel", "deep Singh", "ahmed muj", "shakur", "chudimin", "sumid",
				"dishti sheth", "edson aguiar", "honorinicy", "kelly liu", "kinjan shah", 
				"lan ru", "lauran", "liujunyu", "Isy", "muhammed rabiuumar", "pwang",
				"prithviatani", "richard chow", "Sahil Sandhu", "Kabir rumie", "scott",
				"shahbaz mansahia", "siyuqqq", "Shanchun yang", "tao", "tony li",
				"tosaku", "Akshay trivedi", "chao li", "vananhtrg", "yan huang", "zhaosaitong" 
		};
		
		System.out.println(
				"Names:" + Arrays.toString(names));
		Random r = new Random();
		int a = r. nextInt(names.length);
		
		System.out.println(
				"Picked name: " +names[a]);
		
	}

}
