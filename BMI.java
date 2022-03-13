import java.awt.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
class AWTCalculator implements ActionListener,WindowListener
{

	TextField Height;
	TextField Weight;
	 TextField BmiIndex;
	 JFrame f;
	public void ActionCalc() {
		f=new JFrame();
		JButton bt=new JButton("Calculate");
		Height=new TextField();
		Weight=new TextField();
		BmiIndex=new TextField();
        Label w=new Label("Weight:");
        Label h=new Label("Height:");

        Height.setText("Enter in cm");
        Weight.setText("Enter in kg");
        w.setBounds(50,80,80,10);
        h.setBounds(50,50,80,20);
        Height.setBounds(100,50,100,20);
		Weight.setBounds(100,80,100,20);
	  BmiIndex.setBounds(100,110,100,20); 
	 bt.setBounds(10,20,10,10);
        f.add(Height);
        f.add(Weight);
         f.add(BmiIndex);
         f.add(w);
        f.add(h);
        f.add(bt);
       
        
        
         bt.addActionListener(this);
         f.addWindowListener(this);
        
        f.setSize(400, 400);        //setting size.  
        f.setTitle("BMI CALCULATOR");  //setting title.  
          //set default layout for frame.  
        f.setVisible(true);           //set frame visibility true.
	       String s=w.getText();
	       String s1=h.getText();
	       f.setLayout(null);

	}
	public void actionPerformed(ActionEvent e) 
	{
		   DecimalFormat df = new DecimalFormat("#.##");
		try{
		 String s=Weight.getText();
	       String s1=Height.getText();
        float a1=Float.parseFloat(s);
        
        float b1=Float.parseFloat(s1);
        String s3=df.format(a1/(b1*b1));

       
        BmiIndex.setText("BMI Index="+s3);
    }
    catch(Exception w)
    {
    	System.out.println("EXCEPTION OCCURED.PLEASE TRY AGAIN");
    }
	}
	public void windowClosing (WindowEvent e) {    
    f.dispose();    
}    
public void windowActivated(WindowEvent e) {}    
public void windowClosed(WindowEvent e) {}    
public void windowDeactivated(WindowEvent e) {}    
public void windowDeiconified(WindowEvent e) {}    
public void windowIconified(WindowEvent e) {}    
public void windowOpened(WindowEvent arg0) {}    

}

	public class BMI
	{
	public static void main(String[] args) {
		AWTCalculator a1=new AWTCalculator();
		a1.ActionCalc();
	
	}
}
