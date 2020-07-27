package com.sist.lib;

/*
 * 	Date
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd / HH-mm-ss");
		System.out.println(sdf.format(today));

	}

}
