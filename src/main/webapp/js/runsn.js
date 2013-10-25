//首页幻灯片
$.fn.imageSlide=function(param){
	var par=param?param:{
			imgShow:'.fouce div',
			trigger:'.boxone ul li',
			activeClass:'active'
		}
	_imgShow=par.imgShow;
	_trigger=par.trigger;
	_activeClass=par.activeClass;
	var slideSwitch=function(){			
            var $active = $(''+_imgShow+'.'+_activeClass+','+_trigger+'.'+_activeClass+'');
            if ($active.length == 0) $active = $(''+_imgShow+':last,'+_trigger+':last');			
            var $next = $active.next().length ? $active.next(): $(''+_imgShow+':first,'+_trigger+':first');
			$active.addClass('last-active');
			$active.removeClass(_activeClass);
            $next.css({ opacity: 0.0 }).addClass(_activeClass).animate({ opacity: 1.0 }, 1000, function(){
					$active.removeClass('last-active');																				
        	});		
		}	
	var autoPlay=function(){
		_ivt=window.setInterval(slideSwitch, 4000);	
	}
	var stopPlay=function(){
		window.clearInterval(_ivt);
	}	
	$(_trigger).hover(function(){
		stopPlay();			   
		var num=$(this).index();
		$(''+_imgShow+','+_trigger+'').removeClass(_activeClass);
		$(this).addClass(_activeClass);
		$(_imgShow).eq(num).addClass(_activeClass);						   
		},function(){			
			autoPlay();			
	});
	autoPlay();
		
}
$('.slidebox').imageSlide({
	imgShow:'.fouce a',
	trigger:'.slidebox ul li',
	activeClass:'active'								
});	

//首页图片效果
$(".homeimg li").hover(function(){
	$(this).find("img").eq(1).hide();
	$(this).find("img").eq(0).show();
	},function(){
	$(this).find("img").eq(0).hide();
	$(this).find("img").eq(1).show();
		});

//导航菜单效果
$(".nav li").hover(function(){
	$(this).addClass("on");	
	$(this).find(".menu").show();	
},function(){
	$(this).removeClass("on");	
	$(this).find(".menu").hide();
	});
$(".m2body a").hover(function () {
	var tabs = $(this).parents(".m2body").children("a");
	var panels = $(this).parents(".menu").find(".submenu");
	var index = $.inArray(this, tabs);
	panels.hide().eq(index).show();
},function(){
	$(this).parents(".menu").find(".submenu").hide();
	});

//手风琴效果
$(".collapse dt").click(function(){
	$(this).parents(".collapse").find("dd").hide();
	$(this).parents("dl").find("dd").show();
	
	$(this).parents(".collapse").find("dl").removeClass("on");
	$(this).parents("dl").addClass("on");
});

//搜索框水印		
function inputTipText(){    
$(".inputText").each(function(){  
	var valTxt = $(this).attr("title");
	var htm = "<label class='tipTxt'>" + valTxt +"</label>"
	$(this).after(htm);
	$(this).keyup(function(){($(this).val()=="")?$(this).next().show():$(this).next().hide();});    
	($(this).val()=="")?$(this).next().show():$(this).next().hide();
});  
$(".tipTxt").click(function(){
	$(this).prev().focus();					
});
} 
inputTipText();

//选项卡切换
$(".tabBox li").click(function () {
	var tabs = $(this).parent().children("li");
	var panels = $(this).parents(".tabBox").find(".tabmain");
	var index = $.inArray(this, tabs);
	tabs.removeClass("on").eq(index).addClass("on");
	panels.hide().eq(index).show();
});

//查看更多
$(".proPage .more").click(function(){
	$(this).prev().toggleClass("hauto");		
	$(this).toggleClass("more_on")
});

//产品二级菜单
$(".proPage1 .prolink").hover(function(){
	$(this).find(".protip").toggle();
	$(this).toggleClass("z9");
});

//页面跟随
function backtop(){
	if($(window).width() < 1024){
		$('.floatbox').css({right:0});
	}else{
		$('.floatbox').css({right:$(window).width()/2-511+'px'}
	);
	$('.floatbox').show();
}
$(window).scroll(function (){
	var st = $(document).scrollTop();
	if(st > 0){
		$('.floatbox').css({position:"absolute"}).animate({top: $(window).scrollTop()+$(window).height()-244},{queue:false,duration:0});
	}else{
		$('.floatbox').css({position:"fixed",top:"auto",bottom:"90px"});
		}
});
}
backtop();
$(window).bind("resize",function(){
backtop();
});