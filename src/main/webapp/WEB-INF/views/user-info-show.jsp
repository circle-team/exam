<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@include file="/common/taglibs.jsp"%>
<html>

<head>
    <%@include file="/common/head.jsp" %>
</head>

<body>
<%@include file="/common/header.jsp" %>
<div class="container">
    <div class="row">
<div class="col-xs-10">
    <div class="panel panel-info">
        <div class="panel-heading">
            <h3 class="panel-title">
                <span class="glyphicon glyphicon-th-list">信息表</span>&nbsp;
            </h3>
        </div>
        <div class="panel-body">
            <%@include file="/common/show-message.jsp" %>
            <div class="container-fluid">
                <div class="row-fluid">
                    <form:form action="${ctx}/sys/user/save1" method="post"
                               cssClass="" modelAttribute="user">
                        <form:hidden path="id" />
                        <table class="table table-bordered table-hover">
                            <thead>
                            </thead>
                            <tbody>
                            <tr>
                                <td>用户名</td>
                                <td><form:input cssClass="form-control" path="username"
                                                disabled="true" /></td>
                            </tr>
                            <tr>
                                <td>名字</td>
                                <td><form:input cssClass="form-control" path="name"  /></td>
                            </tr>
                            <tr class="success">
                                <td>积分</td>
                                <td><form:input cssClass="form-control" path="money" disabled="${entity1.admin!=2}"/></td>
                            </tr>
<%--                            <tr class="error">--%>
<%--                                <td>手机</td>--%>
<%--                                <td><form:input cssClass="form-control" path="telphone" /></td>--%>
<%--                            </tr>--%>
<%--                            <tr class="warning">--%>
<%--                                <td>Email</td>--%>
<%--                                <td><form:input cssClass="form-control" path="email" /></td>--%>
<%--                            </tr>--%>
                            </tbody>
                        </table>
                        <div class="form-group">
                            <label for="name" class="col-sm-2 control-label">权限角色</label>
                            <div class="col-sm-4">
                                <form:checkboxes path="authorityIds" delimiter="<br/>"
                                                 items="${authorities}" itemLabel="authority" itemValue="id" disabled="${user.admin!=2}" />
                            </div>
                        </div>
                        <button  type="submit" class="btn btn-default">修改</button></td>
                    </form:form>
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