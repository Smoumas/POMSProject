﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <!--页面标题提示部分-->

    <title>赠卡设置</title>

</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div id="mark-id">
                    fzsz-zksz
                </div>

                <!--页面标题提示部分-->
                <div class="title">
                    <h2>附赠设置>赠卡设置</h2>
                </div>

                <!--添加，删除，等操作部分-->
                <div class="operation">
                    <div class="add-btn operation-btn">
                        <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
                        <span class="glyphicon glyphicon-plus" ></span>添加
                    </button>
                    </div>
                    <div class="search input-group">
                        <input type="text" class="form-control " placeholder="报刊名称" name="newspaperName">
                        <span class="input-group-btn"><button class="btn btn-info" type="button">
							查询
						</button></span>
                    </div>
                </div>
                <!--表格部分-->
                <div>
                    <table class="table table-hover table-striped">
                        <thead>
                            <tr>
                                <th>赠卡号码</th>
                                <th name="newspaperID">报刊</th>
                                <th name="startDate">起始时间</th>
                                <th name="endDate">截止时间</th>
                                <th>是否被使用</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <!-- 模态框（Modal） -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                        <h4 class="modal-title" id="myModalLabel">
                            添加赠卡
                        </h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form" method="post">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">报刊名称</label>
                                <div class="col-sm-10">
                                    <select name="newspaperID" class="form-control">
                                
                                </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">起始时间</label>
                                <div class="col-sm-10">
                                    <input name="startDate" type="date" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">到期时间</label>
                                <div class="col-sm-10">
                                    <input name="endDate" type="date" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-primary col-sm-offset-3 col-sm-6" value="添加">
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal -->
        </div>
    </div>


    <script>
        $(function() {
            var newspaperlist = {};
            $(".container").on("click", function() {
                //判断是否已经获得 已经获得就退出                 
                if (!$.isEmptyObject(newspaperlist)) {
                    return;alert("ff");
                } else {
                    //获得职务list 
                    $.ajax({
                        url: "/POMSProject/center/newspaper/newspaperList",
                        type: "get",
                        data: "",
                        dataType: "json",
                        success: function(data) {
                            console.log("success");
                            newspaperlist = data.data;
                            //把select替换
                            var select = $("select")[0];
                            for (var i = 0; i < data.size; i++) {
                                var one_newspaper = newspaperlist[i];
                                var option = document.createElement("option");
                                option.setAttribute("value", one_newspaper.newspaperID);
                                var text = document.createTextNode(one_newspaper.newspaperName);
                                option.appendChild(text);
                                select.appendChild(option);
                            }
                        },
                        error: function(data) {
                            console.log("error");
                            alert("啊哦，连接数据库出现了一点问题");
                        }
                    });
                }

            });
        });
    </script>
</body>

</html>