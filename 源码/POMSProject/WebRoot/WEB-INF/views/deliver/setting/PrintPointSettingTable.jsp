﻿<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>印点管理</title>
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <!-- 重点引入这俩个类-->
      <div id="mark-id">
        xtsz-ydgl
      </div>

      <div class="title">
        <h2>系统设置>印点设置</h2>
      </div>

      <div class="operation" >
        <div class="add">
          <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
            <span class="glyphicon glyphicon-plus"></span>添加
          </button>
        </div>
        <div class="search input-group">
          <input type="text" class="form-control " name="printerName"
                 placeholder="请输入关键字">
          <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
        </div>
      </div>
      <div>
          <table class="table table-hover table-striped">
            <thead>
            <tr>
            <th name="printerID">编号</th>
            <th name="printerName">名称</th>
            <th name="printerAddress">地址</th>
            <th name="stationID">所属分站</th>
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
            添加印点
          </h4>
        </div>
        <div class="modal-body">
          <form class="form-horizontal" role="form">
            <div class="form-group">
              <label  class="col-sm-2 control-label">印点名称</label>
              <div class="col-sm-10">
                <input name="printerName" type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">地址</label>
              <div class="col-sm-10">
                <input name="printerAddress" type="text" class="form-control">
              </div>
            </div>
         <!--   <div class="form-group">
              <label class="col-sm-2 control-label">分站</label>
              <div class="col-sm-10">
                <select name="stationID" class="form-control"></select>
              </div>
            </div>-->
            <div class="form-group">
              <input type="submit" class="btn btn-info col-sm-offset-3 col-sm-6" value="添加">
            </div>
          </form>
        </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal -->
  </div>

</div>
</body>
</html>
