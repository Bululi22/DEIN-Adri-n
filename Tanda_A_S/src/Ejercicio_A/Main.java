package Ejercicio_A;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


//
public class Main extends Application {
	private ListView<String> lista;
	private CheckBox cbPractica;
	private Slider sldCompra, sldTele, sldCine;
	@Override
	public void start(Stage stage) {
		Label lblTitulo = new Label("ENCUESTA");
		Label lblProfesion = new Label("Profesión: ");
		TextField txfProfesion = new TextField();
		Label lblHermanos = new Label("Hermanos: ");
		TextField txfHermanos = new TextField();
		Label lblEdad = new Label("Edad: ");
		ComboBox<String> edades = new ComboBox<>();
		edades.getItems().addAll("Menores de 18","Entre 18 y 30","Entre 31 y 50","Entre 51 y 70","Mayores de 70");
		edades.setValue("Menores de 18");
		Label lblSexo = new Label("Sexo: ");
		RadioButton rbHombre = new RadioButton("Hombre");
		RadioButton rbMujer = new RadioButton("Mujer");
		RadioButton rbOtro = new RadioButton("Otro");
		ToggleGroup tGroup = new ToggleGroup();
		tGroup.getToggles().addAll(rbHombre,rbMujer,rbOtro);
		rbMujer.setSelected(true);
		
		cbPractica = new CheckBox("¿Práctica algún deporte?");
		cbPractica.selectedProperty().addListener(this::changed);
		
		Label lblCual = new Label("¿Cúal?");
		lista = new ListView<String>();
		lista.getItems().addAll("Tenis","Fútbol","Baloncesto","Natación","Ciclismo","Otro");
		lista.setPrefSize(0,70);
		lista.setDisable(true);
		
		Label lblMarca = new Label("Marque del 1 al 10 su grado de satisfacción");
		sldCompra= new Slider(0, 10, 5);
		
		
		
		
		//kjjkjjk
		GridPane grid = new GridPane();
		grid.add(lblTitulo, 0, 0, 4, 1);
		grid.add(lblProfesion, 0, 1);
		grid.add(txfProfesion, 1, 1, 3, 1);
		grid.add(lblHermanos, 0, 2);
		grid.add(txfHermanos, 1, 2);
		grid.add(lblEdad, 2, 2);
		grid.add(edades, 3, 2);
		grid.add(lblSexo, 0, 3);
		HBox box = new HBox();
		box.getChildren().addAll(rbHombre,rbMujer,rbOtro);
		grid.add(box, 1, 3, 3, 1);
		/*grid.add(rbHombre, 1, 3);
		grid.add(rbMujer, 2, 3);
		grid.add(rbOtro, 3, 3);*/
		grid.add(cbPractica, 0, 4, 2, 1);
		grid.add(lblCual, 2, 4, 2, 1);
		grid.add(lista, 2, 5, 2, 1);
		
		
		Scene scene = new Scene(grid);
		stage.setScene(scene);
		stage.setTitle("Setting Column/Row Constraints");
		stage.show();
	}
		
		public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
			
			if (cbPractica.isSelected()) {
				lista.setDisable(false);
			} else {
				lista.setDisable(true);
			}
		}
		
		
	
	
	public static void main(String[] args) {
		launch(args);
	}
}