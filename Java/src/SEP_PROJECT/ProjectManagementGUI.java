import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectManagementGUI extends Application {

  private TextArea savedDetailsTextArea;
  private List<String> savedDetailsList;
  private int currentIndex = -1;

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

    // Initialize saved details list
    savedDetailsList = new ArrayList<>();

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

    // Building Size field for all project types
    Label buildingSizeLabel = new Label("Building Size:");
    TextField buildingSizeField = new TextField();

    // Additional fields for Residential
    Label bathroomLabel = new Label("Bathroom Number:");
    TextField bathroomField = new TextField();

    Label kitchenLabel = new Label("Kitchen Number:");
    TextField kitchenField = new TextField();

    // Additional fields for Commercial
    // Label buildingSizeLabelCommercial = new Label("Building Size:");
    // TextField buildingSizeFieldCommercial = new TextField();

    Label floorNumberLabel = new Label("Floor Number:");
    TextField floorNumberField = new TextField();

    // Budget field for all project types
    Label budgetLabel = new Label("Budget:");
    TextField budgetField = new TextField();

    // Notes field for all project types
    Label notesLabel = new Label("Notes:");
    TextArea notesArea = new TextArea();

    Label actionsLabel = new Label("Actions:");
    Button updateButton = new Button("Update");
    Button saveButton = new Button("Save");
    Button prevButton = new Button("Previous");
    Button nextButton = new Button("Next");

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
        floorNumberField.getText(),
        budgetField.getText(),
        notesArea.getText(),
        buildingSizeField.getText()
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
        floorNumberField.getText(),
        budgetField.getText(),
        notesArea.getText(),
        buildingSizeField.getText()
    ));

    prevButton.setOnAction(e -> showPreviousDetails());
    nextButton.setOnAction(e -> showNextDetails());

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
        // Building Size field for all project types
        buildingSizeLabel, buildingSizeField,
        // Additional fields for Residential
        bathroomLabel, bathroomField,
        kitchenLabel, kitchenField,
        // Additional fields for Commercial
        // buildingSizeLabelCommercial, buildingSizeFieldCommercial,
        floorNumberLabel, floorNumberField,
        // Budget field for all project types
        budgetLabel, budgetField,
        // Notes field for all project types
        notesLabel, notesArea,
        actionsLabel, updateButton, saveButton, prevButton, nextButton
    );

    // Update the UI when the project type changes
    projectTypeComboBox.setOnAction(e -> updateUIForProjectType(
        projectTypeComboBox.getValue(),
        bathroomLabel, bathroomField,
        kitchenLabel, kitchenField,
        // buildingSizeLabelCommercial, buildingSizeFieldCommercial,
        floorNumberLabel, floorNumberField
    ));

    return projectDetailsBox;
  }

  private void handleUpdate(String projectType, String customValues, String defaultValues,
      String length, String width, int timeline, String status,
      String bathroom, String kitchen, String floorNumber, String budget, String notes, String buildingSize) {
    // Add your update logic here
    String updateDetails = "Update - Project Type: " + projectType + ", Custom Values: " +
        customValues + ", Default Values: " + defaultValues + ", Length: " +
        length + ", Width: " + width + ", Timeline: " +
        timeline + ", Status: " + status +
        ", Bathroom Number: " + bathroom + ", Kitchen Number: " + kitchen +
        ", Floor Number: " + floorNumber +
        ", Budget: " + budget +
        ", Notes: " + notes +
        ", Building Size: " + buildingSize + "\n";

    // Append to the existing details
    savedDetailsList.add(updateDetails);
    currentIndex = savedDetailsList.size() - 1;
    showDetailsAtIndex(currentIndex);
  }

  private void handleSave(String projectType, String customValues, String defaultValues,
      String length, String width, int timeline, String status,
      String bathroom, String kitchen, String floorNumber, String budget, String notes, String buildingSize) {
    // Add your save logic here
    String saveDetails = "Save - Project Type: " + projectType + ", Custom Values: " +
        customValues + ", Default Values: " + defaultValues + ", Length: " +
        length + ", Width: " + width + ", Timeline: " +
        timeline + ", Status: " + status +
        ", Bathroom Number: " + bathroom + ", Kitchen Number: " + kitchen +
        ", Floor Number: " + floorNumber +
        ", Budget: " + budget +
        ", Notes: " + notes +
        ", Building Size: " + buildingSize + "\n";

    // Append to the existing details
    savedDetailsList.add(saveDetails);
    currentIndex = savedDetailsList.size() - 1;
    showDetailsAtIndex(currentIndex);

    // Save to a file named "project_detail.csv"
    saveToCSVFile(savedDetailsList, "project_detail.csv");
  }

  private void saveToCSVFile(List<String> detailsList, String filePath) {
    try (PrintWriter writer = new PrintWriter(new File(filePath))) {
      // Write CSV header
      writer.println("Type,Custom,Default,Length,Width,Timeline,Status,Bathroom,Kitchen,Floor,Budget,Notes,Building Size");

      // Write details to CSV
      for (String details : detailsList) {
        writer.println(details.replaceAll("[-]", ""));
      }

      System.out.println("Project details saved to: " + filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void updateUIForProjectType(String projectType,
      Label bathroomLabel, TextField bathroomField,
      Label kitchenLabel, TextField kitchenField,
      // Label buildingSizeLabelCommercial, TextField buildingSizeFieldCommercial,
      Label floorNumberLabel, TextField floorNumberField) {
    // Update UI based on project type
    if ("Residential".equals(projectType)) {
      bathroomLabel.setDisable(false);
      bathroomField.setDisable(false);
      kitchenLabel.setDisable(false);
      kitchenField.setDisable(false);
      // buildingSizeLabelCommercial.setDisable(true);
      // buildingSizeFieldCommercial.setDisable(true);
      floorNumberLabel.setDisable(true);
      floorNumberField.setDisable(true);
    } else if ("Commercial".equals(projectType)) {
      bathroomLabel.setDisable(true);
      bathroomField.setDisable(true);
      kitchenLabel.setDisable(true);
      kitchenField.setDisable(true);
      // buildingSizeLabelCommercial.setDisable(false);
      // buildingSizeFieldCommercial.setDisable(false);
      floorNumberLabel.setDisable(false);
      floorNumberField.setDisable(false);
    } else if ("Road".equals(projectType)) {
      bathroomLabel.setDisable(true);
      bathroomField.setDisable(true);
      kitchenLabel.setDisable(true);
      kitchenField.setDisable(true);
      // buildingSizeLabelCommercial.setDisable(true);
      // buildingSizeFieldCommercial.setDisable(true);
      floorNumberLabel.setDisable(true);
      floorNumberField.setDisable(true);
    }
  }

  private void showDetailsAtIndex(int index) {
    if (index >= 0 && index < savedDetailsList.size()) {
      savedDetailsTextArea.setText(savedDetailsList.get(index));
    }
  }

  private void showPreviousDetails() {
    if (currentIndex > 0) {
      currentIndex--;
      showDetailsAtIndex(currentIndex);
    }
  }

  private void showNextDetails() {
    if (currentIndex < savedDetailsList.size() - 1) {
      currentIndex++;
      showDetailsAtIndex(currentIndex);
    }
  }
}
