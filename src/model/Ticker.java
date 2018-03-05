/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author lucas
 */
public class Ticker {

    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal vol;
    private BigDecimal last;
    private BigDecimal buy;
    private BigDecimal sell;
    private Integer date;

    public String getHigh() {
        return new DecimalFormat("#.00").format(high);
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public String getLow() {
        return new DecimalFormat("#.00").format(low);
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getVol() {
        return vol;
    }

    public void setVol(BigDecimal vol) {
        this.vol = vol;
    }

    public String getLast() {

        return new DecimalFormat("#.00").format(last);
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public void setBuy(BigDecimal buy) {
        this.buy = buy;
    }

    public BigDecimal getSell() {
        return sell;
    }

    public void setSell(BigDecimal sell) {
        this.sell = sell;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

}
