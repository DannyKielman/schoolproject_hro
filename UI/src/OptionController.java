import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Controller class for the first vista.
 */
public class OptionController {

    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void transactionPane(ActionEvent event) {
        PageNavigator.loadVista(PageNavigator.VISTA_TRANS);
    }

    @FXML
    void saldoPane(ActionEvent event) {
        PageNavigator.loadVista(PageNavigator.VISTA_SALD);
    }

    @FXML
    void homePane(ActionEvent event) {
        PageNavigator.loadVista(PageNavigator.VISTA_1);
    }

}
