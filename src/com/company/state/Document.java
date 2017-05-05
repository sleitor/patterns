package com.company.state;

import com.company.state.statements.State;

/**
 * Created by User on 05.05.2017.
 */
public class Document extends State {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {

        this.data = data;
    }
}
