package com.company.Briges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public class FBSocialWeb extends BasicSocialWeb {

    String getHistory(String date){
        return "FB history";
    }

    List<Integer> getLikes( int messageId, boolean showNegative,int userID ){
        return Arrays.asList(7,8,9);
    }
}
