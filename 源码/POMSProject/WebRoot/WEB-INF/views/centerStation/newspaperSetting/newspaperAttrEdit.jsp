﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>修改报刊信息</title>
</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <!--页面标题提示部分-->
                <div id="mark-id">
                    bksz-xgbkxx
                </div>
                <div class="title">
                    <h2>报刊设置>修改报刊信息</h2>
                </div>
                <!--添加，删除，等操作部分-->
                <div class="operation">
                    <div class="add-btn operation-btn">
                        <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
                        <span class="glyphicon glyphicon-plus"></span>添加
                    </button>
                    </div>

                    <div class="search input-group">
                        <input type="text" class="form-control" placeholder="请输入报刊名称" name="newspaperName">
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
                                <th>报刊编号</th>
                                <th>报刊名称</th>
                                <th>所属报社</th>
                                <th name="ableUnsubscribe">是否允许退订</th>
                                <th name="ableRedirect">是否允许转址</th>
                                <th name="ableDelay">是否允许延期</th>
                                <th name="frequency">刊期</th>
                                <th name="issueRate">发行费率</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                        <h4 class="modal-title" id="myModalLabel">
                            添加报刊信息
                        </h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form" method="post">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">报刊名称</label>
                                <div class="col-sm-10">
                                    <input name="newspaperName" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">所属报社</label>
                                <div class="col-sm-10">
                                    <select name="noID" class="form-control">
                                    <option>1报社</option>
                                </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">是否允许退订</label>
                                <div class="col-sm-10">
                                    <select name="ableUnsubscribe" class="form-control">
                                    <option value="1">是</option>
                                    <option value="0">否</option>
                                </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">是否允许转址</label>
                                <div class="col-sm-10">
                                    <select name="ableRedirect" class="form-control">
                                    <option value="1">是</option>
                                    <option value="0">否</option>
                                </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">是否允许延期</label>
                                <div class="col-sm-10">
                                    <select name="ableDelay" class="form-control">
                                    <option value="1">是</option>
                                    <option value="0">否</option>
                                </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">刊期</label>
                                <div class="col-sm-10">
                                    <select name="frequency" class="form-control">
                                    <option value="1">日刊</option>
                                    <option value="2">月刊</option>
                                    <option value="3">季刊</option>
                                    <option value="4">半年刊</option>
                                    <option value="5">年刊</option>
                                </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">发行费率</label>
                                <div class="col-sm-10">
                                    <input name="issueRate" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-primary col-sm-offset-3 col-sm-6" value="提交">
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
            var newsOfficeList = {};
            $(".container").on("click", function() {
                //判断是否已经获得 已经获得就退出                 
                if (!$.isEmptyObject(newsOfficeList)) {
                    return;
                } else {
                    //获得职务list 
                    $.ajax({
                        url: "/POMSProject/center/dictionaryMaintain/newsOfficeList",
                        type: "GET",
                        data: "",
                        dataType: "json",
                        success: function(data) {
                            console.log("success");
                            newsOfficeList = data.data;
                            //把select替换
                            var select = $("select")[0];
                            $(select).html("");
                            for (var i = 0; i < data.size; i++) {
                                var one_newsOffice = newsOfficeList[i];
                                var option = document.createElement("option");
                                option.setAttribute("value", one_newsOffice.noID);
                                var text = document.createTextNode(one_newsOffice.noName);
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