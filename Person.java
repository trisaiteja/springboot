package com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

@CopyRight
public class Person implements Externalizable {

	private int personId;

	private String personName;

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
		this.personId = objectInput.readInt();
		this.personName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeInt(personId);
		objectOutput.writeUTF(personName);
	}

}
