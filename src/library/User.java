package library;

class User {
    private String name;
    private Integer userID;

    public User(String name, Integer userID) {
        this.name = name;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "library.User{" +
                "name='" + name + '\'' +
                ", userID=" + userID +
                '}';
    }
}