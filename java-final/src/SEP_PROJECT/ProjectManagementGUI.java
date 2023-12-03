package SEP_PROJECT;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ProjectManagementGUI extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Project Details");

    BorderPane borderPane = new BorderPane();
    borderPane.setPadding(new Insets(10, 20, 10, 20));

    // Create project details section
    VBox projectDetailsBox = createProjectDetailsBox();
    borderPane.setCenter(projectDetailsBox);

    Scene scene = new Scene(borderPane, 400, 300);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private VBox createProjectDetailsBox() {
    VBox projectDetailsBox = new VBox();
    projectDetailsBox.setSpacing(10);

    Label titleLabel = new Label("Project Details");
    titleLabel.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");

    // Add more labels, buttons, and input fields for project details
    Label projectTypeLabel = new Label("Project Type:");
    ComboBox<String> projectTypeComboBox = new ComboBox<>();
    projectTypeComboBox.getItems().addAll("Residential", "Commercial", "Road");
    projectTypeComboBox.setValue("Residential"); // Default value

    Label customValuesLabel = new Label("Custom Values:");
    TextField customValuesField = new TextField();

    Label defaultValuesLabel = new Label("Default Values:");
    TextField defaultValuesField = new TextField();

    Label timelineLabel = new Label("Timeline:");
    Spinner<Integer> timelineSpinner = new Spinner<>(1, 100, 1);

    Label statusLabel = new Label("Status:");
    ComboBox<String> statusComboBox = new ComboBox<>();
    statusComboBox.getItems().addAll("Not Started", "In Progress", "Completed");
    statusComboBox.setValue("Not Started"); // Default value

    Label actionsLabel = new Label("Actions:");
    Button updateButton = new Button("Update");
    Button saveButton = new Button("Save");

    // Add elements to the VBox
    projectDetailsBox.getChildren().addAll(
        titleLabel,
        projectTypeLabel, projectTypeComboBox,
        customValuesLabel, customValuesField,
        defaultValuesLabel, defaultValuesField,
        timelineLabel, timelineSpinner,
        statusLabel, statusComboBox,
        actionsLabel, updateButton, saveButton
    );

    return projectDetailsBox;
  }
}
