package com;

import java.io.Serializable;

@CopyRight
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;

	private int vehicleTypeId;

	private String vehicleType;

	public Vehicle(int vehicleTypeId, String vehicleType) {
		super();
		this.vehicleTypeId = vehicleTypeId;
		this.vehicleType = vehicleType;
	}

	public int getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(int vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleTypeId=" + vehicleTypeId + ", vehicleType=" + vehicleType + "]";
	}

}
