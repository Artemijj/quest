package com.javarush.quest.laptev.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class State {
    private String label;
    private State stateOne;
    private State stateTwo;

    public State(String label) {
        this.label = label;
    }

    @XmlElement
    public void setNextStates(State stateOne, State stateTwo) {
        this.stateOne = stateOne;
        this.stateTwo = stateTwo;
    }

    public State nextState(String answer) {
        State next = null;
        if (answer.equals("one")) {
            next = stateOne;
        } else if (answer.equals("two")) {
            next = stateTwo;
        }
        return next;
    }

    public String getLabel() {
        return label;
    }
}
