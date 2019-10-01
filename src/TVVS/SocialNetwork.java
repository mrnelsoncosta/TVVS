package TVVS;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private static SocialNetwork socialNetwork = null;
    private List<Profile> profiles = new ArrayList<>();

    public SocialNetwork(){}

    static SocialNetwork getInstance() {
        if(socialNetwork == null)
            socialNetwork = new SocialNetwork();

        return socialNetwork;
    }

    public Profile createProfile(String name){
        Profile profile = new Profile(name);
        profiles.add(profile);
        return profile;
    }

    public int getNumberOfProfiles() {
        return profiles.size();
    }

    public String getProfileInformation(Profile profile){
        return profile.getName() + "'s Profile";
    }




}
