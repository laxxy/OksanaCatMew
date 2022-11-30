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
        shos1.setName("(hays) Clover red");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos2.getName());
        shos1.setDM("");
        shos1.setME("9.6");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("184");
        shos1.setFiber("266");
        shos1.setSugar("0");
        shos1.setFat("39");
        shos1.setCa("15.3");
        shos1.setP("2.5");
        
        Shos shos3 = new Shos();
        shos1.setName("(hays) Grass poor-quality");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos3.getName());
        shos1.setDM("");
        shos1.setME("7");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("55");
        shos1.setFiber("380");
        shos1.setSugar("0");
        shos1.setFat("16");
        shos1.setCa("2.5");
        shos1.setP("1.5");
        
        Shos shos4 = new Shos();
        shos1.setName("(hays) Grass good-quality");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos4.getName());
        shos1.setDM("");
        shos1.setME("9.5");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("110");
        shos1.setFiber("298");
        shos1.setSugar("0");
        shos1.setFat("18");
        shos1.setCa("7");
        shos1.setP("3.5");
        
        Shos shos5 = new Shos();
        shos1.setName("(straw) Oat");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos5.getName());
        shos1.setDM("");
        shos1.setME("7");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("34");
        shos1.setFiber("394");
        shos1.setSugar("20");
        shos1.setFat("22");
        shos1.setCa("4");
        shos1.setP("0.7");
        
        Shos shos6 = new Shos();
        shos1.setName("(straw) Oat ammoniated");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos6.getName());
        shos1.setDM("");
        shos1.setME("7.8");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("75");
        shos1.setFiber("431");
        shos1.setSugar("16");
        shos1.setFat("18");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos7 = new Shos();
        shos1.setName("(straw) Barley");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos7.getName());
        shos1.setDM("");
        shos1.setME("6.5");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("38");
        shos1.setFiber("394");
        shos1.setSugar("32");
        shos1.setFat("21");
        shos1.setCa("4.5");
        shos1.setP("0.7");
        
        Shos shos8 = new Shos();
        shos1.setName("(straw) Barley ammoniated");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos8.getName());
        shos1.setDM("");
        shos1.setME("7.5");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("70");
        shos1.setFiber("450");
        shos1.setSugar("20");
        shos1.setFat("15");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos9 = new Shos();
        shos1.setName("(straw) Bean");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos9.getName());
        shos1.setDM("");
        shos1.setME("7.4");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("52");
        shos1.setFiber("501");
        shos1.setSugar("19");
        shos1.setFat("9");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos10 = new Shos();
        shos1.setName("(straw) Pea");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos10.getName());
        shos1.setDM("");
        shos1.setME("6.7");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("105");
        shos1.setFiber("410");
        shos1.setSugar("0");
        shos1.setFat("19");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos11 = new Shos();
        shos1.setName("(straw) Wheat");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos11.getName());
        shos1.setDM("");
        shos1.setME("6.1");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("34");
        shos1.setFiber("417");
        shos1.setSugar("0");
        shos1.setFat("15");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos12 = new Shos();
        shos1.setName("(straw) Wheat ammoniated");
        shos1.setType(Type.hay_straw);
        shos1.setFEEDS(shos12.getName());
        shos1.setDM("");
        shos1.setME("7.4");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("68");
        shos1.setFiber("434");
        shos1.setSugar("13");
        shos1.setFat("13");
        shos1.setCa("0");
        shos1.setP("0");
        
        
        Shos shos13 = new Shos();
        shos1.setName("(silage_haylage) Grass matured");
        shos1.setType(Type.silage_haylage);
        shos1.setFEEDS(shos13.getName());
        shos1.setDM("");
        shos1.setME("10");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("125");
        shos1.setFiber("340");
        shos1.setSugar("0");
        shos1.setFat("52");
        shos1.setCa("3");
        shos1.setP("2");
        
        Shos shos14 = new Shos();
        shos1.setName("(silage_haylage) Grass young");
        shos1.setType(Type.silage_haylage);
        shos1.setFEEDS(shos14.getName());
        shos1.setDM("");
        shos1.setME("11.6");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("186");
        shos1.setFiber("270");
        shos1.setSugar("0");
        shos1.setFat("52");
        shos1.setCa("8");
        shos1.setP("4");
        
        Shos shos15 = new Shos();
        shos1.setName("(silage_haylage) Corn silage");
        shos1.setType(Type.silage_haylage);
        shos1.setFEEDS(shos15.getName());
        shos1.setDM("");
        shos1.setME("10.8");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("110");
        shos1.setFiber("233");
        shos1.setSugar("211");
        shos1.setFat("57");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos16 = new Shos();
        shos1.setName("(silage_haylage) Barley whole crop");
        shos1.setType(Type.silage_haylage);
        shos1.setFEEDS(shos16.getName());
        shos1.setDM("");
        shos1.setME("8.7");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("64");
        shos1.setFiber("248");
        shos1.setSugar("267");
        shos1.setFat("15");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos17 = new Shos();
        shos1.setName("(silage_haylage) Potato");
        shos1.setType(Type.silage_haylage);
        shos1.setFEEDS(shos17.getName());
        shos1.setDM("");
        shos1.setME("11.8");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("81");
        shos1.setFiber("26");
        shos1.setSugar("0");
        shos1.setFat("19");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos18 = new Shos();
        shos1.setName("(silage_haylage) Lucerne");
        shos1.setType(Type.silage_haylage);
        shos1.setFEEDS(shos18.getName());
        shos1.setDM("");
        shos1.setME("8.5");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("168");
        shos1.setFiber("296");
        shos1.setSugar("16");
        shos1.setFat("84");
        shos1.setCa("0");
        shos1.setP("0");
        
        
        Shos shos19 = new Shos();
        shos1.setName("(concentrates) Brewer's yest dried");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos19.getName());
        shos1.setDM("");
        shos1.setME("11.7");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("443");
        shos1.setFiber("2");
        shos1.setSugar("0");
        shos1.setFat("11");
        shos1.setCa("3.2");
        shos1.setP("7.8");
        
        Shos shos20 = new Shos();
        shos1.setName("(concentrates) Barley");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos20.getName());
        shos1.setDM("");
        shos1.setME("12.8");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("115");
        shos1.setFiber("53");
        shos1.setSugar("599");
        shos1.setFat("17");
        shos1.setCa("0.5");
        shos1.setP("4");
        
        Shos shos21 = new Shos();
        shos1.setName("(concentrates) Barley, brewer's grains");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos21.getName());
        shos1.setDM("");
        shos1.setME("11.2");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("234");
        shos1.setFiber("176");
        shos1.setSugar("51");
        shos1.setFat("77");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos22 = new Shos();
        shos1.setName("(concentrates) Barley, malt culms");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos22.getName());
        shos1.setDM("");
        shos1.setME("11.2");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("271");
        shos1.setFiber("156");
        shos1.setSugar("171");
        shos1.setFat("22");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos23 = new Shos();
        shos1.setName("(concentrates) Grain distiller's grains");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos23.getName());
        shos1.setDM("");
        shos1.setME("14.7");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("265");
        shos1.setFiber("200");
        shos1.setSugar("0");
        shos1.setFat("65");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos24 = new Shos();
        shos1.setName("(concentrates) Grain distiller's dark grains");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos24.getName());
        shos1.setDM("");
        shos1.setME("14.8");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("317");
        shos1.setFiber("89");
        shos1.setSugar("75");
        shos1.setFat("108");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos25 = new Shos();
        shos1.setName("(concentrates) Malt distiller's grains");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos25.getName());
        shos1.setDM("");
        shos1.setME("10.2");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("211");
        shos1.setFiber("199");
        shos1.setSugar("23");
        shos1.setFat("86");
        shos1.setCa("1.7");
        shos1.setP("3.7");
        
        Shos shos26 = new Shos();
        shos1.setName("(concentrates) Malt distiller's dark grains");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos26.getName());
        shos1.setDM("");
        shos1.setME("12.2");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("275");
        shos1.setFiber("121");
        shos1.setSugar("65");
        shos1.setFat("67");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos27 = new Shos();
        shos1.setName("(concentrates) Maize");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos27.getName());
        shos1.setDM("");
        shos1.setME("14.2");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("98");
        shos1.setFiber("24");
        shos1.setSugar("717");
        shos1.setFat("42");
        shos1.setCa("0.3");
        shos1.setP("2.7");
        
        Shos shos28 = new Shos();
        shos1.setName("(concentrates) Maize flaked");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos28.getName());
        shos1.setDM("");
        shos1.setME("15");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("110");
        shos1.setFiber("17");
        shos1.setSugar("0");
        shos1.setFat("49");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos29 = new Shos();
        shos1.setName("(concentrates) Maize gluten feed");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos29.getName());
        shos1.setDM("");
        shos1.setME("12.7");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("262");
        shos1.setFiber("39");
        shos1.setSugar("210");
        shos1.setFat("38");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos30 = new Shos();
        shos1.setName("(concentrates) Maize gluten meal");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos30.getName());
        shos1.setDM("");
        shos1.setME("17.5");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("669");
        shos1.setFiber("12");
        shos1.setSugar("158");
        shos1.setFat("29");
        shos1.setCa("1.6");
        shos1.setP("5");
        
        Shos shos31 = new Shos();
        shos1.setName("(concentrates) Millet");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos31.getName());
        shos1.setDM("");
        shos1.setME("11.3");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("121");
        shos1.setFiber("93");
        shos1.setSugar("0");
        shos1.setFat("44");
        shos1.setCa("0.6");
        shos1.setP("3.1");
        
        Shos shos32 = new Shos();
        shos1.setName("(concentrates) Oats");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos32.getName());
        shos1.setDM("");
        shos1.setME("12");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("109");
        shos1.setFiber("105");
        shos1.setSugar("482");
        shos1.setFat("49");
        shos1.setCa("0.8");
        shos1.setP("3.7");
        
        Shos shos33 = new Shos();
        shos1.setName("(concentrates) Oats naked");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos33.getName());
        shos1.setDM("");
        shos1.setME("14.8");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("119");
        shos1.setFiber("45");
        shos1.setSugar("597");
        shos1.setFat("97");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos34 = new Shos();
        shos1.setName("(concentrates) Oat husks");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos34.getName());
        shos1.setDM("");
        shos1.setME("4.9");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("21");
        shos1.setFiber("351");
        shos1.setSugar("0");
        shos1.setFat("11");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos35 = new Shos();
        shos1.setName("(concentrates) Pot ale syrup");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos35.getName());
        shos1.setDM("");
        shos1.setME("15.4");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("374");
        shos1.setFiber("2");
        shos1.setSugar("36");
        shos1.setFat("2");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos36 = new Shos();
        shos1.setName("(concentrates) Rice brown");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos36.getName());
        shos1.setDM("");
        shos1.setME("0");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("111");
        shos1.setFiber("0");
        shos1.setSugar("0");
        shos1.setFat("23");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos37 = new Shos();
        shos1.setName("(concentrates) Rice bran (extracted)");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos37.getName());
        shos1.setDM("");
        shos1.setME("11");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("166");
        shos1.setFiber("0");
        shos1.setSugar("256");
        shos1.setFat("11");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos38 = new Shos();
        shos1.setName("(concentrates) Rice polished");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos38.getName());
        shos1.setDM("");
        shos1.setME("15");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("77");
        shos1.setFiber("17");
        shos1.setSugar("0");
        shos1.setFat("5");
        shos1.setCa("0");
        shos1.setP("0");
        
        Shos shos39 = new Shos();
        shos1.setName("(concentrates) Rye");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos39.getName());
        shos1.setDM("");
        shos1.setME("14");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("124");
        shos1.setFiber("26");
        shos1.setSugar("0");
        shos1.setFat("19");
        shos1.setCa("0.7");
        shos1.setP("3.7");
        
        Shos shos40 = new Shos();
        shos1.setName("(concentrates) Sorghum");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos40.getName());
        shos1.setDM("");
        shos1.setME("13.4");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("108");
        shos1.setFiber("21");
        shos1.setSugar("745");
        shos1.setFat("43");
        shos1.setCa("0.5");
        shos1.setP("3.5");
        
        Shos shos41 = new Shos();
        shos1.setName("(concentrates) Wheat");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos41.getName());
        shos1.setDM("");
        shos1.setME("13.6");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("124");
        shos1.setFiber("26");
        shos1.setSugar("701");
        shos1.setFat("19");
        shos1.setCa("0.5");
        shos1.setP("3.5");
        
        Shos shos42 = new Shos();
        shos1.setName("(concentrates) Wheat bran");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos42.getName());
        shos1.setDM("");
        shos1.setME("10.1");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("170");
        shos1.setFiber("114");
        shos1.setSugar("259");
        shos1.setFat("45");
        shos1.setCa("1.6");
        shos1.setP("13.6");
        
        Shos shos43 = new Shos();
        shos1.setName("(concentrates) Wheat feed");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos43.getName());
        shos1.setDM("");
        shos1.setME("12");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("178");
        shos1.setFiber("74");
        shos1.setSugar("333");
        shos1.setFat("45");
        shos1.setCa("1.1");
        shos1.setP("8");
        
        Shos shos44 = new Shos();
        shos1.setName("(concentrates) Wheat germ meal");
        shos1.setType(Type.Concentrates);
        shos1.setFEEDS(shos44.getName());
        shos1.setDM("");
        shos1.setME("0");
        shos1.setNEL((Double.parseDouble(shos1.getME()) * 0.6) + "");
        shos1.setCP("279");
        shos1.setFiber("0");
        shos1.setSugar("0");
        shos1.setFat("82");
        shos1.setCa("0");
        shos1.setP("0");

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
