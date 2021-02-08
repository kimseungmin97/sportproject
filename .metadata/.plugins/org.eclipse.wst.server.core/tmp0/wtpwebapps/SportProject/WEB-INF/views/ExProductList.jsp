<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="../CSS/ProductList.css">

	
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="headermenu.jsp" />
	<div class="main2">
		<div id="myBtnContainer">
			<button class="btn active" onclick="filterSelection('all')">Show all</button>
			<button class="btn" onclick="filterSelection('���')">���</button>
			<button class="btn" onclick="filterSelection('�ѽ����̽�')">�ѽ����̽�</button>
			<button class="btn" onclick="filterSelection('������')">������</button>
			<button class="btn" onclick="filterSelection('����')">����</button>
			<button class="btn" onclick="filterSelection('�ֿ�')">�ֿ�</button>
			<button class="btn" onclick="filterSelection('�ƿ��')">�ƿ��</button>
			<button class="btn" onclick="filterSelection('���׽ý�')">���׽ý�</button>
			<button class="btn" onclick="filterSelection('�׽���')">�׽���</button>
			<button class="btn" onclick="filterSelection('���')">���</button>
			<button class="btn" onclick="filterSelection('������')">������</button>
			<button class="btn" onclick="filterSelection('����')">����</button>
		</div>
		<table>
		<c:set var="i" value="0" />
		<c:set var="j" value="3" />
	<c:forEach items="${list}" var="list">	
	 <c:if test="${i%j == 0 }">
	 <tr>
	  </c:if>
	  <td style="width: 40%">
		<div class="row">
			<div class="column ${list.brand}">
				<div class="content">
				<a onclick="location.href='/product/productDetail?qseq=${list.qseq}'">
					<img src="../images/${list.img}" style="width: 100%">
					<h4>${list.brand}</h4>
					<h4 style="text-align: left;">${list.kind}</h4>
					<h4>${list.name}</h4>
					<p>${list.price}��</p>
				</a>
				</div>
			</div>
		</div>
		</td>
		<c:if test="${i%j == j-1 }">
		</tr>	
		</c:if>
		<c:set var="i" value="${i+1 }" />
	</c:forEach>
	</table>
	</div>
<script>
filterSelection("all")
function filterSelection(c) {
  var x, i;
  x = document.getElementsByClassName("column");
  if (c == "all") c = "";
  for (i = 0; i < x.length; i++) {
    w3RemoveClass(x[i], "show");
    if (x[i].className.indexOf(c) > -1) w3AddClass(x[i], "show");
  }
}

function w3AddClass(element, name) {
  var i, arr1, arr2;
  arr1 = element.className.split(" ");
  arr2 = name.split(" ");
  for (i = 0; i < arr2.length; i++) {
    if (arr1.indexOf(arr2[i]) == -1) {element.className += " " + arr2[i];}
  }
}

function w3RemoveClass(element, name) {
  var i, arr1, arr2;
  arr1 = element.className.split(" ");
  arr2 = name.split(" ");
  for (i = 0; i < arr2.length; i++) {
    while (arr1.indexOf(arr2[i]) > -1) {
      arr1.splice(arr1.indexOf(arr2[i]), 1);     
    }
  }
  element.className = arr1.join(" ");
}


// Add active class to the current button (highlight it)
var btnContainer = document.getElementById("myBtnContainer");
var btns = btnContainer.getElementsByClassName("btn");
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function(){
    var current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
</script>
</body>
</html>