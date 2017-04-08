package com.jk.jdk.j2se.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesTest {
	public static void main(String[] args) throws Exception {
		//Files.lines(Paths.get(".project")).forEach(System.out::println);

		System.out.println(readFileAsString(".project"));
	}

	public static String readFileAsString(String fileName) {
		String data = "";
		try {
			data = new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

}
