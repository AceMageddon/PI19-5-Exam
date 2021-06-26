package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    TextField count;

    @FXML
    Text result;

    @FXML
    Button send;

    public void send(ActionEvent actionEvent) {
        String check = count.getText();
        String[] words = check.split(" ");
        if (words[1].equals("+")){
            Data.num1 = Integer.parseInt(words[0]);
            Data.num2 = Integer.parseInt(words[2]);
            Data.num3 = Data.num1 + Data.num2;
        }
        if (words[1].equals("-")){
            Data.num1 = Integer.parseInt(words[0]);
            Data.num2 = Integer.parseInt(words[2]);
            Data.num3 = Data.num1 - Data.num2;
        }
        if (words[1].equals("*")){
            Data.num1 = Integer.parseInt(words[0]);
            Data.num2 = Integer.parseInt(words[2]);
            Data.num3 = Data.num1 * Data.num2;
        }if (words[1].equals("/")){
            Data.num1 = Integer.parseInt(words[0]);
            Data.num2 = Integer.parseInt(words[2]);
            Data.num3 = Data.num1 / Data.num2;
        }
        result.setText(String.valueOf(Data.num3));
    }
}
