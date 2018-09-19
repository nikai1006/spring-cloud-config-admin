package com.didispace.scca.rest;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * spring-cloud-config-admin com.didispace.scca.rest
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 2:13 2018/9/20
 * @Modified By:
 */
public class BCryptPasswordEncoderTest {
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    @Test
    public void encode(){
        String encode = bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);
    }

}
