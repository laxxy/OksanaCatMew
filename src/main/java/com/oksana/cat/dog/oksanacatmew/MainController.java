package com.oksana.cat.dog.oksanacatmew;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML private Label welcomeText;
    @FXML private TextField weight;
    @FXML private TextField mp;
    @FXML private TextField mf;
    @FXML private TextField mpt;
    @FXML private TextField NEL_featus;
    @FXML private TextField fibers;
    @FXML private TextField protein;
    @FXML private TextField sugar;
    @FXML private TextField fat;
    @FXML private TextField calcium;
    @FXML private TextField phos;
    @FXML private TextField hay_straw_stable;
    @FXML private TextField silage_haylage_stable;
    @FXML private TextField roots_stable;
    @FXML private TextField grass_stable;
    @FXML private TextField Concentrates_stable;
    @FXML private TextField hay_straw_stable1;
    @FXML private TextField silage_haylage_stable1;
    @FXML private TextField roots_stable1;
    @FXML private TextField grass_stable1;
    @FXML private TextField Concentrates_stable1;
    @FXML private Label hay_straw_stable_txt;
    @FXML private Label silage_haylage_stable_txt;
    @FXML private Label roots_stable_txt;
    @FXML private Label grass_stable_txt;
    @FXML private Label Concentrates_stable_txt;
    @FXML private Label hay_straw_stable_txt1;
    @FXML private Label silage_haylage_stable_txt1;
    @FXML private Label roots_stable_txt1;
    @FXML private Label grass_stable_txt1;
    @FXML private Label Concentrates_stable_txt1;
    @FXML private ComboBox<String> comboCow;


    private static final double dry1 = 0.016;
    private static final double dry2 = 0.293;

    private static final double lactate_cow1 = 0.025;
    private static final double lactate_cow2 = 0.1;

    private static double val;
    private static double val2;

    private static int weightVal;

    private static double DM;
    private static String value = "";

    private static double NEL_total;
    private static double CP_ = 0;
    private static double crude_fibers;
    private static double sugar_result;
    private static double fat_result;
    private static double calcium_result;
    private static double fosf_result;

    private static String hay_straw_val;
    private static String silage_haylage_val;
    private static String roots_stable_val;
    private static String grass_stable_val;
    private static String Concentrates_stable_val;

    private static String hay_straw_val1;
    private static String silage_haylage_val1;
    private static String roots_stable_val1;
    private static String grass_stable_val1;
    private static String Concentrates_stable_val1;

    @FXML
    protected void onCalculateButtonClick() {
        String selectedItem = comboCow.getSelectionModel().getSelectedItem();
        if (selectedItem.equals("Dry cow")) {
            val = dry1;
            val2 = dry2;
        } else {
            val = lactate_cow1;
            val2 = lactate_cow2;
        }

        weightVal = Integer.parseInt(this.weight.getText());
        double mp_val = Double.parseDouble(mp.getText().isEmpty() ? "0.0" : mp.getText());
        double mf_val = Double.parseDouble(mf.getText().isEmpty() ? "0.0" : mf.getText());
        double mpt_val = Double.parseDouble(mpt.getText().isEmpty() ? "0.0" : mpt.getText());
        double NEL_featus_val = Double.parseDouble(NEL_featus.getText().isEmpty() ? "0.0" : NEL_featus.getText());
        double fibers_val = Double.parseDouble(fibers.getText().isEmpty() ? "0.0" : fibers.getText());
        double protein_val = Double.parseDouble(protein.getText().isEmpty() ? "0.0" : protein.getText());
        double sugar_val = Double.parseDouble(sugar.getText().isEmpty() ? "0.0" : sugar.getText());
        double fat_val = Double.parseDouble(fat.getText().isEmpty() ? "0.0" : fat.getText());
        double calcium_val = Double.parseDouble(calcium.getText().isEmpty() ? "0.0" : calcium.getText());
        double fosf = Double.parseDouble(phos.getText().isEmpty() ? "0.0" : phos.getText());

        if (selectedItem.equals("Dry cow")) {
            DM = weightVal * val;
        } else {
            DM = (val * weightVal) + (val2 * mp_val);
        }

        double NEL_vital = dry2 * Math.round(Math.pow(weightVal, 0.75));

        double NEL_MS = 0;
        if (selectedItem.equals("Dry cow")) {
            NEL_total = NEL_featus_val + NEL_vital;
        } else {
            double MC = (0.4 + 0.15 * mf_val) * mp_val;
            NEL_MS = MC * 3.3;
            NEL_total = NEL_MS + NEL_vital;
        }

        double CP = 0;
        double CP_VITAL = 0;
        double CP_MS = 0;
        double CP_TOTAL = 0;
        if (selectedItem.equals("Dry cow")) {
            CP = protein_val * DM;
            CP_ = CP;
        } else {
            CP_VITAL = 3.4 * Math.round(Math.pow(weightVal, 0.75));
            CP_MS = (mpt_val * 10 * 2.1) * mp_val;
            CP_TOTAL = CP_VITAL + CP_MS;
            CP_ = CP_TOTAL;
        }

        crude_fibers = fibers_val * DM;
        sugar_result = sugar_val * DM;
        fat_result = fat_val * DM;
        calcium_result = calcium_val * DM;
        fosf_result = fosf * DM;

        if (selectedItem.equals("Dry cow")) {
            welcomeText.setText("DM = " + String.format("%.2f", DM) + "; NEL_vital = "
                    + String.format("%.2f", NEL_vital)
                    + "; NEL_total = " + String.format("%.2f", NEL_total)
                    +"\n CP = " + String.format("%.2f", CP)
            +"; crude_fibers = " + String.format("%.2f", crude_fibers)
            +"; sugar_result = " + String.format("%.2f", sugar_result)
            +"; fat_result = " + String.format("%.2f", fat_result)
            +"\n calcium_result = " + String.format("%.2f", calcium_result)
            +"; fosf_result = " + String.format("%.2f", fosf_result));

        } else {
            welcomeText.setText("DM = " + String.format("%.2f", DM) + "; NEL_vital = "
                    + String.format("%.2f", NEL_vital)
                    + "; NEL_MS = " + String.format("%.2f", NEL_MS)
                    + "; NEL_total = " + String.format("%.2f", NEL_total)
                    + "\n CP_VITAL = " + String.format("%.2f", CP_VITAL)
                    + "; CP_MS = " + String.format("%.2f", CP_MS)
                    + "; CP_TOTAL = " + String.format("%.2f", CP_TOTAL)
                    +"\n crude_fibers = " + String.format("%.2f", crude_fibers)
                    +"; sugar_result = " + String.format("%.2f", sugar_result)
                    +"; fat_result = " + String.format("%.2f", fat_result)
                    +"; calcium_result = " + String.format("%.2f", calcium_result)
                    +"; fosf_result = " + String.format("%.2f", fosf_result));
        }
    }

    @FXML
    protected void onCalculateButtonClick2() {
        int hay_straw = Integer.parseInt(hay_straw_stable.getText().isEmpty() ? "0" : hay_straw_stable.getText());
        int silage_haylage = Integer.parseInt(silage_haylage_stable.getText().isEmpty() ? "0" : silage_haylage_stable.getText());
        int roots = Integer.parseInt(roots_stable.getText().isEmpty() ? "0" : roots_stable.getText());
        int grass = Integer.parseInt(grass_stable.getText().isEmpty() ? "0" : grass_stable.getText());
        int Concentrates = Integer.parseInt(Concentrates_stable.getText().isEmpty() ? "0" : Concentrates_stable.getText());

        int hay_straw1 = Integer.parseInt(hay_straw_stable1.getText().isEmpty() ? "0" : hay_straw_stable1.getText());
        int silage_haylage1 = Integer.parseInt(silage_haylage_stable1.getText().isEmpty() ? "0" : silage_haylage_stable1.getText());
        int roots1 = Integer.parseInt(roots_stable1.getText().isEmpty() ? "0" : roots_stable1.getText());
        int grass1 = Integer.parseInt(grass_stable1.getText().isEmpty() ? "0" : grass_stable1.getText());
        int Concentrates1 = Integer.parseInt(Concentrates_stable1.getText().isEmpty() ? "0" : Concentrates_stable1.getText());

        if (!value.isEmpty()) {
            value = "";
        }

        if (hay_straw != 0) {
            double w = (DM * hay_straw) / 100;
            String format = String.format("%.2f", w);
            hay_straw_stable_txt.setText(format);
            hay_straw_val = format;
        }
        if (silage_haylage != 0) {
            double w = (DM * silage_haylage) / 100;
            String format = String.format("%.2f", w);
            silage_haylage_stable_txt.setText(format);
            silage_haylage_val = format;
        }
        if (roots != 0) {
            double w = (DM * roots) / 100;
            String format = String.format("%.2f", w);
            roots_stable_txt.setText(format);
            roots_stable_val = format;
        }
        if (grass != 0) {
            double w = (DM * grass) / 100;
            String format = String.format("%.2f", w);
            grass_stable_txt.setText(format);
            grass_stable_val = format;
        }
        if (Concentrates != 0) {
            double w = (DM * Concentrates) / 100;
            String format = String.format("%.2f", w);
            Concentrates_stable_txt.setText(format);
            Concentrates_stable_val = format;
        }

        if (hay_straw1 != 0) {
            double w = (DM * hay_straw1) / 100;
            String format = String.format("%.2f", w);
            hay_straw_stable_txt1.setText(format);
            hay_straw_val1 = format;
        }
        if (silage_haylage1 != 0) {
            double w = (DM * silage_haylage1) / 100;
            String format = String.format("%.2f", w);
            silage_haylage_stable_txt1.setText(format);
            silage_haylage_val1 = format;
        }
        if (roots1 != 0) {
            double w = (DM * roots1) / 100;
            String format = String.format("%.2f", w);
            roots_stable_txt1.setText(format);
            roots_stable_val1 = format;
        }
        if (grass1 != 0) {
            double w = (DM * grass1) / 100;
            String format = String.format("%.2f", w);
            grass_stable_txt1.setText(format);
            grass_stable_val1 = format;
        }
        if (Concentrates1 != 0) {
            double w = (DM * Concentrates1) / 100;
            String format = String.format("%.2f", w);
            Concentrates_stable_txt1.setText(format);
            Concentrates_stable_val1 = format;
        }
    }

    public static double getDM() {
        return DM;
    }

    public static String getValue() {
        return value;
    }

    public static String getHay_straw_val() {
        return hay_straw_val;
    }

    public static String getSilage_haylage_val() {
        return silage_haylage_val;
    }

    public static String getRoots_stable_val() {
        return roots_stable_val;
    }

    public static String getGrass_stable_val() {
        return grass_stable_val;
    }

    public static String getConcentrates_stable_val() {
        return Concentrates_stable_val;
    }

    public static double getNEL_total() {
        return NEL_total;
    }

    public static double getCp() {
        return CP_;
    }

    public static double getCrude_fibers() {
        return crude_fibers;
    }

    public static double getSugar_result() {
        return sugar_result;
    }

    public static double getFat_result() {
        return fat_result;
    }

    public static double getCalcium_result() {
        return calcium_result;
    }

    public static double getFosf_result() {
        return fosf_result;
    }

    public static String getHay_straw_val1() {
        return hay_straw_val1;
    }

    public static String getSilage_haylage_val1() {
        return silage_haylage_val1;
    }

    public static String getRoots_stable_val1() {
        return roots_stable_val1;
    }

    public static String getGrass_stable_val1() {
        return grass_stable_val1;
    }

    public static String getConcentrates_stable_val1() {
        return Concentrates_stable_val1;
    }
}