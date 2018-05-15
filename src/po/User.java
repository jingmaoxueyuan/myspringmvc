package po;

import java.util.Date;
import java.util.List;

public class User {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public List<Orders> getOrders() {
	return orders;
}
public void setOrders(List<Orders> orders) {
	this.orders = orders;
}
private String username;
private Date birthday;
private char sex;
private String address;
private List<Orders> orders;
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", birthday="
			+ birthday + ", sex=" + sex + ", address=" + address + ", \norders="
			+ orders + "]\n";
}

}
