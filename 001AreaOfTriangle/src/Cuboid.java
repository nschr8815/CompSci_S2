import javax.swing.JOptionPane;

public class Cuboid {

	
	private double width, height, depth, surfArea, volume;
	
	
	public void calcSurfArea() {
		
		
		width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the cuboid: "));
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the cuboid: "));
		depth = Double.parseDouble(JOptionPane.showInputDialog("Enter the depth of the cuboid: "));
		
		surfArea = 2 * ((height * width) + (height * depth) + (width * depth));
		JOptionPane.showMessageDialog(null, "The surface area of the cuboid = " + surfArea);
	
	} // end of calcSurfArea
	
	public void calcVol() {
		
		volume = height * width * depth;
		JOptionPane.showMessageDialog(null, "The volume of the cuboid = " + volume);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // end of main
