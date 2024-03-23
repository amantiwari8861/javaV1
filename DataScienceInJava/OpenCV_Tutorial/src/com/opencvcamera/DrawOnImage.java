package com.opencvcamera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.Point;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class DrawOnImage extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JLabel imageView;
	
	private Mat image;
	private Mat tempImage;
	private byte[] imageData;
	private Point origin;
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem saveMenu;
	public DrawOnImage() {
		setLayout(null);
		image = Imgcodecs.imread("images/faces2.jpg");
		viewSetup();
		
		loadImage(image);
		imageView.addMouseListener(new MouseAdapter() {
 
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				origin = new Point(e.getX(), e.getY());
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				image = tempImage.clone();
			}
			
		});
		
		imageView.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				tempImage = image.clone();
				final Point point = new Point(e.getX(),e.getY());
				
//				Imgproc.rectang
				
//				Imgproc.rectangle(tempImage, origin, point, new Scalar(0, 0, 255), 5);
				
//				Imgproc.line(tempImage, origin, point, new Scalar(0,255,0), 2);
//				
				double distance = Math.sqrt(Math.pow((point.x-origin.x),2) + Math.pow(point.y-origin.y,2));
				
//				Imgproc.circle(tempImage, origin, (int) distance, new Scalar(255,0,0),5);
				
				double x = Math.abs(point.x - origin.x);
				double y = Math.abs(point.y - origin.y);
				
				Imgproc.ellipse(tempImage, new RotatedRect(origin, new Size(x*2,y*2), 0), new Scalar(0, 0, 255),6);
				
				
				
				loadImage(tempImage);
				
			}
			
		});
		setSize(image.width(),image.height()+20);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void loadImage(Mat image) {
		
		MatOfByte mob = new MatOfByte();
		Imgcodecs.imencode(".jpg", image, mob);
		
		imageData = mob.toArray();
		
		final ImageIcon icon = new ImageIcon(imageData);
		imageView.setIcon(icon);
	}

	
	private void viewSetup() {
		
		imageView = new JLabel();
		imageView.setBounds(0,20,image.width(),image.height());
		System.out.println(image.height() + " " + image.width());
		add(imageView);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 640, 20);
		menu = new JMenu("file");
		saveMenu = new JMenuItem("save");
		menu.add(saveMenu);
		menuBar.add(menu);
		add(menuBar);
		
		saveMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Imgcodecs.imwrite("images/out.jpg", image);
				System.out.println("write success");
				
			}
		});
		
		
	}
}