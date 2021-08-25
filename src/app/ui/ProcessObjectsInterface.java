package app.ui;

import app.model.Publication;
import app.model.User;

public interface ProcessObjectsInterface {

    User createUser(String[] input);

    Publication createPub(String[] input);

}
