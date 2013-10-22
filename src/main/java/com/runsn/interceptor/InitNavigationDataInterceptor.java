package com.runsn.interceptor;

import com.runsn.dto.Document;
import com.runsn.dto.DocumentDetail;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.TypeDao;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
        modelAndView.addObject("services", DocumentDao.queryByTitle1code(1));
        modelAndView.addObject("requirementSolutions", groupData(DocumentDao.queryByTitle2code(2, 1)));
        modelAndView.addObject("bizSolutions", groupData(DocumentDao.queryByTitle2code(2, 2)));
        modelAndView.addObject("sizeSolutions", groupData(DocumentDao.queryByTitle2code(2, 3)));
        modelAndView.addObject("requirementProducts", DocumentDao.queryByTitle2code(3, 1));
        modelAndView.addObject("brandProducts", DocumentDao.queryByTitle2code(3, 2));
        modelAndView.addObject("trains", DocumentDao.queryByTitle1code(4));
    }

    private List groupData(List<Document> requirementSolutions) {
        Set typeids = new HashSet();
        for (Document document : requirementSolutions) {
            typeids.add(document.getTypeid());
        }
        List result = new ArrayList();
        Iterator iterator = typeids.iterator();
        while (iterator.hasNext()) {
            Integer typeid = (Integer) iterator.next();
            List list = new ArrayList();
            for (Document document : requirementSolutions) {
                if (document.getTypeid().equals(typeid)) {
                    DocumentDetail documentDetail = new DocumentDetail();
                    documentDetail.setDocument(document);
                    documentDetail.setDocumentType(TypeDao.query(typeid));
                    list.add(documentDetail);
                }
            }
            result.add(list);
        }
        return result;
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
