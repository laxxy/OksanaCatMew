package com.oksana.cat.dog.oksanacatmew;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MewMewWoofController {

    private static ArrayList<Shos> list = new ArrayList<>();

    static {
        Shos shos1 = new Shos();

        shos1.setName("(hay-staw) Oat staw");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos1.getName());
        shos1.setDM("");
        shos1.setME("7");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("34");
        shos1.setFiber("398");
        shos1.setSugar("20");
        shos1.setFat("22");
        shos1.setCa("4");
        shos1.setP("0.7");

        list.add(shos1);

        Shos shos2 = new Shos();

        shos2.setName("(silage) grass matured");
        shos2.setType(Type.silage_haylage);
        shos2.setFEEDS(shos2.getName());
        shos2.setDM("");
        shos2.setME("10");
        shos2.setNEL((Double.parseDouble(shos2.getME()) * 0.6) + "");
        shos2.setCP("125");
        shos2.setFiber("340");
        shos2.setSugar("0");
        shos2.setFat("52");
        shos2.setCa("3");
        shos2.setP("2");

        Shos shos3 = new Shos();

        shos3.setName("(concentrate) Brewer's yest, dried");
        shos3.setType(Type.Concentrates);
        shos3.setFEEDS(shos3.getName());
        shos3.setDM("");
        shos3.setME("11.7");
        shos3.setNEL((Double.parseDouble(shos3.getME()) * 0.6) + "");
        shos3.setCP("443");
        shos3.setFiber("2");
        shos3.setSugar("0");
        shos3.setFat("11");
        shos3.setCa("3.2");
        shos3.setP("7.8");

        Shos shos4 = new Shos();

        shos4.setName("(silage) Corn silage");
        shos4.setType(Type.silage_haylage);
        shos4.setFEEDS(shos4.getName());
        shos4.setDM("");
        shos4.setME("10.8");
        shos4.setNEL((Double.parseDouble(shos4.getME()) * 0.6) + "");
        shos4.setCP("110");
        shos4.setFiber("233");
        shos4.setSugar("211");
        shos4.setFat("57");
        shos4.setCa("0");
        shos4.setP("0");

        list.add(shos1);
        list.add(shos3);
        list.add(shos2);
        list.add(shos4);
    }

    @FXML
    public Label text;
    @FXML
    private ComboBox<String> combo;
    @FXML
    private TableView<Shos> tableView;
    @FXML
    private TableColumn FEEDS;
    @FXML
    private TableColumn DM;
    @FXML
    private TableColumn ME;
    @FXML
    private TableColumn NEL;
    @FXML
    private TableColumn CP;
    @FXML
    private TableColumn Fiber;
    @FXML
    private TableColumn Sugar;
    @FXML
    private TableColumn Fat;
    @FXML
    private TableColumn Ca;
    @FXML
    private TableColumn P;

    private List<String> collect = new ArrayList<>();

    @FXML
    protected void loadData() {
        if (!collect.isEmpty()) {
            collect.clear();
            text.setText("");
        }
        String trim = MainController.getValue().trim();
        collect = Stream
                .of(trim.split(" "))
                .collect(Collectors.toList());
        text.setText(trim);
    }

    @FXML
    protected void deleteOnClick() {
        ObservableList<Shos> items = tableView.getItems();
        Shos selectedItem = tableView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            String feeds = selectedItem.getFEEDS();
            List<Shos> collect = items.stream().filter(k -> k.getFEEDS().equals(feeds)).collect(Collectors.toList());

            tableView.getItems().removeAll(collect);
        }
    }

    @FXML
    protected void calcOnClick() {
        String selectedItem = combo.getSelectionModel().getSelectedItem();
        Shos shos = list.stream().filter(k -> k.getName().equals(selectedItem)).findAny().get();

        FEEDS.setCellValueFactory(new PropertyValueFactory<>("FEEDS"));
        DM.setCellValueFactory(new PropertyValueFactory<>("DM"));
        ME.setCellValueFactory(new PropertyValueFactory<>("ME"));
        NEL.setCellValueFactory(new PropertyValueFactory<>("NEL"));
        CP.setCellValueFactory(new PropertyValueFactory<>("CP"));
        Fiber.setCellValueFactory(new PropertyValueFactory<>("Fiber"));
        Sugar.setCellValueFactory(new PropertyValueFactory<>("Sugar"));
        Fat.setCellValueFactory(new PropertyValueFactory<>("Fat"));
        Ca.setCellValueFactory(new PropertyValueFactory<>("Ca"));
        P.setCellValueFactory(new PropertyValueFactory<>("P"));


        String type = switchType(shos.getType());

        Shos shos2 = new Shos();
        double w = Double.parseDouble(type);
        System.out.println(shos.getType());
        System.out.println(w);
        shos2.setFEEDS(selectedItem);
        shos2.setDM(type);
        shos2.setME("");
        shos2.setNEL(String.format("%.2f", w * Double.parseDouble(shos.getNEL())));
        shos2.setCP(String.format("%.2f", w * Double.parseDouble(shos.getCP())));
        shos2.setFiber(String.format("%.2f", w * Double.parseDouble(shos.getFiber())));
        shos2.setSugar(String.format("%.2f", w * Double.parseDouble(shos.getSugar())));
        shos2.setFat(String.format("%.2f", w * Double.parseDouble(shos.getFat())));
        shos2.setCa(String.format("%.2f", w * Double.parseDouble(shos.getCa())));
        shos2.setP(String.format("%.2f", w * Double.parseDouble(shos.getP())));

        ObservableList<Shos> items = tableView.getItems();
        items.addAll(shos, shos2);
        tableView.setItems(items);
    }

    private String switchType(Type type) {
        return switch (type) {
            case hay_straw -> MainController.getHay_straw_val();
            case silage_haylage -> MainController.getSilage_haylage_val();
            case roots -> MainController.getRoots_stable_val();
            case grass -> MainController.getGrass_stable_val();
            case Concentrates -> MainController.getConcentrates_stable_val();
        };
    }

    public static class Shos {

        private Type type;
        private String name;
        private String FEEDS;
        private String DM;
        private String ME;
        private String NEL;
        private String CP;
        private String Fiber;
        private String Sugar;
        private String Fat;
        private String Ca;
        private String P;

        public String getME() {
            return ME;
        }

        public Shos setME(String ME) {
            this.ME = ME;
            return this;
        }

        public String getNEL() {
            return NEL;
        }

        public Shos setNEL(String NEL) {
            this.NEL = NEL;
            return this;
        }

        public String getCP() {
            return CP;
        }

        public Shos setCP(String CP) {
            this.CP = CP;
            return this;
        }

        public String getFiber() {
            return Fiber;
        }

        public Shos setFiber(String fiber) {
            Fiber = fiber;
            return this;
        }

        public String getSugar() {
            return Sugar;
        }

        public Shos setSugar(String sugar) {
            Sugar = sugar;
            return this;
        }

        public String getFat() {
            return Fat;
        }

        public Shos setFat(String fat) {
            Fat = fat;
            return this;
        }

        public String getCa() {
            return Ca;
        }

        public Shos setCa(String ca) {
            Ca = ca;
            return this;
        }

        public String getP() {
            return P;
        }

        public Shos setP(String p) {
            P = p;
            return this;
        }

        public String getFEEDS() {
            return FEEDS;
        }

        public Shos setFEEDS(String FEEDS) {
            this.FEEDS = FEEDS;
            return this;
        }

        public String getDM() {
            return DM;
        }

        public Shos setDM(String DM) {
            this.DM = DM;
            return this;
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
