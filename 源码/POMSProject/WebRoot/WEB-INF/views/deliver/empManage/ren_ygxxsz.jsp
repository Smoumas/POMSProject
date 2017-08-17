<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>员工信息设置</title>
</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">

                <!--页面标题提示部分-->
                <div id="mark-id">
                    rsgl-ygxxsz
                </div>
                <div class="title">
                    <h2>人事管理>员工信息设置</h2>
                </div>

                <!--顶部添加，删除，等操作部分-->
                <div class="operation">
                    <div class="add-btn operation-btn">
                        <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
            <span class="glyphicon glyphicon-plus"></span>添加
          </button>
                    </div>
                    <div class="search input-group">
                        <input type="text" class="form-control" placeholder="请输入姓名" name="employeeName">
                        <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
                    </div>
                </div>

                <!--表格部分-->
                <div>
                    <table class="table table-hover table-striped">
                        <thead>
                            <tr>
                                <th>员工编号</th>
                                <th>姓名</th>
                                <th>性别</th>
                                <th>年龄</th>
                                <th>职务</th>
                                <th>联系方式</th>
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
                            添加员工信息
                        </h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form" method="post">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">员工姓名</label>
                                <div class="col-sm-10">
                                    <input name="employeeName" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">性别</label>
                                <div class="col-sm-10">
                                    <select name="sex" class="form-control">
                  <option value="0">男</option>
                  <option value="1">女</option>
                </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">年龄</label>
                                <div class="col-sm-10">
                                    <input name="age" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">联系方式</label>
                                <div class="col-sm-10">
                                    <input name="phone" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">职务</label>
                                <div class="col-sm-10">
                                    <select name="dutyID" class="form-control">
                  
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-primary col-sm-offset-3 col-sm-6" value="提交">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <script>
        $(function() {
            var dutylist = {};
            $(".container").on("click", function() {
                //判断是否已经获得 已经获得就退出                 
                if (!$.isEmptyObject(dutylist)) {
                    return;
                } else {
                    //获得职务list 
                    $.ajax({
                        url: "/POMSProject/deliver/personManage/dutyList",
                        type: "get",
                        data: "",
                        dataType: "json",
                        success: function(data) {
                            console.log("success");
                            dutylist = data.data;
                            //把select替换
                            var select = $("select")[1];
                            $(select).html("");
                            for (var i = 0; i < data.size; i++) {
                                var one_duty = dutylist[i];
                                var option = document.createElement("option");
                                option.setAttribute("value", one_duty.dutyType);
                                var text = document.createTextNode(one_duty.dutyName);
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