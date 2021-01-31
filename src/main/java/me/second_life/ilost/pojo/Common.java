/**
 * 
 */
package me.second_life.ilost.pojo;

import org.joda.time.DateTime;

/**
 * @Description
 * @author 可凡
 * @date 2014年1月3日 下午10:20:38
 * @mail
 * @version v1.0.0
 */
public class Common {

	private String addUser;
	private String updateUser;
	private DateTime addDate;
	private DateTime updateDate;

	/**
	 * @return the addUser
	 */
	public String getAddUser() {
		return addUser;
	}

	/**
	 * @param addUser
	 *            the addUser to set
	 */
	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}

	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * @param updateUser
	 *            the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * @return the addDate
	 */
	public DateTime getAddDate() {
		return addDate;
	}

	/**
	 * @param addDate
	 *            the addDate to set
	 */
	public void setAddDate(DateTime addDate) {
		this.addDate = addDate;
	}

	/**
	 * @return the updateDate
	 */
	public DateTime getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

}
