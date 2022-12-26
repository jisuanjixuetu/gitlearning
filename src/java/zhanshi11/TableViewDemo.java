package zhanshi11;

import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TableViewDemo extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        TableView<Country> tableView = new TableView<>();
        ObservableList<Country> data = FXCollections.observableArrayList(new Country("USA", "Washington DC", 280, ""),
                new Country("Canada", "Ottawa", 32, ""), new Country("United Kingdom", "London", 60, ""),
                new Country("Germany", "Berlin", 83, ""), new Country("France", "Paris", 60, ""));
        tableView.setItems(data);
        TableColumn countryColumn = new TableColumn("Country");
        countryColumn.setMinWidth(100);
        countryColumn.setCellValueFactory(new PropertyValueFactory<Country, String>("country"));
        TableColumn capitalColumn = new TableColumn("Capital");
        capitalColumn.setMinWidth(100);
        capitalColumn.setCellValueFactory(new PropertyValueFactory<Country, String>("capital"));
        TableColumn populationColumn = new TableColumn("Population (million)");
        populationColumn.setMinWidth(200);
        populationColumn.setCellValueFactory(new PropertyValueFactory<Country, Double>("population"));
        TableColumn descritionColumn = new TableColumn("Description");
        descritionColumn.setMinWidth(200);
        descritionColumn.setCellValueFactory(new PropertyValueFactory<Country, String>("Description"));
        tableView.getColumns().addAll(countryColumn, capitalColumn, populationColumn, descritionColumn);
        Pane pane = new Pane();
        pane.getChildren().add(tableView);
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("TableViewDemo"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in t he window
        primaryStage.show(); // Display the window
    }

    public static class Country {
        private final SimpleStringProperty country;
        private final SimpleStringProperty capital;
        private final SimpleDoubleProperty population;
        private final SimpleStringProperty description;

        private Country(String country, String capital, double population, String desc) {
            this.country = new SimpleStringProperty(country);
            this.capital = new SimpleStringProperty(capital);
            this.population = new SimpleDoubleProperty(population);
            this.description = new SimpleStringProperty(desc);
        }

        public String getCountry() {
            return country.get();
        }

        public void setCountry(String country) {
            this.country.set(country);
        }

        public String getCapital() {
            return capital.get();
        }

        public void setCapital(String capital) {
            this.capital.set(capital);
        }

        public double getPopulation() {
            return population.get();
        }

        public void setPopulation(double population) {
            this.population.set(population);
        }

        public String getDescription() {
            return description.get();
        }

        public void setDemocratic(String desc) {
            this.description.set(desc);
        }
    }
}