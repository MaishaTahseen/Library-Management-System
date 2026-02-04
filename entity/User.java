package entity;

public abstract class User {
    private Integer id;
    private String username;
    private String password;
    private String mail;
    private String phn;
    public User(Integer id, String username, String password, String mail, String phn){
        this.id=id;
        this.username=username;
        this.password=password;
        this.mail=mail;
        this.phn = phn;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getMail(){
        return mail;
    }
    public String getPhone(){
        return phn;
    }
    public Integer getID(){
        return id;
    }
    public void setID(Integer id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phn) {
        this.phn = phn;
    }
    


}
