package model;

public class User {
	
	private String userID;
	private String loginPassword;//µÇÂ¼ÃÜÂë
    private String identity;//Student£»Teacher£»Admin
	public User(){}
	public User(String userID, String loginPassword, String identity) {
		this.userID = userID;
		this.loginPassword = loginPassword;
		this.identity = identity;
	}
    
}
