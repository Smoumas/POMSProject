/**
 * Created by Think on 2017/8/7.
 */
$(function(){
    $("#main").find(".main-left>.first-list>li:not(:first-child):not(.sub-list)").click(function () {
        $(this).next().slideToggle();
    });


    $(".sub-list").find("ul>li>a").click(function () {
        var href = this.getAttribute("href");
        $(".main-right").load(href,function () {
          alert(href);
        });
        return false;
    });

    $(".btn-info").click(function () {
        beginEdit(this,2,3);
    })

    $(".f1").attr("class","fff");


});

/*
* 点击编辑按钮开始编辑
 */
function beginEdit() {
    //获取子节点数组
    var parent = arguments[0].parentNode.parentNode.parentNode;
    var columeArr = arguments[1];
    var childrennode = parent.children;

    var previousBtn = arguments[0].parentNode;
    var previousBtnHtml = previousBtn.innerHTML.toString();
    alert(previousBtnHtml);

    /*
    *待编辑的文本变为输入框
     */
    var idOfWaitEdit = 0;
    for(var i=0;i<columeArr.length;i++){
        var editnode = childrennode[columeArr[i]-1];
        editnode.innerHTML = "<input id = 'waitEdit" + idOfWaitEdit + "' type= 'text 'value='" + editnode.innerText+ "'>";
        idOfWaitEdit++
    }

    var indexOfColumesArrStr = columeArr.toString();
    // alert(indexOfColumesArrStr);

    /*
    *编辑按钮变为完成和取消按钮
     */
    arguments[0].parentNode.innerHTML =
        "<button type=\"button\" class=\"btn btn-info\" onclick=\"return submitChange(this,["+indexOfColumesArrStr+"],"+arguments[2]+")\">\n" +
        "                                <span class=\"glyphicon glyphicon-edit\"></span>确定\n" +
        "                            </button>"+
        "<button type=\"button\" class=\"btn btn-warning\" onclick=\"return cancelChange(this,["+indexOfColumesArrStr+"],"+arguments[2]+")\">\n" +
        "                                <span class=\"glyphicon glyphicon-edit\"></span>取消\n" +
        "                            </button>";

}

{result:true,false}
function submitChange() {
    //parent为上层父节点tr,chilrennode为tr下的td节点数组
    var parent = arguments[0].parentNode.parentNode.parentNode;
    var childrennode = parent.children;
    var submitdata = "{";
    var headerArray = document.getElementById("TableHeader").children;
    //待编辑的input的编号
    var idOfWaitEdit = 0;
    for(var i=0;i<childrennode.length-1;i++){
        var editnode = childrennode[i];
        submitdata += headerArray[i].innerHTML;
        submitdata += ":";
        if($(editnode).find("input").length != 0){
            editnode = document.getElementById("waitEdit"+idOfWaitEdit);
            submitdata += $(editnode).val(); //获取td节点里input框的值
            idOfWaitEdit++;
        }else{
            submitdata += editnode.innerText;
        }
        if(i<childrennode.length-2){
            submitdata += ",";
        }
    }
    submitdata +="}";
    alert(submitdata);
    alert(idOfWaitEdit);

    /*
    *编辑完成操作成功后输入框变为text文本的代码,按钮组恢复为原先的按钮组
    * 暂时放入这里，设定提交必定修改
    * 对接时将这段代码放入 AJAX success调用的函数中
     */
            for(var i = 0;i<idOfWaitEdit;i++){
                var waitToBeText = document.getElementById("waitEdit"+i);
                var textOfEdit = $(waitToBeText).val();
                alert(textOfEdit);
                $(waitToBeText).parent().html(textOfEdit);
            }
    var previousButStr = "";
    //将按钮组修改为编辑或编辑+删除（即恢复为最初的状态）
    if(arguments[2] == 0){
    }else if(arguments[2] == 1){
        previousButStr = "<button type=\"button\" class=\"btn btn-info\" onclick=\"return beginEdit(this,["+arguments[1]+"],"+arguments[2]+")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>编辑\n" +
            "                            </button>";
    }else if(arguments[2] == 2){
        previousButStr = "<button type=\"button\" class=\"btn btn-info\" onclick=\"return beginEdit(this,["+arguments[1]+"],"+arguments[2]+")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>编辑\n" +
            "                            </button>"+
            "<button type=\"button\" class=\"btn btn-warning\" onclick=\"return beginDelete(this,["+arguments[1]+"],"+arguments[2]+")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>删除\n" +
            "                            </button>"
        ;
    }
    arguments[0].parentNode.innerHTML = previousButStr;
//     $ajax({
//         type:"GET",
//         url:"****.action",
//         data: submitdata,
//         dataType:"json",
//         success:function (data) {
//             if(data.result == "true"){
//     for(var i = 0;i<idOfWaitEdit;i++){
//         var waitToBeText = document.getElementById("waitEdit"+i);
//         var textOfEdit = $(waitToBeText).val();
//         alert(textOfEdit);
//         $(waitToBeText).parent().html(textOfEdit);
//     }
//             }
//         },
//         failure:function () {
//
//         }
//     })
}

function cancelChange() {
    //parent为上层父节点tr,chilrennode为tr下的td节点数组
    var parent = arguments[0].parentNode.parentNode.parentNode;
    var childrennode = parent.children;
    var idOfWaitEdit = 0;
    //文本框的值恢复为最初的状态
    for(var i=0;i<parent.children.length-1;i++){
        var editnode = childrennode[i];
        if($(editnode).find("input").length != 0){
            alert("have find input");
            var waitToBeText = document.getElementById("waitEdit"+idOfWaitEdit);
            var textOfValue = waitToBeText.getAttribute("value");
            $(waitToBeText).parent().html(textOfValue);
            idOfWaitEdit++;
        }
    }
    //将按钮组修改为编辑或编辑+删除（即恢复为最初的状态）
    if(arguments[2] == 0){
    }else if(arguments[2] == 1){
        previousButStr = "<button type=\"button\" class=\"btn btn-info\" onclick=\"return beginEdit(this,["+arguments[1]+"],"+arguments[2]+")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>编辑\n" +
            "                            </button>";
    }else if(arguments[2] == 2){
        previousButStr = "<button type=\"button\" class=\"btn btn-info\" onclick=\"return beginEdit(this,["+arguments[1]+"],"+arguments[2]+")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>编辑\n" +
            "                            </button>"+
            "<button type=\"button\" class=\"btn btn-warning\" onclick=\"return beginDelete(this,["+arguments[1]+"],"+arguments[2]+")\">\n" +
            "                                <span class=\"glyphicon glyphicon-edit\"></span>删除\n" +
            "                            </button>"
        ;
    }
    arguments[0].parentNode.innerHTML = previousButStr;

}

function beginDelete() {
    //parent为上层父节点tr,chilrennode为tr下的td节点数组
    var parent = arguments[0].parentNode.parentNode.parentNode;
    var childrennode = parent.children;
    var headerArray = document.getElementById("TableHeader").children;
    var deleteData = "{";
    for(var i = 0;i<childrennode.length;i++){
        var deleteNode = childrennode[i];
        if($(deleteNode).find("div").length == 0){
            deleteData += headerArray[i].innerHTML;
            deleteData += ":";
            deleteData += deleteNode.innerText;
            if(i<childrennode.length-2){
                deleteData += ",";
            }
        }
    }
    deleteData += "}"
    // alert(deleteData);

    var inform = confirm("确定要删除这条数据吗？");
    if(inform == true){

        /*
        *确认删除后移除该删除button所在的tr标签及标签的所有内容
        * 暂时放入这里，设定点击确定必定删除
        * 对接时将这段代码放入 AJAX success调用的函数中
        */
        parent.parentNode.removeChild(parent);

    //     $ajax({
    //         type:"GET",
    //         url:"****.action",
    //         data: deleteData,
    //         dataType:"json",
    //         success:function (data) {
    //             if(data.result == "true"){
    //                 //返回已删除，则需要删除该tr节点
    //                 parent.parentNode.removeChild(parent);
    //             }
    //         },
    //         failure:function () {
    //         }
    // })
    }
}

function InputTextValidate(str) {
    if(str != ""){
        return true;
    }else {
        return false;
    }
}



