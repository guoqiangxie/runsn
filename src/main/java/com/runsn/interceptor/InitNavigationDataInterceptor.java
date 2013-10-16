package com.runsn.interceptor;

import com.runsn.dto.Document;
import com.runsn.dto.DocumentType;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.TypeDao;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: InitNavigationDataInterceptor
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class InitNavigationDataInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        List<Document> services = DocumentDao.queryByTitle1code(1);
        modelAndView.addObject("services", services);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
