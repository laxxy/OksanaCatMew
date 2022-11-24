package com.oksana.cat.dog.oksanacatmew;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.*;

public class MewMewWoofController {

    private static Map<String, LinkedHashMap<String, Double>> all = new HashMap<>();

    static {
        LinkedHashMap<String, Double> sino = new LinkedHashMap<>();
        sino.put("ME", 7.0);
        sino.put("NEL", 4.2);
        sino.put("CP", 34.0);
        sino.put("Fiber", 398.0);
        sino.put("Sugar", 20.0);
        sino.put("Fat", 2.2);
        sino.put("Ca", 4.0);
        sino.put("P", 0.7);

        all.put("SINO", sino);
    }

    @FXML private ComboBox<String> combo;
    @FXML private TableView<String> tableView;
    @FXML private TableColumn ME;
    @FXML private TableColumn NEL;
    @FXML private TableColumn CP;
    @FXML private TableColumn Fiber;
    @FXML private TableColumn Sugar;
    @FXML private TableColumn Fat;
    @FXML private TableColumn Ca;
    @FXML private TableColumn P;


    @FXML
    protected void calcOnClick() {
        combo.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                
            }
        });
    }
}
