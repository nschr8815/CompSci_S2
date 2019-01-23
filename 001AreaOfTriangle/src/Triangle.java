import javax.swing.JOptionPane;

public class Triangle {
	
	// class variable go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	/*
	 * constructor goes here constructor is where the class begins
	 */
	public Triangle() {

		setVarsToZero();
	}

	// methods go here
	
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
	
	} // end of setVarsToZero

	public void showVars() {
		
		String msg = 
				"Perimeter = " + perimeter 
				+ "   Area = " + theArea;
		
		JOptionPane.showMessageDialog(null, msg);

	} // end of showVars

	public void setSides() {
		
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A: "));
	
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B: "));

		sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side C: "));

	} // end of setSides

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
		

	} // end of calcPerimeter

	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC) / 2.0;

		theArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		
	} // end of calcArea

	public void calcAngles() {
		
		double cosA = 0.0, acos = 0.0, aDeg = 0.0, bDeg = 0.0, cDeg = 0.0, cosB = 0.0, bcos = 0.0, cosC = 0.0, ccos = 0.0;

		cosA = (Math.pow(sideC, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideA, 2.0))/
			    (2.0 * sideC * sideB);
		
		acos = Math.acos(cosA);
		
		aDeg = Math.toDegrees(acos);
		
		
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0))/
			    (2.0 * sideC * sideA);
		bcos = Math.acos(cosB);
		bDeg = Math.toDegrees(bcos);
		
		
		cosC = (Math.pow(sideB, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideC, 2.0))/
			    (2.0 * sideB * sideA);
		ccos = Math.acos(cosC);
		cDeg = Math.toDegrees(ccos);
		JOptionPane.showMessageDialog(null, "Angle A, B, C = " + aDeg + ", " + bDeg + ", " + cDeg);
		
	} // end of calcAngles

	public void showVarsAngles() {

	} // end of showVarsAngles

} // end of class g
