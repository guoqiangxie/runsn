package com.runsn.dto;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Title: Document
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Document implements Serializable {
    private Integer id = 0;
    private String name;
    private String content;
    private String title = "";
    private String keywords;
    private String description;
    private Integer typeid;
    private Integer active;
    private Integer mainLevel;
    private Date createDate;
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getMainLevel() {
        return mainLevel;
    }

    public void setMainLevel(Integer mainLevel) {
        this.mainLevel = mainLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setDefaultContent(int type) {
        switch (type){
           case 1: this.content = serviceContent;break;
            case 2: this.content = solutionContent;break;
            case 5: this.content = newsContent;break;
        }
    }

    private static String serviceContent = "      <div class=\"neirong\">\n" +
            "      <div style=\"width:560px; padding:0 0 0 20px; display:block;line-height:23px;\">\n" +
            "        <h2 style=\"color:#1b976f; font-size:18px; margin-bottom:10px; font-weight:bold;\">数据备份/容灾服务</h2>\n" +
            "        <p> <b style=\"display:block; color:#333;\">● 备份</b>\n" +
            "　　要在云时代中保持竞争力，IT 组织面临着一些新的挑战，这些挑战迫切要求一次彻底的转型。备份转型便是其中之一。事实上，它对加速您的云计算之旅至关重要。掌控这一进程，第一件事就是备份和恢复。\n" +
            "在本地机房内构建一套自动化的基于正本数据的异介质副本保存机制。目的是为了防止正本数据的丢失和逻辑错误，改变您团队的局面。获得您解决最大难题所需的速度、效率和灵活性，确保您的数据始终受到保护，并实现您的业务转型。<br />\n" +
            "　　为此，它们将赋予您以下能力：<br />\n" +
            "　　—   更快地实现虚拟化并转向云计算<br /> \n" +
            "　　—    信心十足地备份您的应用程序<br /> \n" +
            "　　—    向应用所有者授权，同时保持备份的集中控制权<br /> \n" +
            "　　—    高效地管理备份，以更少的资源完成更多的任务<br /> \n" +
            "　　—    降低成本——加速收回成本<br /><br />\n" +
            "\n" +
            "<b style=\"display:block; color:#333;\">● 容灾</b>\n" +
            "　　按照容灾系统对应用系统的保护程度可以分为数据级容灾和应用级容灾。<br />\n" +
            "　　数据级容灾系统只保证数据的完整性、可靠性和安全性，但提供实时服务的请求在灾难中会中断。应用级容灾系统能够提供不间断的应用服务，让服务请求能够透明(在灾难发生时毫无觉察)地继续运行，保证数据中心提供的服务完整、可靠、安全。因此对服务中断不太敏感的部分可以选择数据级容灾，以便节省成本，在数据级容灾的基础上构建应用级容灾系统，保证实时服务不间断运行，为用户提供更好的服务。<br />\n" +
            "　　(1)数据级容灾。通过在异地建立一份数据复制的方式保证数据的安全性，当本地工作系统出现不可恢复的物理故障时，容灾系统提供可用的数据。数据级容灾是容灾的基础形式，由于只需要考虑数据的复制和存放，不需要考虑备用系统，实现起来相对简单，投资也较少。数据级容灾需要考虑三方面问题：在线模式与离线模式问题；远程数据复制技术问题；同步与异步容灾问题。<br /> \n" +
            "　　(2)应用级容灾。应用级容灾能保证业务的连续性。在数据级容灾的基础上，建立备份的应用系统环境，当本地工作系统出现不可恢复的物理故障时，容灾系统提供可用的数据和应用系统。 \n" +
            "应用级容灾系统是建立在数据级容灾系统基础上的，同时能完成数据和应用系统环境的复制存放和管理。为实现发生灾难时的应用切换，容灾中心需要配置与工作系统同构和相同功能的业务网络、应用服务器、应用软件等。 <br />\n" +
            "　　应用级容灾还需要考虑数据复制的完全性、数据的一致性、数据的完整性、网络的通畅性、容灾切换的性能影响、应用软件的适应性改造等问题，以及为保证业务运行的所需设备、环境、人员及其相应的管理。\n" +
            "        </p>\n" +
            "    \n" +
            "    <div class=\"tabBox\" style=\"display:block; width:850px; overflow:hidden; margin-top:30px;\">\n" +
            "      <ul class=\"tabs\" style=\"background: url(/img/sermain_icon3.gif) repeat-x 0 21px; display:block; height:30px; padding-left:20px; width:850px;\">\n" +
            "        <li class=\"on\">服务内容</li>\n" +
            "        <li>软盛优势</li>\n" +
            "      </ul>\n" +
            "      <div class=\"tabmain\" style=\"display:block;padding:20px; line-height:23px; overflow:hidden;\"><b style=\"color:#333;\">数据备份</b><br />\n" +
            "软盛提供基于主流备份软件（Symantec BE，Symantec NBU，EMC network等）的，集成磁带，虚拟带库（EMC DD），传统磁盘阵列等介质的数备份服务。提供给客户一站式的软硬件一体化备份解决方案。<br /><br />\n" +
            "<b style=\"color:#333;\">容灾</b><br />\n" +
            "软盛根据客户的具体需求，提供相应的数据级容灾和应用容灾的解决方案，并提供集软件和硬件为一体的一站式服务流程。\n" +
            "      </div>\n" +
            "      <div class=\"tabmain\" style=\"padding:20px; line-height:23px; overflow:hidden;\">\n" +
            "      <p><b style=\"color:#333;\">全面的产品代理资质</b><br />\n" +
            "涉及企业私有云中全线产品的最高代理资质。（VMware企业级代理，EMC金牌代理，思科金牌代理等）<br /><br />\n" +
            "<b style=\"color:#333;\">资深的工程师团队</b><br />\n" +
            "软盛拥有多位VMware VCP工程师，并且具有3年以上的项目经验。<br /><br />\n" +
            "<b style=\"color:#333;\">众多的成功案例和丰富的行业背景</b><br />\n" +
            "软盛拥有3年多的私有云集成经验，在这个过程中，积累了大量的成功案例，并且在零售、快消、物流、金融、制造、汽车等行业，拥有资深的行业背景。<br /><br /></p>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "      </div>\n" +
            "      </div>";

    private static String solutionContent = "<div class=\"neirong\">\n" +
            "                    <div style=\"width:420px; display:block;line-height:23px;\">\n" +
            "                        <div>主页 &gt; 解决方案 &gt; 按行业分 &gt; 金融行业解决方案</div>\n" +
            "                        <h2 style=\"font-size:18px; color:#0ba29a; height:25px; line-height:25px; margin:18px 0;\">诺亚财富存储改造项目解决方案</h2>\n" +
            "                        <p><b class=\"f16\" style=\"font-size:16px; display:block;\">客户背景</b>\n" +
            "                            <b>● 公司背景：</b>诺亚财富管理中心是一家专注为中国百万元以上高净值资产的私人客户提供全方位的理财规划顾问机构，提供的服务包括家庭资产配置方案，家庭金融投资以及不动产投资顾问等。2003年8月成立至今，已成中国目前最大的第三方理财顾问机构。2007年10月，美国最大的风险投资机构“红杉资本”注资诺亚，2010年11月10日，诺亚财富管理中心登陆纽交所，股票代码“NOAH”，成为中国第一支上市的第三方理财机构。<br />\n" +
            "                            <b>● 项目背景：</b>随着企业迅速的发展，企业信息现代化不断深入，诺亚原有的IT应用和系统已经无法满足发展的需要，急需一整套面向未来的IT基础架构满足未来的商业应用的需要。<br /><br />\n" +
            "                            <b class=\"f16\">现状描述</b>\n" +
            "                            ● 客户当前的主机房位于上海市浦东新区陆家时代金融中心，并且在宁波分公司也有一个机房。<br />\n" +
            "                            ● 客户在昆山已经租用一个IDC机房，并且考虑将上海总部机房的部分应用转移到昆山机房。<br />\n" +
            "                            ● 在上海总部有近11台服务器使用年限过长，考虑使用虚拟化技术更换服务器。这11台服务器分别是（金蝶，金蝶测试环境，主域控，短信平台，Exchange，威盾，基金，Lync测试，CV，ETL）<br />\n" +
            "                            ● 现有邮件服务器群，总共3台服务器。</p>\n" +
            "                        <div class=\"aboutinfo\" style=\"background:url(/img/solution_icon3.png) no-repeat; width:374px; height:88px; padding:10px 20px; display:block; overflow:hidden; margin:25px 0;\">\n" +
            "                            <h3 style=\"color:#333; display:block; font-weight:bold;\">相关产品</h3>\n" +
            "                            <ul>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">EMC VNX 5100</a></li>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">VMware vCenter server</a></li>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">EMC StorCenter ix4-200d</a></li>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">Symantec BE 2010</a></li>\n" +
            "                                <li style=\"width:180px; margin-right:5px; height:22px; line-height:22px; float:left;\"><a href=\"#\">EMC SQL Server</a></li>\n" +
            "                            </ul>\n" +
            "                        </div>\n" +
            "                        <div class=\"clear_float\"></div>\n" +
            "                        <h2 style=\"font-size:18px; color:#0ba29a; height:25px; line-height:25px; margin:18px 0;\">解决方案概述</h2>\n" +
            "                        <div class=\"tabBox\">\n" +
            "                            <ul class=\"tabs\" style=\"background: url(/img/sermain_icon3.gif) repeat-x 0 21px; display:block; height:30px; padding-left:20px; width:850px;padding-left:0; width:645px;\">\n" +
            "                                <li class=\"on\">项目需求分析</li>\n" +
            "                                <li>拓扑图</li>\n" +
            "                                <li>方案简介</li>\n" +
            "                                <li>Customer Benefits</li>\n" +
            "                            </ul>\n" +
            "                            <div class=\"tabmain\" style=\"display:block;padding:20px; line-height:23px; overflow:hidden;\">\n" +
            "                                <p style=\"text-align:center;\"><img src=\"/img/solution_pre1.png\" width=\"585\" height=\"381\" /></p>\n" +
            "                            </div>\n" +
            "                            <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">222222222222222</div>\n" +
            "                            <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">33333333333</div>\n" +
            "                            <div class=\"tabmain\" style=\"padding:20px; display:none; line-height:23px; overflow:hidden;\">4444444444</div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>";

    private static String newsContent = "<div class=\"newpage\">\n" +
            "      <h2>思杰：做一个成功的中型公司</h2>\n" +
            "      <p>良性发展和良好的企业文化，才是一个成功的公司。<br /> \n" +
            "今天，随时随地的工作和娱乐从一种时尚变成了日常需要。<br /> \n" +
            "思杰公司的掌舵者，CEO Mark B.Templeton每次的中国之行都喜欢到处逛逛。他自己乘坐地铁到中关村去体验，只需要随身携带一台智能手机。当他在等地铁时，有几份紧急的文件需要批复，他可以马上用智能手机接入无线网络就能连到公司服务器完成签署，而且即便应用公用网络也能保障其安全。这些移动办公和BYOD（自带设备）背后的强大支撑自然就是云计算。<br /> \n" +
            "思杰公司（citrix）就是为移动化提供云服务的专业公司。2011年思杰总收入22.1亿美元，净利润3.6亿美元。2012年思杰的总收入达到25.9亿美元，净利润3.5亿美元。虽然从规模上来说，思杰没法和规模数百亿的IT巨头们相提并论，但是其独特的定位和良好的企业文化却让思杰成为了一个成功的中型公司。<br /> \n" +
            "运用思杰公司的桌面虚拟化方案和服务器虚拟化方案搭建的企业桌面云和私有云，思杰员工可以在移动设备和办公室之间建立无缝连接，将工作与生活平衡好。得益于此，美国专供企业员工分享职场感悟的\"Glassdoor\"网站近日公布了第五届年度员工选择奖获奖名单，以及2013年\"50家最佳雇主\"入选名单，思杰连续两年获此双重殊荣。<br />\n" +
            "谦逊的Mark B.Templeton来到北京办公室，进门首先和前台员工打招呼，和见到的每一位员工聊天，倾听员工的想法。这样尊重个人的企业文化，使得思杰公司虽然个头不大，却魅力不小。 \n" +
            "Mark B.Templeton已经担任16年思杰CEO，谈起公司的未来，他表示：\"思杰还将保持现在的美好状态，既专注于为移动化提供云服务，又保持尊重人的价值的良好企业文化。\"<br /> \n" +
            "Q 你对于移动化和虚拟化的判断被证明是非常正确的。现在，你观察到的IT行业最大的变化是什么？<br />\n" +
            "A 随着IT技术的不断创新和演进，移动化和云计算格外令人瞩目。2007年，苹果推出的iPhone引爆了移动应用市场， 2012年平板电脑和智能手机加在一起的出货量远远超过了PC。这样的改变源于——人们越来越需要随时随地都可以工作和娱乐。消费化的趋势能够促进整个IT高科技产业的成熟。整个IT产业界，会逐渐从以自我为中心、以自己的技术为中心，转变成真正以客户为中心的模式。未来的掌控权会从IT厂商转移到由客户自己来掌握一切。<br />\n" +
            "Q 思杰现在销售规模25.9亿美元，你能描述一下心目中思杰的未来么？<br />\n" +
            "A 我想保持思杰公司目前这种美好的状态。良性发展和良好的企业文化，才是一个成功的公司。<br />\n" +
            "首先要保持思杰独特的文化，即尊重人的价值。从18年前我刚进入思杰时只有50名员工到现在思杰成为拥有8000多名员工的全球企业，思杰都贯彻着尊重人的价值的文化；第二是云计算、移动化时代，思杰希望给全世界带来更大的积极影响。<br />\n" +
            "在增长和保持企业文化之间，要找到良好的平衡点，一方面实现有条不紊的增长，另一方面也要保持尊重人的价值的企业文化不变，有些公司发展到一定程度，业务变复杂了，就会建立起比较森严的等级制度，而忽略了对人的尊重，但思杰始终要以人的价值为重。当然，业务增长和保持企业文化时常相互矛盾、相互制约，但是目光总要放长远。 </p>\n" +
            "      \n" +
            "      </div>";
}
