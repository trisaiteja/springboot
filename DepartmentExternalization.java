package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@CopyRight
public class DepartmentExternalization {

	public static final String OUTPUT_FILE = "Department.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Department departmentExternalizationObj = new Department(1, "Software Development");

		// Serializing the Employee Object
		FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		departmentExternalizationObj.writeExternal(objectOutputStream);

		// Close resources
		objectOutputStream.flush();
		fileOutputStream.close();

		// Deserializing the Employee Object
		FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		departmentExternalizationObj.readExternal(objectInputStream);

		// Close resources
		objectInputStream.close();
		fileInputStream.close();

		System.out.println(departmentExternalizationObj.toString());
	}
}
