package mwp.domain;

import java.util.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(name="basedomain")
public class Basedomain {
    @Basic
    private double amount;

    @Basic
    private String billName;

    @Basic
    private String billType;

    @Basic
    private Date createDate;

    @Basic
    @Column(nullable=false, length=31)
    private String dtype;

    @Basic
    private Date endDate;

    @Basic
    private String havePay;

    @Id
    private long id;

    @Basic
    private Date mailDate;

    @Basic
    private Date startDate;


    public Basedomain() {
    }

    public Basedomain(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getHavePay() {
        return havePay;
    }

    public void setHavePay(String havePay) {
        this.havePay = havePay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getMailDate() {
        return mailDate;
    }

    public void setMailDate(Date mailDate) {
        this.mailDate = mailDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}