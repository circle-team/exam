<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@include file="/common/taglibs.jsp" %>
<html>

<head>
    <%@include file="/common/head.jsp" %>
</head>

<body>
<%@include file="/common/header.jsp" %>
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
                            <table class="table table-bordered table-hover">
                                <thead>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td>名字</td>
                                    <td>&nbsp;</td>
                                    <td><c:out value="${user.name}"/></td>
                                </tr>
                                <tr class="success">
                                    <td>&nbsp;</td>
                                    <td>积分</td>
                                    <td>&nbsp;</td>
                                    <td><c:out value="${user.money}"/></td>
                                </tr>
                                <tr class="error">
                                    <td>&nbsp;</td>
                                    <td>手机</td>
                                    <td>&nbsp;</td>
                                    <td><c:out value="${user.telphone}"/></td>
                                </tr>
                                <tr class="warning">
                                    <td>&nbsp;</td>
                                    <td>Email</td>
                                    <td>&nbsp;</td>
                                    <td><c:out value="${user.email}"/></td>
                                </tr>
                                <tr class="info">
                                    <td>&nbsp;</td>
                                    <td>TB - Monthly5\</td>
                                    <td>&nbsp;</td>
                                    <td>Call in to confirm</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
</script>
</html>