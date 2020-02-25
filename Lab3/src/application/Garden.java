//import com.sun.javafx.geom.Point2D;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//public class Garden extends Application{
//	Pane root;
//	Scene scene;
//	Point2D lastPosition = null;
//	Flower flowerRed;
//	GardenComponent currentComponent;
//	Point2D clickPoint;
//public void start(Stage Stage) throws Exception {
//	
//	
//	
//	
//	
//	Scene scene = new Scene(root,500,500);
//  Stage.setTitle("");
//	Stage.setScene(scene);
//	Stage.show();
//	
//}
//
//public static void main(String[] args) {
//	launch(args);
//}
//}


package application;

import javafx.geometry.Point2D;

public interface Garden {
	public default void move(double x,double y ) {
		
	}

	public boolean contains(Point2D Point);
}