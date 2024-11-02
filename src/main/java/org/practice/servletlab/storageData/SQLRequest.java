package org.practice.servletlab.storageData;

public enum SQLRequest {
    FIND_BY_USERNAME_PASSWORD("SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?"),
    INSERT("INSERT INTO USERS (id, username, password, gender, email, birthday) VALUES (?, ?, ?, ?, ?, ?)"),
    FIND_BY_EMAIL_PASSWORD("SELECT * FROM USERS WHERE EMAIL = ? AND PASSWORD = ?"),
    FIND_BY_EMAIL("SELECT * FROM USERS WHERE EMAIL = ?"),
    FIND_BY_USERNAME("SELECT * FROM USERS WHERE USERNAME = ?");

    private String sql;

    SQLRequest(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }
}
