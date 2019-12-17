//package pers.corvey.exam.entity;
//
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Transient;
//
//import org.springframework.security.core.userdetails.UserDetails;
//
//import pers.corvey.exam.entity.common.BaseEntityImpl;
//import pers.corvey.exam.entity.common.IdEntity;
//
//@Entity(name = "sys_user_info")
//public class SysUserInfo extends BaseEntityImpl<Long> {
//
////    private static final long serialVersionUID = 2199893230329858254L;
//    //    private static final long serialVersionUID = 1L;
//    private String telphone;
//    private String email;
//    private String gender;
//    private String image;
//
//    public SysUserInfo() {}
//
////    @Override
////    public String toString() {
////        return String.format("SysUserInfo[id=%s, telphone=%s, email=%s, gender=%s,image=%s]",
////                id, telphone, email, gender,image);
////    }
//
//
//    public String getTelphone() {
//        return telphone;
//    }
//
//    public void setTelphone(String telphone) {
//        this.telphone = telphone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//}
