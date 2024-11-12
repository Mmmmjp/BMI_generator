package model;

import java.io.Serializable;

public class BmiBeans implements Serializable{

	private String name;
	private double height,weight,bmi;
	private String bodyType;
	
	//Name 
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	//height 
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height =height;
	}
	
	//Weight 
	
	public double getWeight () {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//BMI 
	
	public double getBmi() {
		return this.bmi;
	}
	
	public void setBmi(double bmi) {
		this.bmi =bmi;
	}
	
	//BodyType 
	
	public String getBodyType() {
		return this.bodyType;
	}
	
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
}
