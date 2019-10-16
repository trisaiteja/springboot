package com;

import java.io.Serializable;

@CopyRight
public class Resource implements Serializable {

	private static final long serialVersionUID = 1L;

	private int resourceId;

	private String resourceName;

	private String resourceDoj;

	Resource() {
	}

	Resource(int resourceId, String resourceName, String resourceDoj) {
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.resourceDoj = resourceDoj;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceDoj() {
		return resourceDoj;
	}

	public void setResourceDoj(String resourceDoj) {
		this.resourceDoj = resourceDoj;
	}

	@Override
	public String toString() {
		return "Resource [resourceId=" + resourceId + ", resourceName=" + resourceName + ", resourceDoj=" + resourceDoj
				+ "]";
	}

}
