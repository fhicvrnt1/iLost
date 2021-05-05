/**
 * 
 */
package me.second_life.ilost.pojo;

import java.io.Serializable;

import org.joda.time.DateTime;

/**
 * @Description pojo通用属性
 * @author 可凡
 * @date 2014年1月3日 下午10:20:38
 * @mail
 * @version v1.0.0
 */
public class Common implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6282309387973367970L;
	private String addUser;
	private String updateUser;
	private DateTime addTime;
	private DateTime updateTime;

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
	public DateTime getAddTime() {
		return addTime;
	}

	/**
	 * @param addDate
	 *            the addDate to set
	 */
	public void setAddTime(DateTime addTime) {
		this.addTime = addTime;
	}

	/**
	 * @return the updateDate
	 */
	public DateTime getUpdateDate() {
		return updateTime;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateTime(DateTime updateTime) {
		this.updateTime = updateTime;
	}

}
