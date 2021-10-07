package Java.DesignPatterns.StructuralPattern;

import java.util.ArrayList;
import java.util.List;

class Profile{
    String id;
}

interface ProfileIterator{
    Boolean hasNext();
    Profile getNext();
}

interface SocialNetwork{
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}

class Facebook implements SocialNetwork{

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return null;
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return null;
    }
}

class FaceBookIterator implements ProfileIterator{

    List<Profile> profiles = new ArrayList();
    int currentPosition = 0;

    @Override
    public Boolean hasNext() {
        return profiles.get(currentPosition)!=null;
    }

    @Override
    public Profile getNext() {
        currentPosition++;
        return profiles.get(currentPosition);
    }
}

public class IteratorMethod {
    public static void main(String[] args){

    }
}
