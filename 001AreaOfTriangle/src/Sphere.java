import javax.swing.JOptionPane;

public class Sphere {

	private double radius, surfArea, volume;
	
	
	public void calcSurfArea() {
		
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the sphere: "));
		surfArea = 4 * Math.PI * Math.pow(radius, 2.0);
		JOptionPane.showMessageDialog(null, "The surface area of the sphere = " + surfArea);
		
	} // end of calcSurfArea
	
	public void calcVolume() {
		
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3.0);
		JOptionPane.showMessageDialog(null,"The volume of the sphere = " + volume);
		
		
		
	} // end of calcVolume
	
	
	
	
	
	
	
	
	
	
	
	
} // end of main
