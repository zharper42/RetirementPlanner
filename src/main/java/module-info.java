module edu.uab.zharper.retirementplannergui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens edu.uab.zharper.retirementplannergui to javafx.fxml;
    exports edu.uab.zharper.retirementplannergui;
}
