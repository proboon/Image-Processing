
import java.io.File;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelFormat;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javax.management.Notification;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meadow
 */
public class project_IP extends Application {

    Boolean selected = false;
    String getpath = "";
    String getname = "";
    int getwidth, getheight = 0;

    @Override
    public void start(Stage stage) throws IOException {
        HBox LhBox1 = new HBox(15);
        HBox LhBox2 = new HBox(15);

        VBox first_vbox = new VBox();

        VBox second_vbox1 = new VBox(20);
        VBox second_vbox2 = new VBox(25);
        VBox second_vbox3 = new VBox(20);

        HBox third_hbox1 = new HBox(20);
        HBox third_hbox2 = new HBox(20);
        HBox third_hbox3 = new HBox(20);
        HBox third_hbox4 = new HBox(20);

        VBox fourth_vbox1 = new VBox(15);
        VBox fourth_vbox2 = new VBox(15);
        VBox fourth_vbox3 = new VBox(15);
        VBox fourth_vbox4 = new VBox(15);

        first_vbox.setStyle("-fx-background-color: white;");
        second_vbox1.setStyle("-fx-background-color: #ffff00;");
        third_hbox1.setStyle("-fx-background-color: #ffff00;");
        third_hbox2.setStyle("-fx-background-color: #ffff00;");
        third_hbox3.setStyle("-fx-background-color: #ffff00;");
        third_hbox4.setStyle("-fx-background-color: #ffff00;");
        second_vbox3.setStyle("-fx-background-color: #ffff00;");

        second_vbox1.setPadding(new Insets(15));
        second_vbox2.setPadding(new Insets(25));
        third_hbox1.setPadding(new Insets(15));
        third_hbox2.setPadding(new Insets(15));
        third_hbox3.setPadding(new Insets(15));
        third_hbox4.setPadding(new Insets(15));
        second_vbox3.setPadding(new Insets(15));

        second_vbox1.setAlignment(Pos.CENTER);
        second_vbox3.setAlignment(Pos.CENTER);

        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("RAW Image", "*.raw"));
        fileChooser.setTitle("Upload File Path");

        Label lbone = new Label("Step 1");
        Label lbtwo = new Label("Step 2");
        Label lbthree = new Label("Step 3");
        Label lbfour = new Label("Step 4");

        lbone.setFont(new Font("Agency FB", 40));
        lbone.setTextFill(Color.web("white"));
        lbone.setStyle("-fx-background-color: black;");
        lbone.setPadding(new Insets(15));
        lbtwo.setFont(new Font("Agency FB", 40));
        lbtwo.setTextFill(Color.web("white"));
        lbtwo.setStyle("-fx-background-color: black;");
        lbtwo.setPadding(new Insets(15));
        lbthree.setFont(new Font("Agency FB", 40));
        lbthree.setTextFill(Color.web("white"));
        lbthree.setStyle("-fx-background-color: black;");
        lbthree.setPadding(new Insets(15));
        lbfour.setFont(new Font("Agency FB", 40));
        lbfour.setTextFill(Color.web("white"));
        lbfour.setStyle("-fx-background-color: black;");
        lbfour.setPadding(new Insets(15));

        Label IP = new Label("IMAGE PROCESSING");
        IP.setFont(new Font("Agency FB", 60));
        IP.setTextFill(Color.web("black"));

        Label lbchoose = new Label("CHOOSE A RAW FILE");
        lbchoose.setFont(new Font("Agency FB", 35));
        lbchoose.setTextFill(Color.web("black"));

        Label lbconvert = new Label("RAW file convert to:");
        lbconvert.setFont(new Font("Agency FB", 35));
        lbconvert.setTextFill(Color.web("black"));

        Label lbname = new Label("Name :" + getname);
        lbname.setFont(new Font("Agency FB", 35));
        lbname.setTextFill(Color.web("black"));

        Label lbpath = new Label("Path :" + getpath);
        lbpath.setFont(new Font("Agency FB", 35));
        lbpath.setTextFill(Color.web("black"));

        Label lbwidth = new Label("Width :");
        lbwidth.setFont(new Font("Agency FB", 35));
        lbwidth.setTextFill(Color.web("black"));

        Label lbheight = new Label("Height:");
        lbheight.setFont(new Font("Agency FB", 35));
        lbheight.setTextFill(Color.web("black"));

        TextField tf_width = new TextField();
        TextField tf_height = new TextField();

        tf_width.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                    String newValue) {
                if (!newValue.matches("\\d*")) {
                    tf_width.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        tf_height.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                    String newValue) {
                if (!newValue.matches("\\d*")) {
                    tf_height.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        ComboBox cb = new ComboBox();
        cb.getItems().addAll(
                "Convolution",
                "Dithering",
                "High pass",
                "Lower pass",
                "Patterning"
        );

        cb.setValue("Convolution");

        Button select = new Button("Select a Raw image");
        Button generate = new Button("Generate");
        IP_convolution convolution = new IP_convolution();
        IP_patterning patterning = new IP_patterning();
        IP_highpass highpass = new IP_highpass();
        IP_lowpass lowpass = new IP_lowpass();
        IP_dithering dithering = new IP_dithering();
        generate.setDisable(true);

        generate.setFont(new Font("Agency FB", 40));
        generate.setTextFill(Color.web("black"));
        generate.setStyle("-fx-background-color: #ffff00;");
        generate.setPadding(new Insets(15));

        Label label = new Label("Successfully");
        Popup popup = new Popup();
        label.setStyle(" -fx-background-color: white;");
        popup.getContent().add(label);

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                if (!popup.isShowing()) {
                    popup.show(stage);
                } else {
                    popup.hide();
                }
            }
        };

        select.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(stage);
            if (selectedFile != null) {
                getpath = selectedFile.getPath();
                getname = selectedFile.getName();
                System.out.println(getpath);
                System.out.println(getname);
                lbname.setText("Name :" + getname);
                lbpath.setText("Path :" + getpath);

                selected = true;
            }
            if (selected == false) {
                generate.setDisable(true);
//            generate.setStyle("-fx-background-color: #cf1717;-fx-text-color: white;");
            } else {
                generate.setDisable(false);
            }
        });

        generate.setOnAction(e1 -> {
            Stage lineStage = new Stage();
            VBox hb = new VBox(30);
            Label lb = new Label("Successful !");
            lb.setFont(new Font("Agency FB", 20));
            lb.setTextFill(Color.web("black"));
            
            Label lb1 = new Label("Please check your project file");
            lb1.setFont(new Font("Agency FB", 20));
            lb1.setTextFill(Color.web("black"));
            
            hb.setAlignment(Pos.CENTER);
            hb.getChildren().addAll(lb,lb1);

            if (tf_width.equals("") || tf_width.equals("0") || tf_height.equals("") || tf_height.equals("0")) {
                System.out.println("Invalid width or height");
            } else {
                getwidth = Integer.parseInt(tf_width.getText());
                getheight = Integer.parseInt(tf_height.getText());
                try {
                    String method = cb.getValue().toString();
                    switch (method) {
                        case "Convolution":
                            convolution.convolutionwork(getname, getpath, getwidth, getheight);
                            break;
                        case "Dithering":
                            dithering.ditheringwork(getname, getpath, getwidth, getheight);
                            break;
                        case "High pass":
                            highpass.highpasswork(getname, getpath, getwidth, getheight);
                            break;
                        case "Lower pass":
                            lowpass.lowpasswork(getname, getpath, getwidth, getheight);
                            break;
                        case "Patterning":
                            patterning.patterningwork(getname, getpath, getwidth, getheight);
                            break;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(project_IP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            Scene lineScene = new Scene(hb, 500, 300);
            lineStage.setScene(lineScene);
            lineStage.setTitle("Convert Successful !!!");
            lineStage.show();

        });

        LhBox1.getChildren().add(lbwidth);
        LhBox1.getChildren().add(tf_width);
        LhBox2.getChildren().add(lbheight);
        LhBox2.getChildren().add(tf_height);

        fourth_vbox1.getChildren().addAll(lbchoose, select);
        fourth_vbox3.getChildren().addAll(LhBox1, LhBox2);
        fourth_vbox2.getChildren().addAll(lbname, lbpath);
        fourth_vbox4.getChildren().addAll(lbconvert, cb);

        second_vbox1.getChildren().addAll(IP);
        third_hbox1.getChildren().addAll(lbone, fourth_vbox1);
        third_hbox2.getChildren().addAll(lbtwo, fourth_vbox2);
        third_hbox3.getChildren().addAll(lbthree, fourth_vbox3);
        third_hbox4.getChildren().addAll(lbfour, fourth_vbox4);

        second_vbox2.getChildren().addAll(third_hbox1, third_hbox2, third_hbox3, third_hbox4);
        second_vbox3.getChildren().add(generate);
        first_vbox.getChildren().addAll(second_vbox1, second_vbox2, second_vbox3);

        Scene scene = new Scene(first_vbox, 800, 835);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
