package app.ui;

import app.model.Publication;
import app.model.User;

public interface ProcessObjectsInterface {

    public User createUser(String[] input);

    public Publication createPub(String[] input);

}
