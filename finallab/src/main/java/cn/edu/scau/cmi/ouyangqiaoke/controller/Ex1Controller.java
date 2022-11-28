package cn.edu.scau.cmi.ouyangqiaoke.controller;

import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex1.domain.Footballer;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex1.domain.Goalkeeper;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class Ex1Controller implements Initializable {

    @FXML
    private Button button2;

    @FXML
    private TextArea text;

    @FXML
    private Button button1;

    private boolean flag = true;

    private int count;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        text.setEditable(false);
    }

    public void btn1Click(MouseEvent mouseEvent) {
        String value;
        if(flag) {
            value = Goalkeeper.setGoalkeeper("守门员1");
            flag = false;
        } else {
            value = Goalkeeper.setGoalkeeper("守门员2");
        }
        text.appendText(value + "\n");
    }

    public void btn2Click(MouseEvent mouseEvent) {
        String value;
        value = Footballer.addFootballer("球员" + ++count);
        text.appendText(value + "\n");
    }
}
