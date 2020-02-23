<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="../common/header.jsp" %>
</head>
<body>

    <%@include file="../common/nav.jsp" %>

    <div class="container-fluid">
        <div class="row">
            <%@include file="../common/sidebar.jsp" %>

            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <div id="myBreadcrumb">
                    <ul class="breadcrumb">
                        <li>
                            <a href="#">首页</a> <span class="divider">></span>
                        </li>
                        <li class="active">
                            <a href="/check">考勤列表</a>
                        </li>
                    </ul>
                </div>
                <br>
                <div id="content">
                    <div class="table-responsive">
                        <form class="form-inline" method="get" action="/check">
                            <div class="form-group">
                                <label for="Search" class="sr-only">Search</label>
                                <input type="text" name="query" class="form-control" id="Search" placeholder="根据姓名搜索..."
                                       value="${query}">
                            </div>
                            <button type="submit" class="btn btn-default">查询</button>
                            <a href="/check/add">
                                <button type="button" class="btn btn-info">添加</button>
                            </a>
                        </form>
                        <br>
                        <table class="table table-bordered">
                            <tr>
                                <th>姓名</th>
                                <th>编号</th>
                                <th>年龄</th>
                                <th>出勤时间</th>
                                <th>退勤时间</th>
                                <th>上班总时长</th>
                                <th>操作</th>
                            </tr>
                            <c:forEach var="check" items="${checkList}">
                                <tr>
                                    <td>${check.name}</td>
                                    <td>${check.number}</td>
                                    <td>${check.age}</td>
                                    <td><fmt:formatDate value="${check.checkInTime}" pattern="yyyy年MM月dd日HH点mm分"/></td>
                                    <td><fmt:formatDate value="${check.checkOutTime}" pattern="yyyy年MM月dd日HH点mm分"/></td>
                                    <td>${check.duration}小时</td>
                                    <td>
                                        <a href="/check/delete/${check.id}" class="btn btn-danger btn-xs">删除</a>
                                        <a href="/check/edit/${check.id}" class="btn btn-primary btn-xs">编辑</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

<%@include file="../common/footer.jsp" %>