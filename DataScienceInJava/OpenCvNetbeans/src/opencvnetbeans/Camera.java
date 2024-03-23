package opencvnetbeans;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class Camera extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JLabel cameraScreen;
	private JButton btnCapture;
	private VideoCapture capture;
	private Mat image;
	private boolean isClicked=false;
	
	public Camera()
	{
		setLayout(null);
		cameraScreen=new JLabel();
		cameraScreen.setBounds(0, 0, 640, 480);
		add(cameraScreen);
		btnCapture=new JButton("Capture");
		btnCapture.setBounds(300, 380, 80, 40);
		add(btnCapture);
		
		btnCapture.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				isClicked=true;
			}
		});
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				capture.release();
				image.release();
				System.exit(0);
			}
		});
		
		setSize(new Dimension(500, 500));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	public void  startCamera()
	{
		capture=new VideoCapture(0);
		image=new Mat();
		byte[] imageData;
		ImageIcon icon;
		
		while(true)
		{
			capture.read(image);
			final MatOfByte buffer=new MatOfByte();
			Imgcodecs.imencode(".jpg", image,buffer);
			imageData=buffer.toArray();
			icon=new ImageIcon(imageData);
			cameraScreen.setIcon(icon);
			if (isClicked) {
				String name=JOptionPane.showInputDialog(this,"Enter image name ");
				if(name==null)
				{
					name=new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss").format(new Date());
				}
				Imgcodecs.imwrite("images/"+name+".jpg",image);
				isClicked=false;
			}
		}
	}
}
