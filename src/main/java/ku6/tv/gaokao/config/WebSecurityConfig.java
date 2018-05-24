package ku6.tv.gaokao.config;

/**
 * Created by paul on 2017/4/18.
 */

import ku6.tv.gaokao.constants.MVCConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**

 *
 */
@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {

    /**
     * 登录session key
     */


    @Bean
    public SecurityInterceptor getSecurityInterceptor() {
        return new SecurityInterceptor();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());

        // 排除配置
        addInterceptor.excludePathPatterns("/error");
        addInterceptor.excludePathPatterns("/login**");
        addInterceptor.excludePathPatterns("/test");
        addInterceptor.excludePathPatterns("/checkFee");


        // 拦截配置
        addInterceptor.addPathPatterns("/**");
    }


    private class SecurityInterceptor extends HandlerInterceptorAdapter {

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                throws Exception {
            HttpSession session = request.getSession();
            if(request.getRequestURI().endsWith(".css")||request.getRequestURI().endsWith(".js"))
                return true;
            if (session.getAttribute(MVCConstant.CURRENT_STUDENT) != null)
                return true;

            // 跳转登录
            String url = "/login";
            response.sendRedirect(url);
            return false;
        }
    }
}