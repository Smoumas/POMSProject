/**
 * Created by Think on 2017/8/7.
 */


//用来存储一个子系统各功能模块的加载-查询-添加三种URL
// flag标识符 无编辑、仅编辑、编辑删除、查看具体和确认已读（收取消息页面的按钮）  0 无按钮 1仅编辑 2编辑删除 3确认已读并且查看具体
// is_equally 1接受的所有字段和要展示的字段一样 0接受的字段和要展示的不一样 -1 不接受字段
//data_names 要展示的字段名 如果is_equally == 1  这个字段是null  is_equally == 0 要展示的字段  is_equally-1 null
var array = {
    //字典维护
    "zdwh-bmsz": {
        "load_URL": "/POMSProject/center/dictionaryMaintain/departmentList",
        "query_URL": "",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "URL5",
        "flag": "1",
        "place": "1,2,3,4",
        "is_equally": "1",
        "data_names": null
    },

    //需要更新

    "zdwh-zbsz": {
        "load_URL": "POMSProject/center/query/departmentDutyInfo",
        "query_URL": "",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "1",
        "data_names": null
    },

    "zdwh-bssz": {
        "load_URL": "POMSProject/center/dictionaryMaintain/newsOfficeList",
        "query_URL": "POMSProject/center/dictionaryMaintain/newsOfficeByID",
        "add_URL": "POMSProject/center/dictionaryMaintain/insertNewsOffice",
        "delete_URL": "POMSProject/center/dictionaryMaintain/deleteNewsOffice",
        "update_URL": "POMSProject/center/dictionaryMaintain/updateNewsOffice",
        "flag": "2",
        "place": "[2,3]",
        "is_equally": "1",
        "data_names": null
    },


    "zdwh-ysdwsz": {
        "load_URL": "POMSProject/center/dictionaryMaintain/transferComList",
        "query_URL": "POMSProject/center/dictionaryMaintain/transferComByName",
        "add_URL": "POMSProject/center/dictionaryMaintain/insertTransferCom",
        "delete_URL": "POMSProject/center/dictionaryMaintain/deleteTransferCom",
        "update_URL": "POMSProject/center/dictionaryMaintain/updateTransferCom",
        "flag": "2",
        "place": "[2,3,4]",
        "is_equally": "1",
        "data_names": null
    },

    "zdwh-tddsz": {
        "load_URL": "POMSProject/center/dictionaryMaintain/deliverAreaList",
        "query_URL": "POMSProject/center/dictionaryMaintain/deliverAreaByID",
        "add_URL": "POMSProject/center/dictionaryMaintain/insertDeliverArea",
        "delete_URL": "POMSProject/center/dictionaryMaintain/deleteDeliverArea",
        "update_URL": "POMSProject/center/dictionaryMaintain/updateDeliverArea",
        "flag": "2",
        "place": "[2]",
        "is_equally": "0",
        "data_names": ["deliverAreaValue", "stationID"]
    },


    "zdwh-bgyysz": {
        "load_URL": "POMSProject/center/dictionaryMaintain/userModifyList",
        "query_URL": "POMSProject/center/dictionaryMaintain/userModifyListByType",
        "add_URL": "POMSProject/center/dictionaryMaintain/insertUserModify",
        "delete_URL": "POMSProject/center/dictionaryMaintain/deleteUserModify",
        "update_URL": "POMSProject/center/dictionaryMaintain/updateUserModify",
        "flag": "2",
        "place": "[3]",
        "is_equally": "0",
        "data_names": ["orderID", "type", "reason"]
    },


    //人事管理，员工信息设置

    "rsgl-ygxxsz": {
        "load_URL": "POMSProject/center/personManage/employeeList",
        "query_URL": "POMSProject/center/personManage/employeeByName",
        "add_URL": "POMSProject/center/personManage/insertEmployee",
        "delete_URL": "POMSProject/center/personManage/deleteEmployee",
        "update_URL": "POMSProject/center/personManage/updateEmployee",
        "flag": "2",
        "place": "[2,3,4,7,8]",
        "is_equally": "1",
        "data_names": null
    },

    //操作员权限设置

    "rsgl-czyqxsz": {
        "load_URL": "POMSProject/center/personManage/operatorList",
        "query_URL": "POMSProject/center/personManage/operatorByID",
        "add_URL": "POMSProject/center/personManage/insertOperator",
        "delete_URL": "POMSProject/center/personManage/deleteOperator",
        "update_URL": "POMSProject/center/personManage/updateOperator",
        "flag": "2",
        "place": "[2,3]",
        "is_equally": "0",
        "data_names": ["operatorID", "level", "employeeID"]
    },

    //业绩统计，分为征订员和投递员

    "rsgl-tdyyjtj": {
        "load_URL": "POMSProject/center/personManage/salerPerformance",
        "query_URL": "",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "1",
        "data_names": ["employeeID", "employeeName", "performance"]
    },


    "rsgl-yjtj": {
        "load_URL": "POMSProject/center/personManage/deliverPerformance",
        "query_URL": "",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "1",
        "data_names": ["operatorID", "employeeName", "performance"]
    },

    "bksz-xgbkxx": {
        "load_URL": "/POMSProject/center/newspaper/newspaperList",
        "query_URL": "/POMSProject/center/newspaper/newspaperListByName",
        "add_URL": "/POMSProject/center/newspaper/insertNewspaper",
        "delete_URL": "/POMSProject/center/newspaper/deleteNewspaper",
        "update_URL": "/POMSProject/center/newspaper/updateNewspaper",
        "flag": "2",
        "place": "3,4,5,6,7",
        "is_equally": "1",
        "data_names": []
    },
    "bksz-bkjbdj": {
        "load_URL": "/POMSProject/center/newspaper/newspaperPriceList",
        "query_URL": "/POMSProject/center/newspaper/newspaperPriceByID",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "/POMSProject/center/newspaper/updateNewspaperPrice",
        "flag": "1",
        "place": "6",
        "is_equally": "1",
        "data_names": []
    },
    "fzsz-zksz": {
        "load_URL": "/POMSProject/center/bonus/giftCardList",
        "query_URL": "",
        "add_URL": "/POMSProject/center/bonus/insertGiftCard",
        "delete_URL": "/POMSProject/center/bonus/deleteGiftCard",
        "update_URL": "/POMSProject/center/bonus/updateGiftCard",
        "flag": "2",
        "place": "2",
        "is_equally": "1",
        "data_names": []
    },
    "yzsz-djqsz": {
        "load_URL": "/POMSProject/center/bonus/couponList",
        "query_URL": "/POMSProject/center/bonus/couponByID",
        "add_URL": "/POMSProject/center/bonus/insertCoupon",
        "delete_URL": "/POMSProject/center/bonus/deleteCoupon",
        "update_URL": "/POMSProject/center/bonus/updateCoupon",
        "flag": "2",
        "place": "2,3",
        "is_equally": "1",
        "data_names": []
    },
    "fzyw-sqtz": {
        "load_URL": "/POMSProject/center/assist/adviceList?isReaded=0",
        "query_URL": "/POMSProject/center/assist/adviceList",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "3",
        "place": "",
        "is_equally": "0",
        "data_names": ["adviceID", "sendStationID", "sendDeptID", "content"]
    },
    "fzyw-fstz": {
        "load_URL": "",
        "query_URL": "",
        "add_URL": "/POMSProject/center/assist/insertAdvice",
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
        "add_URL": "/POMSProject/center/personManage/updateOperator",
        "delete_URL": "",
        "update_URL": "",
        "flag": "-1",
        "place": "",
        "is_equally": "-1",
        "data_names": []
    },
    "fzyw-jzdz": {
        "load_URL": "",
        "query_URL": "",
        "add_URL": "/POMSProject/center/assist/correctOrderAddress",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "-1",
        "data_names": []
    },
    "hz-xdshxghhz": {
        "load_URL": "",
        "query_URL": "/POMSProject/center/query/orderCountByDate",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "1",
        "data_names": []
    },
    "cx-bkxxcx": {
        "load_URL": "/POMSProject/center/newspaper/newspaperList",
        "query_URL": "POMSProject/center/newspaper/newspaperListByName",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "1",
        "data_names": []
    },
    "cx-dhdgcx": {
        "load_URL": "",
        "query_URL": "POMSProject/center/newspaper/newspaperListByName",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "0",
        "data_names": ["customerID", "newspaperID", "orderNum"]
    },
    "cx-bkddcx": {
        "load_URL": "",
        "query_URL": "/POMSProject/center/query/orderListByCustomerName",
        "add_URL": "",
        "delete_URL": "",
        "update_URL": "",
        "flag": "0",
        "place": "",
        "is_equally": "0",
        "data_names": ["newspaperID", "customerID", "orderNum", "orderDate", "orderAddress"]
    },
};

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
            var type = 0; //判断当前界面是加载 还是查询的 0 加载 1 查询

            //有一个标记 记录分页
            var page = 0; //当前页数
            //记录查询条件
            var search_if = {};

            // 通过mark_id标记符获得三种URL以及是否有编辑的标志符
            var mark_id = $.trim($("#mark-id").text());
            console.log(mark_id);
            console.log(array[mark_id]);
            var load_URL = array[mark_id].load_URL;
            var query_URL = array[mark_id].query_URL;
            var add_URL = array[mark_id].add_URL;
            var flag = array[mark_id].flag; //代表是否有编辑按钮的标志符
            var place = array[mark_id].place; //代表需要编辑的列号
            var is_equally = array[mark_id].is_equally; //代表字段名是否匹配
            var data_names = array[mark_id].data_names; //数组 代表字段名
            // 发送加载的ajax,包括标识符和需要编辑的列号
            console.log("send load-ajax");

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
                add(add_URL, add_json, flag, place, load_URL);
                page = 1; //第0页已经展示  待展示：第一页
                //去除默认事件                 
                return false;
            });

            //绑定查看具体按钮事件
            // 这里用模态框
            var look_all_btn = $(".lookAll");
            $(look_all_btn).on("click", function() {
                // 获得数据            
                var look_all_json = {};
                var tr = $(this).parent();
                var tds = $(tr).children();
                var texts = new Array();
                // 获得了数据 因为有操作栏 这个要剪掉
                for (var i = 0; i < tds.length - 1; i++) {
                    texts[i] = $(tds[i]).text();
                }
                //获得模态框
                var modal = $(".modal-body")[0];
                var div = $(modal).find(".div");
                for (var j = 0; j < div.length; j++) {
                    $(div[j]).text(texts[i]);
                }
                //信息填充完毕
            });

            //绑定确认已阅读按钮
            //和删除按钮差不多

            var isReaded_btn = $(".isReaded-btn");
            var field_table_div = $("#tableHeader");
            var first_child_id = $($(field_table_div).children(":first")).text();
            $(isReaded_btn).on("click", function() {
                //单页面事件 就在这里写了
                $.ajax({
                    url: "/POMSProject/center/assist/setAdviceReaded", //此处填确认通知的URL
                    type: "POST",
                    data: { "adviceID": first_child_id }, //通知id 此处id通过页面获得 页面显示id号 同时上面is_equally == "0"的 data_names参数要包括id =="1"的就不用了，传回来的data有id
                    dataType: "json",
                    success: function(data) {
                        console.log("success");
                        // 0失败 1成功
                        if (data.result) {
                            alert("已阅读该通知，请到未阅读通知处查看该通知！！！");
                            //删除这一行  div td tr 
                            var tr = this.parentNode.parentNode.parentNode;
                            tr.parentNode.removeChild(tr);
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
            $(".container").scroll(function() {
                page++;
                var viewH = $(this).height(); //可见高度
                var contentH = $(this).get(0).scrollHeight; //内容高度
                var scrollTop = $(this).scrollTop(); //滚动高度
                if (contentH - viewH - scrollTop <= 100) { //到达底部100px时,加载新内容
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
        search_value = $(search_type[i]).val();
        search[search_key] = search_value;
    }
}

var add_table_content = function(data, flag, place, is_equally, data_names) {
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
        div.setAttribute("id", "tableHeader");
        //记录这个表格有几列
        var count = 0;
        if (is_equally == "-1") {

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
        var tr = document.createElement("tr");
        // 加入tr
        tbody.appendChild(tr);
        //添加表格内容
        for (var i = 0; i < data.size; i++) {
            var oneData = allData[i];
            if (is_equally == "1") {
                for (var key in oneData) {
                    var td = document.createElement("td");
                    tr.appendChild(td);
                    var td_text = document.createTextNode(oneData[key]);
                    td.appendChild(td_text);
                }
            } else if (is_equally == "0") {
                for (var j = 0; j < data_names.length; j++) {
                    var td = document.createElement("td");
                    tr.appendChild(td);
                    var td_text = document.createTextNode(oneData[data_names[j]]);
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
            var tdStr3 = "<div class = 'btn-group'>" +
                "<button type = 'button' class = 'btn btn-default' class='lookAll' data-toggle='modal' data-target='#myModal'>" +
                "<span ></span>查看具体</button>" +
                "<button type = 'button' class = 'btn btn-default' class='isReaded-btn'>" +
                "<span ></span>确认为已读</button>" +
                "</div>";
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
        // 找到tbody
        var tbody = document.getElementsByTagName("tbody")[0];
        var tr = document.createElement("tr");
        // 加入tr
        tbody.appendChild(tr);
        var td = document.createElement("td");
        tr.appendChild(td);
        td.setAttribute("colspan", count);
        td.setAttribute("id", "no-data-tr");
        var td_text_no_data = document.createTextNode("没有相应的数据!!!!");
    }
}

//加载ajax
var load = function(load_URL, flag, place, is_equally, data_names, page) {
    if (load_URL == "") {
        return;
    }
    $.ajax({
        url: load_URL,
        type: "GET",
        data: { "page": page },
        dataType: "json",
        success: function(data) {
            console.log("success");
            add_table_content(data, flag, place, is_equally, data_names);
        },
        error: function(data) {
            console.log("error");
            alert("啊哦，连接数据库出现了一点问题");
        }
    });
}

//查询ajax
var query = function(query_URL, json, flag, place, is_equally, data_names, page) {
    json["page"] = page;
    $.ajax({
        url: query_URL,
        type: "POST",
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
            alert("啊哦，发生了一点问题......");
        }
    });
}

//添加ajax
var add = function(add_URL, json, flag, place, load_URL) {
    $.ajax({
        url: add_URL,
        type: "POST",
        data: json,
        dataType: "json",
        success: function(data) {
            console.log("success");
            // 0失败 1成功
            if (data.result) {
                alert("添加成功");
                //清空表格
                var tbody = document.getElementsByTagName("tbody")[0];
                $(tbody).html("");
                // 由于添加都是单表 所有的 所以赋1 null
                load(load_URL, flag, place, "1", null, 0);
            } else {
                console.log("add fail");
                alert("添加失败！！！！！！");
            }
        },
        error: function(data) {
            console.log("error");
            alert("啊哦，发生了一点问题");
        }
    });
}

//查看具体 class=lookAll
// var lookAll = function() {

// }

// 确认已读 isReaded
// var isReaded = function() {

// }