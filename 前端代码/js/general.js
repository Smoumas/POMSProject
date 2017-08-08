/**
 * Created by Think on 2017/8/7.
 */
//ÈÃÒþ²ØµÄÏÔÊ¾
$(function(){
    $(".main-right").load("../consumerManage/support/sendNews.html");
    $("#main").find(".main-left>.first-list>li:not(:first-child):not(.sub-list)").click(function () {
        $(this).next().slideToggle();
    });

    $(".sub-list").find("ul>li>a").click(function () {
        var href = this.getAttribute("href");
        $(".main-right").load(href);
        return false;
    });

});