package com.example.dokkaapplication;

/**
 * Dokka expects that only member field should be annotated with @{@link Deprecated} and not its
 * accessor methods.
 */
public class DeprecatedFieldObject {

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
    public String getPassword() {
        return password;
    }

    /**
     * Set password.
     *
     * @deprecated this setter is deprecated and will be removed in a future major release.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
