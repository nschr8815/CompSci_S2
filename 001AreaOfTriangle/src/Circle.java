import javax.swing.JOptionPane;
//This is an edit to test git
public class Circle {


	private double radius, area, circum; 
	//int option = new String("");

	public void calcArea() {
	/*while(repeat == 1) {
		option = JOptionPane.showConfirmDialog(null, "Do you want to input radius or diameter?", "Choose", JOptionPane.YES_NO_OPTION);
	    toString(option);
	    if (option == "Radius" || option == "radius") {
	    	radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle: "));
	    	area = Math.PI * Math.pow(radius, 2.0);
	    } else if (option == "Diameter" || option == "diameter") {
		    diameter = Double.parseDouble(JOptionPane.showInputDialog("Enter the diameter of the circle: "));
		    radius = diameter / 2;
		    area = Math.PI * Math.pow(radius, 2.0);
		*/    
		    
		    
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle: "));
	    area = Math.PI * Math.pow(radius, 2.0);
		JOptionPane.showMessageDialog(null, "The area of the circle is " + area);
	
	} // end of calcArea


	public void calcCircum() {
	
	circum = 2 * Math.PI * radius;
	JOptionPane.showMessageDialog(null, "The circumference of the circle is " + circum);

	} // end of calcCircum




} // end of main
