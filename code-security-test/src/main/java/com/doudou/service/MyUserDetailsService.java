package com.doudou.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.doudou.entity.SystemUser;
import com.doudou.mapper.SystemUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DouDou
 * @date 2021/1/1
 * @Description
 */
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private SystemUserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SystemUser systemUser = userMapper.selectOne(new QueryWrapper<SystemUser>().eq("username",username));
        if(systemUser == null)
            throw new UsernameNotFoundException("用户不存在！");
        List<GrantedAuthority> authors = AuthorityUtils.commaSeparatedStringToAuthorityList("admins");
        return new User(systemUser.getUsername(),new BCryptPasswordEncoder().encode(systemUser.getPassword()),authors);
    }

}
