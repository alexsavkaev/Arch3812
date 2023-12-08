public class Person {
    private int id;
    private String name;
    private long cardNumber;
    private long hashPass;
    private String login;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getHashPass() {
        return hashPass;
    }

    public String getLogin() {
        return login;
    }

    public void setHashPass(long hashPass) {
        this.hashPass = hashPass;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
