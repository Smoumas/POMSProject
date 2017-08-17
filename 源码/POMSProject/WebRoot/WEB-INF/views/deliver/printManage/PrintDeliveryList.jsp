﻿<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>打印分发单</title>
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <!-- 重点引入这俩个类-->
      <div id="mark-id">
        dygl-dyysd
      </div>
      <div class="title">
        <h2>打印管理>打印运输单</h2>
      </div>

      <div class="panel panel-default">
        <div class="panel-heading">
          <h4 class="panel-title" data-toggle="collapse" data-parent="#accordion"
              href="#collapseOne">
            <label>
              查询打包数量单
            </label>

          </h4>
        </div>
        <div id="collapseOne" class="panel-collapse collapse in">
          <div class="panel-body">
            <div class="operation">
              <div class="search input-group">
                <input type="text"  class="form-control " name="stationName"
                       placeholder="分站名称">
                <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
              </div>
            </div>
            <div>
              <tr>
                <table class="table table-hover table-striped">
                  <thead>
                  <th><input type="checkbox"></th>
                  <th>分站编号</th>
                  <th>分站名称</th>
                  <th>分发量</th>
                  <th>应该打包的数量</th>
                  <th>零头数</th>
                  </tr>
                  </thead>
                  <tbody>
                 <!-- <tr>
                    <td><input type="checkbox"></td>
                    <td>1</td>
                    <td>TB - Monthly</td>
                    <td>1</td>
                    <td>TB - Monthly</td>
                    <td>1</td>
                  </tr>
                  <tr>
                    <td><input type="checkbox"></td>
                    <td>1</td>
                    <td>TB - Monthly</td>
                    <td>1</td>
                    <td>TB - Monthly</td>
                    <td>1</td>
                  </tr>-->
                  </tbody>
                </table>
            </div>
    <!--        <div class="pagination-div">
              <ul class="pagination pagination-lg">
                <li><a href="#">&laquo;</a></li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&raquo;</a></li>
              </ul>
            </div>-->
            <div class="printSubmitButton">
              <button type="button" class="btn btn-info">加入打印单</button>
            </div>
          </div>
        </div>
      </div>


      <!-- 此处开始写路线组合的主体部分-->
      <div>
        <div>
          <input type="text"  class="form-control " id="printListTitle"
                 placeholder="此处输入打印单标题">
        </div>
        <table class="table table-hover table-striped">
          <thead>
          <th>分站编号</th>
          <th>分站名称</th>
          <th>分发量</th>
          <th>应该打包的数量</th>
          <th>零头数</th>
          </tr>
          </thead>
          <tbody>
         <!-- <tr>
            <td>1</td>
            <td>TB - Monthly</td>
            <td>1</td>
            <td>TB - Monthly</td>
            <td>1</td>
          </tr>
          <tr>
            <td>1</td>
            <td>TB - Monthly</td>
            <td>1</td>
            <td>TB - Monthly</td>
            <td>1</td>
          </tr>-->
          </tbody>
        </table>
      </div>
<!--      <div class="pagination-div">
        <ul class="pagination pagination-lg">
          <li><a href="#">&laquo;</a></li>
          <li><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
          <li><a href="#">&raquo;</a></li>
        </ul>
      </div>-->
      <div class="printSubmitButton">
        <button class="btn btn-info">打印预览</button>
        <button class="btn btn-info">打印</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>
</title>
</head>
<body>
