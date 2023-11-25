package main.model;

import main.model.user.User;
import main.utils.exception.ModelNotFoundException;

/**

 This interface represents an object that can be displayed in a formatted string and a splitter.
 */
public interface Displayable {
    /**
     Returns the formatted string representation of the object.
     @return the formatted string representation of the object.
     */
    String getDisplayableString() throws ModelNotFoundException;

    /**
     Returns the splitter used to separate different fields of the object in the formatted string representation.
     @return the splitter used to separate different fields of the object in the formatted string representation.
     */
    String getSplitter();
}
