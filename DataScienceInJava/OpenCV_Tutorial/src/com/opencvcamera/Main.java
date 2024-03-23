package com.opencvcamera;

import java.awt.EventQueue;

//import java.awt.EventQueue;

import org.opencv.core.Core;

public class Main {
	

	public static void main(String[] args) {

		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		System.out.println("library loaded succesfully!");
		
		
//		EventQueue.invokeLater(new Runnable() {
//			
//			@Override
//			public void run() {
//				Camera camera=new Camera();
//				new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						camera.startCamera();
//					}
//				}).start();
//			}
//		});
//		new FaceRecognition();
//		new TextRecognition();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				DrawOnImage image = new DrawOnImage();
			}
		});
	}

}
