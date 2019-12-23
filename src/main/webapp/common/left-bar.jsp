<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<div id="bar" class="col-xs-2 my-nav-bar">
  <div class="panel panel-info">
    <div class="panel-heading">
      <h3 class="panel-title">
        <span class="glyphicon glyphicon-th-list"></span>&nbsp;信息管理
      </h3>
    </div>
    <div class="list-group">
      <c:if test="${user.admin==2}">
      <a class="list-group-item" href="${ctx}/sys/user/list">用户管理</a>
      </c:if>
      <a class="list-group-item" href="${ctx}/exampaper/list">问卷管理</a>
      <a class="list-group-item" href="${ctx}/question/list">题目管理</a>
      <a class="list-group-item" href="${ctx}/resource/list">资源管理</a>
      <a class="list-group-item" href="${ctx}/exam/list">问卷详细管理</a>
      <a class="list-group-item" href="${ctx}/examresult/list">意向查看</a>
    </div>
  </div>
</div>
