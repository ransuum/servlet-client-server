package org.practice.servletlab.storageData;

public enum SQLRequest {
    FIND_BY_USERNAME_PASSWORD("SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?"),
    INSERT("INSERT INTO USERS (id, username, password, gender, email, birthday) VALUES (?, ?, ?, ?, ?, ?)"),
    FIND_BY_EMAIL_PASSWORD("SELECT * FROM USERS WHERE EMAIL = ? AND PASSWORD = ?"),
    FIND_BY_EMAIL("SELECT * FROM USERS WHERE EMAIL = ?"),
    FIND_BY_USERNAME("SELECT * FROM USERS WHERE USERNAME = ?"),
    INSERNT_PROFILE_PICTURE("INSERT INTO profile_pictures (id, username, profile_picture, upload_date) VALUES (?, ?, ?, ?)");

    private String sql;

    SQLRequest(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }
}
