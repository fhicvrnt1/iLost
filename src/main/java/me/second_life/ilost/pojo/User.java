/**
 * 
 */
package me.second_life.ilost.pojo;

/**
 * @Description 用户pojo
 * @author 可凡
 * @date 2013年12月20日 下午8:15:31
 * @mail liukefan@gmail.com
 * @version v1.0.0
 */
public class User extends Common {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2900686332819781030L;
	private int userId;
	private String userName;
	private String userPassword;

	/**
	 * @return the id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword
	 *            the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
