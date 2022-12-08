package com.oksana.cat.dog.oksanacatmew;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.*;
import java.util.stream.Collectors;

public class MewMewWoofController {

    private static ArrayList<Shos> list = new ArrayList<>();
    private static ArrayList<Shos> listTable2 = new ArrayList<>();

    static {
        Shos total = new Shos();
        Shos norm = new Shos();
        total
                .setFEEDS("TOTAL");
        norm
                .setFEEDS("NORM");

        Collections.addAll(listTable2, total, norm);


        Shos shos1 = new Shos();
        shos1.setName("(hays) Lucerne early-flowering");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos1.getName());
        shos1.setDM("");
        shos1.setME("8.2");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("225");
        shos1.setFiber("302");
        shos1.setSugar("0");
        shos1.setFat("13");
        shos1.setCa("11.3");
        shos1.setP("1.8");

        Shos shos2 = new Shos();
        shos2.setName("(hays) Clover red");
        shos2.setType(Type.hay_straw);
        shos2.setFEEDS(shos2.getName());
        shos2.setDM("");
        shos2.setME("9.6");
        shos2.setNEL((Double.parseDouble(shos2.getME()) * 0.6) + "");
        shos2.setCP("184");
        shos2.setFiber("266");
        shos2.setSugar("0");
        shos2.setFat("39");
        shos2.setCa("15.3");
        shos2.setP("2.5");

        Shos shos3 = new Shos();
        shos3.setName("(hays) Grass poor-quality");
        shos3.setType(Type.hay_straw);
        shos3.setFEEDS(shos3.getName());
        shos3.setDM("");
        shos3.setME("7");
        shos3.setNEL((Double.parseDouble(shos3.getME()) * 0.6) + "");
        shos3.setCP("55");
        shos3.setFiber("380");
        shos3.setSugar("0");
        shos3.setFat("16");
        shos3.setCa("2.5");
        shos3.setP("1.5");

        Shos shos4 = new Shos();
        shos4.setName("(hays) Grass good-quality");
        shos4.setType(Type.hay_straw);
        shos4.setFEEDS(shos4.getName());
        shos4.setDM("");
        shos4.setME("9.5");
        shos4.setNEL((Double.parseDouble(shos4.getME()) * 0.6) + "");
        shos4.setCP("110");
        shos4.setFiber("298");
        shos4.setSugar("0");
        shos4.setFat("18");
        shos4.setCa("7");
        shos4.setP("3.5");

        Shos shos5 = new Shos();
        shos5.setName("(straw) Oat");
        shos5.setType(Type.hay_straw);
        shos5.setFEEDS(shos5.getName());
        shos5.setDM("");
        shos5.setME("7");
        shos5.setNEL((Double.parseDouble(shos5.getME()) * 0.6) + "");
        shos5.setCP("34");
        shos5.setFiber("394");
        shos5.setSugar("20");
        shos5.setFat("22");
        shos5.setCa("4");
        shos5.setP("0.7");

        Shos shos6 = new Shos();
        shos6.setName("(straw) Oat ammoniated");
        shos6.setType(Type.hay_straw);
        shos6.setFEEDS(shos6.getName());
        shos6.setDM("");
        shos6.setME("7.8");
        shos6.setNEL((Double.parseDouble(shos6.getME()) * 0.6) + "");
        shos6.setCP("75");
        shos6.setFiber("431");
        shos6.setSugar("16");
        shos6.setFat("18");
        shos6.setCa("0");
        shos6.setP("0");

        Shos shos7 = new Shos();
        shos7.setName("(straw) Barley");
        shos7.setType(Type.hay_straw);
        shos7.setFEEDS(shos7.getName());
        shos7.setDM("");
        shos7.setME("6.5");
        shos7.setNEL((Double.parseDouble(shos7.getME()) * 0.6) + "");
        shos7.setCP("38");
        shos7.setFiber("394");
        shos7.setSugar("32");
        shos7.setFat("21");
        shos7.setCa("4.5");
        shos7.setP("0.7");

        Shos shos8 = new Shos();
        shos8.setName("(straw) Barley ammoniated");
        shos8.setType(Type.hay_straw);
        shos8.setFEEDS(shos8.getName());
        shos8.setDM("");
        shos8.setME("7.5");
        shos8.setNEL((Double.parseDouble(shos8.getME()) * 0.6) + "");
        shos8.setCP("70");
        shos8.setFiber("450");
        shos8.setSugar("20");
        shos8.setFat("15");
        shos8.setCa("0");
        shos8.setP("0");

        Shos shos9 = new Shos();
        shos9.setName("(straw) Bean");
        shos9.setType(Type.hay_straw);
        shos9.setFEEDS(shos9.getName());
        shos9.setDM("");
        shos9.setME("7.4");
        shos9.setNEL((Double.parseDouble(shos9.getME()) * 0.6) + "");
        shos9.setCP("52");
        shos9.setFiber("501");
        shos9.setSugar("19");
        shos9.setFat("9");
        shos9.setCa("0");
        shos9.setP("0");

        Shos shos10 = new Shos();
        shos10.setName("(straw) Pea");
        shos10.setType(Type.hay_straw);
        shos10.setFEEDS(shos10.getName());
        shos10.setDM("");
        shos10.setME("6.7");
        shos10.setNEL((Double.parseDouble(shos10.getME()) * 0.6) + "");
        shos10.setCP("105");
        shos10.setFiber("410");
        shos10.setSugar("0");
        shos10.setFat("19");
        shos10.setCa("0");
        shos10.setP("0");

        Shos shos11 = new Shos();
        shos11.setName("(straw) Wheat");
        shos11.setType(Type.hay_straw);
        shos11.setFEEDS(shos11.getName());
        shos11.setDM("");
        shos11.setME("6.1");
        shos11.setNEL((Double.parseDouble(shos11.getME()) * 0.6) + "");
        shos11.setCP("34");
        shos11.setFiber("417");
        shos11.setSugar("0");
        shos11.setFat("15");
        shos11.setCa("0");
        shos11.setP("0");

        Shos shos12 = new Shos();
        shos12.setName("(straw) Wheat ammoniated");
        shos12.setType(Type.hay_straw);
        shos12.setFEEDS(shos12.getName());
        shos12.setDM("");
        shos12.setME("7.4");
        shos12.setNEL((Double.parseDouble(shos12.getME()) * 0.6) + "");
        shos12.setCP("68");
        shos12.setFiber("434");
        shos12.setSugar("13");
        shos12.setFat("13");
        shos12.setCa("0");
        shos12.setP("0");


        Shos shos13 = new Shos();
        shos13.setName("(silage_haylage) Grass matured");
        shos13.setType(Type.silage_haylage);
        shos13.setFEEDS(shos13.getName());
        shos13.setDM("");
        shos13.setME("10");
        shos13.setNEL((Double.parseDouble(shos13.getME()) * 0.6) + "");
        shos13.setCP("125");
        shos13.setFiber("340");
        shos13.setSugar("0");
        shos13.setFat("52");
        shos13.setCa("3");
        shos13.setP("2");

        Shos shos14 = new Shos();
        shos14.setName("(silage_haylage) Grass young");
        shos14.setType(Type.silage_haylage);
        shos14.setFEEDS(shos14.getName());
        shos14.setDM("");
        shos14.setME("11.6");
        shos14.setNEL((Double.parseDouble(shos14.getME()) * 0.6) + "");
        shos14.setCP("186");
        shos14.setFiber("270");
        shos14.setSugar("0");
        shos14.setFat("52");
        shos14.setCa("8");
        shos14.setP("4");

        Shos shos15 = new Shos();
        shos15.setName("(silage_haylage) Corn silage");
        shos15.setType(Type.silage_haylage);
        shos15.setFEEDS(shos15.getName());
        shos15.setDM("");
        shos15.setME("10.8");
        shos15.setNEL((Double.parseDouble(shos15.getME()) * 0.6) + "");
        shos15.setCP("110");
        shos15.setFiber("233");
        shos15.setSugar("211");
        shos15.setFat("57");
        shos15.setCa("0");
        shos15.setP("0");

        Shos shos16 = new Shos();
        shos16.setName("(silage_haylage) Barley whole crop");
        shos16.setType(Type.silage_haylage);
        shos16.setFEEDS(shos16.getName());
        shos16.setDM("");
        shos16.setME("8.7");
        shos16.setNEL((Double.parseDouble(shos16.getME()) * 0.6) + "");
        shos16.setCP("64");
        shos16.setFiber("248");
        shos16.setSugar("267");
        shos16.setFat("15");
        shos16.setCa("0");
        shos16.setP("0");

        Shos shos17 = new Shos();
        shos17.setName("(silage_haylage) Potato");
        shos17.setType(Type.silage_haylage);
        shos17.setFEEDS(shos17.getName());
        shos17.setDM("");
        shos17.setME("11.8");
        shos17.setNEL((Double.parseDouble(shos17.getME()) * 0.6) + "");
        shos17.setCP("81");
        shos17.setFiber("26");
        shos17.setSugar("0");
        shos17.setFat("19");
        shos17.setCa("0");
        shos17.setP("0");

        Shos shos18 = new Shos();
        shos18.setName("(silage_haylage) Lucerne");
        shos18.setType(Type.silage_haylage);
        shos18.setFEEDS(shos18.getName());
        shos18.setDM("");
        shos18.setME("8.5");
        shos18.setNEL((Double.parseDouble(shos18.getME()) * 0.6) + "");
        shos18.setCP("168");
        shos18.setFiber("296");
        shos18.setSugar("16");
        shos18.setFat("84");
        shos18.setCa("0");
        shos18.setP("0");


        Shos shos19 = new Shos();
        shos19.setName("(concentrates) Brewer's yest dried");
        shos19.setType(Type.Concentrates);
        shos19.setFEEDS(shos19.getName());
        shos19.setDM("");
        shos19.setME("11.7");
        shos19.setNEL((Double.parseDouble(shos19.getME()) * 0.6) + "");
        shos19.setCP("443");
        shos19.setFiber("2");
        shos19.setSugar("0");
        shos19.setFat("11");
        shos19.setCa("3.2");
        shos19.setP("7.8");

        Shos shos20 = new Shos();
        shos20.setName("(concentrates) Barley");
        shos20.setType(Type.Concentrates);
        shos20.setFEEDS(shos20.getName());
        shos20.setDM("");
        shos20.setME("12.8");
        shos20.setNEL((Double.parseDouble(shos20.getME()) * 0.6) + "");
        shos20.setCP("115");
        shos20.setFiber("53");
        shos20.setSugar("599");
        shos20.setFat("17");
        shos20.setCa("0.5");
        shos20.setP("4");

        Shos shos21 = new Shos();
        shos21.setName("(concentrates) Barley, brewer's grains");
        shos21.setType(Type.Concentrates);
        shos21.setFEEDS(shos21.getName());
        shos21.setDM("");
        shos21.setME("11.2");
        shos21.setNEL((Double.parseDouble(shos21.getME()) * 0.6) + "");
        shos21.setCP("234");
        shos21.setFiber("176");
        shos21.setSugar("51");
        shos21.setFat("77");
        shos21.setCa("0");
        shos21.setP("0");

        Shos shos22 = new Shos();
        shos22.setName("(concentrates) Barley, malt culms");
        shos22.setType(Type.Concentrates);
        shos22.setFEEDS(shos22.getName());
        shos22.setDM("");
        shos22.setME("11.2");
        shos22.setNEL((Double.parseDouble(shos22.getME()) * 0.6) + "");
        shos22.setCP("271");
        shos22.setFiber("156");
        shos22.setSugar("171");
        shos22.setFat("22");
        shos22.setCa("0");
        shos22.setP("0");

        Shos shos23 = new Shos();
        shos23.setName("(concentrates) Grain distiller's grains");
        shos23.setType(Type.Concentrates);
        shos23.setFEEDS(shos23.getName());
        shos23.setDM("");
        shos23.setME("14.7");
        shos23.setNEL((Double.parseDouble(shos23.getME()) * 0.6) + "");
        shos23.setCP("265");
        shos23.setFiber("200");
        shos23.setSugar("0");
        shos23.setFat("65");
        shos23.setCa("0");
        shos23.setP("0");

        Shos shos24 = new Shos();
        shos24.setName("(concentrates) Grain distiller's dark grains");
        shos24.setType(Type.Concentrates);
        shos24.setFEEDS(shos24.getName());
        shos24.setDM("");
        shos24.setME("14.8");
        shos24.setNEL((Double.parseDouble(shos24.getME()) * 0.6) + "");
        shos24.setCP("317");
        shos24.setFiber("89");
        shos24.setSugar("75");
        shos24.setFat("108");
        shos24.setCa("0");
        shos24.setP("0");

        Shos shos25 = new Shos();
        shos25.setName("(concentrates) Malt distiller's grains");
        shos25.setType(Type.Concentrates);
        shos25.setFEEDS(shos25.getName());
        shos25.setDM("");
        shos25.setME("10.2");
        shos25.setNEL((Double.parseDouble(shos25.getME()) * 0.6) + "");
        shos25.setCP("211");
        shos25.setFiber("199");
        shos25.setSugar("23");
        shos25.setFat("86");
        shos25.setCa("1.7");
        shos25.setP("3.7");

        Shos shos26 = new Shos();
        shos26.setName("(concentrates) Malt distiller's dark grains");
        shos26.setType(Type.Concentrates);
        shos26.setFEEDS(shos26.getName());
        shos26.setDM("");
        shos26.setME("12.2");
        shos26.setNEL((Double.parseDouble(shos26.getME()) * 0.6) + "");
        shos26.setCP("275");
        shos26.setFiber("121");
        shos26.setSugar("65");
        shos26.setFat("67");
        shos26.setCa("0");
        shos26.setP("0");

        Shos shos27 = new Shos();
        shos27.setName("(concentrates) Maize");
        shos27.setType(Type.Concentrates);
        shos27.setFEEDS(shos27.getName());
        shos27.setDM("");
        shos27.setME("14.2");
        shos27.setNEL((Double.parseDouble(shos27.getME()) * 0.6) + "");
        shos27.setCP("98");
        shos27.setFiber("24");
        shos27.setSugar("717");
        shos27.setFat("42");
        shos27.setCa("0.3");
        shos27.setP("2.7");

        Shos shos28 = new Shos();
        shos28.setName("(concentrates) Maize flaked");
        shos28.setType(Type.Concentrates);
        shos28.setFEEDS(shos28.getName());
        shos28.setDM("");
        shos28.setME("15");
        shos28.setNEL((Double.parseDouble(shos28.getME()) * 0.6) + "");
        shos28.setCP("110");
        shos28.setFiber("17");
        shos28.setSugar("0");
        shos28.setFat("49");
        shos28.setCa("0");
        shos28.setP("0");

        Shos shos29 = new Shos();
        shos29.setName("(concentrates) Maize gluten feed");
        shos29.setType(Type.Concentrates);
        shos29.setFEEDS(shos29.getName());
        shos29.setDM("");
        shos29.setME("12.7");
        shos29.setNEL((Double.parseDouble(shos29.getME()) * 0.6) + "");
        shos29.setCP("262");
        shos29.setFiber("39");
        shos29.setSugar("210");
        shos29.setFat("38");
        shos29.setCa("0");
        shos29.setP("0");

        Shos shos30 = new Shos();
        shos30.setName("(concentrates) Maize gluten meal");
        shos30.setType(Type.Concentrates);
        shos30.setFEEDS(shos30.getName());
        shos30.setDM("");
        shos30.setME("17.5");
        shos30.setNEL((Double.parseDouble(shos30.getME()) * 0.6) + "");
        shos30.setCP("669");
        shos30.setFiber("12");
        shos30.setSugar("158");
        shos30.setFat("29");
        shos30.setCa("1.6");
        shos30.setP("5");

        Shos shos31 = new Shos();
        shos31.setName("(concentrates) Millet");
        shos31.setType(Type.Concentrates);
        shos31.setFEEDS(shos31.getName());
        shos31.setDM("");
        shos31.setME("11.3");
        shos31.setNEL((Double.parseDouble(shos31.getME()) * 0.6) + "");
        shos31.setCP("121");
        shos31.setFiber("93");
        shos31.setSugar("0");
        shos31.setFat("44");
        shos31.setCa("0.6");
        shos31.setP("3.1");

        Shos shos32 = new Shos();
        shos32.setName("(concentrates) Oats");
        shos32.setType(Type.Concentrates);
        shos32.setFEEDS(shos32.getName());
        shos32.setDM("");
        shos32.setME("12");
        shos32.setNEL((Double.parseDouble(shos32.getME()) * 0.6) + "");
        shos32.setCP("109");
        shos32.setFiber("105");
        shos32.setSugar("482");
        shos32.setFat("49");
        shos32.setCa("0.8");
        shos32.setP("3.7");

        Shos shos33 = new Shos();
        shos33.setName("(concentrates) Oats naked");
        shos33.setType(Type.Concentrates);
        shos33.setFEEDS(shos33.getName());
        shos33.setDM("");
        shos33.setME("14.8");
        shos33.setNEL((Double.parseDouble(shos33.getME()) * 0.6) + "");
        shos33.setCP("119");
        shos33.setFiber("45");
        shos33.setSugar("597");
        shos33.setFat("97");
        shos33.setCa("0");
        shos33.setP("0");

        Shos shos34 = new Shos();
        shos34.setName("(concentrates) Oat husks");
        shos34.setType(Type.Concentrates);
        shos34.setFEEDS(shos34.getName());
        shos34.setDM("");
        shos34.setME("4.9");
        shos34.setNEL((Double.parseDouble(shos34.getME()) * 0.6) + "");
        shos34.setCP("21");
        shos34.setFiber("351");
        shos34.setSugar("0");
        shos34.setFat("11");
        shos34.setCa("0");
        shos34.setP("0");

        Shos shos35 = new Shos();
        shos35.setName("(concentrates) Pot ale syrup");
        shos35.setType(Type.Concentrates);
        shos35.setFEEDS(shos35.getName());
        shos35.setDM("");
        shos35.setME("15.4");
        shos35.setNEL((Double.parseDouble(shos35.getME()) * 0.6) + "");
        shos35.setCP("374");
        shos35.setFiber("2");
        shos35.setSugar("36");
        shos35.setFat("2");
        shos35.setCa("0");
        shos35.setP("0");

        Shos shos36 = new Shos();
        shos36.setName("(concentrates) Rice brown");
        shos36.setType(Type.Concentrates);
        shos36.setFEEDS(shos36.getName());
        shos36.setDM("");
        shos36.setME("0");
        shos36.setNEL((Double.parseDouble(shos36.getME()) * 0.6) + "");
        shos36.setCP("111");
        shos36.setFiber("0");
        shos36.setSugar("0");
        shos36.setFat("23");
        shos36.setCa("0");
        shos36.setP("0");

        Shos shos37 = new Shos();
        shos37.setName("(concentrates) Rice bran (extracted)");
        shos37.setType(Type.Concentrates);
        shos37.setFEEDS(shos37.getName());
        shos37.setDM("");
        shos37.setME("11");
        shos37.setNEL((Double.parseDouble(shos37.getME()) * 0.6) + "");
        shos37.setCP("166");
        shos37.setFiber("0");
        shos37.setSugar("256");
        shos37.setFat("11");
        shos37.setCa("0");
        shos37.setP("0");

        Shos shos38 = new Shos();
        shos38.setName("(concentrates) Rice polished");
        shos38.setType(Type.Concentrates);
        shos38.setFEEDS(shos38.getName());
        shos38.setDM("");
        shos38.setME("15");
        shos38.setNEL((Double.parseDouble(shos38.getME()) * 0.6) + "");
        shos38.setCP("77");
        shos38.setFiber("17");
        shos38.setSugar("0");
        shos38.setFat("5");
        shos38.setCa("0");
        shos38.setP("0");

        Shos shos39 = new Shos();
        shos39.setName("(concentrates) Rye");
        shos39.setType(Type.Concentrates);
        shos39.setFEEDS(shos39.getName());
        shos39.setDM("");
        shos39.setME("14");
        shos39.setNEL((Double.parseDouble(shos39.getME()) * 0.6) + "");
        shos39.setCP("124");
        shos39.setFiber("26");
        shos39.setSugar("0");
        shos39.setFat("19");
        shos39.setCa("0.7");
        shos39.setP("3.7");

        Shos shos40 = new Shos();
        shos40.setName("(concentrates) Sorghum");
        shos40.setType(Type.Concentrates);
        shos40.setFEEDS(shos40.getName());
        shos40.setDM("");
        shos40.setME("13.4");
        shos40.setNEL((Double.parseDouble(shos40.getME()) * 0.6) + "");
        shos40.setCP("108");
        shos40.setFiber("21");
        shos40.setSugar("745");
        shos40.setFat("43");
        shos40.setCa("0.5");
        shos40.setP("3.5");

        Shos shos41 = new Shos();
        shos41.setName("(concentrates) Wheat");
        shos41.setType(Type.Concentrates);
        shos41.setFEEDS(shos41.getName());
        shos41.setDM("");
        shos41.setME("13.6");
        shos41.setNEL((Double.parseDouble(shos41.getME()) * 0.6) + "");
        shos41.setCP("124");
        shos41.setFiber("26");
        shos41.setSugar("701");
        shos41.setFat("19");
        shos41.setCa("0.5");
        shos41.setP("3.5");

        Shos shos42 = new Shos();
        shos42.setName("(concentrates) Wheat bran");
        shos42.setType(Type.Concentrates);
        shos42.setFEEDS(shos42.getName());
        shos42.setDM("");
        shos42.setME("10.1");
        shos42.setNEL((Double.parseDouble(shos42.getME()) * 0.6) + "");
        shos42.setCP("170");
        shos42.setFiber("114");
        shos42.setSugar("259");
        shos42.setFat("45");
        shos42.setCa("1.6");
        shos42.setP("13.6");

        Shos shos43 = new Shos();
        shos43.setName("(concentrates) Wheat feed");
        shos43.setType(Type.Concentrates);
        shos43.setFEEDS(shos43.getName());
        shos43.setDM("");
        shos43.setME("12");
        shos43.setNEL((Double.parseDouble(shos43.getME()) * 0.6) + "");
        shos43.setCP("178");
        shos43.setFiber("74");
        shos43.setSugar("333");
        shos43.setFat("45");
        shos43.setCa("1.1");
        shos43.setP("8");

        Shos shos44 = new Shos();
        shos44.setName("(concentrates) Wheat germ meal");
        shos44.setType(Type.Concentrates);
        shos44.setFEEDS(shos44.getName());
        shos44.setDM("");
        shos44.setME("0");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("279");
        shos44.setFiber("0");
        shos44.setSugar("0");
        shos44.setFat("82");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos45 = new Shos();
        shos44.setName("(grass) Barley in flower");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos45.getName());
        shos44.setDM("");
        shos44.setME("10");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("68");
        shos44.setFiber("316");
        shos44.setSugar("0");
        shos44.setFat("16");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos46 = new Shos();
        shos44.setName("(grass) Cabbage");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos46.getName());
        shos44.setDM("");
        shos44.setME("10.8");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("160");
        shos44.setFiber("160");
        shos44.setSugar("320");
        shos44.setFat("47");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos47 = new Shos();
        shos44.setName("(grass) Clover red early flowering");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos47.getName());
        shos44.setDM("");
        shos44.setME("10.2");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("179");
        shos44.setFiber("274");
        shos44.setSugar("0");
        shos44.setFat("37");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos48 = new Shos();
        shos44.setName("(grass) Clower white early flowering");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos48.getName());
        shos44.setDM("");
        shos44.setME("9");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("237");
        shos44.setFiber("232");
        shos44.setSugar("84");
        shos44.setFat("42");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos49 = new Shos();
        shos44.setName("(grass) Grass young 75 80D");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos49.getName());
        shos44.setDM("");
        shos44.setME("12");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("156");
        shos44.setFiber("130");
        shos44.setSugar("0");
        shos44.setFat("55");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos50 = new Shos();
        shos44.setName("(grass) Grass mature 60 65D");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos50.getName());
        shos44.setDM("");
        shos44.setME("10");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("100");
        shos44.setFiber("200");
        shos44.setSugar("0");
        shos44.setFat("40");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos51 = new Shos();
        shos44.setName("(grass) Kale");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos51.getName());
        shos44.setDM("");
        shos44.setME("11");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("157");
        shos44.setFiber("179");
        shos44.setSugar("284");
        shos44.setFat("36");
        shos44.setCa("21");
        shos44.setP("3.2");
        
        Shos shos52 = new Shos();
        shos44.setName("(grass) Lucerne early flowering");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos52.getName());
        shos44.setDM("");
        shos44.setME("8.2");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("171");
        shos44.setFiber("300");
        shos44.setSugar("0");
        shos44.setFat("17");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos53 = new Shos();
        shos44.setName("(grass) Maize");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos53.getName());
        shos44.setDM("");
        shos44.setME("8.8");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("89");
        shos44.setFiber("289");
        shos44.setSugar("0");
        shos44.setFat("26");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos54 = new Shos();
        shos44.setName("(grass) Rape");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos54.getName());
        shos44.setDM("");
        shos44.setME("9.5");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("200");
        shos44.setFiber("250");
        shos44.setSugar("0");
        shos44.setFat("57");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos55 = new Shos();
        shos44.setName("(grass) Sugar beet tops");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos55.getName());
        shos44.setDM("");
        shos44.setME("9.9");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("125");
        shos44.setFiber("100");
        shos44.setSugar("0");
        shos44.setFat("31");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos56 = new Shos();
        shos44.setName("(grass) Sugarcane");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos56.getName());
        shos44.setDM("");
        shos44.setME("8.9");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("97");
        shos44.setFiber("312");
        shos44.setSugar("0");
        shos44.setFat("22");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos57 = new Shos();
        shos44.setName("(grass) Swede tops");
        shos44.setType(Type.grass);
        shos44.setFEEDS(shos57.getName());
        shos44.setDM("");
        shos44.setME("9.2");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("192");
        shos44.setFiber("125");
        shos44.setSugar("0");
        shos44.setFat("42");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos58 = new Shos();
        shos44.setName("(roots) Artichoke Jerusalem");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos58.getName());
        shos44.setDM("");
        shos44.setME("13.2");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("75");
        shos44.setFiber("35");
        shos44.setSugar("0");
        shos44.setFat("10");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos59 = new Shos();
        shos44.setName("(roots) Cassava");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos59.getName());
        shos44.setDM("");
        shos44.setME("12.8");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("35");
        shos44.setFiber("43");
        shos44.setSugar("692");
        shos44.setFat("9");
        shos44.setCa("2");
        shos44.setP("1");
        
        Shos shos60 = new Shos();
        shos44.setName("(roots) Fodder beet");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos60.getName());
        shos44.setDM("");
        shos44.setME("11.9");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("63");
        shos44.setFiber("56");
        shos44.setSugar("660");
        shos44.setFat("3");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos61 = new Shos();
        shos44.setName("(roots) Mangels");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos61.getName());
        shos44.setDM("");
        shos44.setME("12.4");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("83");
        shos44.setFiber("58");
        shos44.setSugar("0");
        shos44.setFat("8");
        shos44.setCa("2.9");
        shos44.setP("2.1");
        
        Shos shos62 = new Shos();
        shos44.setName("(roots) Potatoes");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos62.getName());
        shos44.setDM("");
        shos44.setME("12.5");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("90");
        shos44.setFiber("38");
        shos44.setSugar("638");
        shos44.setFat("5");
        shos44.setCa("1");
        shos44.setP("2.1");
        
        Shos shos63 = new Shos();
        shos44.setName("(roots) Sugar beet palp dried");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos63.getName());
        shos44.setDM("");
        shos44.setME("12.7");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("99");
        shos44.setFiber("203");
        shos44.setSugar("82");
        shos44.setFat("7");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos64 = new Shos();
        shos44.setName("(roots) Sugar beet palp dried molassed");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos64.getName());
        shos44.setDM("");
        shos44.setME("12.5");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("110");
        shos44.setFiber("132");
        shos44.setSugar("300");
        shos44.setFat("4");
        shos44.setCa("5.7");
        shos44.setP("0.8");
        
        Shos shos65 = new Shos();
        shos44.setName("(roots) Sugar beet molasses");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos65.getName());
        shos44.setDM("");
        shos44.setME("12.9");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("47");
        shos44.setFiber("0");
        shos44.setSugar("632");
        shos44.setFat("0");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos66 = new Shos();
        shos44.setName("(roots) Sugarcane molasses");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos66.getName());
        shos44.setDM("");
        shos44.setME("0");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("55");
        shos44.setFiber("0");
        shos44.setSugar("657");
        shos44.setFat("4");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos67 = new Shos();
        shos44.setName("(roots) Swedes");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos67.getName());
        shos44.setDM("");
        shos44.setME("12.8");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("108");
        shos44.setFiber("100");
        shos44.setSugar("587");
        shos44.setFat("17");
        shos44.setCa("3.6");
        shos44.setP("3.2");
        
        Shos shos68 = new Shos();
        shos44.setName("(roots) Sweet potatoes");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos68.getName());
        shos44.setDM("");
        shos44.setME("12.7");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("39");
        shos44.setFiber("38");
        shos44.setSugar("0");
        shos44.setFat("16");
        shos44.setCa("0");
        shos44.setP("0");
        
        Shos shos69 = new Shos();
        shos44.setName("(roots) Turnips");
        shos44.setType(Type.roots);
        shos44.setFEEDS(shos69.getName());
        shos44.setDM("");
        shos44.setME("11.2");
        shos44.setNEL((Double.parseDouble(shos44.getME()) * 0.6) + "");
        shos44.setCP("122");
        shos44.setFiber("111");
        shos44.setSugar("0");
        shos44.setFat("22");
        shos44.setCa("5");
        shos44.setP("3.6");

        list.add(shos1);
        list.add(shos3);
        list.add(shos2);
        list.add(shos4);
        list.add(shos5);
        list.add(shos6);
        list.add(shos7);
        list.add(shos8);
        list.add(shos9);
        list.add(shos10);
        list.add(shos11);
        list.add(shos12);
        list.add(shos13);
        list.add(shos14);
        list.add(shos15);
        list.add(shos16);
        list.add(shos17);
        list.add(shos18);
        list.add(shos19);
        list.add(shos20);
        list.add(shos21);
        list.add(shos22);
        list.add(shos23);
        list.add(shos24);
        list.add(shos25);
        list.add(shos26);
        list.add(shos27);
        list.add(shos28);
        list.add(shos29);
        list.add(shos30);
        list.add(shos31);
        list.add(shos32);
        list.add(shos33);
        list.add(shos34);
        list.add(shos35);
        list.add(shos36);
        list.add(shos37);
        list.add(shos38);
        list.add(shos39);
        list.add(shos40);
        list.add(shos41);
        list.add(shos42);
        list.add(shos43);
        list.add(shos44);
        list.add(shos45);
        list.add(shos46);
        list.add(shos47);
        list.add(shos48);
        list.add(shos49);
        list.add(shos50);
        list.add(shos51);
        list.add(shos52);
        list.add(shos53);
        list.add(shos54);
        list.add(shos55);
        list.add(shos56);
        list.add(shos57);
        list.add(shos58);
        list.add(shos59);
        list.add(shos60);
        list.add(shos61);
        list.add(shos62);
        list.add(shos63);
        list.add(shos64);
        list.add(shos65);
        list.add(shos66);
        list.add(shos67);
        list.add(shos68);
        list.add(shos69);
    }

    @FXML private ComboBox<String> combo;
    @FXML private ComboBox<String> combo2;
    @FXML private TableView<Shos> tableView;
    @FXML private TableView<Shos> tableView2;
    @FXML private TableColumn FEEDS;
    @FXML private TableColumn DM;
    @FXML private TableColumn ME;
    @FXML private TableColumn NEL;
    @FXML private TableColumn CP;
    @FXML private TableColumn Fiber;
    @FXML private TableColumn Sugar;
    @FXML private TableColumn Fat;
    @FXML private TableColumn Ca;
    @FXML private TableColumn P;
    @FXML private TableColumn FEEDS_TOTAL;
    @FXML private TableColumn DM_TOTAL;
    @FXML private TableColumn ME_TOTAL;
    @FXML private TableColumn NEL_TOTAL;
    @FXML private TableColumn CP_TOTAL;
    @FXML private TableColumn Fiber_TOTAL;
    @FXML private TableColumn Sugar_TOTAL;
    @FXML private TableColumn Fat_TOTAL;
    @FXML private TableColumn Ca_TOTAL;
    @FXML private TableColumn P_TOTAL;

    private static String selected = "";

    @FXML
    protected void deleteOnClick() {
        ObservableList<Shos> items = tableView.getItems();
        Shos selectedItem = tableView.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            String feeds = feeds(selectedItem.getFEEDS());

            List<Shos> collect = items.stream().filter(k -> feeds(k.getFEEDS()).equals(feeds)).collect(Collectors.toList());
            tableView.getItems().removeAll(collect);
            calcTotal();
        }
    }

    //": nutrients in 1kg of DM"
    private String feeds(String feeds) {
        if (feeds.contains(":")) {
            return feeds.split(":")[0];
        }
        return feeds;
    }

    @FXML
    protected void clear() {
        tableView.getItems().clear();
        tableView2.getItems().clear();
    }

    @FXML
    protected void select() {
        selected = combo2.getSelectionModel().getSelectedItem();
    }

    @FXML
    protected void load() {
        ObservableList<String> items = FXCollections.observableArrayList();
        List<String> list = new ArrayList<>();
        Collections.addAll(list,
                "Hay_straw1: " + MainController.getHay_straw_val(),
                "Silage_haylage1: " + MainController.getSilage_haylage_val(),
                "Roots1: " + MainController.getRoots_stable_val(),
                "Grass1: " + MainController.getGrass_stable_val(),
                "Concentrates1: " + MainController.getConcentrates_stable_val(),
                "Hay_straw2: " + MainController.getHay_straw_val1(),
                "Silage_haylage2: " + MainController.getSilage_haylage_val1(),
                "Roots2: " + MainController.getRoots_stable_val1(),
                "Grass2: " + MainController.getGrass_stable_val1(),
                "Concentrates2: " + MainController.getConcentrates_stable_val1()
                );

        String selectedItem = combo.getSelectionModel().getSelectedItem();
        Shos shos = MewMewWoofController.list.stream().filter(k -> k.getName().equals(selectedItem)).findAny().get();

        list.stream().filter(k -> {
            String[] split = k.split(":");
            return !split[1].trim().equals("null");
        } )
                .filter(k -> {
                    if (shos.getType().equals(Type.hay_straw)) {
                        return k.startsWith("Hay_straw");
                    } else if (shos.getType().equals(Type.silage_haylage)) {
                        return k.startsWith("Silage_haylage");
                    }else if (shos.getType().equals(Type.roots)) {
                        return k.startsWith("Roots");
                    }else if (shos.getType().equals(Type.grass)) {
                        return k.startsWith("Grass");
                    }else if (shos.getType().equals(Type.Concentrates)) {
                        return k.startsWith("Concentrates");
                    }
                    return false;
                })
                .forEach(items::add);

        combo2.setItems(items);
    }

    @FXML
    protected void calcOnClick() {
        //tableView2
        if (tableView2.getItems().size() == 0) {

            FEEDS_TOTAL.setCellValueFactory(new PropertyValueFactory<>("FEEDS"));
            DM_TOTAL.setCellValueFactory(new PropertyValueFactory<>("DM"));
            ME_TOTAL.setCellValueFactory(new PropertyValueFactory<>("ME"));
            NEL_TOTAL.setCellValueFactory(new PropertyValueFactory<>("NEL"));
            CP_TOTAL.setCellValueFactory(new PropertyValueFactory<>("CP"));
            Fiber_TOTAL.setCellValueFactory(new PropertyValueFactory<>("Fiber"));
            Sugar_TOTAL.setCellValueFactory(new PropertyValueFactory<>("Sugar"));
            Fat_TOTAL.setCellValueFactory(new PropertyValueFactory<>("Fat"));
            Ca_TOTAL.setCellValueFactory(new PropertyValueFactory<>("Ca"));
            P_TOTAL.setCellValueFactory(new PropertyValueFactory<>("P"));
            ObservableList<Shos> items1 = tableView2.getItems();

            double hs = MainController.getHay_straw_val() == null ? 0 : Double.parseDouble(MainController.getHay_straw_val());
            double cn = MainController.getConcentrates_stable_val() == null ? 0 : Double.parseDouble(MainController.getConcentrates_stable_val());
            double gs = MainController.getGrass_stable_val() == null ? 0 : Double.parseDouble(MainController.getGrass_stable_val());
            double rt = MainController.getRoots_stable_val() == null ? 0 : Double.parseDouble(MainController.getRoots_stable_val());
            double sl = MainController.getSilage_haylage_val() == null ? 0 : Double.parseDouble(MainController.getSilage_haylage_val());
            double hs1 = MainController.getHay_straw_val1() == null ? 0 : Double.parseDouble(MainController.getHay_straw_val1());
            double cn1 = MainController.getConcentrates_stable_val1() == null ? 0 : Double.parseDouble(MainController.getConcentrates_stable_val1());
            double gs1 = MainController.getGrass_stable_val1() == null ? 0 : Double.parseDouble(MainController.getGrass_stable_val1());
            double rt1 = MainController.getRoots_stable_val1() == null ? 0 : Double.parseDouble(MainController.getRoots_stable_val1());
            double sl1 = MainController.getSilage_haylage_val1() == null ? 0 : Double.parseDouble(MainController.getSilage_haylage_val1());

            double p = hs + cn + gs + rt + sl + hs1 + cn1 + gs1 + rt1 + sl1;
            Shos shos = new Shos();
            shos.setFEEDS("NORM");

            shos.setDM((String.format("%.2f", p)));
            shos.setNEL((String.format("%.2f", MainController.getNEL_total())));
            shos.setCP((String.format("%.2f", MainController.getCp())));
            shos.setFiber((String.format("%.2f", MainController.getCrude_fibers())));
            shos.setSugar((String.format("%.2f", MainController.getSugar_result())));
            shos.setFat((String.format("%.2f", MainController.getFat_result())));
            shos.setCa((String.format("%.2f", MainController.getCalcium_result())));
            shos.setP((String.format("%.2f", MainController.getFosf_result())));

            items1.addAll(listTable2.get(0), shos);
            tableView2.setItems(items1);
        }

        String selectedItem = combo.getSelectionModel().getSelectedItem();
        Shos shos = list.stream().filter(k -> k.getName().equals(selectedItem)).findAny().get();
        shos.setFEEDS(shos.getFEEDS() + ": nutrients in 1kg of DM");

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

        String trim = selected.split(":")[1].trim();

        Shos shos2 = new Shos();
        double w = Double.parseDouble(trim);
        shos2.setFEEDS(selectedItem);
        shos2.setDM(trim);
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

        calcTotal();
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

    private void calcTotal() {
        ObservableList<Shos> items = tableView.getItems();
        ObservableList<Shos> items1 = tableView2.getItems();

        Shos tmp = new Shos();

        tmp
                .setDM("0")
                .setNEL("0")
                .setCP("0")
                .setFiber("0")
                .setSugar("0")
                .setFat("0")
                .setCa("0")
                .setP("0");

        items.stream()
                .filter(k -> k.getME().isEmpty())
                .forEach(k -> {
                    tmp.setDM(String.format("%.2f", Double.parseDouble(tmp.getDM()) + Double.parseDouble(k.getDM())));
                    tmp.setNEL(String.format("%.2f", Double.parseDouble(tmp.getNEL()) + Double.parseDouble(k.getNEL())));
                    tmp.setCP(String.format("%.2f", Double.parseDouble(tmp.getCP()) + Double.parseDouble(k.getCP())));
                    tmp.setFiber(String.format("%.2f", Double.parseDouble(tmp.getFiber()) + Double.parseDouble(k.getFiber())));
                    tmp.setSugar(String.format("%.2f", Double.parseDouble(tmp.getSugar()) + Double.parseDouble(k.getSugar())));
                    tmp.setFat(String.format("%.2f", Double.parseDouble(tmp.getFat()) + Double.parseDouble(k.getFat())));
                    tmp.setCa(String.format("%.2f", Double.parseDouble(tmp.getCa()) + Double.parseDouble(k.getCa())));
                    tmp.setP(String.format("%.2f", Double.parseDouble(tmp.getP()) + Double.parseDouble(k.getP())));
                });

        tmp.setFEEDS("TOTAL");
        items1.set(0, tmp);
    }
}
