<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/common/taglibs.jsp"%>
<html>

<head>
<%@include file="/common/head.jsp" %>
</head>

<body>
<%@include file="/common/header.jsp" %>
<div class="container">
  <div class="row">
    <c:if test="${user.admin==2||user.admin==3}">
    <%@include file="/common/left-bar.jsp" %>
    </c:if>
    <jsp:include page="${contentJSP}"/>
  </div>
</div>
</body>

</html>