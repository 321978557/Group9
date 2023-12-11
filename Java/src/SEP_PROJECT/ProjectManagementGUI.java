import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class ProjectManagementGUI extends Application {

  private TextArea savedDetailsTextArea;

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

    // Add TextArea for displaying saved details
    savedDetailsTextArea = new TextArea();
    savedDetailsTextArea.setEditable(false); // Make it read-only
    savedDetailsTextArea.setWrapText(true);
    borderPane.setBottom(savedDetailsTextArea);

    Scene scene = new Scene(borderPane, 500, 600); // Increased height to accommodate TextArea
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

    Label lengthLabel = new Label("Length:");
    TextField lengthField = new TextField();

    Label widthLabel = new Label("Width:");
    TextField widthField = new TextField();

    Label timelineLabel = new Label("Timeline:");
    Spinner<Integer> timelineSpinner = new Spinner<>(1, 100, 1);

    Label statusLabel = new Label("Status:");
    ComboBox<String> statusComboBox = new ComboBox<>();
    statusComboBox.getItems().addAll("Not Started", "In Progress", "Completed");
    statusComboBox.setValue("Not Started"); // Default value

    // Additional fields for Residential
    Label bathroomLabel = new Label("Bathroom Number:");
    TextField bathroomField = new TextField();

    Label kitchenLabel = new Label("Kitchen Number:");
    TextField kitchenField = new TextField();

    Label buildingSizeLabelResidential = new Label("Building Size:");
    TextField buildingSizeFieldResidential = new TextField();

    // Additional fields for Commercial
    Label buildingSizeLabelCommercial = new Label("Building Size:");
    TextField buildingSizeFieldCommercial = new TextField();

    Label floorNumberLabel = new Label("Floor Number:");
    TextField floorNumberField = new TextField();

    Label actionsLabel = new Label("Actions:");
    Button updateButton = new Button("Update");
    Button saveButton = new Button("Save");

    // Add event handlers for buttons
    updateButton.setOnAction(e -> handleUpdate(
        projectTypeComboBox.getValue(),
        customValuesField.getText(),
        defaultValuesField.getText(),
        lengthField.getText(),
        widthField.getText(),
        timelineSpinner.getValue(),
        statusComboBox.getValue(),
        bathroomField.getText(),
        kitchenField.getText(),
        buildingSizeFieldResidential.getText(),
        buildingSizeFieldCommercial.getText(),
        floorNumberField.getText()
    ));

    saveButton.setOnAction(e -> handleSave(
        projectTypeComboBox.getValue(),
        customValuesField.getText(),
        defaultValuesField.getText(),
        lengthField.getText(),
        widthField.getText(),
        timelineSpinner.getValue(),
        statusComboBox.getValue(),
        bathroomField.getText(),
        kitchenField.getText(),
        buildingSizeFieldResidential.getText(),
        buildingSizeFieldCommercial.getText(),
        floorNumberField.getText()
    ));

    // Add elements to the VBox
    projectDetailsBox.getChildren().addAll(
        titleLabel,
        projectTypeLabel, projectTypeComboBox,
        customValuesLabel, customValuesField,
        defaultValuesLabel, defaultValuesField,
        lengthLabel, lengthField,
        widthLabel, widthField,
        timelineLabel, timelineSpinner,
        statusLabel, statusComboBox,
        // Additional fields for Residential
        bathroomLabel, bathroomField,
        kitchenLabel, kitchenField,
        buildingSizeLabelResidential, buildingSizeFieldResidential,
        // Additional fields for Commercial
        buildingSizeLabelCommercial, buildingSizeFieldCommercial,
        floorNumberLabel, floorNumberField,
        actionsLabel, updateButton, saveButton
    );

    // Update the UI when the project type changes
    projectTypeComboBox.setOnAction(e -> updateUIForProjectType(
        projectTypeComboBox.getValue(),
        bathroomLabel, bathroomField,
        kitchenLabel, kitchenField,
        buildingSizeLabelResidential, buildingSizeFieldResidential,
        buildingSizeLabelCommercial, buildingSizeFieldCommercial,
        floorNumberLabel, floorNumberField
    ));

    return projectDetailsBox;
  }

  private void handleUpdate(String projectType, String customValues, String defaultValues,
      String length, String width, int timeline, String status,
      String bathroom, String kitchen, String buildingSizeResidential, String buildingSizeCommercial,
      String floorNumber) {
    // Add your update logic here
    String updateDetails = "Update - Project Type: " + projectType + ", Custom Values: " +
        customValues + ", Default Values: " + defaultValues + ", Length: " +
        length + ", Width: " + width + ", Timeline: " +
        timeline + ", Status: " + status;

    if ("Residential".equals(projectType)) {
      updateDetails += ", Bathroom Number: " + bathroom + ", Kitchen Number: " + kitchen +
          ", Building Size: " + buildingSizeResidential;
    } else if ("Commercial".equals(projectType)) {
      updateDetails += ", Building Size: " + buildingSizeCommercial + ", Floor Number: " + floorNumber;
    } else if ("Road".equals(projectType)) {
      // Add road-specific fields if needed
    }

    updateDetails += "\n";

    // Append to the existing details
    savedDetailsTextArea.appendText(updateDetails);
  }

  private void handleSave(String projectType, String customValues, String defaultValues,
      String length, String width, int timeline, String status,
      String bathroom, String kitchen, String buildingSizeResidential, String buildingSizeCommercial,
      String floorNumber) {
    // Add your save logic here
    String saveDetails = "Save - Project Type: " + projectType + ", Custom Values: " +
        customValues + ", Default Values: " + defaultValues + ", Length: " +
        length + ", Width: " + width + ", Timeline: " +
        timeline + ", Status: " + status;

    if ("Residential".equals(projectType)) {
      saveDetails += ", Bathroom Number: " + bathroom + ", Kitchen Number: " + kitchen +
          ", Building Size: " + buildingSizeResidential;
    } else if ("Commercial".equals(projectType)) {
      saveDetails += ", Building Size: " + buildingSizeCommercial + ", Floor Number: " + floorNumber;
    } else if ("Road".equals(projectType)) {
      // Add road-specific fields if needed
    }

    saveDetails += "\n";

    // Append to the existing details
    savedDetailsTextArea.appendText(saveDetails);

    // Save to a file named "project_detail.txt"
    saveToFile(saveDetails, "project_detail.txt");
  }

  private void saveToFile(String details, String filePath) {
    try (FileWriter writer = new FileWriter(filePath, true)) {
      // Write the details to the file
      writer.write(details);
      writer.write("\n"); // Add a newline for better readability
      System.out.println("Project details saved to: " + filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void updateUIForProjectType(String projectType,
      Label bathroomLabel, TextField bathroomField,
      Label kitchenLabel, TextField kitchenField,
      Label buildingSizeLabelResidential, TextField buildingSizeFieldResidential,
      Label buildingSizeLabelCommercial, TextField buildingSizeFieldCommercial,
      Label floorNumberLabel, TextField floorNumberField) {
    // Update UI based on project type
    if ("Residential".equals(projectType)) {
      bathroomLabel.setDisable(false);
      bathroomField.setDisable(false);
      kitchenLabel.setDisable(false);
      kitchenField.setDisable(false);
      buildingSizeLabelResidential.setDisable(false);
      buildingSizeFieldResidential.setDisable(false);

      buildingSizeLabelCommercial.setDisable(true);
      buildingSizeFieldCommercial.setDisable(true);
      floorNumberLabel.setDisable(true);
      floorNumberField.setDisable(true);
    } else if ("Commercial".equals(projectType)) {
      bathroomLabel.setDisable(true);
      bathroomField.setDisable(true);
      kitchenLabel.setDisable(true);
      kitchenField.setDisable(true);
      buildingSizeLabelResidential.setDisable(true);
      buildingSizeFieldResidential.setDisable(true);

      buildingSizeLabelCommercial.setDisable(false);
      buildingSizeFieldCommercial.setDisable(false);
      floorNumberLabel.setDisable(false);
      floorNumberField.setDisable(false);
    } else if ("Road".equals(projectType)) {
      bathroomLabel.setDisable(true);
      bathroomField.setDisable(true);
      kitchenLabel.setDisable(true);
      kitchenField.setDisable(true);
      buildingSizeLabelResidential.setDisable(true);
      buildingSizeFieldResidential.setDisable(true);

      buildingSizeLabelCommercial.setDisable(true);
      buildingSizeFieldCommercial.setDisable(true);
      floorNumberLabel.setDisable(true);
      floorNumberField.setDisable(true);
    }
  }
}
