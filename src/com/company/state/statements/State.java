package com.company.state.statements;

import com.company.state.Document;

/**
 * Created by User on 05.05.2017.
 */
public abstract class State {
    private Document doc;

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

}
