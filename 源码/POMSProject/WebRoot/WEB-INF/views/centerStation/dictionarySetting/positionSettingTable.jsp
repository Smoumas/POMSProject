<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>职别设置</title>
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <!-- 重点引入这俩个类-->
      <!--页面标题提示部分-->
      <div id="mark-id">
        zdwh-zbsz
      </div>

      <div class="title">
        <h2>字典维护>职务设置</h2>
      </div>

      <div class="operation">
   <!--     <div class="add-btn operation-btn">
          <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
            <span class="glyphicon glyphicon-plus"></span>添加</button>
        </div>-->
        <div class="search input-group">
          <input type="text" class="form-control " placeholder="请输入部门名" name="departmentName">
          <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
        </div>
      </div>
      <div>
          <table class="table table-hover table-striped">
            <thead>
            <tr>
              <th>部门编号</th>
              <th>部门名称</th>
              <th name="dutyName">职务名称</th>
              <th name="wage">绩效工资核算类型</th>
            <!--  <th>操作</th>-->
            </tr>
            </thead>
            <tbody>

            </tbody>
          </table>
      </div>
    </div>
  </div>

<!--  &lt;!&ndash; 模态框（Modal） &ndash;&gt;
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
            &times;
          </button>
          <h4 class="modal-title" id="myModalLabel">
            添加职位
          </h4>
        </div>
        <div class="modal-body">
          &lt;!&ndash;此表单涉及多个表，不能用path&ndash;&gt;
          <form class="form-horizontal" role="form" method="post">
            <div class="form-group">
              <label  class="col-sm-2 control-label">部门名</label>
              <div class="col-sm-10">
                <select name="departmentID" class="form-control"></select>
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">职务名称</label>
              <div class="col-sm-10">
                <input name="dutyName" type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label">绩效工资核算类型</label>
              <div class="col-sm-10">
                <input name="wage" type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <input type="submit" class="btn btn-info col-sm-offset-3 col-sm-6" value="添加">
            </div>
          </form>
        </div>
      </div>&lt;!&ndash; /.modal-content &ndash;&gt;
    </div>&lt;!&ndash; /.modal &ndash;&gt;
  </div>-->

</div>
</body>
</html>
