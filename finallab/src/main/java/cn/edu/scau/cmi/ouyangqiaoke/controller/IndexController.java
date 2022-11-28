package cn.edu.scau.cmi.ouyangqiaoke.controller;

import cn.edu.scau.cmi.ouyangqiaoke.FinalLabApplication;
import cn.edu.scau.cmi.ouyangqiaoke.view.Ex1View;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;


@FXMLController
public class IndexController implements Initializable {

    @FXML
    private Button button;

    @FXML
    private ChoiceBox<String> choiceBox;


    @FXML
    public void onAction(MouseEvent mouseEvent) {
        String value = choiceBox.getValue();
        System.out.println("Button Click ==> " + value);
        if("实验一：单例模式与多例模式".equals(value)) {
            FinalLabApplication.showView(Ex1View.class, Modality.WINDOW_MODAL);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBox.getItems().add("实验一：单例模式与多例模式");
        choiceBox.getItems().add("实验二：简单工厂方法模式");
        choiceBox.getItems().add("实验二：工厂模式");
        choiceBox.getItems().add("实验二：抽象工厂模式");
        choiceBox.getItems().add("实验三：对象适配器模式");
        choiceBox.getItems().add("实验三：类适配器模式");
        choiceBox.getItems().add("实验四：安全型组合模式");
        choiceBox.getItems().add("实验四：一致型组合模式");
    }


}
