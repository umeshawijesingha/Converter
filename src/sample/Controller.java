package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {

    double num;
    boolean isNumber;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_meter;

    @FXML
    private Button btn_kilometer;

    @FXML
    private Button btn_volume;

    @FXML
    private Button btn_INR;

    @FXML
    private Button btn_celcius;

    @FXML
    private Button btn_fahrenheit;


    @FXML
    private TextField txtInput;

    @FXML
    private SplitMenuButton btn_condition;

    @FXML
    private MenuItem btn_mm;

    @FXML
    private Label lblInput;

    @FXML
    private Label lblInputUnit;

    @FXML
    private Label lblOutput;

    @FXML
    private Label lblOutputUnit;

    @FXML
    private Button btn_clear;


    @FXML
    void input_mm(ActionEvent event) {

        btn_condition.setText("mm");
        btn_INR.setDisable(true);
        btn_celcius.setDisable(true);
        btn_fahrenheit.setDisable(true);
    }

    @FXML
    void input_cm(ActionEvent event) {

        btn_condition.setText("cm");
        btn_INR.setDisable(true);
        btn_celcius.setDisable(true);
        btn_fahrenheit.setDisable(true);
    }



    @FXML
    void input_m(ActionEvent event) {

        btn_condition.setText("m");
        btn_INR.setDisable(true);
        btn_celcius.setDisable(true);
        btn_fahrenheit.setDisable(true);
    }

    @FXML
    void input_km(ActionEvent event) {

        btn_condition.setText("km");
        btn_INR.setDisable(true);
        btn_celcius.setDisable(true);
        btn_fahrenheit.setDisable(true);
    }

    public boolean checkInputIsANumber(){
        try {
            lblInput.setText(txtInput.getText());
            num=Double.parseDouble(txtInput.getText());
            isNumber = true;
        }catch (NumberFormatException e){
            txtInput.setText("Please enter a number");
            lblInput.setText("");
            lblOutput.setText("");
            lblInputUnit.setText("");
            lblOutputUnit.setText("");
            btn_condition.setText("");
            isNumber = false;
        }
       return isNumber;
    }

    @FXML
    void convertMeter(ActionEvent event) {
        boolean number=checkInputIsANumber();

        if(number) {
            switch (btn_condition.getText()) {
                case "mm": num = num * 0.001;
                           lblInputUnit.setText("Milimeter");
                           break;
                case "cm": num = num * 0.01;
                           lblInputUnit.setText("Centimeter");
                           break;
                case "m": num = num * 1;
                          lblInputUnit.setText("Meter");
                          break;
                default: num = num * 1000;
                         lblInputUnit.setText("Kilometer");
            }
            lblOutput.setText(Double.toString(num));
            lblOutputUnit.setText("Meter");
        }

    }


    @FXML
    void convertKilometer(ActionEvent event) {
        boolean number=checkInputIsANumber();
        if(number) {
        switch (btn_condition.getText()){
            case "mm":num = num * 0.000001;
                      lblInputUnit.setText("Milimeter");
                      break;
            case "cm":num = num * 0.00001;
                      lblInputUnit.setText("Centimeter");
                      break;
            case "km":num = num * 1;
                      lblInputUnit.setText("Kilometer");
                      break;
            default:  num = num * 0.001;
                      lblInputUnit.setText("Meter");
        }
            lblOutput.setText(Double.toString(num));
            lblOutputUnit.setText("Kilometer");
        }

    }


    @FXML
    void convertVolume(ActionEvent event) {

        boolean number=checkInputIsANumber();
        if(number) {
            num = num * num * num;
            lblOutput.setText(Double.toString(num));
            switch(btn_condition.getText()){
                case "mm": lblInputUnit.setText("Milimeter");
                           lblOutputUnit.setText("Cubic Milimeter");
                           break;
                case "cm" :lblInputUnit.setText("Centimeter");
                           lblOutputUnit.setText("Cubic Centimeter");
                           break;
                case "km" :lblInputUnit.setText("Kilometer");
                           lblOutputUnit.setText("Cubic Kilometer");
                           break;
                default:   lblInputUnit.setText("Meter");
                           lblOutputUnit.setText("Cubic Meter");
            }

        }

    }

    @FXML
    void convertINR(ActionEvent event) {

        boolean number = checkInputIsANumber();
        if (number) {
            num = num * 0.37;
            lblOutput.setText(Double.toString(num));
            lblInputUnit.setText("Sri Lankan Rupee");
            lblOutputUnit.setText("Indian Rupee");
        }
    }

    @FXML
    void convertCelcius(ActionEvent event) {

        boolean number = checkInputIsANumber();
        if (number) {
            num = ((num - 32) * 5 ) / 9;
            lblOutput.setText(Double.toString(num));
            lblInputUnit.setText("Fahrenheit");
            lblOutputUnit.setText("Celcius");
        }
    }

    @FXML
    void convertFahrenheit(ActionEvent event) {

        boolean number = checkInputIsANumber();
        if (number) {
            num = ((9 * num) / 5) + 32;
            lblOutput.setText(Double.toString(num));
            lblInputUnit.setText("Celcius");
            lblOutputUnit.setText("Fahrenheit");
        }
    }

    @FXML
    void clear(ActionEvent event) {
        txtInput.setText("");
        lblInput.setText("");
        lblOutput.setText("");
        lblInputUnit.setText("");
        lblOutputUnit.setText("");
        btn_condition.setText("");
        btn_INR.setDisable(false);
        btn_celcius.setDisable(false);
        btn_fahrenheit.setDisable(false);
    }



    @FXML
    void initialize() {



    }
}
