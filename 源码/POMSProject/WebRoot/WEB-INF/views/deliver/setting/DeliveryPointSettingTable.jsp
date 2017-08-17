<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>送报点管理</title>
</head>
<body>

<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">

      <!--页面标题提示部分-->
      <div id="mark-id">
        xtsz-sbdsz
      </div>
      <!-- 重点引入这俩个类-->
      <div class="title">
        <h2>系统设置>送报点设置</h2>
      </div>

      <div class="operation">
        <div class="add-btn operation">
          <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
            <span class="glyphicon glyphicon-plus"></span>添加
          </button>
        </div>
        <div class="search input-group">
          <input type="text" class="form-control"name="deliverPointName" placeholder="请输入送报点名称">
          <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
        </div>
      </div>
      <div>
          <table class="table table-hover table-striped">
            <thead>
            <tr>
              <th name="deliverPointID">印点编号</th>
            <th namr="deliverPointName">送报点名称</th>
            <th name="deliverPointAddress">送报点地址</th>
              <th name="stationID">所属分站编号</th>
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
            添加送报点
          </h4>
        </div>
        <div class="modal-body">
          <form class="form-horizontal" role="form">
            <div class="form-group">
              <label class="col-sm-2 control-label">名称</label>
              <div class="col-sm-10">
                <input name="deliverPointName" type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">地址</label>
              <div class="col-sm-10">
                <input name="deliverPointAddress" type="text" class="form-control">
              </div>
            </div>

     <!--       <div class="form-group">
              <label class="col-sm-2 control-label">分站编号</label>
              <div class="col-sm-10">
                <select name="stationID" class="form-control"></select>
              </div>
            </div>-->

            <div class="form-group">
              <input type="submit" class="btn btn-info col-sm-offset-2 col-sm-8" value="添加">
            </div>
          </form>
        </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal -->
  </div>
</div>

</body>
</html>
