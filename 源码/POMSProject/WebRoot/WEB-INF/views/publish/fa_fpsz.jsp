<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>发票设置</title>
    <!--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
    <!--<link href="general.css" rel="stylesheet">-->
    <!--<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>-->
    <!--<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">


                <!--页面标题提示部分-->
                <div id="mark-id">
                    fpgl-fpsz
                </div>

                <!--页面标题提示部分-->
                <div class="title">
                    <h2>发票管理>发票设置</h2>
                </div>

                <!--添加的表单-->
                <div class="add-form modify-password-form">
                    <form role="form">
                        <div class="form-group">
                            <label class="col-sm-2">发票ID</label>
                            <input name="invoiceID" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">状态</label>
                            <select name="state" id="" class="form-control">
                                <option value="0">未使用</option>
                                <option value="1">已使用</option>
                                <option value="2">丢失</option>
                                <option value="3">发票作废</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="send-new-password-btn btn btn-info col-sm-offset-1" value="提交">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

</body>

</html>