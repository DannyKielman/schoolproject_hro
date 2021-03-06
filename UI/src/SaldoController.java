import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Controller class for the first vista.
 */
public class SaldoController {

    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void nextPane(ActionEvent event) {
        PageNavigator.loadVista(PageNavigator.VISTA_1);
    }

}
