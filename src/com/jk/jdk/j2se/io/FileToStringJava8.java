package com.jk.jdk.j2se.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileToStringJava8 {
	private static BufferedReader buf;

	public static void main(String[] args) throws Exception {
		String fileName = ".project";
		
		// How to read file into String before Java 7
		InputStream is = new FileInputStream(fileName);
		buf = new BufferedReader(new InputStreamReader(is));
		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		while (line != null) {
			sb.append(line).append("\n");
			line = buf.readLine();
		}
		buf.close();
		
		String fileAsString = sb.toString();
		System.out.println("Contents (before Java 7) : " + fileAsString);

		// Reading file into Stirng in one line in JDK 7
		String contents = new String(Files.readAllBytes(Paths.get(fileName)));
		System.out.println("Contents (Java 7) : " + contents);

		// Reading file into String using proper character encoding
		String fileString = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
		System.out.println("Contents (Java 7 with character encoding ) : " + fileString);

		// It's even easier in Java 8
		Files.lines(Paths.get(fileName), StandardCharsets.UTF_8).forEach(System.out::println);

	}

}
