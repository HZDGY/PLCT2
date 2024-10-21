module com.PLCT {
    exports com.PLCT.Controller to javafx.fxml;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.PLCT to javafx.fxml;
    opens com.PLCT.Controller to javafx.fxml;
    exports com.PLCT;
}
