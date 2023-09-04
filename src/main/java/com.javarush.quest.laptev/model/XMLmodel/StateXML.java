package com.javarush.quest.laptev.model.XMLmodel;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class StateXML {
    @XmlAttribute(name = "label")
    private String label;
    @XmlAttribute(name = "yes")
    private String stateOne;
    @XmlAttribute(name = "no")
    private String stateTwo;

    public StateXML() {

    }

    public StateXML(String label, String stateOne, String stateTwo) {
        this.label = label;
        this.stateOne = stateOne;
        this.stateTwo = stateTwo;
    }

    public String getLabel() {
        return label;
    }

    public String getStateOne() {
        return stateOne;
    }

    public String getStateTwo() {
        return stateTwo;
    }
}
