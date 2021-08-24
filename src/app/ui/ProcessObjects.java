
package app.ui;

import app.model.Publication;
import app.model.User;
import app.util.Dbutil;

public class ProcessObjects implements ProcessObjectsInterface {


    @Override
    public User createUser(String[] input) {
        User user = new User(input[0],
                input[1],
                input[2]);
        return user;
    }

    @Override
    public Publication createPub(String[] input) {
        Publication pub = new Publication(input[0],
                input[1],
                input[2]);
        return pub;
    }
}
