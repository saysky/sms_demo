<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../common/header.jsp"%>
<body>

<%@include file="../common/nav.jsp"%>

<div class="container-fluid">
    <div class="row">

        <%@include file="../common/sidebar.jsp"%>
        
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            <div id="myBreadcrumb">
                <ul class="breadcrumb">
                    <li>
                        <a href="#">首页</a> <span class="divider">></span>
                    </li>
                    <li>
                        <a href="/check">考勤列表</a> <span class="divider">></span>
                    </li>
                    <li class="active">添加考勤</li>
                </ul>
            </div>

            <br>
            <form class="form-horizontal"  action="/check/save" method="post">
                <div class="form-group">
                    <label for="name" class="col-sm-2 control-label">姓名 <span class="text-danger">*</span></label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="name" id="name" required >
                    </div>
                </div>
                <div class="form-group">
                    <label for="number" class="col-sm-2 control-label">编号 <span class="text-danger">*</span></label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="number" id="number" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="age" class="col-sm-2 control-label">年龄 <span class="text-danger">*</span></label>
                    <div class="col-sm-4">
                        <input type="number" class="form-control" name="age" id="age" min="0" max="120" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="checkInTime" class="col-sm-2 control-label">考勤时间<span class="text-danger">*</span></label>
                    <div class="col-sm-4">
                        <input type="datetime-local" class="form-control" name="checkInTime" id="checkInTime" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="checkOutTime" class="col-sm-2 control-label">退勤时间<span class="text-danger">*</span></label>
                    <div class="col-sm-4">
                        <input type="datetime-local" class="form-control" name="checkOutTime" id="checkOutTime" required>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">添加</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>


<%@include file="../common/footer.jsp"%>