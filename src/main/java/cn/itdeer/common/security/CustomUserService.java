package cn.itdeer.common.security;

import cn.itdeer.modules.admin.security.entity.Role;
import cn.itdeer.modules.admin.security.entity.User;
import cn.itdeer.modules.admin.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：自定义用户Service
 * 创建人：Itdeer
 * 创建时间：2017/10/9 21:51
 */

@Service
public class CustomUserService implements UserDetailsService{

    @Autowired
    private UserService userService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("登录账户不存在");
        }

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

      /* for(Role role : user.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }*/

        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),authorities);
    }
}
