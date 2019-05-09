package dt.library.entity;

import java.util.Date;

public class Library extends BaseEntity{

	private static final long serialVersionUID = -714705552823267403L;

	private String name;//'图书馆名',
	private String  curator;//'馆长名',
	private String tel;//'电话',
	private String address ;// '地址',
	private String  email;//'邮箱',
	private String website;// '网址',
	private Date createdDate ;// '建馆日期',
	private String profile;// '简介',
	private Integer cardFee;// '开卡费',
	private Integer cardValidDate ;// '卡有效期'	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurator() {
		return curator;
	}
	public void setCurator(String curator) {
		this.curator = curator;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Integer getCardFee() {
		return cardFee;
	}
	public void setCardFee(Integer cardFee) {
		this.cardFee = cardFee;
	}
	public Integer getCardValidDate() {
		return cardValidDate;
	}
	public void setCardValidDate(Integer cardValidDate) {
		this.cardValidDate = cardValidDate;
	}
	@Override
	public String toString() {
		return "Library [name=" + name + ", curator=" + curator + ", tel=" + tel + ", address=" + address + ", email="
				+ email + ", website=" + website + ", createdDate=" + createdDate + ", profile=" + profile
				+ ", cardFee=" + cardFee + ", cardValidDate=" + cardValidDate + "]";
	}
	
}
