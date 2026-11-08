package io.github.jbruno37.calendar.desktop;

import io.github.jbruno37.calendar.domain.Tarea;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        Tarea tarea = Tarea.crear("Mi primera tarea");
        Label etiqueta = new Label(tarea.titulo());
        stage.setScene(new Scene(new StackPane(etiqueta), 360, 200));
        stage.setTitle("Calendario");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
