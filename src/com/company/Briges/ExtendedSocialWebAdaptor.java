package com.company.Briges;

import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public class ExtendedSocialWebAdaptor implements ExtendedSocialWeb {

        private BasicSocialWeb extendedSocialWeb;

    public ExtendedSocialWebAdaptor(BasicSocialWeb extendedSocialWeb) {
        this.extendedSocialWeb = extendedSocialWeb;
    }

    @Override
    public String getHistory(int userID, String date) {
        if (extendedSocialWeb instanceof VKSocialWeb){
            return new VKSocialWeb().getHistory();
        }
        if (extendedSocialWeb instanceof FBSocialWeb){
        return new FBSocialWeb().getHistory(date);
        }
        return null;
    }

    @Override
    public List<Integer> getLikes(int userID, boolean showNegative, int messageId) {
        if (extendedSocialWeb instanceof VKSocialWeb){
            return new VKSocialWeb().getLikes(messageId,userID);
        }
        if (extendedSocialWeb instanceof FBSocialWeb){
            return new FBSocialWeb().getLikes(messageId,showNegative,userID);
        }
        return null;
    }
}
