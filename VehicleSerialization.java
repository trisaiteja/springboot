package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@CopyRight
public class VehicleSerialization {

	public static final String OUTPUT_FILE = "Vehicle_Seriliazation.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Vehicle vehicleSerializationObj = new Vehicle(1, "Auto");

		// Serializing the Vehicle object
		FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(vehicleSerializationObj);

		// Close Resources
		objectOutputStream.close();
		fileOutputStream.close();

		// Deserializing the Vehicle object
		FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Vehicle vehicleDeserializationObj = (Vehicle) objectInputStream.readObject();

		// Close Resources
		objectInputStream.close();
		fileInputStream.close();

		// Get Vehicle data from Deserialized object
		System.out.println(vehicleDeserializationObj.toString());

	}

}
