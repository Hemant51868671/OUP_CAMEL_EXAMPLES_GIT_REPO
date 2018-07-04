package com.javaoutofbounds.pojo;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="studentxml")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentXml implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6709279853947990076L;
	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "address")
	private String address;

	public StudentXml() {

	}

	public StudentXml(final int id, final String name, final String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "StudentXml [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
