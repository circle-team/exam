<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@include file="/common/taglibs.jsp" %>
<html>

<head>
    <%@include file="/common/head.jsp" %>
</head>

<body>
<%@include file="/common/header.jsp" %>

<%

    session.setAttribute("user2", CurrentUtils.getCurrentUser());

%>
<div class="container">
    <div class="row">
        <div class="col-md-offset-1 col-md-10">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        <span class="glyphicon glyphicon-th-list"></span>&nbsp;我的信息
                    </h3>
                </div>
                <div class="panel-body">
                    <%@include file="/common/show-message.jsp" %>
                    <div class="container-fluid">
                        <div class="row-fluid">
                            <form action="sys/user/update">
                            <table class="table table-bordered table-hover">
                                <thead>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>Id</td>
                                    <td><input name="id" class="form-control" value="${sessionScope.user2.id}"></td>
                                </tr>
                                <tr>
                                    <td>名字</td>
                                    <td><input name="name" class="form-control" value="${sessionScope.user2.name}"></td>
                                </tr>
                                <tr class="success">
                                    <td>积分</td>
                                    <td><c:out value="${user.money}"/></td>
                                </tr>
                                <tr class="error">
                                    <td>手机</td>
                                    <td><input  name="telphone" class="form-control" value="${sessionScope.user2.telphone}"></td>
                                </tr>
                                <tr class="warning">
                                    <td>Email</td>
                                    <td><input name="email" class="form-control" value="${sessionScope.user2.email}"></td>
                                </tr>
                                <tr class="info">
                                    <td></td>
                                    <td><button  type="submit" class="btn btn-default">修改</button></td>
                                </tr>
                                </tbody>
                            </table>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    $.ajax()
</script>
</html>