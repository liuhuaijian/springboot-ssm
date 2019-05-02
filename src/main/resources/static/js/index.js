$(document).ready(function(){
    $("#index").submit(function () {
        var name = $("#name").val();
        var password = $("#password").val();

        var user = {
            "name" : name,
            "password" : password
        }

        $.ajax({
            type : "get",
            url : "http://localhost:8080/getUserSubmit",
            data : user,
            success:function (result) {
                var v = JSON.parse(result);
                if(v.mag == "ok"){
                    alert("欢迎登录！");
                    window.location.href = "list.html";
                }
            },
            error:function (result) {
                console.log(result.errotMag);
            }

        })
        return false;
    })
})