package sample.data.jpa.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Fields {

    ROW_1110("row1110"),
    ROW_1120("row1120"),
    ROW_1130("row1130"),
    ROW_1140("row1140"),
    ROW_1150("row1150"),
    ROW_1160("row1160"),
    ROW_1170("row1170"),
    ROW_1180("row1180"),
    ROW_1190("row1190"),
    ROW_1210("row1210"),
    ROW_1220("row1220"),
    ROW_1230("row1230"),
    ROW_1240("row1240"),
    ROW_1250("row1250"),
    ROW_1260("row1260"),
    ROW_1310("row1310"),
    ROW_1320("row1320"),
    ROW_1330("row1330"),
    ROW_1340("row1340"),
    ROW_1350("row1350"),
    ROW_1360("row1360"),
    ROW_1370("row1370"),
    ROW_1410("row1410"),
    ROW_1420("row1420"),
    ROW_1430("row1430"),
    ROW_1440("row1440"),
    ROW_1450("row1450"),
    ROW_1510("row1510"),
    ROW_1520("row1520"),
    ROW_1530("row1530"),
    ROW_1540("row1540"),
    ROW_1550("row1550"),
    ROW_1300("row1300"),
    ROW_1400("row1400"),
    ROW_1500("row1500");

    private String name;

    Fields(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<String> asList() {
       return Arrays.stream(values())
               .map(Fields::getName)
               .collect(Collectors.toList());
    }
}
