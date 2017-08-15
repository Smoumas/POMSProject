var login_btn = document.getElementById("login-btn");
login_btn.onclick = function() {
    return LoginAuth();
}

function LoginAuth() {
    var inputOfUsername = document.getElementById("username");
    var usrname = inputOfUsername.value;
    var inputOfPassWord = document.getElementById("password");
    var pwd = inputOfPassWord.value;
    if (InputTextValidate(usrname) && InputTextValidate(pwd)) {
        window.location.href = "centerStation/centerMain";


        return false;
    } else {
        $("#show-text").text("用户名/密码不能为空!!!!!");
        return false;
    }
}

var loginAjax = function(username, password) {
    $.ajax({
        url: "/POMSProject/center/personManage/login",
        type: "POST",
        data: { "operatorID": username, "password": password },
        dataType: "json",
        success: function(data) {
            console.log("success");
            if (!data.result) {
                $("#show-text").text("账号/密码错误!!!!!!");
            } else if (data.result == 1) {
                window.location.href = "../code/centerStation/centerMain.html";
            } else if (data.result == 2) {
                window.location.href = "../code/issueStation/main_fa.html";
            } else if (data.result == 3) {
                window.location.href = "../code/deliveryManage/deliveryMain.html";
            } else if (data.result == 4) {
                window.location.href = "../code/caiwuguanli/caiwuMain.html";
            } else if (data.result == 5) {
                window.location.href = "../code/consumerManage/consumerMain.html";
            }
        },
        error: function(data) {
            console.log("error");
            alert("啊哦，连接数据库出现了一点问题");
        }
    });
}

function InputTextValidate(str) {
    if (str != "") {
        return true;
    } else {
        return false;
    }
}