/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author Admin
 */
public class SessionManager {
    private static int userId;
    private static String username;
    private static String userType;

    // Méthodes pour définir les informations de session
    public static void setSession(int userId, String username, String userType) {
        SessionManager.userId = userId;
        SessionManager.username = username;
        SessionManager.userType = userType;
    }

    // Méthodes pour récupérer les informations de session
    public static int getUserId() {
        return userId;
    }

    public static String getUsername() {
        return username;
    }

    public static String getUserType() {
        return userType;
    }
    
}
