package pers.corvey.exam.entity.sys;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.springframework.security.core.userdetails.UserDetails;

import pers.corvey.exam.entity.common.BaseEntityImpl;
import pers.corvey.exam.entity.common.IdEntity;

@Entity
public class SysUser extends BaseEntityImpl<Long> implements UserDetails {

	private static final long serialVersionUID = -8934005291821318128L;
	private String name;
	private String username;
	private String password;
	private Integer money;
	private String email;
	private String telphone;
	private String image;
	private String gender;
	private Set<SysAuthority> authorities;
	
	public SysUser() {}
	
	@Override
	public String toString() {
		return String.format("SysUser[id=%s, name=%s, username=%s, password=%s]", 
				id, name, username, password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(length = 20, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	@Column(length = 20, updatable = false, nullable = false, unique = true)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	@Column(columnDefinition = "char(32)", nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}
	
	@Override
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "sys_user_authority")
	public Set<SysAuthority> getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(Set<SysAuthority> authorities) {
		this.authorities = authorities;
	}

	@Override
	@Transient
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	@Transient
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	@Transient
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	@Transient
	public boolean isEnabled() {
		return true;
	}
	
	/*----------JSP需要用到的方法--------------*/
	
	@Transient
	public Integer getAdmin() {
		 if(authorities.stream()
				.map(x -> x.getAuthority())
				.anyMatch(a -> a.equals("ROLE_ADMIN")))
		 	return 2;
		 	else if (authorities.stream()
				.map(x -> x.getAuthority())
				.anyMatch(a -> a.equals("ROLE_REPORT")))
		 		return 3;
		 	else
		 		return 1;
	}
	
	@Transient
	public List<Byte> getAuthorityIds() {
		return IdEntity.getCollectionIds(getAuthorities());
	}
	
	@Transient
	public String getAuthorityNames() {
		if (authorities == null) {
			return null;
		}
		List<String> names = authorities.stream()
				.sorted((a, b) -> a.getId() < b.getId() ? -1 : 1)
				.map(x -> x.getAuthority().replace("ROLE_", ""))
				.collect(Collectors.toList());
		return String.join(", ", names);
	}
}
