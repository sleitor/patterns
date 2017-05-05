package com.company.Briges;

/**
 * Created by User on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        BasicSocialWeb faceBookSocialWeb =
                new FBSocialWeb();
        ExtendedSocialWeb extendedSocialWeb =
                new ExtendedSocialWebAdaptor(faceBookSocialWeb);

        System.out.println(
                extendedSocialWeb
                        .getHistory(1, "04.05.2017")
        );

        System.out.println(
                extendedSocialWeb
                        .getLikes(1,
                                true,
                                2)
        );


        FacadeDetective detective = new FacadeDetective();
        detective.makeDoc(faceBookSocialWeb, 1);


        FacadeInspector inspector = new FacadeInspector();
        inspector.getPays(faceBookSocialWeb,1);
    }
}
