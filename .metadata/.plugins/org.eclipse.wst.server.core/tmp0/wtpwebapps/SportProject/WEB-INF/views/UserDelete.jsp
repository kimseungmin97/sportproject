<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../CSS/ResultId.css">
<meta charset="EUC-KR">
<script type="text/javascript">
function disable(box) {
	var abc = document.getElementById('button'); 
	if (box.checked == true	) {
	abc.disabled = false;		
	}else {
		abc.disabled = true;
	}
	
}
</script>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />	
<jsp:include page="headermenu.jsp"/>
<c:forEach items="user" var="user"/>	
		<p class="sign" align="center">ȸ��Ż��</p>
			<p class="abc" align="center">Ż�� �Ŀ��� ���̵�${user.id}�� �ٽ� �����Ҽ� ������</p>
			<p class="abc" align="center">���̵�� �����ʹ� ������ �� �����ϴ�.</p>
			<p class="abc" align="center">�Խ��ǿ� �����ִ� �Խñ��� Ż���� ������ �� �����ϴ�.</p><br>
			<p class="abc" align="center"><input type="checkbox" onclick="disable(this);">�� ���׿� �����մϴ�</p>
			<p class="abc" align="center"><input type="button" name="button" id="button" onclick="location.href='/user/UserDelete'" value="ȸ��Ż��" disabled></p>
</body>
</html>