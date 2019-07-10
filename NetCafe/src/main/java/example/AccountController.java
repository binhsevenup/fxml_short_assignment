package example;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountController implements Initializable {

    @FXML
    private JFXTextField txtAvatar;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnDiactive;

    @FXML
    private JFXTextField txtFullname;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private JFXTextField txtUsername;

    @FXML
    private JFXTextField txtRemain;

    @FXML
    private JFXTextField txtStatus;

    @FXML
    private TableView<Account> tableView;

    @FXML
    private TableColumn<Account, ImageView> columnAvatar;

    @FXML
    private TableColumn<Account, String> columnUsername;

    @FXML
    private TableColumn<Account, Integer> columnRemainTime;







    public void doDeactive(ActionEvent actionEvent) {
    }

    public void doUpdate(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
