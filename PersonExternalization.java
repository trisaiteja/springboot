package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@CopyRight
public class PersonExternalization {

	public static final String OUTPUT_FILE = "Person_Externalization.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person personExternalizationObj = new Person(1, "Trisaiteja");

		// Person Externalization
		FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		personExternalizationObj.writeExternal(objectOutputStream);

		// Close Resources
		objectOutputStream.close();
		fileOutputStream.close();

		// Person Deserialization
		FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		personExternalizationObj.readExternal(objectInputStream);

		// Close Resources
		objectInputStream.close();
		fileInputStream.close();

		System.out.println(personExternalizationObj.toString());
	}
}
