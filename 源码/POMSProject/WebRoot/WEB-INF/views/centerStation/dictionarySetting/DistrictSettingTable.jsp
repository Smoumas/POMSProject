<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>投递段设置</title>
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <!-- 重点引入这俩个类-->
      <!--页面标题提示部分-->
      <div id="mark-id">
        zdwh-tddsz
      </div>
      <div class="title">
        <h2>字典管理>投递段设置</h2>
      </div>
      <div class="operation">
        <div class="add-btn operation-btn">
          <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" >
            <span class="glyphicon glyphicon-plus"></span>添加
          </button>
        </div>
        <div class="search input-group">
          <input type="text" class="form-control " placeholder="请输入投递段地址" name="deliverAreaValue">
          <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
        </div>
      </div>
      <div>
        <tr>
          <table class="table table-hover table-striped">
            <thead>
            <th>投递段编号</th>
            <th  name="deliverAreaValue">地址</th>
            <th>所属分站</th>
            <th>送报点ID</th>
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
            添加投递段
          </h4>
        </div>
        <div class="modal-body">
          <form class="form-horizontal" role="form" method="post">
            <div class="form-group">
              <label  class="col-sm-2 control-label">地址</label>
              <div class="col-sm-10">
                <input name="deliverAreaValue" type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">所属分站</label>
              <div class="col-sm-10">
                <select name="stationID" class="form-control">
                </select>
              </div>
            </div>
			<div class="form-group">
              <label class="col-sm-2 control-label">送报点</label>
              <div class="col-sm-10">
                <select name="deliverPointID" class="form-control">
                </select>
              </div>
            </div>            
            <div class="form-group">
              <input type="submit" class="btn btn-info col-sm-offset-3 col-sm-6" value="添加" >
            </div>
          </form>
        </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal -->
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
			                   url: "/POMSProject/center/dictionaryMaintain/deliverPointList",
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
			                           option.setAttribute("value", one_pointList.deliverPointID);
			                           var text = document.createTextNode(one_pointList.deliverPointName);
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
                   url: "/POMSProject/center/dictionaryMaintain/deliverPointList",
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
                           option.setAttribute("value", one_pointList.deliverPointID);
                           var text = document.createTextNode(one_pointList.deliverPointName);
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
