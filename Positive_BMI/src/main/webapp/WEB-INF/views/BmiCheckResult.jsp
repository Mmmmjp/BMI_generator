<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.BmiBeans" %>

<% 
//リクエストスコープに保存されたBmiBeansのインスタンスを取得
BmiBeans bb = (BmiBeans)request.getAttribute("bb");%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ポジティブBMI診断結果</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>

    <h1><%=bb.getName()%>さんのBMI診断の結果</h1>

    <P>
        身長：<%=bb.getHeight() %>cm <br>
        体重：<%=bb.getWeight() %>kg <br>
        BMIは<%=bb.getBmi() %>でした。 <br>

        体型：<%= bb.getBodyType() %>
    </P>

    <a href="BmiCheck">戻る</a>

</body>
</html>