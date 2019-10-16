package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@CopyRight
public class EmployeeSerialization {

	public static final String OUTPUT_FILE = "Employee.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee employeeSerializationObj = new Employee(51774026, "Trisaiteja", "Narina", "9962040345", "Chennai");

		// Serializing the Employee Object
		FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employeeSerializationObj);

		// Close resources
		objectOutputStream.flush();
		fileOutputStream.close();

		// Deserializing the Employee Object
		FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Employee employeeDeserializationObj = (Employee) objectInputStream.readObject();

		// Close resources
		objectInputStream.close();
		fileInputStream.close();

		System.out.println(employeeDeserializationObj.toString());

	}
}
