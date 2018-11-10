package com.mesawer.training.dynamicui;

import java.io.Serializable;
import java.util.List;

public class Attribute implements Serializable {

    private String panelGroup;;
    private Integer panelSeq;
    private Integer panelRecid;
    private Integer attributeRecid;
    private String attributeName;
    private String attributeValue;
    private Integer attributeValueRecid;
    private Boolean readOnly;
    private Boolean mandatory;
    private String attributeType;
    private Integer attributeTypeRecid;
    private Integer colNo;
    private Integer rowNo;
    private List<String> valueList;
    private String format;
    private Integer momoRow;
    private Integer memoColumn;

    public String getPanelGroup() {
        return panelGroup;
    }

    public void setPanelGroup(String panelGroup) {
        this.panelGroup = panelGroup;
    }

    public Integer getPanelSeq() {
        return panelSeq;
    }

    public void setPanelSeq(Integer panelSeq) {
        this.panelSeq = panelSeq;
    }

    public Integer getPanelRecid() {
        return panelRecid;
    }

    public void setPanelRecid(Integer panelRecid) {
        this.panelRecid = panelRecid;
    }

    public Integer getAttributeRecid() {
        return attributeRecid;
    }

    public void setAttributeRecid(Integer attributeRecid) {
        this.attributeRecid = attributeRecid;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public Integer getAttributeValueRecid() {
        return attributeValueRecid;
    }

    public void setAttributeValueRecid(Integer attributeValueRecid) {
        this.attributeValueRecid = attributeValueRecid;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public Integer getAttributeTypeRecid() {
        return attributeTypeRecid;
    }

    public void setAttributeTypeRecid(Integer attributeTypeRecid) {
        this.attributeTypeRecid = attributeTypeRecid;
    }

    public Integer getColNo() {
        return colNo;
    }

    public void setColNo(Integer colNo) {
        this.colNo = colNo;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getMomoRow() {
        return momoRow;
    }

    public void setMomoRow(Integer momoRow) {
        this.momoRow = momoRow;
    }

    public Integer getMemoColumn() {
        return memoColumn;
    }

    public void setMemoColumn(Integer memoColumn) {
        this.memoColumn = memoColumn;
    }
}
