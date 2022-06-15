module com.toba.contactslist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.toba.contactslist to javafx.fxml;
    exports com.toba.contactslist;
    exports datamodel;
    opens datamodel to javafx.fxml;
}