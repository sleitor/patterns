package com.company.Briges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public class VKSocialWeb extends BasicSocialWeb {

    public String getHistory(){
        return "VKSocialWeb history";
    }
    List<Integer> getLikes(int messageId, int userID ){
        return Arrays.asList(1,2,3);
    }
}
