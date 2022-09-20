module Tanda_A_S {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens Ejercicio_A to javafx.graphics, javafx.fxml;
	opens Ejercicio_B to javafx.graphics, javafx.fxml;
	opens model to javafx.graphics, javafx.fxml, javafx.base;
}
