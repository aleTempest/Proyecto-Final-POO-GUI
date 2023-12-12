package org.ale.gui_futbol.Factories;

import org.ale.gui_futbol.DBObjects.User;

public class UserFactory {
    public static User create(Integer userId, String firstName, String lastName, String phoneNumber, String career, String enrollment, String password) {
        return new User(userId, firstName, lastName, phoneNumber, career, enrollment, password);
    }
}
