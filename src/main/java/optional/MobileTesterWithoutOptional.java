package optional;

public class MobileTesterWithoutOptional {
    public static void main(String[] args) {
        ScreenResolition resolition = new ScreenResolition(950,1500);
        DisplayFeatures displayFeatures = new DisplayFeatures("4.7",resolition);
        Mobile mobile = new Mobile(2015001,"Apple","iphone 11",displayFeatures);

        MobileService mobileService = new MobileService();

        int mobileWidth = mobileService.getMobileScreenWidth(mobile);
        System.out.println("Apple iphone 11 Screen Width : " + mobileWidth);

        ScreenResolition resolition2 = new ScreenResolition(0,0);
        DisplayFeatures displayFeatures2 = new DisplayFeatures("0",resolition2);
        Mobile mobile2 = new Mobile(2015001, "Apple","iphone 11",displayFeatures2);
        int mobileWidth2 = mobileService.getMobileScreenWidth(mobile2);
        System.out.println(mobileWidth2);
    }
}
