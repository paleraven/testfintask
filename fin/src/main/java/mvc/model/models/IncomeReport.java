package mvc.model.models;

import java.math.BigDecimal;
import java.util.Date;

public class IncomeReport {
    private int id;
    private int accountId;
    private int version;
    private String status;
    private Date created;
    private int period;
    private String year;

    /**
     * sales proceeds
     */
    private BigDecimal row2110;
    /**
     * cost of sales
     */
    private BigDecimal row2120;
    private BigDecimal row2100;

    private BigDecimal row2210;
    /**
     * revenue from sales
     */
    private BigDecimal row2200;

    private BigDecimal row2310;
    private BigDecimal row2320;
    private BigDecimal row2330;
    private BigDecimal row2340;
    private BigDecimal row2350;
    /**
     * profit (loss) before taxation
     */
    private BigDecimal row2300;

    private BigDecimal row2410;
    private BigDecimal row2421;
    private BigDecimal row2430;
    private BigDecimal row2450;
    private BigDecimal row2460;
    /**
     * net profit (loss)
     */
    private BigDecimal row2400;

    public IncomeReport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
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

    public BigDecimal getRow2110() {
        return row2110;
    }

    public void setRow2110(BigDecimal row2110) {
        this.row2110 = row2110;
    }

    public BigDecimal getRow2120() {
        return row2120;
    }

    public void setRow2120(BigDecimal row2120) {
        this.row2120 = row2120;
    }

    public BigDecimal getRow2100() {
        return row2100;
    }

    public void setRow2100(BigDecimal row2100) {
        this.row2100 = row2100;
    }

    public BigDecimal getRow2210() {
        return row2210;
    }

    public void setRow2210(BigDecimal row2210) {
        this.row2210 = row2210;
    }

    public BigDecimal getRow2200() {
        return row2200;
    }

    public void setRow2200(BigDecimal row2200) {
        this.row2200 = row2200;
    }

    public BigDecimal getRow2310() {
        return row2310;
    }

    public void setRow2310(BigDecimal row2310) {
        this.row2310 = row2310;
    }

    public BigDecimal getRow2320() {
        return row2320;
    }

    public void setRow2320(BigDecimal row2320) {
        this.row2320 = row2320;
    }

    public BigDecimal getRow2330() {
        return row2330;
    }

    public void setRow2330(BigDecimal row2330) {
        this.row2330 = row2330;
    }

    public BigDecimal getRow2340() {
        return row2340;
    }

    public void setRow2340(BigDecimal row2340) {
        this.row2340 = row2340;
    }

    public BigDecimal getRow2350() {
        return row2350;
    }

    public void setRow2350(BigDecimal row2350) {
        this.row2350 = row2350;
    }

    public BigDecimal getRow2300() {
        return row2300;
    }

    public void setRow2300(BigDecimal row2300) {
        this.row2300 = row2300;
    }

    public BigDecimal getRow2410() {
        return row2410;
    }

    public void setRow2410(BigDecimal row2410) {
        this.row2410 = row2410;
    }

    public BigDecimal getRow2421() {
        return row2421;
    }

    public void setRow2421(BigDecimal row2421) {
        this.row2421 = row2421;
    }

    public BigDecimal getRow2430() {
        return row2430;
    }

    public void setRow2430(BigDecimal row2430) {
        this.row2430 = row2430;
    }

    public BigDecimal getRow2450() {
        return row2450;
    }

    public void setRow2450(BigDecimal row2450) {
        this.row2450 = row2450;
    }

    public BigDecimal getRow2460() {
        return row2460;
    }

    public void setRow2460(BigDecimal row2460) {
        this.row2460 = row2460;
    }

    public BigDecimal getRow2400() {
        return row2400;
    }

    public void setRow2400(BigDecimal row2400) {
        this.row2400 = row2400;
    }
}
