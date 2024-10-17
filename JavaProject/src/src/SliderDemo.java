package src;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
	
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	SliderDemo(){
		
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100);
		slider.addChangeListener(this);
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(25);
		slider.setSnapToTicks(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("degrees celcius: "+slider.getValue());
		
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		label.setText("degrees celcius: "+slider.getValue());
		
	}

}
