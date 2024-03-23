package com.opencvcamera;

import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.objdetect.Objdetect;

public class FaceRecognition 
{
	public FaceRecognition()
	{
		Mat image=Imgcodecs.imread("images/faces3.jpg");
		detectAndSave(image);
	}
	public void detectAndSave(Mat image)
	{
		MatOfRect faces = new MatOfRect();
		Mat grayFrame=new Mat();
		Imgproc.cvtColor(image, grayFrame, Imgproc.COLOR_BGR2GRAY);
		Imgproc.equalizeHist(grayFrame,grayFrame);
		int height=grayFrame.height();
		int absoluteFaceSize=0;
		if(Math.round(height*0.2f)>0)
		{
			absoluteFaceSize=Math.round(height*0.2f);
		}
		CascadeClassifier faceCascade=new CascadeClassifier();
		faceCascade.load("dataset/haarcascade_frontalface_alt2.xml");
		faceCascade.detectMultiScale(grayFrame, faces, 1.1,2,0|Objdetect.CASCADE_SCALE_IMAGE,
				new Size(absoluteFaceSize,absoluteFaceSize),new Size());
		
		Rect[] faceArray=faces.toArray();
		for (int i = 0; i < faceArray.length; i++) {
			Imgproc.rectangle(image, faceArray[i], new Scalar(0, 0, 255),3);
		}
		Imgcodecs.imwrite("images/output.jpg",image);
		System.out.println("detected "+faceArray.length+" faces");
	}
}
