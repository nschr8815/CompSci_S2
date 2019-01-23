import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Runner {

	/*
	 * Circle: input r, calculate circumference, area-----------------Done
	 * Rectangle: input side a, b, calc perimeter, area and diagonal--Done
	 * Triangle: Input sides a b c, calc perimeter, area, all angles--Done
	 * Cuboid: input sides a b c, calc volume, total surface area-----Done
	 * Sphere: Input radius, calc volume, and surface area
	 * 
	 * 
	 */

	
		
	
	
	public static void main(String[] args) {

		
		
		// Instantiate each class
		Triangle myTriangle = new Triangle();
		Rectangle myRectangle = new Rectangle();
		Circle myCircle = new Circle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		JOptionPane.showMessageDialog(null,"Welcome to my object calculator! Designed by Nicholas Schroeder");
		int goAgain = 1;
		int restart = 1;
		
		while(restart == 1) {
		while(goAgain == 1) {
		String msg = "Would you like to solve for a Rectangle, Circle, Triangle, Cuboid or Sphere : Please enter your selection";
		String answer = JOptionPane.showInputDialog(msg);
		//When comparing strings, ==, is unreliable - don't use, instead us String class methods
		if ((answer.equals("Triangle")) || (answer.equals("triangle"))) {
			JOptionPane.showMessageDialog(null, "Triangle!");
			myTriangle.setVarsToZero();
			myTriangle.setSides();
			myTriangle.calcPerimeter();
			myTriangle.calcArea();
			myTriangle.calcAngles();
			myTriangle.showVars();
			myTriangle.showVarsAngles();
			goAgain = 0;
		} 
		else if ((answer.equals("Rectangle")) || (answer.equals("rectangle"))){
			JOptionPane.showMessageDialog(null, "Rectangle!");
			myRectangle.calcRectArea();
			myRectangle.calcRectPeri();
			myRectangle.calcDiagonal();
			goAgain = 0;
			
		} 
		else if ((answer.equals("Circle")) || (answer.equals("circle"))){
			JOptionPane.showMessageDialog(null, "Circle!");
			myCircle.calcArea();
			myCircle.calcCircum();
			goAgain = 0;
		}
		else if ((answer.equals("Cuboid")) || (answer.equals("cuboid"))) {
			myCuboid.calcSurfArea();
			myCuboid.calcVol();
			goAgain = 0;
		}
		else if ((answer.equals("Sphere")) || (answer.equals("sphere"))) {
			mySphere.calcSurfArea();
			mySphere.calcVolume();
			goAgain = 0;
		}
		else {
			String YesNo = "Do you want to re-input your selection?: Input Y/N";
			String yesAnswer = JOptionPane.showInputDialog(YesNo);
			if (yesAnswer.equals("Y") || (yesAnswer.equals("y"))){
				goAgain = 1;
			}
			else {
				goAgain = 0;
			}
		}
		}
		JOptionPane.showConfirmDialog(null, "Would you like to calculate another shape?");
		
		}
		
	}
}
