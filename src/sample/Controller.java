package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    TextField name;

    @FXML
    TextField phone;

    @FXML
    TextField email;

    @FXML
    ListView list;

    ObservableList<Contact> items = FXCollections.observableArrayList();



    public void onAdd() {
        Contact item = new Contact(name.getText(), phone.getText(), email.getText());
        items.add(item);
        name.setText("");
        phone.setText("");
        email.setText("");
    }

    public void onRemove() {
        SelectionModel model = list.getSelectionModel();
        Contact item = (Contact) model.getSelectedItem();
        items.remove(item);


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(items);
    }
}
