package com.company.Briges;

import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public interface ExtendedSocialWeb {

    String getHistory(int userID, String date);
    List<Integer> getLikes(int userID, boolean showNegative, int messageId );
}
