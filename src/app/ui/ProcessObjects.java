
package app.ui;

import app.model.Publication;
import app.model.User;
import app.util.Dbutil;

public class ProcessObjects implements ProcessObjectsInterface {

    @Override
    public User createUser(String[] input) {
        return new User(input[0],
                input[1],
                input[2]);
    }

    @Override
    public Publication createPub(String[] input) {
        return new Publication(input[0],
                input[1],
                input[2]);
    }
}
