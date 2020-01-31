package com.example.dokkaapplication;

/**
 * If one tries to annotate accessor methods with @{@link Deprecated}, documentation breaks for all
 * the other deprecated code, everywhere in the project.
 */
public class FailedDeprecationObject {

    private String username;

    @Deprecated
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get password
     *
     * @return password
     * @deprecated this getter is deprecated and it will be removed in a future major release.
     */
    @Deprecated
    public String getPassword() {
        return password;
    }

    /**
     * Set password.
     *
     * @deprecated this setter is deprecated and will be removed in a future major release.
     */
    @Deprecated
    public void setPassword(String password) {
        this.password = password;
    }
}
