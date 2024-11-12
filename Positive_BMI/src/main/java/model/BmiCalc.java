package model;

public class BmiCalc {

	public void execute(BmiBeans bb) {
		
		//BMI数値を算出
		
		double height = bb.getHeight();
		double weight = bb.getWeight();
		
		double bmi = weight /(height/100.0 *height /100.0);
		
		bb.setBmi(bmi);
		
		String bodyType;
		
		//BMIから体型の判定
		
		if (bmi <18.5) {
			bodyType ="痩せ型";
		} else if (bmi<25) {
			bodyType ="普通";
		} else {
			bodyType= "肥満";
		}
		
		bb.setBodyType(bodyType);
	}
}
