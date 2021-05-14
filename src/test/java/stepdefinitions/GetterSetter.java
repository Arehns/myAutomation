package stepdefinitions;

public class GetterSetter {

    private String newEmail = "";
    private String newUser = "";
    StringModifier g = new StringModifier();

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String email) {
        if (email.equals("randomEmail")) {
            this.newEmail = g.randomEmailString();

        } else if (email.equals("noEmail")) {
            this.newEmail = "";

        }
    }
    public String getNewUser() {
        return newUser;
    }

    public void setNewUser(String user) {
        if (user.equals("randomName")) {

            this.newUser = g.randomUserString();

        } else if (user.equals("tooLongName")) {
            this.newUser = g.userNameTooLong();

        } else if (user.equals("takenUser")) {
            this.newUser = "AndreaAutoUppgift";

        }
    }
}