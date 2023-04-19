package lk.ijse.hms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import com.jfoenix.controls.JFXButton;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lk.ijse.hms.controller.login.AdminLoginFormController;
import lk.ijse.hms.controller.user.UserDetailsFormController;
import lk.ijse.hms.dto.UserDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainFormController {

    @FXML
    private AnchorPane pneContainer;

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnStudent;

    @FXML
    private JFXButton btnRoom;

    @FXML
    private JFXButton btnReservation;

    @FXML
    private JFXButton btnPayment;

    @FXML
    private JFXButton btnUser;

    @FXML
    private Label lblUserStatus;

    private UserDTO userDTO;

    private final List<JFXButton> buttonList = new ArrayList<>();

    public void init(UserDTO userDTO) {
        this.userDTO = userDTO;
        lblUserStatus.setText(userDTO.getName());
        buttonList.add(btnDashboard);
        buttonList.add(btnStudent);
        buttonList.add(btnRoom);
        buttonList.add(btnReservation);
        buttonList.add(btnPayment);
        buttonList.add(btnUser);
        btnOnAction(btnDashboard);
        navigation("/view/DashboardForm.fxml");
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        btnOnAction(btnDashboard);
        navigation("/view/DashboardForm.fxml");
        ((Stage)pneContainer.getScene().getWindow()).setTitle("Dashboard");
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) {
        btnOnAction(btnPayment);
        navigation("/view/PaymentForm.fxml");
        ((Stage)pneContainer.getScene().getWindow()).setTitle("Manage Payment");
    }

    @FXML
    void btnReservationOnAction(ActionEvent event) {
        btnOnAction(btnReservation);
        navigation("/view/ManageReservationForm.fxml");
        ((Stage)pneContainer.getScene().getWindow()).setTitle("Manage Reservation");
    }

    @FXML
    void btnRoomOnAction(ActionEvent event) {
        btnOnAction(btnRoom);
        navigation("/view/ManageRoomForm.fxml");
        ((Stage)pneContainer.getScene().getWindow()).setTitle("Manage Room");
    }

    @FXML
    void btnStudentOnAction(ActionEvent event) {
        btnOnAction(btnStudent);
        navigation("/view/ManageStudentForm.fxml");
        ((Stage)pneContainer.getScene().getWindow()).setTitle("Manage Student");
    }

    @FXML
    void btnUserOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/login/AdminLoginForm.fxml"));
            Parent load = fxmlLoader.load();
            AdminLoginFormController adminLoginFormController = fxmlLoader.getController();
            adminLoginFormController.init(this);
            Stage stage = new Stage();
            stage.getIcons().add(new Image("assets/user.png"));
            stage.setScene(new Scene(load));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }

    public void goUserOnAction(){
        btnOnAction(btnUser);
        navigation("/view/ManageUserForm.fxml");
        ((Stage)pneContainer.getScene().getWindow()).setTitle("Manage User");
    }

    @FXML
    void imgMouseClock(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/user/UserDetailsForm.fxml"));
            Parent load = fxmlLoader.load();
            UserDetailsFormController userDetailsFormController = fxmlLoader.getController();
            userDetailsFormController.init(userDTO, this);
            Stage stage = new Stage();
            stage.getIcons().add(new Image("assets/UserIcon.png"));
            stage.setScene(new Scene(load));
            stage.setTitle("User Details");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }

    @FXML
    public void logOutOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/LoginForm.fxml"));
            Parent load = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.getIcons().add(new Image("assets/logo.png"));
            stage.setTitle("Login");
            stage.centerOnScreen();
            stage.show();
            Stage window = (Stage) pneContainer.getScene().getWindow();
            window.close();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }

    private void navigation(String location) {
        try {
            pneContainer.getChildren().clear();
            pneContainer.getChildren().add(FXMLLoader.load(getClass().getResource(location)));
        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR,"forms error ..!").show();
        }
    }

    private void btnOnAction(JFXButton selectedBTN){
        for (JFXButton jfxButton:buttonList){
            jfxButton.getStyleClass().removeAll("selected-nav-btn");
            jfxButton.getStyleClass().addAll("nav-btn");
        }
        selectedBTN.getStyleClass().removeAll("nav-btn");
        selectedBTN.getStyleClass().addAll("selected-nav-btn");
    }
}
