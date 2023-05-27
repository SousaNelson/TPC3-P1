package com.example.tpc_8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 470, 510, Color.LIGHTBLUE);

        //String:TPC8
        Text texto = new Text(40, 40, "TPC 8");
        texto.setFill(Color.GREEN);
        texto.setFont(Font.font("Arial", 35));

        //line
        Line linha = new Line(200, 80, 400, 250);
        linha.setStroke(Color.RED);
        linha.setStrokeWidth(4.0);

        //retangulo
        Rectangle retangulo = new Rectangle(90, 90, 90, 90);
        retangulo.setFill(Color.BLUE);
        retangulo.setStroke(Color.BLACK);
        retangulo.setStrokeWidth(3.0);


        // Triângulo e line
        Polygon triangulo = new Polygon();
        triangulo.getPoints().addAll(180.0, 280.0, 180.0, 180.0, 280.0, 279.0);
        triangulo.setFill(Color.YELLOW);


        // Círculo
        Circle circulo = new Circle(330, 318, 50);
        circulo.setFill(Color.ORANGE);

        //imagem
        Image imagem = new Image("file:src/main/java/logo-uta.png");
        ImageView imageView = new ImageView(imagem);
        imageView.setX(50);
        imageView.setY(360);
        double novaLargura = 350; // Definir a nova largura desejada
        double novaAltura = 80; // Definir a nova altura desejada
        imageView.setFitWidth(novaLargura);
        imageView.setFitHeight(novaAltura);


        root.getChildren().addAll(texto, linha, retangulo, triangulo, circulo, imageView);

        primaryStage.setTitle("TPC 8-Trabalhar com Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
