public class Encap1 {
    public static void main(String[] args){
        login l = new login();
        l.setUsername("Vikas");
        l.setPassword(9590);
        System.out.println("This is password "+ l.getPassword());
        System.out.println("This is username " + l.getUsername());

    }
}

class login{
    private String username;
    private int  password;
    public String getUsername() {
        return username;
    }
    public int getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(int password) {
        this.password = password;
    }

}