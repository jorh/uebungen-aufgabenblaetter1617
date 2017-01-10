package uebung11;



import java.util.HashMap;
import java.util.Map;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class GUIProgrammierung extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		RoadTrafficSimulator straﬂe = new RoadTrafficSimulator();
        BorderPane mainPane = new BorderPane();
        Pane simulationPane = new Pane();
        Map<Integer, Text> texts = new HashMap();
        for(Node node : straﬂe.getNodes().values()){
        	Circle kreis = new Circle(node.getCoordinateX(),node.getCoordinateY(),3);
        	simulationPane.getChildren().add(kreis);
        }
        for(Link link : straﬂe.getLinks().values()){
        	Node startNode = link.getStartNode();
			Node endNode = link.getEndNode();
			Line linie = new Line(startNode.getCoordinateX(),startNode.getCoordinateY(),endNode.getCoordinateX(),endNode.getCoordinateY());
        	simulationPane.getChildren().add(linie);
        	Text text = new Text(startNode.getCoordinateX(),startNode.getCoordinateY(), "Belastung: "+link.getOccupation());
        	texts.put(link.getId(), text);
        	simulationPane.getChildren().add(text);
        }
        Button button = new Button("Increase volume");
        button.setOnAction(new EventHandler <ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event){
        		straﬂe.increaseTrafficVolume();
        		for( Link link : straﬂe.getLinks().values()) {
        			Text text = texts.get(link.getId());
        			text.setText("Belastung: "+link.getOccupation());
        		}
        	}
        });
        mainPane.setTop(button);
        mainPane.setCenter(simulationPane);
        
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.show();
	}
	
}
