package com.klim.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

/**
 * Created by Artem on 06.11.2016.
 */
@Entity(name = "results")
public class Results {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long loginId;

    @Column(name = "testid")
    private String testId;

    @Column(name = "dat")
    private Date dat;

    @Column(name = "mark")
    private int mark;

    public Results() {
    }

    public Results(String testId, Date dat, int mark) {
        this.testId = testId;
        this.dat = dat;
        this.mark = mark;
    }

    public long getLoginId() {
        return loginId;
    }

    public void setLoginId(long loginId) {
        this.loginId = loginId;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
