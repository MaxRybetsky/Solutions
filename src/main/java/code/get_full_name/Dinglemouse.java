package code.get_full_name;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (isEmpty(firstName)) {
            if (isEmpty(lastName)) {
                return "";
            } else {
                return lastName;
            }
        } else {
            if (isEmpty(lastName)) {
                return firstName;
            } else {
                return firstName + " " + lastName;
            }
        }
    }

    private boolean isEmpty(String str) {
        return "".equals(str);
    }

}