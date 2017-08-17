<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>新订</title>
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
                    spdg-xd1
                </div>

                <!--页面标题提示部分-->
                <div class="title">
                    <h2>商品订购>新订</h2>
                </div>

                <!--添加的表单-->
                <div class="add-form modify-password-form">
                    <form role="form">
                        <div class="form-group">
                            <label class="col-sm-2">客户ID</label>
                            <input name="customerID" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">征订员ID</label>
                            <input name="salerID" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">投递段ID</label>
                            <input name="deliverAreaID" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">投递员ID</label>
                            <input name="deliverID" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">报刊名称</label>
                            <select name="newspaperID" id="" class="form-control">
                        </select>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">刊期</label>
                            <select name="frequency" class="form-control">
                            <option value="1">日刊</option>
                            <option value="2">月刊</option>
                            <option value="3">季刊</option>
                            <option value="4">半年刊</option>
                            <option value="5">年刊</option>
                        </select>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">订单类型</label>
                            <select name="orderType" class="form-control">
                            <option value="0">普通订阅</option>
                            <option value="1">跨站订阅</option>
                            <option value="2">集订分送</option>
                        </select>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">订单数量</label>
                            <input name="orderNum" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">订单地址</label>
                            <input name="orderAddress" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">持续时间</label>
                            <input name="orderKeepTime" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">收款方式</label>
                            <select name="receiptType" class="form-control">
                            <option value="0">普通收费</option>
                            <option value="1">先订报后收费</option>
                            <option value="2">电话订报上门收费</option>
                            <option value="3">异地收费</option>
                            <option value="4">集体收费</option>
                        </select>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">支付类型</label>
                            <select name="paymentType" class="form-control">
                            <option value="3">现金</option>
                            <option value="1">支票</option>
                            <option value="2">现金+支票</option>
                            <option value="4">现金+代金券</option>
                            <option value="6">赠卡</option>
                        </select>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">缴费情况</label>
                            <select name="paymentType" class="form-control">
                            <option value="0">已付款</option>
                            <option value="1">未付款</option>
                            <option value="2">部分缴费</option>                        
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

    <script>
        $(function() {
            var newspaperList = {};
            $(".container").on("click", function() {
                //判断是否已经获得 已经获得就退出                 
                if (!$.isEmptyObject(newspaperList)) {
                    return;
                } else {
                    //获得分站list 
                    $.ajax({
                        url: "/POMSProject/publish/query/newspaperList",
                        type: "get",
                        data: "",
                        dataType: "json",
                        success: function(data) {
                            console.log("success");
                            newspaperList = data.data;
                            //把select替换
                            var select = $("select")[0];
                            for (var i = 0; i < data.size; i++) {
                                var one_newspaper = newspaperList[i];
                                var option = document.createElement("option");
                                option.setAttribute("value", one_newspaper.newspaperID);
                                var text = document.createTextNode(one_newspaper.newspaperName);
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