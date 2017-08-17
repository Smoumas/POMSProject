<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>员工职务设置</title>
    <!--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
    <!--<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>-->
    <!--<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
    <!--<link rel="stylesheet" href="general.css" type="text/css">-->
</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">

                <!--页面标题提示部分-->
                <div id="mark-id">
                    rsgl-ygzzsz
                </div>
                <!--页面标题提示部分-->
                <div class="title">
                    <h2>人事管理>员工职务设置</h2>
                </div>

                <!--添加的表单-->
                <div class="add-form modify-password-form">
                    <form method="POST" action="" role="form">
                        <div class="form-group">
                            <label class="col-sm-2">员工ID</label>
                            <input type="text" class="form-control" name="employeeID">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">职务</label>
                            <select name="dutyType" class="form-control">
                        </select>
                        </div>

                        <div class="form-group">
                            <input type="submit" class="send-new-password-btn btn btn-info col-sm-offset-2" value="提交">
                        </div>
                    </form>
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
                        url: "/POMSProject/publish/employeeManage/dutyList",
                        type: "get",
                        data: "",
                        dataType: "json",
                        success: function(data) {
                            console.log("success");
                            dutylist = data.data;
                            //把select替换
                            var select = $("select")[0];
                            $(select).html("");
                            for (var i = 0; i < data.size; i++) {
                            console.log("duty" + data.size);
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