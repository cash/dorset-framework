package edu.jhuapl.dorset.ldapuserservice;

import java.util.List;
import java.util.Map;

public class Ldap {
    protected LdapConfig config;

    public Ldap(LdapConfig config) {
        this.config = config;
    }

    /**
     * Bind to the LDAP server using service account credentials
     */
    public void bind() {
        
    }

    /**
     * Bind to the LDAP server using the user's credentials
     *
     * @param username  the user's username
     * @param password  the user's password
     * @return whether the bind was successful
     */
    public boolean bindUser(String username, String password) {
        return false;
    }

    /**
     * Get a user's information from LDAP.
     *
     * The fields returned depends on LdapConfig
     *
     * @param username  The user's username
     * @return attribute data
     * @TODO need to look at data to see if this is what we want
     */
    public List<Map<String, String>> getUserData(String username) {
        return null;
    }
}
