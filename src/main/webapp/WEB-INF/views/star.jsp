<%@page contentType="text/html;charset=UTF-8"  language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>培训课堂 | 软盛</title>
<style>
*{ margin:0; padding:0;}
#bookslide{width:837px;height:175px;margin:8px 0 0 15px;padding:15px 0 0;font:12px/1.5 tahoma,microsoft yahei,arial,\5b8b\4f53; }
#bookslide-main{height:138px;overflow:hidden;width:805px;}
#bookslide-main,#bookslide-main a{color:#ccc;}
#bookslide-main li{float:left;width:255px; height:135px; margin-right:20px; display:block; overflow:hidden; color:#555; margin-bottom:10px; font-size:12px; line-height:21px;}
#bookslide-main li img{ float:left; margin-right:12px; }
#bookslide-main li b{ display:block; font-size:14px; margin-bottom:5px;}
#bookslide-main p{height:40px;line-height:20px;overflow:hidden;}
#bscrollbar{height:27px;font-size:0;overflow:hidden;width:837px;margin:0 auto;}
#bscrollbar-m{float:left;cursor:pointer;height:16px;width:810px;display:inline; background:url(/img/bookslide-bg.png) no-repeat; display:block; overflow:hidden; margin-top:10px;}
#bscrollbar-handel{width:44px;height:16px;background:url(/img/bookslide-bg.png) no-repeat 0 -16px;}
#bscrollbar-pre,#bscrollbar-next{ display:none;}
</style>
<script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/js/Dragslide.js"></script>
<script type="text/javascript">
//设置滚动条
function homeslide(x,y){
	var sld = new Slider("bscrollbar-m", "bscrollbar-handel", {
		MaxValue: $("bookslide-main").scrollWidth - $("bookslide-main").clientWidth,
		onMin: function(){ $("bscrollbar-pre").style.backgroundPosition = "bottom left"; },
		onMax: function(){ $("bscrollbar-next").style.backgroundPosition = "bottom right"; },
		onMid: function(){ $("bscrollbar-pre").style.backgroundPosition = "top left"; $("bscrollbar-next").style.backgroundPosition = "top right"; },
		onMove: function(){ $("bookslide-main").scrollLeft = this.GetValue(); }
	});
	sld.SetPercent(0);
	sld.Ease = true;
	$("bscrollbar-pre").onmouseover = function(){ sld.Run(false); }
	$("bscrollbar-pre").onmouseout = function(){ sld.Stop(); }
	$("bscrollbar-next").onmouseover = function(){ sld.Run(true); }
	$("bscrollbar-next").onmouseout = function(){ sld.Stop(); }
} 
//模拟滚动条设置ul长度
function homdeslidelen() {
    var len = jQuery('#bookslide-main li').length;
    jQuery('#bookslide-main ul').css('width', len * 136)
}
//运行
jQuery(function(){
    homdeslidelen();
    homeslide();
})
</script>
</head>
<body style="background:none;">
<div id="bookslide">
		<div id="bookslide-main">
			<ul>
                <c:forEach var="engineer" items="${starEngineers}">
                    <li><a href="/service_7.html" target=_parent><img src="${engineer.image}" width="121" height="134" /></a>
                        <b>${engineer.name}</b> 培训技能： ${engineer.experiences}</li>
                </c:forEach>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
			</ul>
  </div>
		<div id="bscrollbar">
			<div id="bscrollbar-pre"></div>
			<div id="bscrollbar-m"><div id="bscrollbar-handel"></div></div>
			<div id="bscrollbar-next"></div>
		</div>
    </div>
</body>
</html>