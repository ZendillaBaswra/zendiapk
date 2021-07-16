/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi;

/**
 *
 * @author YOGA SAPUTRA
 */
public class session {
    private static String id_login;
    private static String username;

    public static String getId_login() {
        return id_login;
    }

    public static void setId_login(String id_login) {
        session.id_login = id_login;
    }
     public static String getUsername() {
        return username;
    }
    public static void setUsername(String username) {
        session.username = username;
    }
    
}
