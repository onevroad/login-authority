package org.onevroad.login.auth.samples;

import org.onevroad.login.auth.core.RequestMessageConverter;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Type;

@Component
public class LoginRequestMessageConverter implements RequestMessageConverter {

    @Override
    public Object convert(HttpServletRequest request, MethodParameter parameter,
                              Type paramType) {
        String token = request.getHeader("token");
        LoginUser loginUser = new LoginUser();
        loginUser.setUserId(token);
        return loginUser;
    }
}
