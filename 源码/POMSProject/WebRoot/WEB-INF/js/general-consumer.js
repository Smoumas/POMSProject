/**
 * Created by Think on 2017/8/7.
 */


//用来存储一个子系统各功能模块的加载-查询-添加三种URL
// flag标识符 无编辑、仅编辑、编辑删除、查看具体和确认已读（收取消息页面的按钮）  0 无按钮 1仅编辑 2编辑删除 3确认已读并且查看具体
// is_equally 1接受的所有字段和要展示的字段一样 0接受的字段和要展示的不一样 -1 不接受字段
//data_names 要展示的字段名 如果is_equally == 1  这个字段是null  is_equally == 0 要展示的字段  is_equally-1 null
var array = {
    //监督管理-客户管理
    "jdgl-khgl": {
        "load_URL": "/POMSProject/support/manage/customerList",
        "query_URL": "",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "1",
        "data_names": ""
    },
    "jdgl-yjgl": {
        "load_URL": "/POMSProject/support/manage/allInvestigation",
        "query_URL": "/POMSProject/support/manage/investigationByType",
        "add_URL": "/POMSProject/support/manage/setInvestigation",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "1",
        "data_names": ""
    },
    "jdgl-tjhz": {
        "load_URL": "",
        "query_URL": "",
        "add_URL": "/POMSProject/support/manage/insertReceipt",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "-1",
        "data_names": ""
    },
    "cx-dddqscx": {
        "load_URL": "/POMSProject/support/query/expiredOrder",
        "query_URL": "",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "0",
        "data_names": ["newspaperID", "customerID", "orderType", "orderAddress", "orderNum", "orderDate", "orderKeepTime"]
    },
    "fzyw-sqtz": {
        "load_URL": "/POMSProject/support/advice/adviceList?isReaded=0",
        "query_URL": "/POMSProject/support/advice/adviceList",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "3",
        "place": "",
        "is_equally": "0",
        "data_names": ["adviceID", "sendStationID", "sendDeptID", "sendDate","content"]
    },
    "fzyw-fstz": {
        "load_URL": "",
        "query_URL": "",
        "add_URL": "/POMSProject/support/advice/sendAdvice",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "-1",
        "data_names": []
    },
    "fzyw-xgmm": {
        "load_URL": "",
        "query_URL": "",
        "add_URL": "/POMSProject/support/manage/changePassword",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "-1",
        "data_names": []
    },


};

var load_URL;
var query_URL;
var add_URL;
var delete_URL;
var update_URL;
var flag;
var place;
var is_equally;
var data_names;
var is_read = 0;
var page = 0;
var type = 0;
$(function() {
	//让隐藏的显示
	/*左侧导航栏下拉*/
	$("#main").find(".main-left>.first-list>li:not(:first-child):not(.sub-list)").click(function() {

		$(this).next().slideToggle();
	});
	// 给左侧导航栏按钮添加点击事件
	$(".sub-list").find("ul>li>a").click(function() {

		var href = this.getAttribute("href");
		// 加载子页面
		$(".main-right").load(href, function() {
			type = 0; //判断当前界面是加载 还是查询的 0 加载 1 查询

			//有一个标记 记录分页
			page = 0; //当前页数
			//记录查询条件
			var search_if = {};

			// 通过mark_id标记符获得三种URL以及是否有编辑的标志符
			var mark_id = $.trim($("#mark-id").text());
			console.log(mark_id);
			console.log(array[mark_id]);
			load_URL = array[mark_id].load_URL;
			query_URL = array[mark_id].query_URL;
			add_URL = array[mark_id].add_URL;
			delete_URL = array[mark_id].delete_URL;
			update_URL = array[mark_id].update_URL;

			flag = array[mark_id].flag; //代表是否有编辑按钮的标志符
			place = array[mark_id].place; //代表需要编辑的列号
			is_equally = array[mark_id].is_equally; //代表字段名是否匹配
			data_names = array[mark_id].data_names; //数组 代表字段名
			// 发送加载的ajax,包括标识符和需要编辑的列号
			console.log("send load-ajax");
			console.log(is_equally);

            load(load_URL, flag, place, is_equally, data_names, page);
            // 绑定查询按钮的事件
            var search_btn = $(".search .input-group-btn");
            $(search_btn).on("click", function() {
                type = 1;
                page = 0;
                // 获得查询按钮的数据
                //存储之 要获得 就用 for(var key in search)

                //并打包成json数据
                var search_json = {};
                var search_div = $(".search");
                getKeyAndValue(search_div, "input", search_json);
                getKeyAndValue(search_div, "select", search_json);
                //转换成字符串  {"stationName1":"21","stationName":"12","isReaded":"1"}
                // var searchStr = JSON.stringify(search);
                // console.log(searchStr);
                search_if = search_json; //记录查询条件
                // 发送查询的ajax
                console.log("send query-ajax");
                query(query_URL, search_json, flag, place, is_equally, data_names, page);
                //去除默认事件
                return false;
            });
            // 绑定添加按钮的事件
            //input[type=submit]
            var add_btn = $("form input[type='submit']");
            // 测试是否选择元素成功
            // for (var i = 0; i < add_btn.length; i++) {
            //     alert($(add_btn[i]).attr("class"));
            // }

            $(add_btn).on("click", function() {
                type = 0;
                page = 0;
                // 获得查询按钮的数据
                //存储之 要获得 就用 for(var key in search)
                //并打包成json数据
                var add_json = {};
                // 表单块
                var add_div = $("form");

                getKeyAndValue(add_div, "input:not([type='submit'])", add_json);
                getKeyAndValue(add_div, "select", add_json);
                getKeyAndValue(add_div, "textarea", add_json);
                // //转换成字符串  {"stationName1":"21","stationName":"12","isReaded":"1"}
                // var searchStr = JSON.stringify(add);
                // console.log(searchStr);

                // 发送添加的ajax
                console.log("send add-ajax");
                console.log(add_json);
                add(add_URL, add_json, flag, place,is_equally, data_names, load_URL);
                page = 1; //第0页已经展示  待展示：第一页
                //去除默认事件
                return false;
            });

            //绑定查看具体按钮事件
            // 这里用模态框
            var look_all_btn = $(".lookAll");
            $(document).on("click", ".lookAll", function() {
                // 获得数据
                var look_all_json = {};
                var tr = $(this).parent().parent().parent();
                var tds = $(tr).children();
                var texts = new Array();
                // 获得了数据 因为有操作栏 这个要剪掉
                for (var i = 0; i < tds.length - 1; i++) {
                    texts[i] = $(tds[i]).text();
                    console.log(texts[i] + " " + i);
                }
                //获得模态框
                var modal = $(".modal-body")[0];
                var div = $(modal).find(".div");
                console.log(div.length);
                for (var j = 0; j < div.length; j++) {

                    $(div[j]).html(texts[j]);

                }
                //信息填充完毕
            });


            //绑定确认已阅读按钮
            //和删除按钮差不多

//            var isReaded_btn = $(".isReaded-btn");
//            var field_table_div = $("#TableHeader");
//            var first_child_id = $($(field_table_div).children(":first")).text();	
//            var first_child_id_int = parseInt(first_child_id);
//            alert(first_child_id_int);
            $(document).on("click", ".isReaded-btn", function() {
//            	alert("fff");
            	var adviceID = $($($(this).parent().parent().parent()).find("td:first")).text();
//            	var adviceID_int = parseInt(adviceID);
//            	alert(adviceID_int);
            	var this_btn = $(this);
//            	parent.remove();
                //单页面事件 就在这里写了
                $.ajax({
                    url: "/POMSProject/center/assist/setAdviceReaded", //此处填确认通知的URL
                    type: "get",
                    data: { "adviceID": adviceID }, //通知id 此处id通过页面获得 页面显示id号 同时上面is_equally == "0"的 data_names参数要包括id =="1"的就不用了，传回来的data有id
                    dataType: "json",
                    success: function(data) {
                        console.log("success");
                        // 0失败 1成功
                        if (data.result) {
                        	var parent = this_btn.parent().parent().parent();
                        	parent.remove();
//                              parent.remove();
                            alert("已阅读该通知，请到未阅读通知处查看该通知！！！");
                            //删除这一行  div td tr
                            
                          
                        } else {
                            console.log("add fail");
                            alert("失败！！！！！！");
                        }
                    },
                    error: function(data) {
                        console.log("error");
                    }
                });
            });

            //上面的加载、查询等 默认从0开始 每次触底+1 查询、添加按钮触发后归0 触底事件导致的查询、添加不归0  要注意 归0 操作写在函数的外面，写在里面由于值传递 无效
            //写一个滚动条触底事件
            $(document).on("scroll",function() {
            
               
                var scrollTop = $(this).scrollTop();
                var scrollHeight = $(document).height();
                var windowHeight = $(this).height();
                console.log(scrollTop+" " +scrollHeight+" "+windowHeight);
                if (scrollTop + windowHeight >= scrollHeight) {
                	 page++;
                    if (type == 0) {
                        load(load_URL, flag, place, is_equally, data_names, page);
                    } else if (type == 1) {
                        query(query_URL, search_if, flag, place, is_equally, data_names, page);
                    }

                }
            });

            //加载完之后让子页面点击一下 用来给子页面
            $(".container").click();


        });
        return false;
    });
});


var getKeyAndValue = function(div, type, search) {
    var search_type = new Array();
    search_type = div.find(type);
    var search_key = new Array();
    var search_value = new Array();
    for (var i = 0; i < search_type.length; i++) {
        search_key = $(search_type[i]).attr("name");
        if (!search_key) {
            continue;
        }
        if(search_key == "issueRate"){
        	
        	search_value = parseFloat($(search_type[i]).val());
        	
        }else{
        	search_value = $(search_type[i]).val();        	
        }
        search[search_key] = search_value;
    }
}

var add_table_content = function(data, flag, place, is_equally, data_names) {
    if (document.getElementById("no_one_knows")) {
        var p = document.getElementById("no_one_knows");
        p.parentNode.removeChild(p);
    }
    var table = document.getElementById("TableHeader");
    if (table) {
        table.parentNode.removeChild(table);
    }
    if (data.size > 0) {
        // data.data 数据段
        // 获得数据段数据
        var allData = data.data;
        // 获得一个数据段
        var firstData = allData[0];
        // 添加一段div 用来存储返回的字段的数据库名，即存储这个页面需要的字段 其id=field-name 用于编辑的时候提取
        var div = document.createElement("div");
        document.body.appendChild(div);
        div.style.display = "none";
        div.setAttribute("id", "TableHeader");
        //记录这个表格有几列
        var count = 0;
        if (is_equally == "-1") {
            return;
        } else if (is_equally == "0") {
            for (var i = 0; i < data_names.length; i++) {
                var span = document.createElement("div");
                var text = document.createTextNode(data_names[i]);
                span.appendChild(text);
                div.appendChild(span);
                count++;
            }
        } else if (is_equally == "1") {
            for (var key in firstData) {
                // 创建一个span，用来存储键名
                var span = document.createElement("div");
                console.log(span);
                var text = document.createTextNode(key);
                span.appendChild(text);
                div.appendChild(span);
                count++;
            } // div创建完成 用来存储字段名
        }


        // 添加操作列计数
        if (flag > 0) {
            count++;
        }
        // 计数完毕

        // 找到tbody
        var tbody = document.getElementsByTagName("tbody")[0];

        for (var i = 0; i < data.size; i++) {
            var tr = document.createElement("tr");
            // 加入tr
            tbody.appendChild(tr);
            //添加表格内容
            var oneData = allData[i];
            console.log(oneData);
            if (is_equally == "1") {
                for (var key in oneData) {
                    var td = document.createElement("td");
                    tr.appendChild(td);
                  //将key数字转换为中文
                    if (key == "sex") {
                        if (oneData[key]) {
                            td.appendChild(document.createTextNode("女"));
                        } else {
                            td.appendChild(document.createTextNode("男"));
                        }
                        continue;
                    } else if (key == "ableUnsubscribe" || key == "ableRedirect" || key == "ableDelay" || key == "isUsed" || key == "isReaded" ||
                        key == "isDelivered" || key == "isPrinted") {
                        if (oneData[key]) {
                            td.appendChild(document.createTextNode("是"));
                        } else {
                            td.appendChild(document.createTextNode("否"));
                        }
                        continue;
                    } else if (key == "frequency") {
                        if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("日刊"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("月刊"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("季刊"));
                        } else if (oneData[key] == 4) {
                            td.appendChild(document.createTextNode("半年刊"));
                        } else if (oneData[key] == 5) {
                            td.appendChild(document.createTextNode("年刊"));
                        }
                        continue;
                    } else if (key == "type") {
                        if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("退订"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("转址"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("延期"));
                        } else if (oneData[key] == 4) {
                            td.appendChild(document.createTextNode("未续订"));
                        }
                        continue;
                    } else if (key == "customerType") {
                        if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("普通客户"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("大客户"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("会员"));
                        }
                        continue;
                    } else if (key == "commentType") {
                        if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("批评"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("表扬"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("建议"));
                        }
                        continue;
                    } else if (key == "orderType") {
                        if (oneData[key] == 0) {
                            td.appendChild(document.createTextNode("普通"));
                        } else if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("跨站订阅"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("集订分送"));
                        }
                        continue;
                    } else if (key == "state") {
                        if (oneData[key] == 0) {
                            td.appendChild(document.createTextNode("未使用"));
                        } else if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("正常"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("丢弃"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("作废"));
                        }
                        continue;
                    }

                    var td_text;
                    console.log(oneData[key]);
                    if(oneData[key] == null){
                    	console.log("isNull");
                    	td_text = document.createTextNode("无");
                    }else{
                    	td_text = document.createTextNode(oneData[key]);
                    }
                    td.appendChild(td_text);
                }
            } else if (is_equally == "0") {
                for (var j = 0; j < data_names.length; j++) {
                    var td = document.createElement("td");
                    tr.appendChild(td);
                    var key = data_names[j];
                  //将key数字转换为中文
                    if (key == "sex") {
                        if (oneData[key]) {
                            td.appendChild(document.createTextNode("女"));
                        } else {
                            td.appendChild(document.createTextNode("男"));
                        }
                        continue;
                    } else if (key == "ableUnsubscribe" || key == "ableRedirect" || key == "ableDelay" || key == "isUsed" || key == "isReaded" ||
                        key == "isDelivered" || key == "isPrinted") {
                        if (oneData[key]) {
                            td.appendChild(document.createTextNode("是"));
                        } else {
                            td.appendChild(document.createTextNode("否"));
                        }
                        continue;
                    } else if (key == "frequency") {
                        if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("日刊"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("月刊"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("季刊"));
                        } else if (oneData[key] == 4) {
                            td.appendChild(document.createTextNode("半年刊"));
                        } else if (oneData[key] == 5) {
                            td.appendChild(document.createTextNode("年刊"));
                        }
                        continue;
                    } else if (key == "type") {
                        if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("退订"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("转址"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("延期"));
                        } else if (oneData[key] == 4) {
                            td.appendChild(document.createTextNode("未续订"));
                        }
                        continue;
                    } else if (key == "customerType") {
                        if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("普通客户"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("大客户"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("会员"));
                        }
                        continue;
                    } else if (key == "commentType") {
                        if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("批评"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("表扬"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("建议"));
                        }
                        continue;
                    } else if (key == "orderType") {
                        if (oneData[key] == 0) {
                            td.appendChild(document.createTextNode("普通"));
                        } else if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("跨站订阅"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("集订分送"));
                        }
                        continue;
                    } else if (key == "state") {
                        if (oneData[key] == 0) {
                            td.appendChild(document.createTextNode("未使用"));
                        } else if (oneData[key] == 1) {
                            td.appendChild(document.createTextNode("正常"));
                        } else if (oneData[key] == 2) {
                            td.appendChild(document.createTextNode("丢弃"));
                        } else if (oneData[key] == 3) {
                            td.appendChild(document.createTextNode("作废"));
                        }
                        continue;
                    }

                    var td_text;
                    console.log(oneData[key]);
                    if(oneData[key] == null){
                    	console.log("isNull");
                    	td_text = document.createTextNode("无");
                    }else{
                    	td_text = document.createTextNode(oneData[key]);
                    }
                    td.appendChild(td_text);
                }
            }
            var editStat = "<button type = 'button' class = 'btn btn-info' onclick='return beginEdit(this," + place + "," + flag + ");'>" +
                "<span class = 'glyphicon glyphicon-edit'></span>编辑</button>";
            var tdStr1 = "<div class = 'btn-group'>" + editStat + "</div>";
            var tdStr2 = "<div class = 'btn-group'>" + editStat +
                "<button type = 'button' class = 'btn btn-warning' onclick='return beginDelete(this)';>" +
                "<span class = 'glyphicon glyphicon-trash'></span>删除</button>" +
                "</div>";
            var tdStr3;
            if(is_read == 1){
            	tdStr3 = "<div class = 'btn-group'>" +
                "<button type = 'button' class = 'btn btn-info lookAll' data-toggle='modal' data-target='#myModal'>" +
                "<span ></span>查看具体</button>"+
                "</div>";
            }else if(is_read == 0){
            	tdStr3 = "<div class = 'btn-group'>" +
                "<button type = 'button' class = 'btn btn-info lookAll' data-toggle='modal' data-target='#myModal'>" +
                "<span ></span>查看具体</button>" +
                "<button type = 'button' class = 'btn btn-info isReaded-btn'>" +
                "<span ></span>确认为已读</button>" +
                "</div>";
            }
            
            if (flag == 0) {
                // 无编辑
                continue;
            } else {
                var td = document.createElement("td");
                tr.appendChild(td);
                if (flag == 1) {
                    //仅编辑 添加编辑按钮
                    $(td).html(tdStr1);
                } else if (flag == 2) {
                    // 编辑和删除 添加编辑和删除按钮
                    $(td).html(tdStr2);
                } else if (flag == 3) {
                    //查看具体 确认已读 收取通知页面
                    $(td).html(tdStr3);
                }
            }

        }

    } else if (data.size === 0 || data.size < 0) {
        console.log("数据库没有符合条件的数据");
        // 找到容器
        if (!document.getElementById("no_one_knows")) {
            var tbody = document.getElementsByClassName("container")[0];
            var p = document.createElement("p");
            p.setAttribute("id", "no_one_knows");
            // 加入P
            tbody.appendChild(p);
            p.style.width = "100%";
            p.style.textAlign = "center";
            p.style.fontSize = "1.8rem";
            p.style.lineHeight = "1.4";
            var text_no_data = document.createTextNode("没有更多数据!!!!");
            p.appendChild(text_no_data);
        } else {

        }

    }
}

//加载ajax
var load = function(load_URL, flag, place, is_equally, data_names, page) {
    if (load_URL == "") {
        return;
    }
    $.ajax({
        url: load_URL,
        type: "get",
        data: { "page": page },
        dataType: "json",
        success: function(data) {
            console.log("success");
            add_table_content(data, flag, place, is_equally, data_names);
        },
        error: function(data) {
            console.log("error");
            alert("啊哦，加载出现了一点问题");
        }
    });
}

//查询ajax
var query = function(query_URL, json, flag, place, is_equally, data_names, page) {
    if (query_URL == "") {
        return;
    }
    if(json.isReaded == 1){
    	is_read = 1;
    }else if(json.isReaded == 0){
    	is_read = 0;
    }
    json["page"] = page;
    $.ajax({
        url: query_URL,
        type: "get",
        data: json,
        dataType: "json",
        success: function(data) {
            console.log("success");
            // 清空表格
            var tbody = document.getElementsByTagName("tbody")[0];
            $(tbody).html("");
            // 动态添加
            add_table_content(data, flag, place, is_equally, data_names);

            //如果是已查看页面的话 将确认为已读按钮disabled
            if (json.isReaded == 2) { //已阅读通知
                $(".isReaded-btn").attr("disabled", "disabled");
            } else {

            }
        },
        error: function(data) {
            console.log("error");
            alert("啊哦，查询发生了一点问题......");
        }
    });
}

//添加ajax
var add = function(add_URL, json, flag, place,is_equally, data_names, load_URL) {
    if (add_URL == "") {
        return;
    }
    console.log(json);
    $.ajax({
        url: add_URL,
        type: "post",
        data: json,
        dataType: "json",
        success: function(data) {
            console.log("success");
            // 0失败 1成功
            if (data.result) {
                alert("操作成功");
                $(".modal").modal("hide");
                //清空表格
                var tbody = document.getElementsByTagName("tbody")[0];
                $(tbody).html("");
                // 由于添加都是单表 所有的 所以赋1 null
                load(load_URL, flag, place, is_equally, data_names, 0);
            } else {
                console.log("add fail");	
                alert("操作失败");
            }
        },
        error: function(data) {
            console.log("error");
            alert("啊哦，添加发生了一点问题");
        }
    });
}

//查看具体 class=lookAll
// var lookAll = function() {

// }

// 确认已读 isReaded
// var isReaded = function() {

// }


/*
 * 点击编辑按钮开始编辑
 */
//select_array_e 数组 那几列是select  select_type_e 数组 值为 1  2 ，1固定的select  2来自服务器端的URL 
// select_value_e 数组 [{"1":"是"，"0","否"},{"URL":"/POMS........","id":"stationID","name":"stationName"}]
function beginEdit() {
    //获取子节点数组
    var parent = arguments[0].parentNode.parentNode.parentNode;
    var columeArr = arguments[1];
    var childrennode = parent.children;

    var previousBtn = arguments[0].parentNode;
    var previousBtnHtml = previousBtn.innerHTML.toString();

    /*
     *待编辑的文本变为输入框
     */
    var idOfWaitEdit = 0;
    for (var i = 0; i < columeArr.length; i++) {
        // // 
        // var editnode = childrennode[columeArr[i] - 1];
        // var select_flag = 0;
        // for (var j = 0; j < select_array_e.length; j++) {
        //     if (columeArr[i] == select_array_e[j]) {
        //         select_flag = 1;
        //         //匹配了 这一列是select
        //         var one_select_type_e = select_type_e[j];
        //         var one_select_value_e = select_value_e[j];
        //         if (one_select_type_e == 1) {
        //             //固定
        //             var html_str = "<select id = 'waitEdit" + idOfWaitEdit + "' >";
        //             for (var one_select_key in one_select_value_e) {
        //                 html_str += "<option value='" + one_select_key + "'>" + one_select_value_e[one_select_key] + "</option>";
        //             }
        //             html_str += "</select>";
        //             editnode.innerHTML = html_str;

        //         } else if (one_select_type_e == 2) {
        //             //URL

        //         }
        //     }
        // }
        // if (select_flag == 0) {

        //     editnode.innerHTML = "<input id = 'waitEdit" + idOfWaitEdit + "' type= 'text 'value='" + editnode.innerText + "'>";
        //     idOfWaitEdit++;
        // }
        // // 
        var editnode = childrennode[columeArr[i] - 1];
        editnode.innerHTML = "<input id = 'waitEdit" + idOfWaitEdit + "' type= 'text 'value='" + editnode.innerText + "'>";
        idOfWaitEdit++;
    }

    var indexOfColumesArrStr = columeArr.toString();
    // alert(indexOfColumesArrStr);

    /*
     *编辑按钮变为完成和取消按钮
     */
    arguments[0].parentNode.innerHTML =
        "<button type=\"button\" class=\"btn btn-info\" onclick=\"return submitChange(this,[" + indexOfColumesArrStr + "]," + arguments[2] + ")\">\n" +
        "                                <span class=\"glyphicon glyphicon-edit\"></span>确定\n" +
        "                            </button>" +
        "<button type=\"button\" class=\"btn btn-warning\" onclick=\"return cancelChange(this,[" + indexOfColumesArrStr + "]," + arguments[2] + ")\">\n" +
        "                                <span class=\"glyphicon glyphicon-edit\"></span>取消\n" +
        "                            </button>";

}

{ result: true, false }

function submitChange() {
    //parent为上层父节点tr,chilrennode为tr下的td节点数组
    var parent = arguments[0].parentNode.parentNode.parentNode;
    var childrennode = parent.children;
    var submitdata = "{";
    var headerArray = document.getElementById("TableHeader").children;
    //判断是否为空 为空则不进行

    //待编辑的input的编号
    var idOfWaitEdit = 0;
    for (var i = 0; i < childrennode.length - 1; i++) {
        var editnode = childrennode[i];
        submitdata += "\"";
        submitdata += headerArray[i].innerText;
        submitdata += "\"";
        submitdata += ":";
        if ($(editnode).find("input").length != 0) {
            editnode = document.getElementById("waitEdit" + idOfWaitEdit);
            if (!$.trim($(editnode).val())) {
                alert("请填充完数据！！！！！");
                return;
            }
            var  edit_text = $(editnode).val();
            if (edit_text == "女" || edit_text == "是" || edit_text == "日刊" || edit_text == "退订" || edit_text == "普通客户" || edit_text == "批评" || edit_text == "跨站订阅" || edit_text == "正常") {
                edit_text = 1;
            } else if (edit_text == "男" || edit_text == "否" || edit_text == "普通" || edit_text == "未使用") {
                edit_text = 0;
            } else if (edit_text == "月刊" || edit_text == "转址" || edit_text == "大客户" || edit_text == "表扬" || edit_text == "集订分送" || edit_text == "丢弃") {
                edit_text = 2;
            } else if (edit_text == "季刊" || edit_text == "延期" || edit_text == "会员" || edit_text == "建议" || edit_text == "作废") {
                edit_text = 3;
            } else if (edit_text == "半年刊") {
                edit_text = 4;
            } else if (edit_text == "年刊") {
                edit_text = 5;
            }
            submitdata += "\"" + edit_text + "\""; //获取td节点里input框的值
            idOfWaitEdit++;
        } else {
            submitdata += "\"";
            var edit_text = editnode.innerText;
//            alert(editnode.innerText);
//            alert(edit_text+"  1 "  );
            if (edit_text == "女" || edit_text == "是" || edit_text == "日刊" || edit_text == "退订" || edit_text == "普通客户" || edit_text == "批评" || edit_text == "跨站订阅" || edit_text == "正常") {
                edit_text = 1;
            } else if (edit_text == "男" || edit_text == "否" || edit_text == "普通" || edit_text == "未使用") {
                edit_text = 0;
            } else if (edit_text == "月刊" || edit_text == "转址" || edit_text == "大客户" || edit_text == "表扬" || edit_text == "集订分送" || edit_text == "丢弃") {
                edit_text = 2;
            } else if (edit_text == "季刊" || edit_text == "延期" || edit_text == "会员" || edit_text == "建议" || edit_text == "作废") {
                edit_text = 3;
            } else if (edit_text == "半年刊") {
                edit_text = 4;
            } else if (edit_text == "年刊") {
                edit_text = 5;
            }
//            alert(edit_text);
            submitdata += edit_text;
            submitdata += "\"";
        }
        if (i < childrennode.length - 2) {
            submitdata += ",";
        }
    }
    submitdata += "}";
    console.log(submitdata);
    var obj = JSON.parse(submitdata);

    var previousButStr = "";
    //将按钮组修改为编辑或编辑+删除（即恢复为最初的状态）
    if (arguments[2] == 0) {} else if (arguments[2] == 1) {
        previousButStr = "<button type=\"button\" class=\"btn btn-info\" onclick=\"return beginEdit(this,[" + arguments[1] + "]," + arguments[2] + ")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>编辑\n" +
            "                            </button>";
    } else if (arguments[2] == 2) {
        previousButStr = "<button type=\"button\" class=\"btn btn-info\" onclick=\"return beginEdit(this,[" + arguments[1] + "]," + arguments[2] + ")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>编辑\n" +
            "                            </button>" +
            "<button type=\"button\" class=\"btn btn-warning\" onclick=\"return beginDelete(this,[" + arguments[1] + "]," + arguments[2] + ")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>删除\n" +
            "                            </button>";
    }
    arguments[0].parentNode.innerHTML = previousButStr;
    $.ajax({
        url: update_URL,
        type: "post",
        data: obj,
        dataType: "json",
        success: function(data) {
            if (data.result) {
                /*
                 *编辑完成操作成功后输入框变为text文本的代码,按钮组恢复为原先的按钮组
                 * 暂时放入这里，设定提交必定修改
                 * 对接时将这段代码放入 AJAX success调用的函数中
                 */
                for (var i = 0; i < idOfWaitEdit; i++) {
                    var waitToBeText = document.getElementById("waitEdit" + i);
                    var textOfEdit = $(waitToBeText).val();
                    $(waitToBeText).parent().html(textOfEdit);
                }

            }
        },
        failure: function() {

        }
    })
}

function cancelChange() {
    //parent为上层父节点tr,chilrennode为tr下的td节点数组
    var parent = arguments[0].parentNode.parentNode.parentNode;
    var childrennode = parent.children;
    var idOfWaitEdit = 0;
    //文本框的值恢复为最初的状态
    for (var i = 0; i < parent.children.length - 1; i++) {
        var editnode = childrennode[i];
        if ($(editnode).find("input").length != 0) {
            console.log("have find input");
            var waitToBeText = document.getElementById("waitEdit" + idOfWaitEdit);
            var textOfValue = waitToBeText.getAttribute("value");
            $(waitToBeText).parent().html(textOfValue);
            idOfWaitEdit++;
        }
    }
    //将按钮组修改为编辑或编辑+删除（即恢复为最初的状态）
    if (arguments[2] == 0) {} else if (arguments[2] == 1) {
        previousButStr = "<button type=\"button\" class=\"btn btn-info\" onclick=\"return beginEdit(this,[" + arguments[1] + "]," + arguments[2] + ")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>编辑\n" +
            "                            </button>";
    } else if (arguments[2] == 2) {
        previousButStr = "<button type=\"button\" class=\"btn btn-info\" onclick=\"return beginEdit(this,[" + arguments[1] + "]," + arguments[2] + ")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>编辑\n" +
            "                            </button>" +
            "<button type=\"button\" class=\"btn btn-warning\" onclick=\"return beginDelete(this,[" + arguments[1] + "]," + arguments[2] + ")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>删除\n" +
            "                            </button>";
    }
    arguments[0].parentNode.innerHTML = previousButStr;

}
//begindelete 第一个参数为this
function beginDelete() {
    //parent为上层父节点tr,chilrennode为tr下的td节点数组
    var parent = arguments[0].parentNode.parentNode.parentNode;
    var childrennode = parent.children;
    var headerArray = document.getElementById("TableHeader").children;
    var zhujian = document.getElementById("TableHeader").childNodes[0].innerText;
    var deleteData = {};
    var valueOfZhujian = childrennode[0].innerText;
    // for (var i = 0; i < childrennode.length; i++) {
    //     var deleteNode = childrennode[i];
    //     if ($(deleteNode).find("div").length == 0) {
    //         deleteData += headerArray[i].innerHTML;
    //         deleteData += ":";
    //         deleteData += deleteNode.innerText;
    //         if (i < childrennode.length - 2) {
    //             deleteData += ",";
    //         }
    //     }
    // }
    deleteData[zhujian] = valueOfZhujian;
    // alert(deleteData);

    var inform = confirm("确定要删除这条数据吗？");
    if (inform == true) {
        $.ajax({
            url: delete_URL,
            type: "get",
            data: deleteData,
            dataType: "json",
            success: function(data) {
                if (data.result == "1") {
                    //返回已删除，则需要删除该tr节点
                    parent.parentNode.removeChild(parent);

                }
            },
            failure: function() {}
        });
    }
}

function InputTextValidate(str) {
    if (str != "") {
        return true;
    } else {
        return false;
    }
}