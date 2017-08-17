<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>印点送报点关系设置</title>
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">

      <!--页面标题提示部分-->
      <div id="mark-id">
        xtsz-ydsbdgxsz
      </div>
      <div class="title">
        <h2>系统设置>印点送报点关系设置</h2>
      </div>
      <div class="operation">
        <div class="add">
          <button type="button" class="btn btn-info" data-target="#myModal" data-toggle="modal">
            关系设置与打包份数设置
          </button>
        </div>
        
      </div>
      <div>
          <table class="table table-hover table-striped">
            <thead>
            <tr>
              <th>印点编号</th>
              <th>送报点编号</th>
              <th>送报时间</th>
              <th>送报路线</th>
              <th>每捆报纸份数</th>
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
            添加印点送报点关系
          </h4>
        </div>
        <div class="modal-body">
          <form class="form-horizontal" role="form">
            <div class="form-group">
              <label  class="col-sm-2 control-label">印点</label>
              <div class="col-sm-10">
                <select name="printerID" type="text" class="form-control"></select>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-2 control-label">送报点</label>
              <div class="col-sm-10">
                <select name="deliverPointID" type="text" class="form-control"></select>
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">送报时间</label>
              <div class="col-sm-10">
                <input name="deliverTime" type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">送报路线</label>
              <div class="col-sm-10">
                <input name="deliverWay" type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">份数</label>
              <div class="col-sm-10">
                <input name="deliverNum" type="text" class="form-control">
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
