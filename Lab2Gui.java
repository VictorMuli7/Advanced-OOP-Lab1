package lab2gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.text.Text;

public class Lab2Gui extends Application {
    
    @Override
    public void start(Stage stage) {
        Button button = new Button("Register Genre");
        Button button1 = new Button("Manage movies");
        Button button2 = new Button("Customer management");
        Button button3 = new Button("Rentals");

        button.setOnAction(e ->showGenre(stage));
        button1.setOnAction(e -> showMovies(stage));
        button2.setOnAction(e -> showCustDetails(stage));
        button3.setOnAction(e -> showRentals(stage));
        
        GridPane gridpane = new GridPane ();
        gridpane.setMinSize(600,400);
        gridpane.setPadding(new Insets(10, 10, 10, 10));
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        gridpane.setAlignment(Pos.CENTER);
        gridpane.add(button, 0, 0);
        gridpane.add(button1, 0, 1);
        gridpane.add(button2, 0, 2);
        gridpane.add(button3, 0, 3);

        button.setStyle("-fx-background-color: #E1A274; -fx-text-fill: white; -fx-font-size:13pt;");
        button1.setStyle("-fx-background-color: #E1A274; -fx-text-fill: white; -fx-font-size:13pt;");
        button2.setStyle("-fx-background-color: #E1A274; -fx-text-fill: white; -fx-font-size:13pt;");
        button3.setStyle("-fx-background-color: #E1A274; -fx-text-fill: white; -fx-font-size:13pt;");
        gridpane.setStyle("-fx-background-color: #FFE2B7");
        
        Scene scene = new Scene(gridpane);
        stage.setTitle("Movie Library System");
        stage.setScene(scene);
        stage.show();
    }
    
    private void showGenre(Stage stage){
        Text text1 = new Text("Name: ");
        Text text2 = new Text("Registered: ");
        TextField textfield1 = new TextField();
        ComboBox combobox1 = new ComboBox();
        Button button1 = new Button ("Save");
        Button button2 = new Button ("Remove");
        button1.setOnAction(e -> {
            String name = textfield1.getText();
            if (name == null|| name.trim().isEmpty()){
                textfield1.requestFocus();
                textfield1.setStyle("-fx-border-color: red;");
            return;
       }
     
    });    
    
    GridPane gridpane = new GridPane ();
    gridpane.setMinSize(600,400);
    gridpane.setPadding(new Insets(10, 10, 10, 10));
    gridpane.setVgap(10);
    gridpane.setHgap(10);
    gridpane.setAlignment(Pos.CENTER);
    gridpane.add(text1, 0, 0);
    gridpane.add(textfield1, 1, 0);
    gridpane.add(button1, 1, 2);
    gridpane.add(text2, 0, 3);
    gridpane.add(combobox1, 1, 3);
    gridpane.add(button2, 1, 4);
    
    button1.setStyle("-fx-background-color: #724C4C; -fx-text-fill: white; -fx-font-size:13pt;");
    button2.setStyle("-fx-background-color: #724C4C; -fx-text-fill: white; -fx-font-size:13pt;");
    combobox1.setStyle("-fx-border-color: #724C4C;");
    text1.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    text2.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    textfield1.setStyle("-fx-border-color: #FFE2B7");
    gridpane.setStyle("-fx-background-color: #FFE2B7");
    
    Scene scene = new Scene(gridpane);
    stage.setTitle("Movie Library System: Genre Registration");
    stage.setScene(scene);
    stage.show();
        
    }    

    private void showMovies(Stage stage){
    Text text1 = new Text("Name: ");
    Text text2 = new Text ("Registered: ");
    Text text3 = new Text ("Genres:");
    TextField textfield1 = new TextField();
    ComboBox combobox = new ComboBox();
    combobox.getItems().addAll("Horror","Sci-Fi","Romance","Thriller");
    combobox.setEditable(true);
    ComboBox combobox2 = new ComboBox();
    combobox2.setEditable(true);
    
    Button button1 = new Button ("Save");
    Button button2 = new Button ("Remove");
    button1.setOnAction(e -> {
       String name = textfield1.getText();
       if (name == null|| name.trim().isEmpty()){
           textfield1.requestFocus();
           textfield1.setStyle("-fx-border-color: red;");
           return;
       }
     
    });    
    
    GridPane gridpane = new GridPane ();
    gridpane.setMinSize(600,400);
    gridpane.setPadding(new Insets(10, 10, 10, 10));
    gridpane.setVgap(10);
    gridpane.setHgap(10);
    gridpane.setAlignment(Pos.CENTER);
    gridpane.add(text3, 0, 0);
    gridpane.add(combobox, 1, 0);
    gridpane.add(text1, 0, 1);
    gridpane.add(textfield1, 1, 1);
    gridpane.add(button1, 1, 2);
    gridpane.add(text2, 0, 3);
    gridpane.add(combobox2, 1, 3);
    gridpane.add(button2, 1, 4);
    
    button1.setStyle("-fx-background-color: #724C4C; -fx-text-fill: white; -fx-font-size:13pt;");
    button2.setStyle("-fx-background-color: #724C4C; -fx-text-fill: white; -fx-font-size:13pt;");
    combobox.setStyle("-fx-border-color: #724C4C;");
    combobox2.setStyle("-fx-border-color: #724C4C;");
    text1.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    text2.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    text3.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    textfield1.setStyle("-fx-border-color: #FFE2B7;");
    gridpane.setStyle("-fx-background-color: #EEEEEE");
    
    Scene scene = new Scene(gridpane);
    stage.setTitle("Movie Library System");
    stage.setScene(scene);
    stage.show();
        
        
        
    }
    private void showCustDetails(Stage stage){
        
    Text text1 = new Text("Name: ");
    Text text2 = new Text ("Phone: ");
    Text text3 = new Text ("Email:");
    Text text4 = new Text("Registered:");
    TextField textfield1 = new TextField();
    TextField textfield2 = new TextField();
    TextField textfield3 = new TextField();
    ComboBox combobox = new ComboBox();
    combobox.setEditable(true);
    
    
    Button button1 = new Button ("Save");
    Button button2 = new Button ("Remove");
    
    GridPane gridpane = new GridPane ();
    gridpane.setMinSize(600,400);
    gridpane.setPadding(new Insets(10, 10, 10, 10));
    gridpane.setVgap(10);
    gridpane.setHgap(10);
    gridpane.setAlignment(Pos.CENTER);
    gridpane.add(text1, 0, 0);
    gridpane.add(textfield1, 1, 0);
    gridpane.add(text2, 0, 1);
    gridpane.add(textfield2, 1, 1);
    gridpane.add(text3, 0, 2);
    gridpane.add(textfield3, 1, 2);
    gridpane.add(button1, 1, 3);
    gridpane.add(text4, 0, 4);
    gridpane.add(combobox, 1, 4);
    gridpane.add(button2, 1, 5);
    
    button1.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-size:13pt;");
    button2.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-size:13pt;");
    combobox.setStyle("-fx-border-color: black;");
    textfield1.setStyle("-fx-border-color: black;");
    textfield2.setStyle("-fx-border-color: black;");
    textfield3.setStyle("-fx-border-color: black;");
    
    text1.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    text2.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    text3.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    text4.setStyle("-fx-fill: black; -fx-font: normal bold 20px 'serif'");
    gridpane.setStyle("-fx-background-color: WHITE");
    
    Scene scene = new Scene(gridpane);
    stage.setTitle("User Credentials");
    stage.setScene(scene);
    stage.show();
        
    }
    public void showRentals(Stage stage) {
        //Texts
        Text text1 = new Text("Customer:");
        Text text2 = new Text("Genre:");
        Text text3 = new Text("Movies:");
        Text text4 = new Text("Borrowed:");
        Text text5 = new Text("Returned:");
        //Comboboxes
        ComboBox<String> comboBox1 = new ComboBox<>();
        ComboBox<String> comboBox2 = new ComboBox<>();
        ComboBox<String> comboBox3 = new ComboBox<>();
        ComboBox<String> comboBox4 = new ComboBox<>();
        ComboBox<String> comboBox5 = new ComboBox<>();
        //Combobox lists
        comboBox1.getItems().addAll("John", "James", "Michael", "Mary", "Ann");
        comboBox2.getItems().addAll("Action", "Horror", "Comedy");
        comboBox3.getItems().addAll("John Wick", "The Conjuring", "Bridesmaids", "Interstellar", "The last Dance");
        comboBox4.getItems().addAll();
        comboBox5.getItems().addAll();
        //combobox editable
        comboBox1.setEditable(true);
        comboBox3.setEditable(true);
        comboBox4.setEditable(true);
        comboBox5.setEditable(true);
        //Genre movie functionality
        comboBox2.setOnAction(e -> {
            String selectedGenre = comboBox2.getValue();
            comboBox3.getItems().clear();
            if (selectedGenre.equals("Action")) {
                comboBox3.getItems().addAll("John Wick", "Mad Max", "The Dark Knight", "Top Gun: Maverick", "Mission Impossible");
            } else if (selectedGenre.equals("Horror")) {
                comboBox3.getItems().addAll("The Conjuring", "Hereditary", "Get Out", "It", "A Quiet Place");
            } else if (selectedGenre.equals("Comedy")) {
                comboBox3.getItems().addAll("Superbad", "Bridesmaids", "Game Night", "The Nice Guys", "The Grand Budapest Hotel");
            }
        });

        //Buttons
        Button button1 = new Button("Save!");
        Button button2 = new Button("Return!");
        //Movie saving functionality
        button1.setOnAction(e->{
            String getCustomer =comboBox1.getValue();
            String getMovie = comboBox3.getValue();
            comboBox4.getItems().add(getMovie);
        });
        //movie returning functionality
        button2.setOnAction(e->{
            String getBorrowedMovie = comboBox4.getValue();
            comboBox5.getItems().add(getBorrowedMovie);
            comboBox4.getItems().remove(getBorrowedMovie);
        });
        //GridPane
        GridPane gridpane = new GridPane();
        //Size of Pane
        gridpane.setMinSize(600, 400);
        //Padding
        gridpane.setPadding(new Insets(10, 10, 10, 10));
        //Vertical and horizontal gaps between columns
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        //Grid alignment
        gridpane.setAlignment(Pos.CENTER);
        //Arrangement of nodes on the grid
        gridpane.add(text1, 0, 0);
        gridpane.add(text2, 0, 1);
        gridpane.add(text3, 0, 2);
        gridpane.add(text4, 0, 4);
        gridpane.add(text5, 0, 6);
        gridpane.add(comboBox1, 1, 0);
        gridpane.add(comboBox2, 1, 1);
        gridpane.add(comboBox3, 1, 2);
        gridpane.add(comboBox4, 1, 4);
        gridpane.add(comboBox5, 1, 6);
        gridpane.add(button1, 1, 3);
        gridpane.add(button2, 1, 5);
        //Styling Nodes
        button1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        //Scene Object
        Scene scene = new Scene(gridpane);
        //Title of Stage
        stage.setTitle("Movies");
        //Adding scene to stage
        stage.setScene(scene);
        //Displaying contents of stage
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
