package pers.corvey.exam.controller.sys;

import java.util.List;
import java.util.Set;

import jdk.nashorn.internal.runtime.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import pers.corvey.exam.controller.common.BaseControllerImpl;
import pers.corvey.exam.entity.sys.SysAuthority;
import pers.corvey.exam.entity.sys.SysUser;
//import pers.corvey.exam.entity.SysUserInfo;
import pers.corvey.exam.entity.ui.CallBackMessage;
import pers.corvey.exam.service.sys.SysAuthorityService;
import pers.corvey.exam.service.sys.SysUserService;
import pers.corvey.exam.util.CurrentUtils;
//import pers.corvey.exam.service.sys.UserInfoService;

@Controller
@RequestMapping("/sys/user")
public class SysUserController extends BaseControllerImpl<SysUser, Long> {

    private final SysUserService sysUserService;

    private final SysAuthorityService sysAuthorityService;

//	private final UserInfoService userInfoService;

    @Autowired
    public SysUserController(SysUserService sysUserService,
                             SysAuthorityService sysAuthorityService) {

        super(sysUserService, "sys/user-input.jsp", "sys/user-list.jsp");
        this.sysUserService = sysUserService;
        this.sysAuthorityService = sysAuthorityService;
//		this.userInfoService = userInfoService;
    }

    /**
     * 保存记录
     *
     * @param user
     * @param ids
     * @return
     */
    @PostMapping(SAVE_PATH)
    public String save(@ModelAttribute("entity") SysUser user,
                       @RequestParam(name = "authorityIds", required = false) List<Byte> authorityIds) {
        if (user.getMoney() == null) {
            user.setMoney(10);
        }
        Set<SysAuthority> authorities = sysAuthorityService.findAll(authorityIds);
        authorities.add(sysAuthorityService.getDefaultAuthority());
        user.setAuthorities(authorities);
        return baseSave(user);
    }

    @PostMapping("/save1")
    public String save1(@ModelAttribute("entity") SysUser user,
                        @RequestParam(name = "authorityIds", required = false) List<Byte> authorityIds) {
        if (user.getMoney() == null) {
            user.setMoney(10);
        }
        Set<SysAuthority> authorities = sysAuthorityService.findAll(authorityIds);
        authorities.add(sysAuthorityService.getDefaultAuthority());
        user.setAuthorities(authorities);
        String optionName = user.getId() == null ? "新增" : "修改";
        CallBackMessage msg = CallBackMessage.createMsgAfterFunction(
                () -> mainService.save(user), optionName + "成功！", optionName + "失败");
        CurrentUtils.addAttributeToSession(CallBackMessage.MESSAGE_ATTRIBUTE_NAME, msg);
        return redirect("/inputs");
    }


    @PostMapping("/search")
    public String search(Model model, @RequestParam("keyword") String keyword) {
        return baseShowListView(model, sysUserService.search(keyword));
    }

    @Override
    public String showInputView(Model model, @ModelAttribute("entity") SysUser entity) {
        Iterable<SysAuthority> authorities = sysAuthorityService.findAll();
        model.addAttribute("authorities", authorities);
        return super.showInputView(model, entity);
    }

    @RequestMapping("/inputs")
    public String showInputView1(Model model, @ModelAttribute("entity") SysUser entity) {
        Iterable<SysAuthority> authorities = sysAuthorityService.findAll();
        model.addAttribute("authorities", authorities);
        return "user-info-show";
    }

    @Override
    public String showDetailView(Model model, @ModelAttribute("entity") SysUser entity) {
        Iterable<SysAuthority> authorities = sysAuthorityService.findAll();
        model.addAttribute("authorities", authorities);
        return super.showDetailView(model, entity);
    }

    @RequestMapping("/update")
    public void updateInfo(@RequestParam("name") String name, @RequestParam("email") String email) {
        sysUserService.delete(1L);


    }

//    @RequestMapping("/info")
//    public String showInfoView(Model model) {
//
//    }




}
