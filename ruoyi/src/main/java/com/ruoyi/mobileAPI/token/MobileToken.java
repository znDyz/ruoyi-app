package com.ruoyi.mobileAPI.token;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.security.service.TokenService;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.system.domain.SysUser;
import com.ruoyi.project.system.service.ISysPostService;
import com.ruoyi.project.system.service.ISysRoleService;
import com.ruoyi.project.system.service.ISysUserService;
import com.sun.xml.internal.bind.v2.TODO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api("检测用户token")
@RestController
public class MobileToken {

    @Autowired
    private ISysUserService userService;

    @Autowired
    private TokenService tokenService;

    @ApiOperation("检测用户token")
    @PostMapping("/checkToken")
    public AjaxResult checkToken(HttpServletRequest request)
    {
        // 获取请求携带的令牌
        //TODO;----待完成
        return null;

    }

}
