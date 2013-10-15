//main menu
$(".sidebar li").hover(function(){
	$(this).stop().animate({marginLeft:'24px'},300).addClass("hover");						  
},function(){
	$(this).removeClass("hover").stop().animate({marginLeft:'40px'},200);
});
//indeximg
function closehover(){
	$(".main1 .box span.close").hover(function(){
	$(this).toggleClass("hover");		  
});
}
function closeremove(){
    $(".main1 .box span.close").click(function(){
	$(this).parent(".box").hide(400);		  
});
}

$(".main1 .add span").click(function(){
    $(this).parent(".add").before("<div class='box b10' style='display:none'>"+$('.box:last').html()+"</div>");
	$(".main1 .box:last").show(400);
	closehover();
	closeremove();
});

$(".tipsinfo b").click(function(){$(this).parent().hide(200)});
$(".sure input").hover(function(){$(this).addClass("hoverbtn");},function(){$(this).removeClass("hoverbtn");});
$("input[type='text']").focus(function(){$(this).addClass("focus");}).blur(function(){$(this).removeClass("focus");});
closehover();
closeremove();

//news
$(".main2 .tmain tr:odd").find("td").addClass("bgodd").hover(function(){$(this).children("td").addClass("hover");},function(){$(this).children("td").removeClass("hover");});
$(".main2 .tmain tr").hover(function(){$(this).children("td").addClass("hover");},function(){$(this).children("td").removeClass("hover");});
$(".newsure input").hover(function(){$(this).addClass("hoverbtn");},function(){$(this).removeClass("hoverbtn");});