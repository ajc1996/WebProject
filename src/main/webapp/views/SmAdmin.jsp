<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <!-- 先引用jquery -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>管理二级管理员</title>

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <%--<link href="https://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css" rel="stylesheet">--%>
    <link href="css/newcss/bootstrapValidator.min.css" rel="stylesheet">
    <link href="css/newcss/fileinput.css" media="all" rel="stylesheet" type="text/css" />
    <link href="css/newcss/fileinput-rtl.css" rel="stylesheet" />

</head>
<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="ibox float-e-margins">
            <div class="col-sm-12">
                <!-- Example Events -->
                <div class="example-wrap">
                    <h4 class="example-title">事件</h4>
                    <%--管理员查询条件信息--%>
                    <div class="example">
                        <div class="panel panel-default">
                            <div class="panel-heading">查询条件</div>
                            <div class="panel-body">
                                <%--<form id="formSearch" class="form-horizontal">--%>
                                    <div class="form-group" style="margin-top: 15px">
                                        <label class="control-label col-sm-1" for="uname">管理员名</label>
                                        <div class="col-sm-3">
                                            <input type="text" class="form-control" id="uname" name="uname">
                                        </div>
                                        <div class="col-sm-4" style="text-align: left">
                                            <button type="button" style="margin-left: 50px" id="btn_query" class="btn btn-primary">查询</button>
                                        </div>
                                    </div>
                                <%--</form>--%>
                            </div>
                        </div>
                        <%--已有管理员操作信息--%>
                        <div class="btn-group hidden-xs" id="exampleTableEventsToolbar" role="group">
                            <button type="button" class="btn btn-outline btn-default" id="NuManageadd" data-toggle="modal" data-target="#myModal2">
                                <i class="glyphicon glyphicon-plus" aria-hidden="true">新增</i>
                            </button>
                            <button type="button" class="btn btn-outline btn-default">
                                <i class="glyphicon glyphicon-trash" aria-hidden="true" id="delete">删除</i>
                            </button>
                            <button type="button" class="btn btn-outline btn-default" id="upload" data-toggle="modal" data-target="#inputmodal">
                                <i class="glyphicon glyphicon-upload" aria-hidden="true">导入</i>
                            </button>
                        </div>
                        <table id="exampleTableEvents" data-height="400" data-mobile-responsive="true">
                        </table>
                    </div>
                </div>
                <!-- End Example Events -->
            </div>
        </div>
    </div>

    <%--modal 添加开始--%>
    <div class="modal inmodal" id="myModal2" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content animated flipInY">
                <form id="form1" action="/useradd" method="post">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title">添加管理员</h4>
                        <small class="font-bold" />
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <div class="form-group">
                                <label>用户名</label>
                                <input type="text" placeholder="请输入用户名" class="form-control" name="uname">
                            </div>
                            <div class="form-group">
                                <label>密码</label>
                                <input type="password" placeholder="请输入密码" class="form-control" name="upassword">
                            </div>
                            <div class="form-group">
                                <label>确认密码</label>
                                <input type="password" placeholder="请再一次输入密码" class="form-control" name="upassword1">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-white" data-dismiss="modal" id="btnclose">关闭</button>
                        <button type="submit" class="btn btn-primary" id="btnadd">保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <%--modal 添加结束--%>

    <%-- 上传文件modal开始 --%>
    <div class="modal inmodal" id="inputmodal" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog" style="width: 1232px;">
            <div class="modal-content">
                <form id="inputform" action="/useradd" method="post">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                        <h3 class="modal-title">导入Excel文件</h3>
                        <small class="font-bold" />
                    </div>
                    <div class="modal-body">
                        <div class="container kv-main" >
                            <h4>Bootstrap 多文件上传实例</h4>
                            <form enctype="multipart/form-data">
                                <label>多文件预览上传实例</label>
                                <input id="file-select" name="file" type="file" multiple class="file-loading" />
                            </form>
                            <hr>
                            <br>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-white" data-dismiss="modal" id="btnclosein">关闭</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <%-- 上传文件modal结束 --%>

    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>
    <script src="js/content.min.js?v=1.0.0"></script>
    <script src="js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script src="js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
    <script src="js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
    <script src="js/jquery/bootstrapValidator.min.js"></script>
    <script src="js/jquery/zh_CN.js"></script>
    <%--<script src="https://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>--%>
    <%--<script src="https://cdn.bootcss.com/bootstrap-validator/0.5.3/js/language/zh_CN.js"></script>--%>
    <script src="js/plugins/sweetalert/sweetalert.min.js"></script>
    <%--<script src="https://cdn.bootcss.com/jquery.form/4.2.1/jquery.form.js"></script>--%>
    <script src="js/jquery/jquery.form.js"></script>
    <script src="js/jquery/fileinput.js" type="text/javascript"></script>
    <script src="js/jquery/zh.js" type="text/javascript"></script>
</body>
<script type="text/javascript">
    $(function () {
        //1.初始化Table
        var oTable = new TableInit();
        oTable.Init();
        //2.初始化Button的点击事件
        var oButtonInit = new ButtonInit();
        oButtonInit.Init();
    });
    $(function () {
        $("#form1").bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                uname: {
                    message: '账户名验证失败',
                    validators: {
                        notEmpty: {
                            message: '账户名不能为空'
                        },
                        stringLength: {
                            min: 6,
                            max: 18,
                            message: '账户名长度必须在6到18位之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '账户名由字母、数字、下划线组成'
                        },
                        remote: {
                            message: '该账户名以被注册',
                            url: "checkExist",
                            type: 'post',
                            data: function (validator) {
                                return {
                                    uname: $("#uname").val()
                                };
                            },
                            delay: 1000
                        }
                    }
                },
                upassword: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        }
                    }
                },
                upassword1: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        identical: {
                            field: 'upassword',
                            message: '两次密码不一致'
                        }
                    }
                }
            }
        });
    });

    $(function () {
        $("#form1").ajaxForm(function (data) {
            if(-1 < data.indexOf("success")){
                swal({
                    title:"太帅了",
                    text:"小手一抖就打开了一个框",
                    type:"success"
                });
                $("#form1").resetForm();
                $("#btnclose").click();
            }else{
                alert("添加失败");
            }
        });
    });

    var TableInit = function () {
        var oTableInit = new Object();
        //初始化Table
        oTableInit.Init = function () {
            $('#exampleTableEvents').bootstrapTable({
                url: '/selectByManage',         //请求后台的URL（*）
                method: 'post',                      //请求方式（*）
                toolbar: '#exampleTableEventsToolbar',                //工具按钮用哪个容器
                contentType: "application/x-www-form-urlencoded",
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParamsType:'',
                queryParams: function queryParams(params) {
                    var param = {
                        pageNumber: params.pageNumber,
                        pageSize: params.pageSize,
                        uname: $("#uname").val()
                    };
                    return param;
                },
                sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber:1,                       //初始化加载第一页，默认第一页
                pageSize: 10,                       //每页的记录行数（*）
                pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
                strictSearch: true,
                showColumns: true,                  //是否显示所有的列
                showRefresh: true,                  //是否显示刷新按钮
                minimumCountColumns: 1,             //最少允许的列数
                clickToSelect: true,                //是否启用点击选中行
                height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
                showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                columns: [{
                    checkbox: true
                },{
                    field: 'uname',
                    title: '管理员帐号'
                }, {
                    field: 'usex',
                    title: '性别',
                    formatter: function (value, row, index) {
                        if(value == "M"){
                            return "男";
                        }else{
                            return "女";
                        }
                    }
                }, {
                    field: 'ubirthday',
                    title: '生日',
                    formatter: function (value, row, index) {
                        if(value == null){
                            return value;
                        }else {
                            return getMyDate(value)
                        }
                    }
                }, {
                    field: 'uphone',
                    title: '联系电话'
                }]
            });
        };
        return oTableInit;
    };
    /*管理员用户名查询,尚未完成*/
    $('#btn_query').click(function() {
        $('#exampleTableEvents').bootstrapTable('refresh', {url: 'selectByManage'});
    });
    //修改——转换日期格式(时间戳转换为datetime格式)
    function getMyDate(str){
        var oDate = new Date(str),
            oYear = oDate.getFullYear(),
            oMonth = oDate.getMonth()+1,
            oDay = oDate.getDate(),
            oTime = oYear +'-'+ getzf(oMonth) +'-'+ getzf(oDay);//最后拼接时间
        return oTime;
    }

    document.getElementById("delete").onclick=function () {
        var rows = $('#exampleTableEvents').bootstrapTable('getSelections');
        if(rows.length==0) {
            alert("请选择删除的数据");
            return;
        }
        var e=confirm("确认要删除选中的'" + rows.length + "'条数据吗?"  );
        if(!e)
            return;
        var names = new Array();
        $.each(rows,function (i,row) {
            names[i]=row['uname'];
        });
        var deleteModel ={
            names: names
        };
        alert(names[2]);
        //   var param={"names":names};
        $.ajax({
            type : "post",
            url :"delete",
            contentType:'application/json;charset=UTF-8',
            data : JSON.stringify(deleteModel),
            success : function() {
                doQuery();
            },
            error:function () {
//                alert("服务器出错！")
            }
        })

    };

    //补0操作
    function getzf(num){
        if(parseInt(num) < 10){
            num = '0'+num;
        }
        return num;
    }

    var ButtonInit = function () {
        var oInit = new Object();
        var postdata = {};

        oInit.Init = function () {
            //初始化页面上面的按钮事件
        };
        return oInit;
    };

    //导入文件
    $('#file-select').fileinput({
        language: 'zh',
        uploadUrl: 'img1',
        //allowedPreviewTypes: ['image'],
        allowedFileExtensions : ['xlsx','xls']
    });
    $('#file-select').on('fileuploaded', function(event, data, previewId, index) {
        var response = data.response;
        $.each(response,function(id,path){//上传完毕，将文件名返回
        });
    });

</script>
</html>