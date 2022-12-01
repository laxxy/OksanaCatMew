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
