package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.DocumentDetail;
import com.runsn.dto.DocumentType;
import com.runsn.dto.Images;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.ImagesDao;
import com.runsn.jdbc.TypeDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: AdminController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "admin/image")
public class ImageController {

    @RequestMapping("image_rightCourse.html")
     public ModelAndView image_rightCourse(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(1);
        modelAndView.addObject("rightCourse1", imagesList.size() > 0 ? imagesList.get(0) : new Images());
        modelAndView.addObject("rightCourse2", imagesList.size() > 1 ? imagesList.get(1) : new Images());
        modelAndView.addObject("rightCourse3", imagesList.size() > 2 ? imagesList.get(2) : new Images());
        modelAndView.setViewName("admin/image_rightCourse");
        return modelAndView;
    }

    @RequestMapping("companyLeftImageLink.html")
    public ModelAndView companyLeftImageLink(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(9);
        DocumentDetail documentDetail = new DocumentDetail();
        List<Document> documents = DocumentDao.queryByTitle1code(6);
        Document document = (documents.size() > 0 ? documents.get(0) : new Document());
        if (document != null && document.getCreateDate()!=null) {
            DocumentType documentType = TypeDao.query(document.getTypeid());
            documentDetail.setDocument(document);
            documentDetail.setDocumentType(documentType);
            documentDetail.setDocumentId(document.getId());
            documentDetail.setTypeid(documentType.getId());
        } else documentDetail.getDocument().setDefaultContent(6);
        modelAndView.addObject("documentDetail", documentDetail);
        modelAndView.addObject("leftImage", (imagesList.size() > 0 ? imagesList.get(0) : new Images()));
        modelAndView.setViewName("admin/companyLeftImageLink");
        return modelAndView;
    }

    @RequestMapping("companyRightImageLink.html")
    public ModelAndView companyRightImageLink(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(10);
        DocumentDetail documentDetail = new DocumentDetail();
        List<Document> documents = DocumentDao.queryByTitle1code(7);
        Document document = (documents.size() > 0 ? documents.get(0) : new Document());
        if (document != null && document.getCreateDate()!=null) {
            DocumentType documentType = TypeDao.query(document.getTypeid());
            documentDetail.setDocument(document);
            documentDetail.setDocumentType(documentType);
            documentDetail.setDocumentId(document.getId());
            documentDetail.setTypeid(documentType.getId());
        } else documentDetail.getDocument().setDefaultContent(7);
        modelAndView.addObject("documentDetail", documentDetail);
        modelAndView.addObject("rightImage", (imagesList.size() > 0 ? imagesList.get(0) : new Images()));
        modelAndView.setViewName("admin/companyRightImageLink");
        return modelAndView;
    }

    @RequestMapping(value = "/submitRightCourse", method = RequestMethod.POST)
    @ResponseBody
    public String submitRightCourse(@RequestParam(value = "linkYear1") int linkYear1,
                                  @RequestParam(value = "linkMonth1") int linkMonth1,
                                  @RequestParam(value = "imageUrl1") String imageUrl1,
                                  @RequestParam(value = "linkYear2") int linkYear2,
                                  @RequestParam(value = "linkMonth2") int linkMonth2,
                                  @RequestParam(value = "imageUrl2") String imageUrl2,
                                  @RequestParam(value = "linkYear3") int linkYear3,
                                  @RequestParam(value = "linkMonth3") int linkMonth3,
                                  @RequestParam(value = "imageUrl3") String imageUrl3) {
        try {
            ImagesDao.deleteByType(1);
            ImagesDao.save(new Images(linkYear1, linkMonth1, imageUrl1));
            ImagesDao.save(new Images(linkYear2, linkMonth2, imageUrl2));
            ImagesDao.save(new Images(linkYear3, linkMonth3, imageUrl3));
            return "您的信息已经添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "您的信息添加失败";
        }
    }

    @RequestMapping("image_indexPageMiddle.html")
    public ModelAndView image_indexPageMiddle(ModelAndView modelAndView) {
        modelAndView.addObject("middleImage11", ImagesDao.queryImagesByTypeAndDetailType(2, 11));
        modelAndView.addObject("middleImage12", ImagesDao.queryImagesByTypeAndDetailType(2, 12));
        modelAndView.addObject("middleImage21", ImagesDao.queryImagesByTypeAndDetailType(2, 21));
        modelAndView.addObject("middleImage22", ImagesDao.queryImagesByTypeAndDetailType(2, 22));
        modelAndView.addObject("middleImage31", ImagesDao.queryImagesByTypeAndDetailType(2, 31));
        modelAndView.addObject("middleImage32", ImagesDao.queryImagesByTypeAndDetailType(2, 32));
        modelAndView.addObject("middleImage41", ImagesDao.queryImagesByTypeAndDetailType(2, 41));
        modelAndView.addObject("middleImage42", ImagesDao.queryImagesByTypeAndDetailType(2, 42));
        modelAndView.addObject("middleImage51", ImagesDao.queryImagesByTypeAndDetailType(2, 51));
        modelAndView.addObject("middleImage52", ImagesDao.queryImagesByTypeAndDetailType(2, 52));
        modelAndView.addObject("middleImage61", ImagesDao.queryImagesByTypeAndDetailType(2, 61));
        modelAndView.addObject("middleImage62", ImagesDao.queryImagesByTypeAndDetailType(2, 62));
        modelAndView.setViewName("admin/image_indexPageMiddle");
        return modelAndView;
    }

    @RequestMapping(value = "/submitIndexPageMiddle", method = RequestMethod.POST)
    @ResponseBody
    public String submitIndexPageMiddle(@RequestParam(value = "linkUrl1") String linkUrl1,
                                    @RequestParam(value = "imageUrl11") String imageUrl11,
                                    @RequestParam(value = "imageUrl12") String imageUrl12,
                                    @RequestParam(value = "linkUrl2") String linkUrl2,
                                    @RequestParam(value = "imageUrl21") String imageUrl21,
                                    @RequestParam(value = "imageUrl22") String imageUrl22,
                                    @RequestParam(value = "linkUrl3") String linkUrl3,
                                    @RequestParam(value = "imageUrl31") String imageUrl31,
                                    @RequestParam(value = "imageUrl32") String imageUrl32,
                                    @RequestParam(value = "linkUrl4") String linkUrl4,
                                    @RequestParam(value = "imageUrl41") String imageUrl41,
                                    @RequestParam(value = "imageUrl42") String imageUrl42,
                                    @RequestParam(value = "linkUrl5") String linkUrl5,
                                    @RequestParam(value = "imageUrl51") String imageUrl51,
                                    @RequestParam(value = "imageUrl52") String imageUrl52,
                                    @RequestParam(value = "linkUrl6") String linkUrl6,
                                    @RequestParam(value = "imageUrl61") String imageUrl61,
                                    @RequestParam(value = "imageUrl62") String imageUrl62) {
        try {
            ImagesDao.deleteByType(2);
            ImagesDao.save(new Images(linkUrl1, imageUrl11, 2, 11));
            ImagesDao.save(new Images(linkUrl1, imageUrl12, 2, 12));

            ImagesDao.save(new Images(linkUrl2, imageUrl21, 2, 21));
            ImagesDao.save(new Images(linkUrl2, imageUrl22, 2, 22));

            ImagesDao.save(new Images(linkUrl3, imageUrl31, 2, 31));
            ImagesDao.save(new Images(linkUrl3, imageUrl32, 2, 32));

            ImagesDao.save(new Images(linkUrl4, imageUrl41, 2, 41));
            ImagesDao.save(new Images(linkUrl4, imageUrl42, 2, 42));

            ImagesDao.save(new Images(linkUrl5, imageUrl51, 2, 51));
            ImagesDao.save(new Images(linkUrl5, imageUrl52, 2, 52));

            ImagesDao.save(new Images(linkUrl6, imageUrl61, 2, 61));
            ImagesDao.save(new Images(linkUrl6, imageUrl62, 2, 62));
            return "您的信息已经添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "您的信息添加失败";
        }
    }

    @RequestMapping(value = "/submitActivityImages", method = RequestMethod.POST)
    @ResponseBody
    public String submitActivityImages(@RequestParam(value = "imageType") int imageType,
                                        @RequestParam(value = "imageDesc1") String imageDesc1,
                                        @RequestParam(value = "imageUrl11") String imageUrl11,
                                        @RequestParam(value = "imageUrl12") String imageUrl12,
                                        @RequestParam(value = "imageDesc2") String imageDesc2,
                                        @RequestParam(value = "imageUrl21") String imageUrl21,
                                        @RequestParam(value = "imageUrl22") String imageUrl22,
                                        @RequestParam(value = "imageDesc3") String imageDesc3,
                                        @RequestParam(value = "imageUrl31") String imageUrl31,
                                        @RequestParam(value = "imageUrl32") String imageUrl32,
                                        @RequestParam(value = "imageDesc4") String imageDesc4,
                                        @RequestParam(value = "imageUrl41") String imageUrl41,
                                        @RequestParam(value = "imageUrl42") String imageUrl42,
                                        @RequestParam(value = "imageDesc5") String imageDesc5,
                                        @RequestParam(value = "imageUrl51") String imageUrl51,
                                        @RequestParam(value = "imageUrl52") String imageUrl52,
                                        @RequestParam(value = "imageDesc6") String imageDesc6,
                                        @RequestParam(value = "imageUrl61") String imageUrl61,
                                        @RequestParam(value = "imageUrl62") String imageUrl62) {
        try {
            ImagesDao.deleteByType(imageType);

            int id1 = ImagesDao.save(new Images(imageUrl12, imageType, 12));
            ImagesDao.save(new Images("/activityDetail/"+id1, imageUrl11, imageType, 11, imageDesc1));

            int id2 = ImagesDao.save(new Images(imageUrl22, imageType, 22));
            ImagesDao.save(new Images("/activityDetail/"+id2, imageUrl21, imageType, 21, imageDesc2));

            int id3 = ImagesDao.save(new Images(imageUrl32, imageType, 32));
            ImagesDao.save(new Images("/activityDetail/"+id3, imageUrl31, imageType, 31, imageDesc3));

            int id4 = ImagesDao.save(new Images(imageUrl42, imageType, 42));
            ImagesDao.save(new Images("/activityDetail/"+id4, imageUrl41, imageType, 41, imageDesc4));

            int id5 = ImagesDao.save(new Images(imageUrl52, imageType, 52));
            ImagesDao.save(new Images("/activityDetail/"+id5, imageUrl51, imageType, 51, imageDesc5));

            int id6 = ImagesDao.save(new Images(imageUrl62, imageType, 62));
            ImagesDao.save(new Images("/activityDetail/"+id6, imageUrl61, imageType, 61, imageDesc6));

            return "您的信息已经添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "您的信息添加失败";
        }
    }

    @RequestMapping("image_productLeftLink.html")
    public ModelAndView image_productLeftLink(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(3);
        modelAndView.addObject("image1", imagesList.size() > 0 ? imagesList.get(0) : new Images());
        modelAndView.addObject("image2", imagesList.size() > 1 ? imagesList.get(1) : new Images());
        modelAndView.addObject("image3", imagesList.size() > 2 ? imagesList.get(2) : new Images());
        modelAndView.setViewName("admin/image_productLeftLink");
        return modelAndView;
    }

    @RequestMapping(value = "/submitProductLeftLink", method = RequestMethod.POST)
    @ResponseBody
    public String submitRightCourse(@RequestParam(value = "linkUrl1") String linkUrl1,
                                    @RequestParam(value = "imageName1") String imageName1,
                                    @RequestParam(value = "linkUrl2") String linkUrl2,
                                    @RequestParam(value = "imageName2") String imageName2,
                                    @RequestParam(value = "linkUrl3") String linkUrl3,
                                    @RequestParam(value = "imageName3") String imageName3) {
        try {
            ImagesDao.deleteByType(3);
            ImagesDao.save(new Images(imageName1, linkUrl1));
            ImagesDao.save(new Images(imageName2, linkUrl2));
            ImagesDao.save(new Images(imageName3, linkUrl3));
            return "您的信息已经添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "您的信息添加失败";
        }
    }

    @RequestMapping("image_trainTop.html")
    public ModelAndView image_trainTop(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(4);
        modelAndView.addObject("image1", imagesList.size() > 0 ? imagesList.get(0):new Images());
        modelAndView.addObject("image2", imagesList.size() > 1 ? imagesList.get(1):new Images());
        modelAndView.addObject("image3", imagesList.size() > 2 ? imagesList.get(2):new Images());
        modelAndView.addObject("image4", imagesList.size() > 3 ? imagesList.get(3):new Images());
        modelAndView.setViewName("admin/image_trainTop");
        return modelAndView;
    }

    @RequestMapping("image_indexTop.html")
    public ModelAndView image_indexTop(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(11);
        modelAndView.addObject("image1", imagesList.size() > 0 ? imagesList.get(0):new Images());
        modelAndView.addObject("image2", imagesList.size() > 1 ? imagesList.get(1):new Images());
        modelAndView.addObject("image3", imagesList.size() > 2 ? imagesList.get(2):new Images());
        modelAndView.addObject("image4", imagesList.size() > 3 ? imagesList.get(3):new Images());
        modelAndView.addObject("image5", imagesList.size() > 4 ? imagesList.get(4):new Images());
        modelAndView.addObject("image6", imagesList.size() > 5 ? imagesList.get(5):new Images());
        modelAndView.addObject("image7", imagesList.size() > 6 ? imagesList.get(6):new Images());
        modelAndView.setViewName("admin/image_indexTop");
        return modelAndView;
    }

    @RequestMapping(value = "/submitTrainTop", method = RequestMethod.POST)
    @ResponseBody
    public String submitRightCourse(@RequestParam(value = "linkUrl1") String linkUrl1,
                                    @RequestParam(value = "imageUrl1") String imageUrl1,
                                    @RequestParam(value = "showOrder1") int showOrder1,
                                    @RequestParam(value = "linkUrl2") String linkUrl2,
                                    @RequestParam(value = "imageUrl2") String imageUrl2,
                                    @RequestParam(value = "showOrder2") int showOrder2,
                                    @RequestParam(value = "linkUrl3") String linkUrl3,
                                    @RequestParam(value = "imageUrl3") String imageUrl3,
                                    @RequestParam(value = "showOrder3") int showOrder3,
                                    @RequestParam(value = "linkUrl4") String linkUrl4,
                                    @RequestParam(value = "imageUrl4") String imageUrl4,
                                    @RequestParam(value = "showOrder4") int showOrder4) {
        try {
            ImagesDao.deleteByType(4);
            ImagesDao.save(new Images(4, imageUrl1, linkUrl1, showOrder1));
            ImagesDao.save(new Images(4, imageUrl2, linkUrl2, showOrder2));
            ImagesDao.save(new Images(4, imageUrl3, linkUrl3, showOrder3));
            ImagesDao.save(new Images(4, imageUrl4, linkUrl4, showOrder4));
            return "您的信息已经添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "您的信息添加失败";
        }
    }

    @RequestMapping(value = "/submitIndexTop", method = RequestMethod.POST)
    @ResponseBody
    public String submitRightCourse(@RequestParam(value = "linkUrl1") String linkUrl1,
                                    @RequestParam(value = "imageUrl1") String imageUrl1,
                                    @RequestParam(value = "showOrder1") int showOrder1,
                                    @RequestParam(value = "linkUrl2") String linkUrl2,
                                    @RequestParam(value = "imageUrl2") String imageUrl2,
                                    @RequestParam(value = "showOrder2") int showOrder2,
                                    @RequestParam(value = "linkUrl3") String linkUrl3,
                                    @RequestParam(value = "imageUrl3") String imageUrl3,
                                    @RequestParam(value = "showOrder3") int showOrder3,
                                    @RequestParam(value = "linkUrl4") String linkUrl4,
                                    @RequestParam(value = "imageUrl4") String imageUrl4,
                                    @RequestParam(value = "showOrder4") int showOrder4,
                                    @RequestParam(value = "linkUrl5") String linkUrl5,
                                    @RequestParam(value = "imageUrl5") String imageUrl5,
                                    @RequestParam(value = "showOrder5") int showOrder5,
                                    @RequestParam(value = "linkUrl6") String linkUrl6,
                                    @RequestParam(value = "imageUrl6") String imageUrl6,
                                    @RequestParam(value = "showOrder6") int showOrder6,
                                    @RequestParam(value = "linkUrl7") String linkUrl7,
                                    @RequestParam(value = "imageUrl7") String imageUrl7,
                                    @RequestParam(value = "showOrder7") int showOrder7) {
        try {
            ImagesDao.deleteByType(11);
            ImagesDao.save(new Images(11, imageUrl1, linkUrl1, showOrder1));
            ImagesDao.save(new Images(11, imageUrl2, linkUrl2, showOrder2));
            ImagesDao.save(new Images(11, imageUrl3, linkUrl3, showOrder3));
            ImagesDao.save(new Images(11, imageUrl4, linkUrl4, showOrder4));
            ImagesDao.save(new Images(11, imageUrl5, linkUrl5, showOrder5));
            ImagesDao.save(new Images(11, imageUrl6, linkUrl6, showOrder6));
            ImagesDao.save(new Images(11, imageUrl7, linkUrl7, showOrder7));
            return "您的信息已经添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "您的信息添加失败";
        }
    }
}