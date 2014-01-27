package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.Engineer;
import com.runsn.dto.Images;
import com.runsn.dto.Lab;
import com.runsn.dto.Product;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.EngineerDao;
import com.runsn.jdbc.ImagesDao;
import com.runsn.jdbc.LabDao;
import com.runsn.jdbc.ProductDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 * Title: DocumentController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class DocumentController {

    @RequestMapping(value = "/admin/submitService", method = RequestMethod.POST)
    public ModelAndView submitService(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "content") String content, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null || document.getCreateDate() == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, 1));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitNews", method = RequestMethod.POST)
    public ModelAndView submitNews(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "content") String content, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null || document.getCreateDate() == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, 28));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitActivity", method = RequestMethod.POST)
    public ModelAndView submitActivity(@RequestParam(value = "imageDesc") String imageDesc, @RequestParam(value = "imageUrl") String imageUrl, @RequestParam(value = "content") String content,
                                       @RequestParam(value = "imageType") int imageType, @RequestParam(value = "imageId", required = false, defaultValue = "0") int imageId,
                                       @RequestParam(value = "documentId", required = false, defaultValue = "0") int documentId,
                                       ModelAndView modelAndView) {
        int typeId = 31;
        if (imageType == 7) typeId = 32;
        if (imageType == 8) typeId = 33;
        try {
            if (documentId != 0) DocumentDao.delete(documentId);
            int documentIdInDB = DocumentDao.save(createDocument(imageDesc, null, null, null, typeId));
            if (imageId != 0) ImagesDao.delete(imageId);
            ImagesDao.save(new Images(imageType, documentIdInDB, imageDesc, imageUrl));
            modelAndView.addObject("result", "成功啦");
            modelAndView.addObject("message", "您的信息已经添加成功");
        } catch (Exception e) {
            modelAndView.addObject("result", "失败啦");
            modelAndView.addObject("message", "您的信息更新失败");
        }

        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitCompanyLeft", method = RequestMethod.POST)
    public ModelAndView submitCompanyLeft(@RequestParam(value = "imageUrl") String imageUrl, @RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "content") String content, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null || document.getCreateDate() == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, 29));
                ImagesDao.deleteByType(9);
                ImagesDao.save(new Images(imageUrl, 9));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                ImagesDao.deleteByType(9);
                ImagesDao.save(new Images(imageUrl, 9));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitCompanyRight", method = RequestMethod.POST)
    public ModelAndView submitCompanyRight(@RequestParam(value = "imageUrl") String imageUrl, @RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "content") String content, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null || document.getCreateDate() == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, 30));
                ImagesDao.deleteByType(10);
                ImagesDao.save(new Images(imageUrl, 10));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                ImagesDao.deleteByType(10);
                ImagesDao.save(new Images(imageUrl, 10));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    private void resetDocument(String title, String keywords, String description, String content, Document document) {
        document.setTitle(title);
        document.setName(title);
        document.setKeywords(keywords);
        document.setDescription(description);
        document.setUpdateDate(new Date(new java.util.Date().getTime()));
        document.setContent(content);
    }

    @RequestMapping(value = "/admin/submitTrain", method = RequestMethod.POST)
    public ModelAndView submitTrain(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "content") String content, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null || document.getCreateDate() == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, 27));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitSolution", method = RequestMethod.POST)
    public ModelAndView submitSolution(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "title3code", required = false) int title3code, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null || document.getCreateDate() == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, title3code));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitProduct", method = RequestMethod.POST)
    public ModelAndView submitProduct(@RequestParam(value = "id") int id,
                                      @RequestParam(value = "productName") String productName,
                                      @RequestParam(value = "productDesc") String productDesc,
                                      @RequestParam(value = "classIds", required = false) String classIds,
                                      @RequestParam(value = "brandId", required = false) Integer brandId,
                                      @RequestParam(value = "typeId", required = false) Integer typeId,
                                      @RequestParam(value = "title", required = false) String title,
                                      @RequestParam(value = "keywords", required = false) String keywords,
                                      @RequestParam(value = "description", required = false) String description,
                                      ModelAndView modelAndView) {
        Product product = ProductDao.query(id);
        if (product.getId() == 0) {
            try {
                ProductDao.save(createProduct(productName, productDesc, typeId, title, keywords, description));
                ProductDao.updateBrand(classIds, brandId);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetProduct(productName, productDesc, title, keywords, description, product);
            try {
                ProductDao.update(product);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitLab", method = RequestMethod.POST)
    public ModelAndView submitLab(@RequestParam(value = "id") int id,
                                  @RequestParam(value = "name") String name,
                                  @RequestParam(value = "teacher") String teacher,
                                  @RequestParam(value = "trainTime") String trainTime,
                                  @RequestParam(value = "address") String address,
                                  @RequestParam(value = "env") String env,
                                  @RequestParam(value = "desc") String desc,
                                  @RequestParam(value = "content") String content,
                                  @RequestParam(value = "personNum") int personNum,
                                  ModelAndView modelAndView) {
        Lab lab = LabDao.query(id);
        Timestamp timestamp = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            java.util.Date date = dateFormat.parse(trainTime);
            timestamp = new Timestamp(date.getTime());
        } catch (ParseException e) {
            System.out.println("时间转换异常");
        }
        if (lab.getId() == 0) {
            try {
                LabDao.save(createLab(name, teacher, timestamp, address, env, desc, content, personNum));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetLab(name, teacher, timestamp, address, env, desc, content, personNum, lab);
            try {
                LabDao.update(lab);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    private Lab createLab(String name, String teacher, Timestamp trainTime, String address, String env, String desc, String content, int personNum) {
        Lab newLab = new Lab();
        newLab.setCreateDate(new Date(new java.util.Date().getTime()));
        newLab.setTrainTime(trainTime);
        newLab.setTeacher(teacher);
        newLab.setPersonNum(personNum);
        newLab.setAddress(address);
        newLab.setContent(content);
        newLab.setDesc(desc);
        newLab.setEnv(env);
        newLab.setName(name);
        return newLab;
    }

    private void resetLab(String name, String teacher, Timestamp trainTime, String address, String env, String desc, String content, int personNum, Lab newLab) {
        newLab.setUpdateDate(new Date(new java.util.Date().getTime()));
        newLab.setTrainTime(trainTime);
        newLab.setTeacher(teacher);
        newLab.setPersonNum(personNum);
        newLab.setAddress(address);
        newLab.setContent(content);
        newLab.setDesc(desc);
        newLab.setEnv(env);
        newLab.setName(name);
    }

    private void resetProduct(String productName, String productDesc, String title, String keywords, String description, Product product) {
        product.setProductName(productName);
        product.setProductDesc(productDesc);
        product.setTitle(title);
        product.setKeywords(keywords);
        product.setDescription(description);
        product.setUpdateDate(new Date(new java.util.Date().getTime()));
    }

    private Product createProduct(String productName, String productDesc, Integer typeId, String title, String keywords, String description) {
        Product model = new Product();
        model.setTypeId(typeId);
        model.setProductName(productName);
        model.setProductDesc(productDesc);
        model.setCreateDate(new Date(new java.util.Date().getTime()));
        model.setTitle(title);
        model.setKeywords(keywords);
        model.setDescription(description);
        return model;
    }

    private static Document createDocument(String title, String content, String keywords, String description, int typeid) {
        Document document = new Document();
        document.setActive(1);
        document.setContent(content);
        document.setName(title);
        document.setTitle(title);
        document.setKeywords(keywords);
        document.setDescription(description);
        document.setCreateDate(new Date(new java.util.Date().getTime()));
        document.setTypeid(typeid);
        return document;
    }

    @RequestMapping("/admin/submitEngineer")
    @ResponseBody
    public String submitEngineer(@RequestParam(value = "id") Integer id,
                                 @RequestParam(value = "name") String name,
                                 @RequestParam(value = "age") int age,
                                 @RequestParam(value = "title") String title,
                                 @RequestParam(value = "experiences") String experiences,
                                 @RequestParam(value = "star", required = false, defaultValue = "") String star,
                                 @RequestParam(value = "image") String image,
                                 @RequestParam(value = "aptitudes") String aptitudes) {
        Engineer engineer = EngineerDao.query(id);
        String[] aptitudesArray = aptitudes.split(";");
        if (engineer.getId() == 0) {
            try {
                Integer engineerId = EngineerDao.save(createEngineer(name, age, title, experiences, null, image, star));
                for (int i = 1; i <= aptitudesArray.length; i++) {
                    String aptitude = aptitudesArray[i - 1];
                    if (aptitude != null || !aptitude.equals("")) ImagesDao.save(new Images(aptitude, engineerId, i));
                }
                return "您的信息已经添加成功";
            } catch (Exception e) {
                e.printStackTrace();
                return "您的信息添加失败";
            }
        } else {
            try {
                resetEngineer(engineer, name, age, title, experiences, null, image, star);
                EngineerDao.update(engineer);
                ImagesDao.deleteByTypeAndEngineer(5, engineer.getId());
                for (int i = 1; i <= aptitudesArray.length; i++) {
                    String aptitude = aptitudesArray[i - 1];
                    if (aptitude != null || !aptitude.equals(""))
                        ImagesDao.save(new Images(aptitude, engineer.getId(), i));
                }
                return "您的信息已经添加成功";
            } catch (Exception e) {
                e.printStackTrace();
                return "您的信息添加失败";
            }
        }
    }

    private void resetEngineer(Engineer engineer, String name, int age, String title, String experiences, String aptitude, String image, String star) {
        engineer.setName(name);
        engineer.setAge(age);
        engineer.setAptitude(aptitude);
        engineer.setImage(image);
        engineer.setTitle(title);
        engineer.setStar(star);
        engineer.setExperiences(experiences);
        engineer.setUpdateDate(new Date(new java.util.Date().getTime()));
    }

    private Engineer createEngineer(String name, int age, String title, String experiences, String aptitude, String image, String star) {
        Engineer engineer = new Engineer();
        engineer.setName(name);
        engineer.setAge(age);
        engineer.setAptitude(aptitude);
        engineer.setImage(image);
        engineer.setTitle(title);
        engineer.setExperiences(experiences);
        engineer.setStar(star);
        engineer.setCreateDate(new Date(new java.util.Date().getTime()));
        engineer.setUpdateDate(new Date(new java.util.Date().getTime()));
        return engineer;
    }
}
