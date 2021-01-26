package by.alex.shop;

public class User {
    private int id;
    private String userName;
    private String password;
    private String confirmPassword;
    private static int count = 0;
    private Basket basket = new Basket();

    public Basket getBasket() {
        return basket;
    }

    public User(String userName, String password) {
        count++;
        this.id = count;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {

        return id;
    }


    public String getUserName() {

        return userName;
    }

//    public void setUserName(String userName) {
//        this.userName = userName;
//    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public void setUserNamePassword(String userName, String password, String confirmPassword) throws WrongUserNameExceprion, WrongPasswordException {
        try {
            if (userName.length() < 5 || userName.length() > 15 || !userName.matches("[a-zA-Z0-9_]*")) {
                throw new WrongUserNameExceprion();
            } else {
                this.userName = userName;
            }
        } catch (WrongUserNameExceprion e) {

            System.err.println("Wrong UserName " + e.getMessage());
        }

            try {
                if (password.length() > 25 || !password.matches("[a-zA-z0-9]*") || !password.equals(confirmPassword)) {
                    throw new WrongPasswordException();
                } else {
                    this.password = password;
                    this.confirmPassword = confirmPassword;
                }
            } catch (WrongPasswordException ex) {
                System.err.println("Wrong password!! " + ex.getMessage());
            }

        }
        }


