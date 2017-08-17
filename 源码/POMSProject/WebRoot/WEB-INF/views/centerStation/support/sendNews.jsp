<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8"><title>发送通知</title>

</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <!--页面标题提示部分-->
                <div id="mark-id">
                    fzyw-fstz
                </div>
                <div class="title">
                    <h2>辅助业务>发送通知</h2>
                </div>
                <!--添加的表单-->
                <div class="add-form send-news-form">
                    <form method="POST" action="" role="form">
                        <div class="form-group">
                            <label class="col-sm-2">目标分站</label>
                            <select name="receiveStationID" class="form-control">
                 
                        </select>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">目标部门</label>
                            <select name="receiveDeptID" class="form-control">
           
                        </select>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">消息内容</label>
                            <textarea name="content" rows="5" class="form-control textarea"></textarea>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="send-news-btn btn btn-info col-sm-offset-3 col-sm-6" value="发送">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script>
    $(function() {
            var stationList = {};
            var pointList = {};
            $(".container").on("click", function() {
                //判断是否已经获得 已经获得就退出                 
                if (!$.isEmptyObject(stationList)) {
                    return;
                } else {
                    //获得分站list 
                    $.ajax({
                        url: "/POMSProject/center/dictionaryMaintain/stationList",
                        type: "get",
                        data: "",
                        dataType: "json",
                        success: function(data) {
                            console.log("success");
                            stationList = data.data;
                            //把select替换
                            var select = $("select")[0];
                           	$(select).html("");
                            for (var i = 0; i < data.size; i++) {
                                var one_station = stationList[i];
                                console.log(one_station);
                                var option = document.createElement("option");
                                option.setAttribute("value", one_station.stationID);
                                var text = document.createTextNode(one_station.stationName);
                                option.appendChild(text);
                                select.appendChild(option);
                            }
                            var stationID = $(select).val();
		                   $.ajax({
			                   url: "/POMSProject/center/dictionaryMaintain/departmentList",
			                   type: "get",
			                   data: {"stationID":stationID},	
			                   dataType: "json",
			                   success: function(data) {
			                       console.log("success");
			                       pointList = data.data;
			                       //把select替换
			                       var select = $("select")[1];
			                       $(select).html("");
			                       for (var i = 0; i < data.size; i++) {
			                           var one_pointList = pointList[i];
			                           var option = document.createElement("option");
			                           option.setAttribute("value", one_pointList.departmentID);
			                           var text = document.createTextNode(one_pointList.departmentName);
			                           option.appendChild(text);
			                           select.appendChild(option);
			                       }
			                   },
			                   error: function(data) {
			                       console.log("error");
			                       alert("啊哦，连接数据库出现了一点问题");
			                   }
			               });
                        },
                        error: function(data) {
                            console.log("error");
                            alert("啊哦，连接数据库出现了一点问题");
                        }
                    });
                    
                    
                    
                }

            });
            
            $("select")[0].onchange = function(){
            	//获得印点List 
            	var stationID = $(this).val();
               $.ajax({
                   url: "/POMSProject/center/dictionaryMaintain/departmentList",
                   type: "get",
                   data: {"stationID":stationID},	
                   dataType: "json",
                   success: function(data) {
                       console.log("success");
                       pointList = data.data;
                       //把select替换
                       var select = $("select")[1];
                       $(select).html("");
                       for (var i = 0; i < data.size; i++) {
                           var one_pointList = pointList[i];
                            console.log(one_pointList);
                           var option = document.createElement("option");
                           option.setAttribute("value", one_pointList.departmentID);
                           var text = document.createTextNode(one_pointList.departmentName);
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
        
    </script>
</body>

</html>