package pattern05.prototype;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户
 */

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User implements Cloneable {

	private String username;
	private List<String> emailList;

	public User(String username, String... email) {
		this.username = username;
		this.emailList = new ArrayList<String>();
		for (String eml : email) {
			this.emailList.add(eml);
		}
	}

	@Override
	public User clone() {
		try {
			User user = (User) super.clone();
			user.emailList = new ArrayList<String>();
			for (String email : this.emailList) {
				user.emailList.add(new String(email));
			}
			return user;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
