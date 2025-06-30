class Encap9{
	 public static void main(String[] args) {
        Login login = new Login();
        login.setUsername("user123");
        login.setPassword("mypassword"); 

        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword()); 


        login.setPassword("short");  
    }
}
class Login {
    
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() > 6) {
            this.password = password;
        } else {
            System.out.println("Password must be more than 6 characters.");
        }
    }
   
}
