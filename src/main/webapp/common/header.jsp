<%@page import="pers.corvey.exam.util.CurrentUtils" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    request.setAttribute("user", CurrentUtils.getCurrentUser());
%>
<div id="header">
    <nav class="navbar" id="header-navbar">
        <div class="container-fluid">
            <div class="navbar-header" style="padding-left: 15px;">
                <a class="navbar-brand" style="padding: 3 0 2 0;">
                    <img style="width: 240px;height:60px;" src="${ctx}/static/img/logo.png"/>
                </a>
            </div>
            <div class="pull-left" style="padding: 5px 0 5px 10px">
                <ul class="nav navbar-nav">
                    <li><a href='${ctx}/exam/show'>在线问卷</a></li>
                    <%-- <li><a href='${ctx}/exam/show'>在线练习</a></li> --%>
                    <li><a href='${ctx}/examresult/show'>完成记录</a></li>
<%--                    <li><a href='${ctx}/exam/wrong/show'>问卷统计</a></li>--%>
                    <%--          <li><a href='${ctx}/resource/all'>资源大全</a></li>--%>
                </ul>
            </div>
            <div class="pull-right" style="padding: 5px 15px 5px 0">
                <!-- <form class="navbar-form navbar-left" id="searchForm">
                  <div class="input-group" style="width: 200px;">
                    <input type="text" class="form-control" placeholder="Search" id="keyword">
                    <div class="input-group-btn">
                      <button class="btn btn-default" type="submit">搜索</button>
                    </div>
                  </div>
                </form> -->
                <ul class="nav navbar-nav">
                    <li id="id" hidden="true"><a>${user.id}</a></li>
                    <li><a>${user.name}</a></li>
                    <li><a>积分：${user.money}</a></li>
                    <c:choose>
                        <c:when test="${user.admin==2}">
                            <li><a href="${ctx}/exampaper/list">管理员页面</a></li>
                        </c:when>
                        <c:when test="${user.admin==3}">
                            <li><a href="${ctx}/exampaper/list">公司员工页面</a></li>
                        </c:when>
                        <c:otherwise></c:otherwise>
                    </c:choose>
                    <li><a href="${ctx}/sys/user/inputs?id=${user.id}">个人信息</a></li>
                    <li><a href="${ctx}/logout">退出登录</a></li>
                </ul>

            </div>
        </div>
    </nav>
</div>
