<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
    <title>变更原因设置</title>
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <!-- 重点引入这俩个类-->
      <!--页面标题提示部分-->
      <div id="mark-id">
        zdwh-bgyysz
      </div>

      <div class="title">
        <h2>字典维护>变更原因设置</h2>
      </div>
      <div class="operation">
        <div class="search input-group">
        <select name="type" class="form-control">
        	<option value="1">退订</option>
        	<option value="2">转址</option>
        	<option value="3">延期</option>
        	<option value="4">未续订</option>
        </select>
          <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
        </div>
      </div>
      <div>
        <tr>
          <table class="table table-hover table-striped">
            <thead>
            <th>记录ID</th>
            <th>订单编号</th>
            <th>变更类型</th>
            <th name="reason">原因</th>
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
            提交变更原因
          </h4>
        </div>
        <div class="modal-body">
          <form class="form-horizontal" role="form" method="post">
            <div class="form-group">
              <label  class="col-sm-2 control-label">订单编号</label>
              <div class="col-sm-10">
                <input name="orderID" type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">变更类型</label>
              <div class="col-sm-10">
                <select name="type" type="text" class="form-control"></select>
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">变更原因</label>
              <div class="col-sm-10">
                <textarea name="reason" type="text" class="form-control"></textarea>
              </div>
            </div>
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
