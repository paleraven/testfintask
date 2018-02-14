package sample.data.jpa.domain;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Balance {

    @Id
    @SequenceGenerator(name = "balance_generator", sequenceName = "balance_sequence", initialValue = 5000)
    @GeneratedValue(generator = "balance_generator")
    private Long balanceId;

    @ManyToOne(optional = false)
    private Account account;

    @Column(nullable = false)
    private int version;

    @Column(nullable = false)
    private String status;

    @Column
    private Date created;

    @Column(nullable = false)
    private int period;

    @Column(nullable = false)
    private String year;
    /**
     * Fixed Assets
     */
    @Column
    private BigDecimal row1110;

    @Column
    private BigDecimal row1120;

    @Column
    private BigDecimal row1130;

    @Column
    private BigDecimal row1140;

    @Column
    private BigDecimal row1150;

    @Column
    private BigDecimal row1160;

    @Column
    private BigDecimal row1170;

    @Column
    private BigDecimal row1180;

    @Column
    private BigDecimal row1190;
    /**
     * Sum of Fixed Assets
     */
    @Column
    private BigDecimal row1100;

    /**
     * Current Assets
     */
    @Column
    private BigDecimal row1210;

    @Column
    private BigDecimal row1220;

    @Column
    private BigDecimal row1230;

    @Column
    private BigDecimal row1240;

    @Column
    private BigDecimal row1250;

    @Column
    private BigDecimal row1260;
    /**
     * Sum of Current Assets
     */
    @Column
    private BigDecimal row1200;

    /**
     * Sum of Fixed Assets and Current Assets (row 1100 + row 1200)
     */
    @Column
    private BigDecimal row1600;

    /**
     * Capital and Reserves
     */
    @Column
    private BigDecimal row1310;

    @Column
    private BigDecimal row1320;

    @Column
    private BigDecimal row1340;

    @Column
    private BigDecimal row1350;

    @Column
    private BigDecimal row1360;

    @Column
    private BigDecimal row1370;

    /**
     * Sum of Capital and Reserves
     */

    @Column
    private BigDecimal row1300;

    /**
     * Long Term Liabilities
     */
    @Column
    private BigDecimal row1410;

    @Column
    private BigDecimal row1420;

    @Column
    private BigDecimal row1430;

    @Column
    private BigDecimal row1450;

    /**
     * Sum of Long Term Liabilities
     */

    @Column
    private BigDecimal row1400;

    /**
     * Short Term Liabilities
     */
    @Column
    private BigDecimal row1510;

    @Column
    private BigDecimal row1520;

    @Column
    private BigDecimal row1530;

    @Column
    private BigDecimal row1540;

    @Column
    private BigDecimal row1550;

    /**
     * Sum of Short Term Liabilities
     */
    @Column
    private BigDecimal row1500;

    /**
     * Sum of Capital and Reserves, Long Term Liabilities and Short Term Liabilities (row 1300 + row 1400 + row 1500)
     */
    @Column
    private BigDecimal row1700;

    public Balance() {
    }

    public Long getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(Long balanceId) {
        this.balanceId = balanceId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account= account;
    }


    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    /**
     *
     * get/set
     */

    public BigDecimal getRow1110() {
        return row1110;
    }

    public void setRow1110(BigDecimal row1110) {
        this.row1110 = row1110;
    }

    public BigDecimal getRow1120() {
        return row1120;
    }

    public void setRow1120(BigDecimal row1120) {
        this.row1120 = row1120;
    }

    public BigDecimal getRow1130() {
        return row1130;
    }

    public void setRow1130(BigDecimal row1130) {
        this.row1130 = row1130;
    }

    public BigDecimal getRow1140() {
        return row1140;
    }

    public void setRow1140(BigDecimal row1140) {
        this.row1140 = row1140;
    }

    public BigDecimal getRow1150() {
        return row1150;
    }

    public void setRow1150(BigDecimal row1150) {
        this.row1150 = row1150;
    }

    public BigDecimal getRow1160() {
        return row1160;
    }

    public void setRow1160(BigDecimal row1160) {
        this.row1160 = row1160;
    }

    public BigDecimal getRow1170() {
        return row1170;
    }

    public void setRow1170(BigDecimal row1170) {
        this.row1170 = row1170;
    }

    public BigDecimal getRow1180() {
        return row1180;
    }

    public void setRow1180(BigDecimal row1180) {
        this.row1180 = row1180;
    }

    public BigDecimal getRow1190() {
        return row1190;
    }

    public void setRow1190(BigDecimal row1190) {
        this.row1190 = row1190;
    }

    public BigDecimal getRow1100() {
        return row1100;
    }

    public void setRow1100(BigDecimal row1100) {
        this.row1100 = row1100;
    }

    public BigDecimal getRow1210() {
        return row1210;
    }

    public void setRow1210(BigDecimal row1210) {
        this.row1210 = row1210;
    }

    public BigDecimal getRow1220() {
        return row1220;
    }

    public void setRow1220(BigDecimal row1220) {
        this.row1220 = row1220;
    }

    public BigDecimal getRow1230() {
        return row1230;
    }

    public void setRow1230(BigDecimal row1230) {
        this.row1230 = row1230;
    }

    public BigDecimal getRow1240() {
        return row1240;
    }

    public void setRow1240(BigDecimal row1240) {
        this.row1240 = row1240;
    }

    public BigDecimal getRow1250() {
        return row1250;
    }

    public void setRow1250(BigDecimal row1250) {
        this.row1250 = row1250;
    }

    public BigDecimal getRow1260() {
        return row1260;
    }

    public void setRow1260(BigDecimal row1260) {
        this.row1260 = row1260;
    }

    public BigDecimal getRow1200() {
        return row1200;
    }

    public void setRow1200(BigDecimal row1200) {
        this.row1200 = row1200;
    }

    public BigDecimal getRow1600() {
        return row1600;
    }

    public void setRow1600(BigDecimal row1600) {
        this.row1600 = row1600;
    }

    public BigDecimal getRow1310() {
        return row1310;
    }

    public void setRow1310(BigDecimal row1310) {
        this.row1310 = row1310;
    }

    public BigDecimal getRow1320() {
        return row1320;
    }

    public void setRow1320(BigDecimal row1320) {
        this.row1320 = row1320;
    }

    public BigDecimal getRow1340() {
        return row1340;
    }

    public void setRow1340(BigDecimal row1340) {
        this.row1340 = row1340;
    }

    public BigDecimal getRow1350() {
        return row1350;
    }

    public void setRow1350(BigDecimal row1350) {
        this.row1350 = row1350;
    }

    public BigDecimal getRow1360() {
        return row1360;
    }

    public void setRow1360(BigDecimal row1360) {
        this.row1360 = row1360;
    }

    public BigDecimal getRow1370() {
        return row1370;
    }

    public void setRow1370(BigDecimal row1370) {
        this.row1370 = row1370;
    }

    public BigDecimal getRow1300() {
        return row1300;
    }

    public void setRow1300(BigDecimal row1300) {
        this.row1300 = row1300;
    }

    public BigDecimal getRow1410() {
        return row1410;
    }

    public void setRow1410(BigDecimal row1410) {
        this.row1410 = row1410;
    }

    public BigDecimal getRow1420() {
        return row1420;
    }

    public void setRow1420(BigDecimal row1420) {
        this.row1420 = row1420;
    }

    public BigDecimal getRow1430() {
        return row1430;
    }

    public void setRow1430(BigDecimal row1430) {
        this.row1430 = row1430;
    }

    public BigDecimal getRow1450() {
        return row1450;
    }

    public void setRow1450(BigDecimal row1450) {
        this.row1450 = row1450;
    }

    public BigDecimal getRow1400() {
        return row1400;
    }

    public void setRow1400(BigDecimal row1400) {
        this.row1400 = row1400;
    }

    public BigDecimal getRow1510() {
        return row1510;
    }

    public void setRow1510(BigDecimal row1510) {
        this.row1510 = row1510;
    }

    public BigDecimal getRow1520() {
        return row1520;
    }

    public void setRow1520(BigDecimal row1520) {
        this.row1520 = row1520;
    }

    public BigDecimal getRow1530() {
        return row1530;
    }

    public void setRow1530(BigDecimal row1530) {
        this.row1530 = row1530;
    }

    public BigDecimal getRow1540() {
        return row1540;
    }

    public void setRow1540(BigDecimal row1540) {
        this.row1540 = row1540;
    }

    public BigDecimal getRow1550() {
        return row1550;
    }

    public void setRow1550(BigDecimal row1550) {
        this.row1550 = row1550;
    }

    public BigDecimal getRow1500() {
        return row1500;
    }

    public void setRow1500(BigDecimal row1500) {
        this.row1500 = row1500;
    }

    public BigDecimal getRow1700() {
        return row1700;
    }

    public void setRow1700(BigDecimal row1700) {
        this.row1700 = row1700;
    }


}
