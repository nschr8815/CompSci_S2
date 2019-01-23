import javax.swing.JOptionPane;

public class Rectangle {
		

	private double base, height;
	private double perimeter;
	private double area, diagonal;


	public void calcRectArea() {

	base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the rectangle"));
	height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the rectangle"));
	area = base * height;
	JOptionPane.showMessageDialog(null, "The area of the rectangle is " + area);



	} // end of calcRectArea

	public void calcRectPeri() {
	
		perimeter = (base * 2) + (height * 2);
		JOptionPane.showMessageDialog(null, "The perimeter of the rectangle is " + perimeter);

	} // end of calcRectPeri

	public void calcDiagonal() {
	
		diagonal = Math.sqrt((Math.pow(base, 2.0) + Math.pow(height, 2.0)));
		JOptionPane.showMessageDialog(null, "The diagonal of the rectangle is " + diagonal);

	} // end of calcDiagonal




	//end of main
}
