package com.company.state.statements;

/**
 * Created by User on 05.05.2017.
 */
public class StateNew1 extends State {


    public StateOtpravlen setStateOtpravlen () {
        return new StateOtpravlen();
    }
    
}
