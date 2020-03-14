package optional;

public class MobileService {

    public int getMobileScreenWidth(Mobile mobile){
        if (mobile!=null){
            DisplayFeatures displayFeatures = mobile.getDisplayFeatures();
            if (displayFeatures!=null){
                ScreenResolition screenResolition = displayFeatures.getResolution();
                if (screenResolition !=null){
                    return screenResolition.getWidth();
                }
            }
        }
        return 0;
    }
}
