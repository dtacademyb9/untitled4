package library;

class Member extends User {
    public Member(String name, Integer userID) {
        super(name, userID);
    }

    // Additional methods to borrow and return books...


    @Override
    public String toString() {
        return "library.Member{} " + super.toString();
    }
}
