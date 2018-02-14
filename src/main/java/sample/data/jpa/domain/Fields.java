package sample.data.jpa.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Fields {

    ROW_1110("1110"),
    ROW_1120("1120"),
    ROW_1130("1130"),
    ROW_1140("1140"),
    ROW_1150("1150"),
    ROW_1160("1160"),
    ROW_1170("1170"),
    ROW_1180("1180"),
    ROW_1190("1190"),
    ROW_1100("1100"),
    ROW_1210("1210"),
    ROW_1220("1220"),
    ROW_1230("1230"),
    ROW_1240("1240"),
    ROW_1250("1250"),
    ROW_1260("1260"),
    ROW_1200("1200"),
    ROW_1310("1310"),
    ROW_1320("1320"),
    ROW_1330("1330"),
    ROW_1340("1340"),
    ROW_1350("1350"),
    ROW_1360("1360"),
    ROW_1370("1370"),
    ROW_1300("1300"),
    ROW_1410("1410"),
    ROW_1420("1420"),
    ROW_1430("1430"),
    ROW_1440("1440"),
    ROW_1450("1450"),
    ROW_1400("1400"),
    ROW_1510("1510"),
    ROW_1520("1520"),
    ROW_1530("1530"),
    ROW_1540("1540"),
    ROW_1550("1550"),
    ROW_1500("1500"),
    ROW_1600("1600");

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
