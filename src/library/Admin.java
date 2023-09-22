package library;

class Admin extends User {

    public Admin(String name, Integer userID) {
        super(name, userID);
    }

    @Override
    public String toString() {
        return "library.Admin{} " + super.toString();
    }
}
