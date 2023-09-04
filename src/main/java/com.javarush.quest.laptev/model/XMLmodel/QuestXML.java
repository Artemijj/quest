package com.javarush.quest.laptev.model.XMLmodel;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

@XmlRootElement(name = "quest")

public class QuestXML {
    @XmlAttribute(name = "init")
    private String initState;
    @XmlElementWrapper(name="states")
    @XmlElement(name="state")
    private ArrayList<StateXML> states;

    public QuestXML() {

    }

    public QuestXML(String initState, ArrayList<StateXML> states) {
        this.initState = initState;
        this.states = states;
    }

    public String getInitState() {
        return initState;
    }

    public ArrayList<StateXML> getStates() {
        return states;
    }
}
