/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ian
 */
public class CarController implements Initializable {
@FXML private TextField makeTextField;
@FXML private TextField modelTextField;
@FXML private TextField yearTextField;
@FXML private TextField milageTextField;
@FXML private TextField sellingPriceTextField;
@FXML private TextField featuresListTextField;
        
@FXML private Button createCarButton;  
@FXML private Label errorMessageLabel;

public void createCarButtonPushed()
{
    try 
    {
        
        Car car1 = new Car(this.makeTextField.getText(),this.modelTextField.getText(), 
                Integer.parseInt(this.yearTextField.getText()),
                Double.parseDouble(this.milageTextField.getText()), 
                Double.parseDouble(this.sellingPriceTextField.getText()));
    System.out.printf("Car Created: %s %s%n", car1, car1.getClass());
    }
    catch (IllegalArgumentException e)
    {
        this.errorMessageLabel.setText(e.getMessage());
        this.errorMessageLabel.setVisible(true);
    }
}


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
        this.errorMessageLabel.setVisible(false);  
        
    }    
    
}
