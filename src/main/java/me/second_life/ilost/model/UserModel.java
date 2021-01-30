/**
 * 
 */
package me.second_life.ilost.model;

import java.io.Serializable;

import me.second_life.ilost.pojo.User;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月27日 下午3:46:37
 * @mail
 * @version v1.0.0
 */
public class UserModel extends User implements Serializable {

	/**
	 * 
	 */	private static final long serialVersionUID = 4930099394287064160L;

	public String toString() {
		return "User { { user_id , " + getUser_Id() + " } , {user_name , "
				+ getUser_Name() + " } , { user_password , "
				+ getUser_Password() + " } }";
	}

}
